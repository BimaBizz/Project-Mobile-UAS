package io.kodular.mahendrabima278.Ebimbingan;

import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.MakeroidYoutubePlayer;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;
import org.jose4j.jws.AlgorithmIdentifiers;

/* compiled from: Video.yail */
public class Video extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10;
    static final SimpleSymbol Lit11;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit13;
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit15;
    static final SimpleSymbol Lit16;
    static final FString Lit17;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit2;
    static final IntNum Lit20 = IntNum.make(-2);
    static final FString Lit21;
    static final SimpleSymbol Lit22;
    static final PairWithPosition Lit23 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Video.yail", 118871);
    static final SimpleSymbol Lit24;
    static final SimpleSymbol Lit25;
    static final FString Lit26;
    static final SimpleSymbol Lit27;
    static final SimpleSymbol Lit28;
    static final FString Lit29;
    static final SimpleSymbol Lit3;
    static final FString Lit30;
    static final SimpleSymbol Lit31;
    static final SimpleSymbol Lit32;
    static final IntNum Lit33 = IntNum.make(18);
    static final SimpleSymbol Lit34;
    static final FString Lit35;
    static final FString Lit36;
    static final SimpleSymbol Lit37;
    static final FString Lit38;
    static final FString Lit39;
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40;
    static final FString Lit41;
    static final PairWithPosition Lit42 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Video.yail", 258135);
    static final SimpleSymbol Lit43;
    static final FString Lit44;
    static final SimpleSymbol Lit45;
    static final FString Lit46;
    static final FString Lit47;
    static final SimpleSymbol Lit48;
    static final FString Lit49;
    static final SimpleSymbol Lit5;
    static final FString Lit50;
    static final SimpleSymbol Lit51;
    static final FString Lit52;
    static final FString Lit53;
    static final SimpleSymbol Lit54;
    static final FString Lit55;
    static final PairWithPosition Lit56;
    static final SimpleSymbol Lit57;
    static final FString Lit58;
    static final SimpleSymbol Lit59;
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final FString Lit61;
    static final SimpleSymbol Lit62;
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final SimpleSymbol Lit67;
    static final SimpleSymbol Lit68;
    static final SimpleSymbol Lit69;
    static final IntNum Lit7 = IntNum.make(21);
    static final SimpleSymbol Lit70;
    static final SimpleSymbol Lit71;
    static final SimpleSymbol Lit72;
    static final SimpleSymbol Lit73;
    static final SimpleSymbol Lit74;
    static final SimpleSymbol Lit75;
    static final SimpleSymbol Lit76;
    static final SimpleSymbol Lit77;
    static final SimpleSymbol Lit78;
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit9;
    public static Video Video;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Label Judul2;
    public Label Judul3;
    public Label Label1;
    public Label Label2;
    public VerticalArrangement Vertical_Arrangement1;
    public VerticalArrangement Vertical_Arrangement1_copy;
    public VerticalArrangement Vertical_Arrangement1_copy1;
    public MakeroidYoutubePlayer Youtube_Player1;
    public final ModuleMethod Youtube_Player1$Initialized;
    public MakeroidYoutubePlayer Youtube_Player2;
    public final ModuleMethod Youtube_Player2$Initialized;
    public MakeroidYoutubePlayer Youtube_Player3;
    public final ModuleMethod Youtube_Player3$Initialized;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public final ModuleMethod dispatchGenericEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public final ModuleMethod get$Mnsimple$Mnname;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public Label judul1;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    public Label tgl1;

    static {
        SimpleSymbol simpleSymbol;
        SimpleSymbol simpleSymbol2;
        SimpleSymbol simpleSymbol3;
        SimpleSymbol simpleSymbol4;
        SimpleSymbol simpleSymbol5;
        SimpleSymbol simpleSymbol6;
        SimpleSymbol simpleSymbol7;
        SimpleSymbol simpleSymbol8;
        SimpleSymbol simpleSymbol9;
        SimpleSymbol simpleSymbol10;
        SimpleSymbol simpleSymbol11;
        SimpleSymbol simpleSymbol12;
        SimpleSymbol simpleSymbol13;
        SimpleSymbol simpleSymbol14;
        FString fString;
        SimpleSymbol simpleSymbol15;
        FString fString2;
        FString fString3;
        SimpleSymbol simpleSymbol16;
        FString fString4;
        FString fString5;
        SimpleSymbol simpleSymbol17;
        FString fString6;
        SimpleSymbol simpleSymbol18;
        SimpleSymbol simpleSymbol19;
        FString fString7;
        SimpleSymbol simpleSymbol20;
        FString fString8;
        FString fString9;
        SimpleSymbol simpleSymbol21;
        FString fString10;
        FString fString11;
        SimpleSymbol simpleSymbol22;
        FString fString12;
        FString fString13;
        SimpleSymbol simpleSymbol23;
        FString fString14;
        SimpleSymbol simpleSymbol24;
        FString fString15;
        SimpleSymbol simpleSymbol25;
        FString fString16;
        FString fString17;
        SimpleSymbol simpleSymbol26;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol27;
        SimpleSymbol simpleSymbol28;
        SimpleSymbol simpleSymbol29;
        FString fString20;
        FString fString21;
        SimpleSymbol simpleSymbol30;
        SimpleSymbol simpleSymbol31;
        FString fString22;
        SimpleSymbol simpleSymbol32;
        SimpleSymbol simpleSymbol33;
        SimpleSymbol simpleSymbol34;
        FString fString23;
        SimpleSymbol simpleSymbol35;
        SimpleSymbol simpleSymbol36;
        FString fString24;
        SimpleSymbol simpleSymbol37;
        SimpleSymbol simpleSymbol38;
        SimpleSymbol simpleSymbol39;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        SimpleSymbol simpleSymbol42;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        SimpleSymbol simpleSymbol46;
        SimpleSymbol simpleSymbol47;
        SimpleSymbol simpleSymbol48;
        SimpleSymbol simpleSymbol49;
        SimpleSymbol simpleSymbol50;
        new SimpleSymbol("lookup-handler");
        Lit80 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit79 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit78 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("send-error");
        Lit77 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit76 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit75 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-components");
        Lit74 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-events");
        Lit73 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit72 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit71 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit70 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit69 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("android-log-form");
        Lit68 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit67 = (SimpleSymbol) simpleSymbol14.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit66 = fString;
        new SimpleSymbol("Label2");
        Lit65 = (SimpleSymbol) simpleSymbol15.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit64 = fString2;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit63 = fString3;
        new SimpleSymbol("Judul3");
        Lit62 = (SimpleSymbol) simpleSymbol16.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit61 = fString4;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit60 = fString5;
        new SimpleSymbol("Vertical_Arrangement1_copy1");
        Lit59 = (SimpleSymbol) simpleSymbol17.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit58 = fString6;
        new SimpleSymbol("Youtube_Player3$Initialized");
        Lit57 = (SimpleSymbol) simpleSymbol18.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol51 = (SimpleSymbol) simpleSymbol19.readResolve();
        Lit4 = simpleSymbol51;
        Lit56 = PairWithPosition.make(simpleSymbol51, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Video.yail", 397399);
        new FString("com.google.appinventor.components.runtime.MakeroidYoutubePlayer");
        Lit55 = fString7;
        new SimpleSymbol("Youtube_Player3");
        Lit54 = (SimpleSymbol) simpleSymbol20.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidYoutubePlayer");
        Lit53 = fString8;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit52 = fString9;
        new SimpleSymbol("Label1");
        Lit51 = (SimpleSymbol) simpleSymbol21.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit50 = fString10;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit49 = fString11;
        new SimpleSymbol("Judul2");
        Lit48 = (SimpleSymbol) simpleSymbol22.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit47 = fString12;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit46 = fString13;
        new SimpleSymbol("Vertical_Arrangement1_copy");
        Lit45 = (SimpleSymbol) simpleSymbol23.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit44 = fString14;
        new SimpleSymbol("Youtube_Player2$Initialized");
        Lit43 = (SimpleSymbol) simpleSymbol24.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidYoutubePlayer");
        Lit41 = fString15;
        new SimpleSymbol("Youtube_Player2");
        Lit40 = (SimpleSymbol) simpleSymbol25.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidYoutubePlayer");
        Lit39 = fString16;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit38 = fString17;
        new SimpleSymbol("tgl1");
        Lit37 = (SimpleSymbol) simpleSymbol26.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit36 = fString18;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit35 = fString19;
        new SimpleSymbol("Text");
        Lit34 = (SimpleSymbol) simpleSymbol27.readResolve();
        new SimpleSymbol("FontSize");
        Lit32 = (SimpleSymbol) simpleSymbol28.readResolve();
        new SimpleSymbol("judul1");
        Lit31 = (SimpleSymbol) simpleSymbol29.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit30 = fString20;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit29 = fString21;
        new SimpleSymbol("isCard");
        Lit28 = (SimpleSymbol) simpleSymbol30.readResolve();
        new SimpleSymbol("Vertical_Arrangement1");
        Lit27 = (SimpleSymbol) simpleSymbol31.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit26 = fString22;
        new SimpleSymbol("Initialized");
        Lit25 = (SimpleSymbol) simpleSymbol32.readResolve();
        new SimpleSymbol("Youtube_Player1$Initialized");
        Lit24 = (SimpleSymbol) simpleSymbol33.readResolve();
        new SimpleSymbol("Load");
        Lit22 = (SimpleSymbol) simpleSymbol34.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidYoutubePlayer");
        Lit21 = fString23;
        new SimpleSymbol("Width");
        Lit19 = (SimpleSymbol) simpleSymbol35.readResolve();
        new SimpleSymbol("Youtube_Player1");
        Lit18 = (SimpleSymbol) simpleSymbol36.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidYoutubePlayer");
        Lit17 = fString24;
        new SimpleSymbol("TitleVisible");
        Lit16 = (SimpleSymbol) simpleSymbol37.readResolve();
        new SimpleSymbol("Title");
        Lit15 = (SimpleSymbol) simpleSymbol38.readResolve();
        new SimpleSymbol("ShowOptionsMenu");
        Lit14 = (SimpleSymbol) simpleSymbol39.readResolve();
        new SimpleSymbol("boolean");
        Lit13 = (SimpleSymbol) simpleSymbol40.readResolve();
        new SimpleSymbol("Scrollable");
        Lit12 = (SimpleSymbol) simpleSymbol41.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit11 = (SimpleSymbol) simpleSymbol42.readResolve();
        int[] iArr = new int[2];
        iArr[0] = -12627531;
        Lit10 = IntNum.make(iArr);
        new SimpleSymbol("PrimaryColorDark");
        Lit9 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("number");
        Lit8 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("MinSdk");
        Lit6 = (SimpleSymbol) simpleSymbol45.readResolve();
        new SimpleSymbol("AppName");
        Lit5 = (SimpleSymbol) simpleSymbol46.readResolve();
        new SimpleSymbol("AppId");
        Lit3 = (SimpleSymbol) simpleSymbol47.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol48.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol49.readResolve();
        new SimpleSymbol("Video");
        Lit0 = (SimpleSymbol) simpleSymbol50.readResolve();
    }

    public Video() {
        ModuleMethod moduleMethod;
        frame frame2;
        ModuleMethod moduleMethod2;
        ModuleMethod moduleMethod3;
        ModuleMethod moduleMethod4;
        ModuleMethod moduleMethod5;
        ModuleMethod moduleMethod6;
        ModuleMethod moduleMethod7;
        ModuleMethod moduleMethod8;
        ModuleMethod moduleMethod9;
        ModuleMethod moduleMethod10;
        ModuleMethod moduleMethod11;
        ModuleMethod moduleMethod12;
        ModuleMethod moduleMethod13;
        ModuleMethod moduleMethod14;
        ModuleMethod moduleMethod15;
        ModuleMethod moduleMethod16;
        ModuleMethod moduleMethod17;
        ModuleMethod moduleMethod18;
        ModuleMethod moduleMethod19;
        ModuleMethod moduleMethod20;
        ModuleMethod moduleMethod21;
        ModuleMethod moduleMethod22;
        ModuleMethod moduleMethod23;
        ModuleMethod moduleMethod24;
        ModuleMethod moduleMethod25;
        ModuleMethod moduleMethod26;
        ModuleMethod moduleMethod27;
        ModuleMethod moduleMethod28;
        ModuleMethod moduleMethod29;
        ModuleMethod moduleMethod30;
        ModuleMethod moduleMethod31;
        ModuleMethod moduleMethod32;
        ModuleMethod moduleMethod33;
        ModuleMethod moduleMethod34;
        ModuleMethod moduleMethod35;
        ModuleMethod moduleMethod36;
        ModuleMethod moduleMethod37;
        ModuleMethod moduleMethod38;
        ModuleMethod moduleMethod39;
        ModuleMethod moduleMethod40;
        ModuleMethod moduleMethod41;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod42 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit67, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod42;
        new ModuleMethod(frame4, 2, Lit68, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit69, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit70, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit71, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit72, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit73, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit74, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit75, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit76, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit77, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit78, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit79, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit80, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod43 = moduleMethod16;
        moduleMethod43.setProperty("source-location", "/tmp/runtime5171376252785622841.scm:615");
        lambda$Fn1 = moduleMethod43;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, (Object) null, 0);
        lambda$Fn3 = moduleMethod19;
        new ModuleMethod(frame4, 21, (Object) null, 0);
        lambda$Fn4 = moduleMethod20;
        new ModuleMethod(frame4, 22, Lit24, 0);
        this.Youtube_Player1$Initialized = moduleMethod21;
        new ModuleMethod(frame4, 23, (Object) null, 0);
        lambda$Fn5 = moduleMethod22;
        new ModuleMethod(frame4, 24, (Object) null, 0);
        lambda$Fn6 = moduleMethod23;
        new ModuleMethod(frame4, 25, (Object) null, 0);
        lambda$Fn7 = moduleMethod24;
        new ModuleMethod(frame4, 26, (Object) null, 0);
        lambda$Fn8 = moduleMethod25;
        new ModuleMethod(frame4, 27, (Object) null, 0);
        lambda$Fn9 = moduleMethod26;
        new ModuleMethod(frame4, 28, (Object) null, 0);
        lambda$Fn10 = moduleMethod27;
        new ModuleMethod(frame4, 29, Lit43, 0);
        this.Youtube_Player2$Initialized = moduleMethod28;
        new ModuleMethod(frame4, 30, (Object) null, 0);
        lambda$Fn11 = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn12 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn13 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn14 = moduleMethod32;
        new ModuleMethod(frame4, 34, (Object) null, 0);
        lambda$Fn15 = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn16 = moduleMethod34;
        new ModuleMethod(frame4, 36, Lit57, 0);
        this.Youtube_Player3$Initialized = moduleMethod35;
        new ModuleMethod(frame4, 37, (Object) null, 0);
        lambda$Fn17 = moduleMethod36;
        new ModuleMethod(frame4, 38, (Object) null, 0);
        lambda$Fn18 = moduleMethod37;
        new ModuleMethod(frame4, 39, (Object) null, 0);
        lambda$Fn19 = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn20 = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn21 = moduleMethod40;
        new ModuleMethod(frame4, 42, (Object) null, 0);
        lambda$Fn22 = moduleMethod41;
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Throwable th;
        String obj;
        Throwable th2;
        Object obj2;
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        Object obj3 = find;
        try {
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            Object[] objArr = new Object[2];
            objArr[0] = misc.symbol$To$String(Lit0);
            Object[] objArr2 = objArr;
            objArr2[1] = "-global-vars";
            FString stringAppend = strings.stringAppend(objArr2);
            FString fString = stringAppend;
            if (stringAppend == null) {
                obj = null;
            } else {
                obj = fString.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(obj);
            Video = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            Object find2 = require.find("com.google.youngandroid.runtime");
            Object obj4 = find2;
            try {
                ((Runnable) find2).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "4587113544679424", Lit4);
                    Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Ebimbingan", Lit4);
                    Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
                    Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit8);
                    Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit0, Lit11, AlgorithmIdentifiers.NONE, Lit4);
                    Object andCoerceProperty$Ex6 = runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.TRUE, Lit13);
                    Object andCoerceProperty$Ex7 = runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Boolean.FALSE, Lit13);
                    Object andCoerceProperty$Ex8 = runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Seputar UMM", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit13), $result);
                } else {
                    new Promise(lambda$Fn2);
                    addToFormDoAfterCreation(obj2);
                }
                this.Youtube_Player1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit17, Lit18, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit21, Lit18, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment = runtime.addToCurrentFormEnvironment(Lit24, this.Youtube_Player1$Initialized);
                } else {
                    addToFormEnvironment(Lit24, this.Youtube_Player1$Initialized);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Youtube_Player1", "Initialized");
                } else {
                    addToEvents(Lit18, Lit25);
                }
                this.Vertical_Arrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit26, Lit27, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit29, Lit27, lambda$Fn6);
                }
                this.judul1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit30, Lit31, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit27, Lit35, Lit31, lambda$Fn8);
                }
                this.tgl1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit36, Lit37, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit27, Lit38, Lit37, lambda$Fn10);
                }
                this.Youtube_Player2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit39, Lit40, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit41, Lit40, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment2 = runtime.addToCurrentFormEnvironment(Lit43, this.Youtube_Player2$Initialized);
                } else {
                    addToFormEnvironment(Lit43, this.Youtube_Player2$Initialized);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Youtube_Player2", "Initialized");
                } else {
                    addToEvents(Lit40, Lit25);
                }
                this.Vertical_Arrangement1_copy = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit44, Lit45, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit46, Lit45, lambda$Fn12);
                }
                this.Judul2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit45, Lit47, Lit48, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit45, Lit49, Lit48, lambda$Fn14);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit45, Lit50, Lit51, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit45, Lit52, Lit51, lambda$Fn16);
                }
                this.Youtube_Player3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit53, Lit54, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit55, Lit54, Boolean.FALSE);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Object addToCurrentFormEnvironment3 = runtime.addToCurrentFormEnvironment(Lit57, this.Youtube_Player3$Initialized);
                } else {
                    addToFormEnvironment(Lit57, this.Youtube_Player3$Initialized);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Youtube_Player3", "Initialized");
                } else {
                    addToEvents(Lit54, Lit25);
                }
                this.Vertical_Arrangement1_copy1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit58, Lit59, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit60, Lit59, lambda$Fn18);
                }
                this.Judul3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit61, Lit62, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit59, Lit63, Lit62, lambda$Fn20);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit59, Lit64, Lit65, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit59, Lit66, Lit65, lambda$Fn22);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                ClassCastException classCastException = e;
                Throwable th3 = th2;
                new WrongType(classCastException, "java.lang.Runnable.run()", 1, obj4);
                throw th3;
            }
        } catch (ClassCastException e2) {
            ClassCastException classCastException2 = e2;
            Throwable th4 = th;
            new WrongType(classCastException2, "java.lang.Runnable.run()", 1, obj3);
            throw th4;
        }
    }

    static Object lambda3() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "4587113544679424", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Ebimbingan", Lit4);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit8);
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit0, Lit11, AlgorithmIdentifiers.NONE, Lit4);
        Object andCoerceProperty$Ex6 = runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.TRUE, Lit13);
        Object andCoerceProperty$Ex7 = runtime.setAndCoerceProperty$Ex(Lit0, Lit14, Boolean.FALSE, Lit13);
        Object andCoerceProperty$Ex8 = runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Seputar UMM", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit13);
    }

    static Object lambda4() {
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Lit20, Lit8);
    }

    static Object lambda5() {
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Lit20, Lit8);
    }

    public Object Youtube_Player1$Initialized() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit18, Lit22, LList.list1("2mjirrZOfD8"), Lit23);
    }

    static Object lambda6() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit27, Lit19, Lit20, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit27, Lit28, Boolean.TRUE, Lit13);
    }

    static Object lambda7() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit27, Lit19, Lit20, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit27, Lit28, Boolean.TRUE, Lit13);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit31, Lit34, "Ini alasan kenapa UMM jadi Kampus Islam Terbaik Dunia! | Profil Video UMM 2021", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit19, Lit20, Lit8);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Lit33, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit31, Lit34, "Ini alasan kenapa UMM jadi Kampus Islam Terbaik Dunia! | Profil Video UMM 2021", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit19, Lit20, Lit8);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit34, "27 Jun 2021", Lit4);
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit37, Lit34, "27 Jun 2021", Lit4);
    }

    public Object Youtube_Player2$Initialized() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit40, Lit22, LList.list1("eZVxRvckjjE"), Lit42);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit45, Lit19, Lit20, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit28, Boolean.TRUE, Lit13);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit45, Lit19, Lit20, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit28, Boolean.TRUE, Lit13);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit48, Lit32, Lit33, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit48, Lit34, "Siap Kuliah di Kampus Putih, Kampus Merdeka? Enroll Now! | Biro Infokom UMM", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit19, Lit20, Lit8);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit48, Lit32, Lit33, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit48, Lit34, "Siap Kuliah di Kampus Putih, Kampus Merdeka? Enroll Now! | Biro Infokom UMM", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit48, Lit19, Lit20, Lit8);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit34, "3 Nov 2021", Lit4);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit51, Lit34, "3 Nov 2021", Lit4);
    }

    public Object Youtube_Player3$Initialized() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit54, Lit22, LList.list1("DL10tvvXC2c"), Lit56);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit59, Lit19, Lit20, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit28, Boolean.TRUE, Lit13);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit59, Lit19, Lit20, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit59, Lit28, Boolean.TRUE, Lit13);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit62, Lit32, Lit33, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit62, Lit34, "Kaleidoskop Oktober 2021 - UMM | Biro Infokom UMM", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit19, Lit20, Lit8);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit62, Lit32, Lit33, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit62, Lit34, "Kaleidoskop Oktober 2021 - UMM | Biro Infokom UMM", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit19, Lit20, Lit8);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit34, "25 Nov 2021", Lit4);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit34, "25 Nov 2021", Lit4);
    }

    /* compiled from: Video.yail */
    public class frame extends ModuleBody {
        Video $main;

        public frame() {
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 1:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 2:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 4:
                    CallContext callContext3 = callContext2;
                    Object obj3 = obj2;
                    Object obj4 = obj3;
                    if (!(obj3 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 6:
                    CallContext callContext4 = callContext2;
                    Object obj5 = obj2;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj6;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 11:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 12:
                    callContext2.value1 = obj2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                case 13:
                    CallContext callContext5 = callContext2;
                    Object obj7 = obj2;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Video)) {
                        return -786431;
                    }
                    callContext5.value1 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod2, obj2, callContext2);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 3:
                    CallContext callContext3 = callContext2;
                    Object obj5 = obj3;
                    Object obj6 = obj5;
                    if (!(obj5 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext3.value1 = obj6;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 4:
                    CallContext callContext4 = callContext2;
                    Object obj7 = obj3;
                    Object obj8 = obj7;
                    if (!(obj7 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext4.value1 = obj8;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 7:
                    CallContext callContext5 = callContext2;
                    Object obj9 = obj3;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Symbol)) {
                        return -786431;
                    }
                    callContext5.value1 = obj10;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 8:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 10:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 16:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod2, obj3, obj4, callContext2);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 9:
                    callContext2.value1 = obj5;
                    callContext2.value2 = obj6;
                    callContext2.value3 = obj7;
                    callContext2.value4 = obj8;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 4;
                    return 0;
                case 14:
                    CallContext callContext3 = callContext2;
                    Object obj9 = obj5;
                    Object obj10 = obj9;
                    if (!(obj9 instanceof Video)) {
                        return -786431;
                    }
                    callContext3.value1 = obj10;
                    CallContext callContext4 = callContext2;
                    Object obj11 = obj6;
                    Object obj12 = obj11;
                    if (!(obj11 instanceof Component)) {
                        return -786430;
                    }
                    callContext4.value2 = obj12;
                    CallContext callContext5 = callContext2;
                    Object obj13 = obj7;
                    Object obj14 = obj13;
                    if (!(obj13 instanceof String)) {
                        return -786429;
                    }
                    callContext5.value3 = obj14;
                    CallContext callContext6 = callContext2;
                    Object obj15 = obj8;
                    Object obj16 = obj15;
                    if (!(obj15 instanceof String)) {
                        return -786428;
                    }
                    callContext6.value4 = obj16;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 4;
                    return 0;
                case 15:
                    CallContext callContext7 = callContext2;
                    Object obj17 = obj5;
                    Object obj18 = obj17;
                    if (!(obj17 instanceof Video)) {
                        return -786431;
                    }
                    callContext7.value1 = obj18;
                    CallContext callContext8 = callContext2;
                    Object obj19 = obj6;
                    Object obj20 = obj19;
                    if (!(obj19 instanceof Component)) {
                        return -786430;
                    }
                    callContext8.value2 = obj20;
                    CallContext callContext9 = callContext2;
                    Object obj21 = obj7;
                    Object obj22 = obj21;
                    if (!(obj21 instanceof String)) {
                        return -786429;
                    }
                    callContext9.value3 = obj22;
                    CallContext callContext10 = callContext2;
                    Object obj23 = obj8;
                    Object obj24 = obj23;
                    Object obj25 = obj23;
                    if (1 == 0) {
                        return -786428;
                    }
                    callContext10.value4 = obj24;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod2, obj5, obj6, obj7, obj8, callContext2);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            Throwable th;
            Throwable th2;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj2 = obj;
            switch (moduleMethod2.selector) {
                case 1:
                    return this.$main.getSimpleName(obj2);
                case 2:
                    this.$main.androidLogForm(obj2);
                    return Values.empty;
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj2);
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th3 = th2;
                        new WrongType(classCastException, "lookup-in-form-environment", 1, obj2);
                        throw th3;
                    }
                case 6:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj2) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th4 = th;
                        new WrongType(classCastException2, "is-bound-in-form-environment", 1, obj2);
                        throw th4;
                    }
                case 11:
                    this.$main.addToFormDoAfterCreation(obj2);
                    return Values.empty;
                case 12:
                    this.$main.sendError(obj2);
                    return Values.empty;
                case 13:
                    this.$main.processException(obj2);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod2, obj2);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            Throwable th4;
            Throwable th5;
            Throwable th6;
            Throwable th7;
            Throwable th8;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj5 = obj;
            Object obj6 = obj2;
            Object obj7 = obj3;
            Object obj8 = obj4;
            switch (moduleMethod2.selector) {
                case 9:
                    this.$main.addToComponents(obj5, obj6, obj7, obj8);
                    return Values.empty;
                case 14:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj5, (String) obj6, (String) obj7, (Object[]) obj8) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    ClassCastException classCastException = e;
                                    Throwable th9 = th8;
                                    new WrongType(classCastException, "dispatchEvent", 4, obj8);
                                    throw th9;
                                }
                            } catch (ClassCastException e2) {
                                ClassCastException classCastException2 = e2;
                                Throwable th10 = th7;
                                new WrongType(classCastException2, "dispatchEvent", 3, obj7);
                                throw th10;
                            }
                        } catch (ClassCastException e3) {
                            ClassCastException classCastException3 = e3;
                            Throwable th11 = th6;
                            new WrongType(classCastException3, "dispatchEvent", 2, obj6);
                            throw th11;
                        }
                    } catch (ClassCastException e4) {
                        ClassCastException classCastException4 = e4;
                        Throwable th12 = th5;
                        new WrongType(classCastException4, "dispatchEvent", 1, obj5);
                        throw th12;
                    }
                case 15:
                    try {
                        try {
                            try {
                                try {
                                    this.$main.dispatchGenericEvent((Component) obj5, (String) obj6, obj7 != Boolean.FALSE, (Object[]) obj8);
                                    return Values.empty;
                                } catch (ClassCastException e5) {
                                    ClassCastException classCastException5 = e5;
                                    Throwable th13 = th4;
                                    new WrongType(classCastException5, "dispatchGenericEvent", 4, obj8);
                                    throw th13;
                                }
                            } catch (ClassCastException e6) {
                                ClassCastException classCastException6 = e6;
                                Throwable th14 = th3;
                                new WrongType(classCastException6, "dispatchGenericEvent", 3, obj7);
                                throw th14;
                            }
                        } catch (ClassCastException e7) {
                            ClassCastException classCastException7 = e7;
                            Throwable th15 = th2;
                            new WrongType(classCastException7, "dispatchGenericEvent", 2, obj6);
                            throw th15;
                        }
                    } catch (ClassCastException e8) {
                        ClassCastException classCastException8 = e8;
                        Throwable th16 = th;
                        new WrongType(classCastException8, "dispatchGenericEvent", 1, obj5);
                        throw th16;
                    }
                default:
                    return super.apply4(moduleMethod2, obj5, obj6, obj7, obj8);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            Throwable th;
            Throwable th2;
            Throwable th3;
            ModuleMethod moduleMethod2 = moduleMethod;
            Object obj3 = obj;
            Object obj4 = obj2;
            switch (moduleMethod2.selector) {
                case 3:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        ClassCastException classCastException = e;
                        Throwable th4 = th3;
                        new WrongType(classCastException, "add-to-form-environment", 1, obj3);
                        throw th4;
                    }
                case 4:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj3, obj4);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th2;
                        new WrongType(classCastException2, "lookup-in-form-environment", 1, obj3);
                        throw th5;
                    }
                case 7:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj3, obj4);
                        return Values.empty;
                    } catch (ClassCastException e3) {
                        ClassCastException classCastException3 = e3;
                        Throwable th6 = th;
                        new WrongType(classCastException3, "add-to-global-var-environment", 1, obj3);
                        throw th6;
                    }
                case 8:
                    this.$main.addToEvents(obj3, obj4);
                    return Values.empty;
                case 10:
                    this.$main.addToGlobalVars(obj3, obj4);
                    return Values.empty;
                case 16:
                    return this.$main.lookupHandler(obj3, obj4);
                default:
                    return super.apply2(moduleMethod2, obj3, obj4);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Video.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Video.lambda3();
                case 20:
                    return Video.lambda4();
                case 21:
                    return Video.lambda5();
                case 22:
                    return this.$main.Youtube_Player1$Initialized();
                case 23:
                    return Video.lambda6();
                case 24:
                    return Video.lambda7();
                case 25:
                    return Video.lambda8();
                case 26:
                    return Video.lambda9();
                case 27:
                    return Video.lambda10();
                case 28:
                    return Video.lambda11();
                case 29:
                    return this.$main.Youtube_Player2$Initialized();
                case 30:
                    return Video.lambda12();
                case 31:
                    return Video.lambda13();
                case 32:
                    return Video.lambda14();
                case 33:
                    return Video.lambda15();
                case 34:
                    return Video.lambda16();
                case 35:
                    return Video.lambda17();
                case 36:
                    return this.$main.Youtube_Player3$Initialized();
                case 37:
                    return Video.lambda18();
                case 38:
                    return Video.lambda19();
                case 39:
                    return Video.lambda20();
                case 40:
                    return Video.lambda21();
                case 41:
                    return Video.lambda22();
                case 42:
                    return Video.lambda23();
                default:
                    return super.apply0(moduleMethod2);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 17:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 18:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 19:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 20:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 21:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 22:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 23:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 24:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 25:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 26:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 27:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 28:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 29:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 30:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 31:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 32:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 33:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 34:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 35:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 36:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 37:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 38:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 39:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 40:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 41:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 42:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod2, callContext2);
            }
        }
    }

    public String getSimpleName(Object object) {
        return object.getClass().getSimpleName();
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.form$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol symbol, Object obj) {
        Object obj2;
        Symbol name = symbol;
        Object default$Mnvalue = obj;
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & true;
        if (!x ? !x : !this.form$Mnenvironment.isBound(name)) {
            obj2 = default$Mnvalue;
        } else {
            obj2 = this.form$Mnenvironment.get(name);
        }
        return obj2;
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol symbol, Object obj) {
        Symbol name = symbol;
        Object object = obj;
        Object[] objArr = new Object[4];
        objArr[0] = "Adding ~A to env ~A with value ~A";
        Object[] objArr2 = objArr;
        objArr2[1] = name;
        Object[] objArr3 = objArr2;
        objArr3[2] = this.global$Mnvar$Mnenvironment;
        Object[] objArr4 = objArr3;
        objArr4[3] = object;
        androidLogForm(Format.formatToString(0, objArr4));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        Object obj = error;
        RetValManager.sendError(obj == null ? null : obj.toString());
    }

    public void processException(Object obj) {
        Object ex = obj;
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component component, String str, String str2, Object[] objArr) {
        boolean z;
        boolean z2;
        Component componentObject = component;
        String registeredComponentName = str;
        String eventName = str2;
        Object[] args = objArr;
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            z = false;
        } else if (lookupInFormEnvironment(registeredObject) == componentObject) {
            try {
                Object apply2 = Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                z2 = true;
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
                z2 = false;
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        return z;
    }

    public void dispatchGenericEvent(Component component, String str, boolean z, Object[] objArr) {
        Boolean bool;
        Component componentObject = component;
        String eventName = str;
        boolean notAlreadyHandled = z;
        Object[] args = objArr;
        Object[] objArr2 = new Object[4];
        objArr2[0] = "any$";
        Object[] objArr3 = objArr2;
        objArr3[1] = getSimpleName(componentObject);
        Object[] objArr4 = objArr3;
        objArr4[2] = "$";
        Object[] objArr5 = objArr4;
        objArr5[3] = eventName;
        Object handler = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend(objArr5)));
        if (handler != Boolean.FALSE) {
            try {
                Apply apply = Scheme.apply;
                Object obj = handler;
                Component component2 = componentObject;
                if (notAlreadyHandled) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Object apply2 = apply.apply2(obj, lists.cons(component2, lists.cons(bool, LList.makeList(args, 0))));
            } catch (PermissionException e) {
                PermissionException exception = e;
                exception.printStackTrace();
                boolean x = this == componentObject;
                if (!x ? !x : !IsEqual.apply(eventName, "PermissionNeeded")) {
                    PermissionDenied(componentObject, eventName, exception.getPermissionNeeded());
                } else {
                    processException(exception);
                }
            } catch (Throwable th) {
                Throwable exception2 = th;
                androidLogForm(exception2.getMessage());
                exception2.printStackTrace();
                processException(exception2);
            }
        }
    }

    public Object lookupHandler(Object componentName, Object obj) {
        Object eventName = obj;
        Object obj2 = componentName;
        String obj3 = obj2 == null ? null : obj2.toString();
        Object obj4 = eventName;
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj3, obj4 == null ? null : obj4.toString())));
    }

    public void $define() {
        Object obj;
        Throwable th;
        Object obj2;
        Throwable th2;
        Object obj3;
        Throwable th3;
        Object obj4;
        Throwable th4;
        Object obj5;
        Throwable th5;
        Object obj6;
        Throwable th6;
        Object obj7;
        Throwable th7;
        Object obj8;
        Throwable th8;
        Throwable th9;
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception e) {
            Exception exception = e;
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Video = this;
        addToFormEnvironment(Lit0, this);
        Object obj9 = this.events$Mnto$Mnregister;
        while (true) {
            Object obj10 = obj9;
            if (obj10 == LList.Empty) {
                break;
            }
            Object obj11 = obj10;
            Object obj12 = obj11;
            try {
                Pair arg0 = (Pair) obj11;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj13 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj13, apply12 == null ? null : apply12.toString());
                obj9 = arg0.getCdr();
            } catch (ClassCastException e2) {
                ClassCastException classCastException = e2;
                Throwable th10 = th9;
                new WrongType(classCastException, "arg0", -2, obj12);
                throw th10;
            }
        }
        try {
            LList components = lists.reverse(this.components$Mnto$Mncreate);
            addToGlobalVars(Lit2, lambda$Fn1);
            LList event$Mninfo2 = components;
            while (event$Mninfo2 != LList.Empty) {
                Object obj14 = event$Mninfo2;
                obj6 = obj14;
                Pair arg02 = (Pair) obj14;
                Object component$Mninfo = arg02.getCar();
                Object apply13 = lists.caddr.apply1(component$Mninfo);
                Object apply14 = lists.cadddr.apply1(component$Mninfo);
                Object component$Mntype = lists.cadr.apply1(component$Mninfo);
                Object apply15 = lists.car.apply1(component$Mninfo);
                obj7 = apply15;
                Object component$Mnname = apply13;
                Object component$Mnobject = Invoke.make.apply2(component$Mntype, lookupInFormEnvironment((Symbol) apply15));
                Object apply3 = SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
                Object obj15 = component$Mnname;
                obj8 = obj15;
                addToFormEnvironment((Symbol) obj15, component$Mnobject);
                event$Mninfo2 = arg02.getCdr();
            }
            LList reverse = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
            while (reverse != LList.Empty) {
                Object obj16 = reverse;
                obj4 = obj16;
                Pair arg03 = (Pair) obj16;
                Object var$Mnval = arg03.getCar();
                Object apply16 = lists.car.apply1(var$Mnval);
                obj5 = apply16;
                addToGlobalVarEnvironment((Symbol) apply16, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                reverse = arg03.getCdr();
            }
            Object reverse2 = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
            while (reverse2 != LList.Empty) {
                Object obj17 = reverse2;
                obj3 = obj17;
                Pair arg04 = (Pair) obj17;
                Object force = misc.force(arg04.getCar());
                reverse2 = arg04.getCdr();
            }
            LList component$Mndescriptors = components;
            LList lList = component$Mndescriptors;
            while (lList != LList.Empty) {
                Object obj18 = lList;
                obj2 = obj18;
                Pair arg05 = (Pair) obj18;
                Object component$Mninfo2 = arg05.getCar();
                Object apply17 = lists.caddr.apply1(component$Mninfo2);
                Object init$Mnthunk = lists.cadddr.apply1(component$Mninfo2);
                if (init$Mnthunk != Boolean.FALSE) {
                    Object apply18 = Scheme.applyToArgs.apply1(init$Mnthunk);
                }
                lList = arg05.getCdr();
            }
            LList lList2 = component$Mndescriptors;
            while (lList2 != LList.Empty) {
                Object obj19 = lList2;
                obj = obj19;
                Pair arg06 = (Pair) obj19;
                Object component$Mninfo3 = arg06.getCar();
                Object component$Mnname2 = lists.caddr.apply1(component$Mninfo3);
                Object apply19 = lists.cadddr.apply1(component$Mninfo3);
                callInitialize(SlotGet.field.apply2(this, component$Mnname2));
                lList2 = arg06.getCdr();
            }
        } catch (ClassCastException e3) {
            ClassCastException classCastException2 = e3;
            Throwable th11 = th;
            new WrongType(classCastException2, "arg0", -2, obj);
            throw th11;
        } catch (ClassCastException e4) {
            ClassCastException classCastException3 = e4;
            Throwable th12 = th2;
            new WrongType(classCastException3, "arg0", -2, obj2);
            throw th12;
        } catch (ClassCastException e5) {
            ClassCastException classCastException4 = e5;
            Throwable th13 = th3;
            new WrongType(classCastException4, "arg0", -2, obj3);
            throw th13;
        } catch (ClassCastException e6) {
            ClassCastException classCastException5 = e6;
            Throwable th14 = th5;
            new WrongType(classCastException5, "add-to-global-var-environment", 0, obj5);
            throw th14;
        } catch (ClassCastException e7) {
            ClassCastException classCastException6 = e7;
            Throwable th15 = th4;
            new WrongType(classCastException6, "arg0", -2, obj4);
            throw th15;
        } catch (ClassCastException e8) {
            ClassCastException classCastException7 = e8;
            Throwable th16 = th8;
            new WrongType(classCastException7, "add-to-form-environment", 0, obj8);
            throw th16;
        } catch (ClassCastException e9) {
            ClassCastException classCastException8 = e9;
            Throwable th17 = th7;
            new WrongType(classCastException8, "lookup-in-form-environment", 0, obj7);
            throw th17;
        } catch (ClassCastException e10) {
            ClassCastException classCastException9 = e10;
            Throwable th18 = th6;
            new WrongType(classCastException9, "arg0", -2, obj6);
            throw th18;
        } catch (YailRuntimeError e11) {
            processException(e11);
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        LList symbols = LList.makeList(argsArray, 0);
        LList lList = symbols;
        Apply apply = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Object obj = symbols;
        Object obj2 = LList.Empty;
        while (true) {
            Object obj3 = obj2;
            Object obj4 = obj;
            if (obj4 == LList.Empty) {
                Object apply2 = apply.apply2(moduleMethod, LList.reverseInPlace(obj3));
                Object obj5 = apply2;
                try {
                    return misc.string$To$Symbol((CharSequence) apply2);
                } catch (ClassCastException e) {
                    ClassCastException classCastException = e;
                    Throwable th4 = th;
                    new WrongType(classCastException, "string->symbol", 1, obj5);
                    throw th4;
                }
            } else {
                Object obj6 = obj4;
                Object obj7 = obj6;
                try {
                    Pair arg0 = (Pair) obj6;
                    obj = arg0.getCdr();
                    Object car = arg0.getCar();
                    Object obj8 = car;
                    try {
                        obj2 = Pair.make(misc.symbol$To$String((Symbol) car), obj3);
                    } catch (ClassCastException e2) {
                        ClassCastException classCastException2 = e2;
                        Throwable th5 = th3;
                        new WrongType(classCastException2, "symbol->string", 1, obj8);
                        throw th5;
                    }
                } catch (ClassCastException e3) {
                    ClassCastException classCastException3 = e3;
                    Throwable th6 = th2;
                    new WrongType(classCastException3, "arg0", -2, obj7);
                    throw th6;
                }
            }
        }
    }

    static Object lambda2() {
        return null;
    }
}
