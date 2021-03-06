package kawa.standard;

import gnu.expr.Declaration;
import gnu.expr.Expression;
import gnu.expr.ModuleExp;
import gnu.expr.QuoteExp;
import gnu.expr.ScopeExp;
import gnu.expr.SetExp;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.mapping.Symbol;
import java.util.Vector;
import kawa.lang.Syntax;
import kawa.lang.Translator;

public class define_variable extends Syntax {
    public static final define_variable define_variable;

    public define_variable() {
    }

    static {
        define_variable define_variable2;
        new define_variable();
        define_variable = define_variable2;
        define_variable.setName("define-variable");
    }

    public boolean scanForDefinitions(Pair pair, Vector vector, ScopeExp scopeExp, Translator translator) {
        StringBuilder sb;
        Pair st = pair;
        Vector forms = vector;
        ScopeExp defs = scopeExp;
        Translator tr = translator;
        if (!(st.getCdr() instanceof Pair)) {
            return super.scanForDefinitions(st, forms, defs, tr);
        }
        Pair p = (Pair) st.getCdr();
        Object sym = p.getCar();
        if ((sym instanceof String) || (sym instanceof Symbol)) {
            if (defs.lookup(sym) != null) {
                new StringBuilder();
                tr.error('e', sb.append("duplicate declaration for '").append(sym).append("'").toString());
            }
            Declaration decl = defs.addDeclaration(sym);
            tr.push(decl);
            decl.setSimple(false);
            decl.setPrivate(true);
            decl.setFlag(268697600);
            decl.setCanRead(true);
            decl.setCanWrite(true);
            decl.setIndirectBinding(true);
            st = Translator.makePair(st, this, Translator.makePair(p, decl, p.getCdr()));
        }
        forms.addElement(st);
        return true;
    }

    public Expression rewriteForm(Pair form, Translator translator) {
        SetExp setExp;
        StringBuilder sb;
        StringBuilder sb2;
        Translator tr = translator;
        Object obj = form.getCdr();
        Expression value = null;
        Declaration decl = null;
        if (obj instanceof Pair) {
            Pair p1 = (Pair) obj;
            Object obj2 = p1.getCar();
            if ((obj2 instanceof String) || (obj2 instanceof Symbol)) {
                new StringBuilder();
                return tr.syntaxError(sb2.append(getName()).append(" is only allowed in a <body>").toString());
            } else if (obj2 instanceof Declaration) {
                decl = (Declaration) p1.getCar();
                Object obj3 = p1.getCdr();
                if (obj3 instanceof Pair) {
                    Pair pair = (Pair) obj3;
                    Pair p12 = pair;
                    if (pair.getCdr() == LList.Empty) {
                        value = tr.rewrite(p12.getCar());
                    }
                }
                if (obj3 != LList.Empty) {
                    decl = null;
                }
            }
        }
        if (decl == null) {
            new StringBuilder();
            return tr.syntaxError(sb.append("invalid syntax for ").append(getName()).toString());
        } else if (value == null) {
            return QuoteExp.voidExp;
        } else {
            new SetExp(decl, value);
            SetExp sexp = setExp;
            sexp.setDefining(true);
            sexp.setSetIfUnbound(true);
            if (decl != null) {
                sexp.setBinding(decl);
                if ((decl.context instanceof ModuleExp) && decl.getCanWrite()) {
                    value = null;
                }
                decl.noteValue(value);
            }
            return sexp;
        }
    }
}
