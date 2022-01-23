package io.kodular.mahendrabima278.Ebimbingan;

import androidx.fragment.app.FragmentTransaction;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.FirebaseDB;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.KodularFirebaseAuthentication;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.MakeroidCardView;
import com.google.appinventor.components.runtime.MakeroidCircularProgress;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.PushNotifications;
import com.google.appinventor.components.runtime.SpaceView;
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
import org.jose4j.jws.AlgorithmIdentifiers;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0;
    static final SimpleSymbol Lit1;
    static final IntNum Lit10;
    static final IntNum Lit100 = IntNum.make(-1040);
    static final FString Lit101;
    static final FString Lit102;
    static final FString Lit103;
    static final FString Lit104;
    static final SimpleSymbol Lit105;
    static final IntNum Lit106 = IntNum.make(-1005);
    static final FString Lit107;
    static final FString Lit108;
    static final FString Lit109;
    static final SimpleSymbol Lit11;
    static final FString Lit110;
    static final SimpleSymbol Lit111;
    static final FString Lit112;
    static final FString Lit113;
    static final FString Lit114;
    static final FString Lit115;
    static final SimpleSymbol Lit116;
    static final IntNum Lit117 = IntNum.make(-1005);
    static final FString Lit118;
    static final FString Lit119;
    static final SimpleSymbol Lit12;
    static final SimpleSymbol Lit120;
    static final IntNum Lit121;
    static final FString Lit122;
    static final PairWithPosition Lit123 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 954640), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 954635), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 954629);
    static final PairWithPosition Lit124 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 954657);
    static final PairWithPosition Lit125;
    static final SimpleSymbol Lit126;
    static final SimpleSymbol Lit127;
    static final PairWithPosition Lit128 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 954823), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 954817);
    static final PairWithPosition Lit129 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 955108), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 955104), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 955100), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 955095);
    static final SimpleSymbol Lit13;
    static final PairWithPosition Lit130 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 955137), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 955131);
    static final SimpleSymbol Lit131;
    static final FString Lit132;
    static final FString Lit133;
    static final PairWithPosition Lit134 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 983299), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 983294), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 983289), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 983283);
    static final PairWithPosition Lit135 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 983316);
    static final SimpleSymbol Lit136;
    static final SimpleSymbol Lit137;
    static final SimpleSymbol Lit138;
    static final PairWithPosition Lit139 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 983442);
    static final SimpleSymbol Lit14;
    static final SimpleSymbol Lit140;
    static final SimpleSymbol Lit141;
    static final SimpleSymbol Lit142;
    static final PairWithPosition Lit143 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 991411), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 991405);
    static final PairWithPosition Lit144 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 991428);
    static final SimpleSymbol Lit145;
    static final SimpleSymbol Lit146;
    static final SimpleSymbol Lit147;
    static final SimpleSymbol Lit148;
    static final SimpleSymbol Lit149;
    static final SimpleSymbol Lit15;
    static final PairWithPosition Lit150 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 999606), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 999600);
    static final PairWithPosition Lit151 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 999623);
    static final SimpleSymbol Lit152;
    static final SimpleSymbol Lit153;
    static final FString Lit154;
    static final FString Lit155;
    static final FString Lit156;
    static final SimpleSymbol Lit157;
    static final SimpleSymbol Lit158;
    static final SimpleSymbol Lit159;
    static final SimpleSymbol Lit16;
    static final SimpleSymbol Lit160;
    static final FString Lit161;
    static final SimpleSymbol Lit162;
    static final PairWithPosition Lit163 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1081614), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1081610), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1081605);
    static final PairWithPosition Lit164 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1081643), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1081637);
    static final SimpleSymbol Lit165;
    static final SimpleSymbol Lit166;
    static final SimpleSymbol Lit167;
    static final PairWithPosition Lit168 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1089654), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1089649);
    static final PairWithPosition Lit169;
    static final SimpleSymbol Lit17;
    static final SimpleSymbol Lit170;
    static final SimpleSymbol Lit171;
    static final FString Lit172;
    static final SimpleSymbol Lit173;
    static final SimpleSymbol Lit174;
    static final FString Lit175;
    static final SimpleSymbol Lit176;
    static final SimpleSymbol Lit177;
    static final SimpleSymbol Lit178;
    static final SimpleSymbol Lit179;
    static final SimpleSymbol Lit18;
    static final SimpleSymbol Lit180;
    static final SimpleSymbol Lit181;
    static final SimpleSymbol Lit182;
    static final SimpleSymbol Lit183;
    static final SimpleSymbol Lit184;
    static final SimpleSymbol Lit185;
    static final SimpleSymbol Lit186;
    static final SimpleSymbol Lit187;
    static final SimpleSymbol Lit188;
    static final SimpleSymbol Lit189;
    static final SimpleSymbol Lit19;
    static final SimpleSymbol Lit190;
    static final SimpleSymbol Lit2;
    static final SimpleSymbol Lit20;
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22;
    static final SimpleSymbol Lit23;
    static final SimpleSymbol Lit24;
    static final FString Lit25;
    static final SimpleSymbol Lit26;
    static final SimpleSymbol Lit27;
    static final IntNum Lit28 = IntNum.make(3);
    static final SimpleSymbol Lit29;
    static final SimpleSymbol Lit3;
    static final IntNum Lit30 = IntNum.make(-2);
    static final SimpleSymbol Lit31;
    static final FString Lit32;
    static final FString Lit33;
    static final SimpleSymbol Lit34;
    static final IntNum Lit35 = IntNum.make(-1010);
    static final FString Lit36;
    static final FString Lit37;
    static final SimpleSymbol Lit38;
    static final SimpleSymbol Lit39;
    static final SimpleSymbol Lit4;
    static final IntNum Lit40 = IntNum.make(70);
    static final SimpleSymbol Lit41;
    static final SimpleSymbol Lit42;
    static final IntNum Lit43;
    static final FString Lit44;
    static final FString Lit45;
    static final SimpleSymbol Lit46;
    static final SimpleSymbol Lit47;
    static final IntNum Lit48 = IntNum.make(2);
    static final IntNum Lit49 = IntNum.make(-1030);
    static final SimpleSymbol Lit5;
    static final IntNum Lit50 = IntNum.make(-1030);
    static final FString Lit51;
    static final FString Lit52;
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54;
    static final SimpleSymbol Lit55;
    static final FString Lit56;
    static final FString Lit57;
    static final SimpleSymbol Lit58;
    static final IntNum Lit59 = IntNum.make(-1020);
    static final SimpleSymbol Lit6;
    static final FString Lit60;
    static final FString Lit61;
    static final SimpleSymbol Lit62;
    static final FString Lit63;
    static final FString Lit64;
    static final SimpleSymbol Lit65;
    static final FString Lit66;
    static final FString Lit67;
    static final SimpleSymbol Lit68;
    static final IntNum Lit69;
    static final IntNum Lit7 = IntNum.make(21);
    static final SimpleSymbol Lit70;
    static final IntNum Lit71 = IntNum.make(1);
    static final SimpleSymbol Lit72;
    static final IntNum Lit73;
    static final IntNum Lit74 = IntNum.make(-1040);
    static final FString Lit75;
    static final PairWithPosition Lit76 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512109), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512104);
    static final SimpleSymbol Lit77;
    static final PairWithPosition Lit78 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512329), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512324);
    static final SimpleSymbol Lit79;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit80;
    static final SimpleSymbol Lit81;
    static final SimpleSymbol Lit82;
    static final SimpleSymbol Lit83;
    static final PairWithPosition Lit84 = PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512716), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512712), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512708), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512703);
    static final PairWithPosition Lit85 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512745), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 512739);
    static final SimpleSymbol Lit86;
    static final SimpleSymbol Lit87;
    static final FString Lit88;
    static final IntNum Lit89;
    static final SimpleSymbol Lit9;
    static final IntNum Lit90;
    static final IntNum Lit91 = IntNum.make(-1040);
    static final FString Lit92;
    static final SimpleSymbol Lit93;
    static final FString Lit94;
    static final SimpleSymbol Lit95;
    static final FString Lit96;
    static final FString Lit97;
    static final SimpleSymbol Lit98;
    static final IntNum Lit99 = IntNum.make(-1025);
    public static Screen1 Screen1;
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
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn41 = null;
    static final ModuleMethod lambda$Fn42 = null;
    static final ModuleMethod lambda$Fn43 = null;
    static final ModuleMethod lambda$Fn44 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public MakeroidCardView Card_View1;
    public MakeroidCircularProgress Circular_Progress1;
    public KodularFirebaseAuthentication Firebase_Authentication1;
    public final ModuleMethod Firebase_Authentication1$CurrentUserSuccess;
    public final ModuleMethod Firebase_Authentication1$LoginSuccess;
    public final ModuleMethod Firebase_Authentication1$SignUpFailed;
    public FirebaseDB Firebase_Database1;
    public final ModuleMethod Firebase_Database1$DataChanged;
    public final ModuleMethod Firebase_Database1$GotValue;
    public HorizontalArrangement Horizontal_Arrangement2;
    public HorizontalArrangement Horizontal_Arrangement3;
    public Image Image1;
    public Image Image2;
    public Label Label1;
    public Notifier Notifier1;
    public PushNotifications Push_Notifications1;
    public final ModuleMethod Screen1$Initialize;
    public SpaceView Space2;
    public SpaceView Space3;
    public SpaceView Space4;
    public VerticalArrangement Vertical_Arrangement1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public Button btn_keluar;
    public final ModuleMethod btn_keluar$Click;
    public Button btn_lanjut;
    public final ModuleMethod btn_lanjut$Click;
    public Button btn_login;
    public final ModuleMethod btn_login$Click;
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
    public VerticalArrangement halamanutama;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    public Label txtemail;
    public Label txtid;
    public Label txtnama;
    public VerticalArrangement user;

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
        SimpleSymbol simpleSymbol15;
        FString fString;
        SimpleSymbol simpleSymbol16;
        SimpleSymbol simpleSymbol17;
        FString fString2;
        SimpleSymbol simpleSymbol18;
        SimpleSymbol simpleSymbol19;
        SimpleSymbol simpleSymbol20;
        SimpleSymbol simpleSymbol21;
        SimpleSymbol simpleSymbol22;
        SimpleSymbol simpleSymbol23;
        SimpleSymbol simpleSymbol24;
        FString fString3;
        SimpleSymbol simpleSymbol25;
        SimpleSymbol simpleSymbol26;
        SimpleSymbol simpleSymbol27;
        SimpleSymbol simpleSymbol28;
        FString fString4;
        FString fString5;
        FString fString6;
        SimpleSymbol simpleSymbol29;
        SimpleSymbol simpleSymbol30;
        SimpleSymbol simpleSymbol31;
        SimpleSymbol simpleSymbol32;
        SimpleSymbol simpleSymbol33;
        SimpleSymbol simpleSymbol34;
        SimpleSymbol simpleSymbol35;
        SimpleSymbol simpleSymbol36;
        SimpleSymbol simpleSymbol37;
        SimpleSymbol simpleSymbol38;
        SimpleSymbol simpleSymbol39;
        SimpleSymbol simpleSymbol40;
        SimpleSymbol simpleSymbol41;
        FString fString7;
        FString fString8;
        SimpleSymbol simpleSymbol42;
        SimpleSymbol simpleSymbol43;
        SimpleSymbol simpleSymbol44;
        SimpleSymbol simpleSymbol45;
        FString fString9;
        SimpleSymbol simpleSymbol46;
        FString fString10;
        FString fString11;
        SimpleSymbol simpleSymbol47;
        FString fString12;
        FString fString13;
        FString fString14;
        FString fString15;
        SimpleSymbol simpleSymbol48;
        FString fString16;
        FString fString17;
        FString fString18;
        FString fString19;
        SimpleSymbol simpleSymbol49;
        FString fString20;
        FString fString21;
        FString fString22;
        FString fString23;
        SimpleSymbol simpleSymbol50;
        FString fString24;
        FString fString25;
        SimpleSymbol simpleSymbol51;
        FString fString26;
        SimpleSymbol simpleSymbol52;
        FString fString27;
        FString fString28;
        SimpleSymbol simpleSymbol53;
        SimpleSymbol simpleSymbol54;
        SimpleSymbol simpleSymbol55;
        SimpleSymbol simpleSymbol56;
        SimpleSymbol simpleSymbol57;
        SimpleSymbol simpleSymbol58;
        SimpleSymbol simpleSymbol59;
        SimpleSymbol simpleSymbol60;
        FString fString29;
        SimpleSymbol simpleSymbol61;
        SimpleSymbol simpleSymbol62;
        SimpleSymbol simpleSymbol63;
        FString fString30;
        FString fString31;
        SimpleSymbol simpleSymbol64;
        FString fString32;
        FString fString33;
        SimpleSymbol simpleSymbol65;
        FString fString34;
        FString fString35;
        SimpleSymbol simpleSymbol66;
        FString fString36;
        FString fString37;
        SimpleSymbol simpleSymbol67;
        SimpleSymbol simpleSymbol68;
        SimpleSymbol simpleSymbol69;
        FString fString38;
        FString fString39;
        SimpleSymbol simpleSymbol70;
        SimpleSymbol simpleSymbol71;
        FString fString40;
        FString fString41;
        SimpleSymbol simpleSymbol72;
        SimpleSymbol simpleSymbol73;
        SimpleSymbol simpleSymbol74;
        SimpleSymbol simpleSymbol75;
        FString fString42;
        FString fString43;
        SimpleSymbol simpleSymbol76;
        FString fString44;
        FString fString45;
        SimpleSymbol simpleSymbol77;
        SimpleSymbol simpleSymbol78;
        SimpleSymbol simpleSymbol79;
        SimpleSymbol simpleSymbol80;
        FString fString46;
        SimpleSymbol simpleSymbol81;
        SimpleSymbol simpleSymbol82;
        SimpleSymbol simpleSymbol83;
        SimpleSymbol simpleSymbol84;
        SimpleSymbol simpleSymbol85;
        SimpleSymbol simpleSymbol86;
        SimpleSymbol simpleSymbol87;
        SimpleSymbol simpleSymbol88;
        SimpleSymbol simpleSymbol89;
        SimpleSymbol simpleSymbol90;
        SimpleSymbol simpleSymbol91;
        SimpleSymbol simpleSymbol92;
        SimpleSymbol simpleSymbol93;
        SimpleSymbol simpleSymbol94;
        SimpleSymbol simpleSymbol95;
        SimpleSymbol simpleSymbol96;
        SimpleSymbol simpleSymbol97;
        SimpleSymbol simpleSymbol98;
        SimpleSymbol simpleSymbol99;
        SimpleSymbol simpleSymbol100;
        SimpleSymbol simpleSymbol101;
        new SimpleSymbol("any");
        Lit190 = (SimpleSymbol) simpleSymbol.readResolve();
        new SimpleSymbol("lookup-handler");
        Lit189 = (SimpleSymbol) simpleSymbol2.readResolve();
        new SimpleSymbol("dispatchGenericEvent");
        Lit188 = (SimpleSymbol) simpleSymbol3.readResolve();
        new SimpleSymbol("dispatchEvent");
        Lit187 = (SimpleSymbol) simpleSymbol4.readResolve();
        new SimpleSymbol("send-error");
        Lit186 = (SimpleSymbol) simpleSymbol5.readResolve();
        new SimpleSymbol("add-to-form-do-after-creation");
        Lit185 = (SimpleSymbol) simpleSymbol6.readResolve();
        new SimpleSymbol("add-to-global-vars");
        Lit184 = (SimpleSymbol) simpleSymbol7.readResolve();
        new SimpleSymbol("add-to-components");
        Lit183 = (SimpleSymbol) simpleSymbol8.readResolve();
        new SimpleSymbol("add-to-events");
        Lit182 = (SimpleSymbol) simpleSymbol9.readResolve();
        new SimpleSymbol("add-to-global-var-environment");
        Lit181 = (SimpleSymbol) simpleSymbol10.readResolve();
        new SimpleSymbol("is-bound-in-form-environment");
        Lit180 = (SimpleSymbol) simpleSymbol11.readResolve();
        new SimpleSymbol("lookup-in-form-environment");
        Lit179 = (SimpleSymbol) simpleSymbol12.readResolve();
        new SimpleSymbol("add-to-form-environment");
        Lit178 = (SimpleSymbol) simpleSymbol13.readResolve();
        new SimpleSymbol("android-log-form");
        Lit177 = (SimpleSymbol) simpleSymbol14.readResolve();
        new SimpleSymbol("get-simple-name");
        Lit176 = (SimpleSymbol) simpleSymbol15.readResolve();
        new FString("com.google.appinventor.components.runtime.PushNotifications");
        Lit175 = fString;
        new SimpleSymbol("OneSignalAppId");
        Lit174 = (SimpleSymbol) simpleSymbol16.readResolve();
        new SimpleSymbol("Push_Notifications1");
        Lit173 = (SimpleSymbol) simpleSymbol17.readResolve();
        new FString("com.google.appinventor.components.runtime.PushNotifications");
        Lit172 = fString2;
        new SimpleSymbol("DataChanged");
        Lit171 = (SimpleSymbol) simpleSymbol18.readResolve();
        new SimpleSymbol("Firebase_Database1$DataChanged");
        Lit170 = (SimpleSymbol) simpleSymbol19.readResolve();
        new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT);
        SimpleSymbol simpleSymbol102 = (SimpleSymbol) simpleSymbol20.readResolve();
        Lit4 = simpleSymbol102;
        Lit169 = PairWithPosition.make(simpleSymbol102, PairWithPosition.make(Lit190, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1089786), "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 1089780);
        new SimpleSymbol("$tag");
        Lit167 = (SimpleSymbol) simpleSymbol21.readResolve();
        new SimpleSymbol("GotValue");
        Lit166 = (SimpleSymbol) simpleSymbol22.readResolve();
        new SimpleSymbol("Firebase_Database1$GotValue");
        Lit165 = (SimpleSymbol) simpleSymbol23.readResolve();
        new SimpleSymbol("StoreValue");
        Lit162 = (SimpleSymbol) simpleSymbol24.readResolve();
        new FString("com.google.appinventor.components.runtime.FirebaseDB");
        Lit161 = fString3;
        new SimpleSymbol("ProjectBucket");
        Lit160 = (SimpleSymbol) simpleSymbol25.readResolve();
        new SimpleSymbol("FirebaseToken");
        Lit159 = (SimpleSymbol) simpleSymbol26.readResolve();
        new SimpleSymbol("DeveloperBucket");
        Lit158 = (SimpleSymbol) simpleSymbol27.readResolve();
        new SimpleSymbol("DefaultURL");
        Lit157 = (SimpleSymbol) simpleSymbol28.readResolve();
        new FString("com.google.appinventor.components.runtime.FirebaseDB");
        Lit156 = fString4;
        new FString("com.google.appinventor.components.runtime.Notifier");
        Lit155 = fString5;
        new FString("com.google.appinventor.components.runtime.Notifier");
        Lit154 = fString6;
        new SimpleSymbol("CurrentUserSuccess");
        Lit153 = (SimpleSymbol) simpleSymbol29.readResolve();
        new SimpleSymbol("Firebase_Authentication1$CurrentUserSuccess");
        Lit152 = (SimpleSymbol) simpleSymbol30.readResolve();
        new SimpleSymbol("LoginSuccess");
        Lit149 = (SimpleSymbol) simpleSymbol31.readResolve();
        new SimpleSymbol("Firebase_Authentication1$LoginSuccess");
        Lit148 = (SimpleSymbol) simpleSymbol32.readResolve();
        new SimpleSymbol("$userID");
        Lit147 = (SimpleSymbol) simpleSymbol33.readResolve();
        new SimpleSymbol("$email");
        Lit146 = (SimpleSymbol) simpleSymbol34.readResolve();
        new SimpleSymbol("$profilePicture");
        Lit145 = (SimpleSymbol) simpleSymbol35.readResolve();
        new SimpleSymbol("$name");
        Lit142 = (SimpleSymbol) simpleSymbol36.readResolve();
        new SimpleSymbol("SignUpFailed");
        Lit141 = (SimpleSymbol) simpleSymbol37.readResolve();
        new SimpleSymbol("Firebase_Authentication1$SignUpFailed");
        Lit140 = (SimpleSymbol) simpleSymbol38.readResolve();
        new SimpleSymbol("$message");
        Lit138 = (SimpleSymbol) simpleSymbol39.readResolve();
        new SimpleSymbol("ShowAlert");
        Lit137 = (SimpleSymbol) simpleSymbol40.readResolve();
        new SimpleSymbol("Notifier1");
        Lit136 = (SimpleSymbol) simpleSymbol41.readResolve();
        new FString("com.google.appinventor.components.runtime.KodularFirebaseAuthentication");
        Lit133 = fString7;
        new FString("com.google.appinventor.components.runtime.KodularFirebaseAuthentication");
        Lit132 = fString8;
        new SimpleSymbol("btn_lanjut$Click");
        Lit131 = (SimpleSymbol) simpleSymbol42.readResolve();
        new SimpleSymbol("GetValue");
        Lit127 = (SimpleSymbol) simpleSymbol43.readResolve();
        new SimpleSymbol("Firebase_Database1");
        Lit126 = (SimpleSymbol) simpleSymbol44.readResolve();
        new SimpleSymbol("boolean");
        SimpleSymbol simpleSymbol103 = (SimpleSymbol) simpleSymbol45.readResolve();
        Lit14 = simpleSymbol103;
        Lit125 = PairWithPosition.make(simpleSymbol103, LList.Empty, "/tmp/1642941051720_0.11789778122575434-0/youngandroidproject/../src/io/kodular/mahendrabima278/Ebimbingan/Screen1.yail", 954684);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit122 = fString9;
        int[] iArr = new int[2];
        iArr[0] = -12627531;
        Lit121 = IntNum.make(iArr);
        new SimpleSymbol("btn_lanjut");
        Lit120 = (SimpleSymbol) simpleSymbol46.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit119 = fString10;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit118 = fString11;
        new SimpleSymbol("Space4");
        Lit116 = (SimpleSymbol) simpleSymbol47.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit115 = fString12;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit114 = fString13;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit113 = fString14;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit112 = fString15;
        new SimpleSymbol("TextAlignment");
        Lit111 = (SimpleSymbol) simpleSymbol48.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit110 = fString16;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit109 = fString17;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit108 = fString18;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit107 = fString19;
        new SimpleSymbol("Space3");
        Lit105 = (SimpleSymbol) simpleSymbol49.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit104 = fString20;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit103 = fString21;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit102 = fString22;
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit101 = fString23;
        new SimpleSymbol("Card_View1");
        Lit98 = (SimpleSymbol) simpleSymbol50.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCardView");
        Lit97 = fString24;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit96 = fString25;
        new SimpleSymbol("user");
        Lit95 = (SimpleSymbol) simpleSymbol51.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit94 = fString26;
        new SimpleSymbol("btn_keluar$Click");
        Lit93 = (SimpleSymbol) simpleSymbol52.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit92 = fString27;
        int[] iArr2 = new int[2];
        iArr2[0] = -16537101;
        Lit90 = IntNum.make(iArr2);
        int[] iArr3 = new int[2];
        iArr3[0] = -12627531;
        Lit89 = IntNum.make(iArr3);
        new FString("com.google.appinventor.components.runtime.Button");
        Lit88 = fString28;
        new SimpleSymbol("Click");
        Lit87 = (SimpleSymbol) simpleSymbol53.readResolve();
        new SimpleSymbol("btn_login$Click");
        Lit86 = (SimpleSymbol) simpleSymbol54.readResolve();
        new SimpleSymbol("txtid");
        Lit83 = (SimpleSymbol) simpleSymbol55.readResolve();
        new SimpleSymbol("txtemail");
        Lit82 = (SimpleSymbol) simpleSymbol56.readResolve();
        new SimpleSymbol("txtnama");
        Lit81 = (SimpleSymbol) simpleSymbol57.readResolve();
        new SimpleSymbol("Image1");
        Lit80 = (SimpleSymbol) simpleSymbol58.readResolve();
        new SimpleSymbol("GetCurrentUser");
        Lit79 = (SimpleSymbol) simpleSymbol59.readResolve();
        new SimpleSymbol("GoogleSignIn");
        Lit77 = (SimpleSymbol) simpleSymbol60.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit75 = fString29;
        int[] iArr4 = new int[2];
        iArr4[0] = -16537101;
        Lit73 = IntNum.make(iArr4);
        new SimpleSymbol("TouchColor");
        Lit72 = (SimpleSymbol) simpleSymbol61.readResolve();
        new SimpleSymbol("Shape");
        Lit70 = (SimpleSymbol) simpleSymbol62.readResolve();
        int[] iArr5 = new int[2];
        iArr5[0] = -12627531;
        Lit69 = IntNum.make(iArr5);
        new SimpleSymbol("BackgroundColor");
        Lit68 = (SimpleSymbol) simpleSymbol63.readResolve();
        new FString("com.google.appinventor.components.runtime.Button");
        Lit67 = fString30;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit66 = fString31;
        new SimpleSymbol("Horizontal_Arrangement2");
        Lit65 = (SimpleSymbol) simpleSymbol64.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit64 = fString32;
        new FString("com.google.appinventor.components.runtime.MakeroidCircularProgress");
        Lit63 = fString33;
        new SimpleSymbol("Circular_Progress1");
        Lit62 = (SimpleSymbol) simpleSymbol65.readResolve();
        new FString("com.google.appinventor.components.runtime.MakeroidCircularProgress");
        Lit61 = fString34;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit60 = fString35;
        new SimpleSymbol("Vertical_Arrangement1");
        Lit58 = (SimpleSymbol) simpleSymbol66.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit57 = fString36;
        new FString("com.google.appinventor.components.runtime.Image");
        Lit56 = fString37;
        new SimpleSymbol("ScalePictureToFit");
        Lit55 = (SimpleSymbol) simpleSymbol67.readResolve();
        new SimpleSymbol("Picture");
        Lit54 = (SimpleSymbol) simpleSymbol68.readResolve();
        new SimpleSymbol("Image2");
        Lit53 = (SimpleSymbol) simpleSymbol69.readResolve();
        new FString("com.google.appinventor.components.runtime.Image");
        Lit52 = fString38;
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit51 = fString39;
        new SimpleSymbol("AlignVertical");
        Lit47 = (SimpleSymbol) simpleSymbol70.readResolve();
        new SimpleSymbol("Horizontal_Arrangement3");
        Lit46 = (SimpleSymbol) simpleSymbol71.readResolve();
        new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
        Lit45 = fString40;
        new FString("com.google.appinventor.components.runtime.Label");
        Lit44 = fString41;
        int[] iArr6 = new int[2];
        iArr6[0] = -12627531;
        Lit43 = IntNum.make(iArr6);
        new SimpleSymbol("TextColor");
        Lit42 = (SimpleSymbol) simpleSymbol72.readResolve();
        new SimpleSymbol("FontTypefaceImport");
        Lit41 = (SimpleSymbol) simpleSymbol73.readResolve();
        new SimpleSymbol("FontSize");
        Lit39 = (SimpleSymbol) simpleSymbol74.readResolve();
        new SimpleSymbol("Label1");
        Lit38 = (SimpleSymbol) simpleSymbol75.readResolve();
        new FString("com.google.appinventor.components.runtime.Label");
        Lit37 = fString42;
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit36 = fString43;
        new SimpleSymbol("Space2");
        Lit34 = (SimpleSymbol) simpleSymbol76.readResolve();
        new FString("com.google.appinventor.components.runtime.SpaceView");
        Lit33 = fString44;
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit32 = fString45;
        new SimpleSymbol("Width");
        Lit31 = (SimpleSymbol) simpleSymbol77.readResolve();
        new SimpleSymbol("Height");
        Lit29 = (SimpleSymbol) simpleSymbol78.readResolve();
        new SimpleSymbol("AlignHorizontal");
        Lit27 = (SimpleSymbol) simpleSymbol79.readResolve();
        new SimpleSymbol("halamanutama");
        Lit26 = (SimpleSymbol) simpleSymbol80.readResolve();
        new FString("com.google.appinventor.components.runtime.VerticalArrangement");
        Lit25 = fString46;
        new SimpleSymbol("Initialize");
        Lit24 = (SimpleSymbol) simpleSymbol81.readResolve();
        new SimpleSymbol("Screen1$Initialize");
        Lit23 = (SimpleSymbol) simpleSymbol82.readResolve();
        new SimpleSymbol("Text");
        Lit22 = (SimpleSymbol) simpleSymbol83.readResolve();
        new SimpleSymbol("btn_login");
        Lit21 = (SimpleSymbol) simpleSymbol84.readResolve();
        new SimpleSymbol("Visible");
        Lit20 = (SimpleSymbol) simpleSymbol85.readResolve();
        new SimpleSymbol("btn_keluar");
        Lit19 = (SimpleSymbol) simpleSymbol86.readResolve();
        new SimpleSymbol("IsSignedIn");
        Lit18 = (SimpleSymbol) simpleSymbol87.readResolve();
        new SimpleSymbol("Firebase_Authentication1");
        Lit17 = (SimpleSymbol) simpleSymbol88.readResolve();
        new SimpleSymbol("TitleVisible");
        Lit16 = (SimpleSymbol) simpleSymbol89.readResolve();
        new SimpleSymbol("Title");
        Lit15 = (SimpleSymbol) simpleSymbol90.readResolve();
        new SimpleSymbol("Scrollable");
        Lit13 = (SimpleSymbol) simpleSymbol91.readResolve();
        new SimpleSymbol("ScreenOrientation");
        Lit12 = (SimpleSymbol) simpleSymbol92.readResolve();
        new SimpleSymbol("ReceiveSharedText");
        Lit11 = (SimpleSymbol) simpleSymbol93.readResolve();
        int[] iArr7 = new int[2];
        iArr7[0] = -12627531;
        Lit10 = IntNum.make(iArr7);
        new SimpleSymbol("PrimaryColorDark");
        Lit9 = (SimpleSymbol) simpleSymbol94.readResolve();
        new SimpleSymbol("number");
        Lit8 = (SimpleSymbol) simpleSymbol95.readResolve();
        new SimpleSymbol("MinSdk");
        Lit6 = (SimpleSymbol) simpleSymbol96.readResolve();
        new SimpleSymbol("AppName");
        Lit5 = (SimpleSymbol) simpleSymbol97.readResolve();
        new SimpleSymbol("AppId");
        Lit3 = (SimpleSymbol) simpleSymbol98.readResolve();
        new SimpleSymbol("*the-null-value*");
        Lit2 = (SimpleSymbol) simpleSymbol99.readResolve();
        new SimpleSymbol("getMessage");
        Lit1 = (SimpleSymbol) simpleSymbol100.readResolve();
        new SimpleSymbol("Screen1");
        Lit0 = (SimpleSymbol) simpleSymbol101.readResolve();
    }

    public Screen1() {
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
        ModuleMethod moduleMethod42;
        ModuleMethod moduleMethod43;
        ModuleMethod moduleMethod44;
        ModuleMethod moduleMethod45;
        ModuleMethod moduleMethod46;
        ModuleMethod moduleMethod47;
        ModuleMethod moduleMethod48;
        ModuleMethod moduleMethod49;
        ModuleMethod moduleMethod50;
        ModuleMethod moduleMethod51;
        ModuleMethod moduleMethod52;
        ModuleMethod moduleMethod53;
        ModuleMethod moduleMethod54;
        ModuleMethod moduleMethod55;
        ModuleMethod moduleMethod56;
        ModuleMethod moduleMethod57;
        ModuleMethod moduleMethod58;
        ModuleMethod moduleMethod59;
        ModuleMethod moduleMethod60;
        ModuleMethod moduleMethod61;
        ModuleMethod moduleMethod62;
        ModuleMethod moduleMethod63;
        ModuleMethod moduleMethod64;
        ModuleMethod moduleMethod65;
        ModuleMethod moduleMethod66;
        ModuleMethod moduleMethod67;
        ModuleMethod moduleMethod68;
        ModuleMethod moduleMethod69;
        ModuleInfo.register(this);
        ModuleMethod moduleMethod70 = moduleMethod;
        new frame();
        frame frame3 = frame2;
        frame3.$main = this;
        frame frame4 = frame3;
        new ModuleMethod(frame4, 1, Lit176, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.get$Mnsimple$Mnname = moduleMethod70;
        new ModuleMethod(frame4, 2, Lit177, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.android$Mnlog$Mnform = moduleMethod2;
        new ModuleMethod(frame4, 3, Lit178, 8194);
        this.add$Mnto$Mnform$Mnenvironment = moduleMethod3;
        new ModuleMethod(frame4, 4, Lit179, 8193);
        this.lookup$Mnin$Mnform$Mnenvironment = moduleMethod4;
        new ModuleMethod(frame4, 6, Lit180, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = moduleMethod5;
        new ModuleMethod(frame4, 7, Lit181, 8194);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = moduleMethod6;
        new ModuleMethod(frame4, 8, Lit182, 8194);
        this.add$Mnto$Mnevents = moduleMethod7;
        new ModuleMethod(frame4, 9, Lit183, 16388);
        this.add$Mnto$Mncomponents = moduleMethod8;
        new ModuleMethod(frame4, 10, Lit184, 8194);
        this.add$Mnto$Mnglobal$Mnvars = moduleMethod9;
        new ModuleMethod(frame4, 11, Lit185, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = moduleMethod10;
        new ModuleMethod(frame4, 12, Lit186, FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.send$Mnerror = moduleMethod11;
        new ModuleMethod(frame4, 13, "process-exception", FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        this.process$Mnexception = moduleMethod12;
        new ModuleMethod(frame4, 14, Lit187, 16388);
        this.dispatchEvent = moduleMethod13;
        new ModuleMethod(frame4, 15, Lit188, 16388);
        this.dispatchGenericEvent = moduleMethod14;
        new ModuleMethod(frame4, 16, Lit189, 8194);
        this.lookup$Mnhandler = moduleMethod15;
        new ModuleMethod(frame4, 17, (Object) null, 0);
        ModuleMethod moduleMethod71 = moduleMethod16;
        moduleMethod71.setProperty("source-location", "/tmp/runtime5171376252785622841.scm:615");
        lambda$Fn1 = moduleMethod71;
        new ModuleMethod(frame4, 18, "$define", 0);
        this.$define = moduleMethod17;
        new ModuleMethod(frame4, 19, (Object) null, 0);
        lambda$Fn2 = moduleMethod18;
        new ModuleMethod(frame4, 20, Lit23, 0);
        this.Screen1$Initialize = moduleMethod19;
        new ModuleMethod(frame4, 21, (Object) null, 0);
        lambda$Fn3 = moduleMethod20;
        new ModuleMethod(frame4, 22, (Object) null, 0);
        lambda$Fn4 = moduleMethod21;
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
        new ModuleMethod(frame4, 29, (Object) null, 0);
        lambda$Fn11 = moduleMethod28;
        new ModuleMethod(frame4, 30, (Object) null, 0);
        lambda$Fn12 = moduleMethod29;
        new ModuleMethod(frame4, 31, (Object) null, 0);
        lambda$Fn13 = moduleMethod30;
        new ModuleMethod(frame4, 32, (Object) null, 0);
        lambda$Fn14 = moduleMethod31;
        new ModuleMethod(frame4, 33, (Object) null, 0);
        lambda$Fn15 = moduleMethod32;
        new ModuleMethod(frame4, 34, (Object) null, 0);
        lambda$Fn16 = moduleMethod33;
        new ModuleMethod(frame4, 35, (Object) null, 0);
        lambda$Fn17 = moduleMethod34;
        new ModuleMethod(frame4, 36, (Object) null, 0);
        lambda$Fn18 = moduleMethod35;
        new ModuleMethod(frame4, 37, (Object) null, 0);
        lambda$Fn19 = moduleMethod36;
        new ModuleMethod(frame4, 38, (Object) null, 0);
        lambda$Fn20 = moduleMethod37;
        new ModuleMethod(frame4, 39, Lit86, 0);
        this.btn_login$Click = moduleMethod38;
        new ModuleMethod(frame4, 40, (Object) null, 0);
        lambda$Fn21 = moduleMethod39;
        new ModuleMethod(frame4, 41, (Object) null, 0);
        lambda$Fn22 = moduleMethod40;
        new ModuleMethod(frame4, 42, Lit93, 0);
        this.btn_keluar$Click = moduleMethod41;
        new ModuleMethod(frame4, 43, (Object) null, 0);
        lambda$Fn23 = moduleMethod42;
        new ModuleMethod(frame4, 44, (Object) null, 0);
        lambda$Fn24 = moduleMethod43;
        new ModuleMethod(frame4, 45, (Object) null, 0);
        lambda$Fn25 = moduleMethod44;
        new ModuleMethod(frame4, 46, (Object) null, 0);
        lambda$Fn26 = moduleMethod45;
        new ModuleMethod(frame4, 47, (Object) null, 0);
        lambda$Fn27 = moduleMethod46;
        new ModuleMethod(frame4, 48, (Object) null, 0);
        lambda$Fn28 = moduleMethod47;
        new ModuleMethod(frame4, 49, (Object) null, 0);
        lambda$Fn29 = moduleMethod48;
        new ModuleMethod(frame4, 50, (Object) null, 0);
        lambda$Fn30 = moduleMethod49;
        new ModuleMethod(frame4, 51, (Object) null, 0);
        lambda$Fn31 = moduleMethod50;
        new ModuleMethod(frame4, 52, (Object) null, 0);
        lambda$Fn32 = moduleMethod51;
        new ModuleMethod(frame4, 53, (Object) null, 0);
        lambda$Fn33 = moduleMethod52;
        new ModuleMethod(frame4, 54, (Object) null, 0);
        lambda$Fn34 = moduleMethod53;
        new ModuleMethod(frame4, 55, (Object) null, 0);
        lambda$Fn35 = moduleMethod54;
        new ModuleMethod(frame4, 56, (Object) null, 0);
        lambda$Fn36 = moduleMethod55;
        new ModuleMethod(frame4, 57, (Object) null, 0);
        lambda$Fn37 = moduleMethod56;
        new ModuleMethod(frame4, 58, (Object) null, 0);
        lambda$Fn38 = moduleMethod57;
        new ModuleMethod(frame4, 59, (Object) null, 0);
        lambda$Fn39 = moduleMethod58;
        new ModuleMethod(frame4, 60, (Object) null, 0);
        lambda$Fn40 = moduleMethod59;
        new ModuleMethod(frame4, 61, Lit131, 0);
        this.btn_lanjut$Click = moduleMethod60;
        new ModuleMethod(frame4, 62, Lit140, 8194);
        this.Firebase_Authentication1$SignUpFailed = moduleMethod61;
        new ModuleMethod(frame4, 63, Lit148, 24582);
        this.Firebase_Authentication1$LoginSuccess = moduleMethod62;
        new ModuleMethod(frame4, 64, Lit152, 20485);
        this.Firebase_Authentication1$CurrentUserSuccess = moduleMethod63;
        new ModuleMethod(frame4, 65, (Object) null, 0);
        lambda$Fn41 = moduleMethod64;
        new ModuleMethod(frame4, 66, (Object) null, 0);
        lambda$Fn42 = moduleMethod65;
        new ModuleMethod(frame4, 67, Lit165, 8194);
        this.Firebase_Database1$GotValue = moduleMethod66;
        new ModuleMethod(frame4, 68, Lit170, 8194);
        this.Firebase_Database1$DataChanged = moduleMethod67;
        new ModuleMethod(frame4, 69, (Object) null, 0);
        lambda$Fn43 = moduleMethod68;
        new ModuleMethod(frame4, 70, (Object) null, 0);
        lambda$Fn44 = moduleMethod69;
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
        String obj;
        Object obj2;
        Consumer $result = $ctx.consumer;
        runtime.$instance.run();
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
        Screen1 = null;
        this.form$Mnname$Mnsymbol = Lit0;
        this.events$Mnto$Mnregister = LList.Empty;
        this.components$Mnto$Mncreate = LList.Empty;
        this.global$Mnvars$Mnto$Mncreate = LList.Empty;
        this.form$Mndo$Mnafter$Mncreation = LList.Empty;
        runtime.$instance.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "4587113544679424", Lit4);
            Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Ebimbingan", Lit4);
            Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
            Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit8);
            Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit0, Lit11, AlgorithmIdentifiers.NONE, Lit4);
            Object andCoerceProperty$Ex6 = runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "portrait", Lit4);
            Object andCoerceProperty$Ex7 = runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.TRUE, Lit14);
            Object andCoerceProperty$Ex8 = runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Screen1", Lit4);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit14), $result);
        } else {
            new Promise(lambda$Fn2);
            addToFormDoAfterCreation(obj2);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment = runtime.addToCurrentFormEnvironment(Lit23, this.Screen1$Initialize);
        } else {
            addToFormEnvironment(Lit23, this.Screen1$Initialize);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
        } else {
            addToEvents(Lit0, Lit24);
        }
        this.halamanutama = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit25, Lit26, lambda$Fn3), $result);
        } else {
            addToComponents(Lit0, Lit32, Lit26, lambda$Fn4);
        }
        this.Space2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit33, Lit34, lambda$Fn5), $result);
        } else {
            addToComponents(Lit26, Lit36, Lit34, lambda$Fn6);
        }
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit37, Lit38, lambda$Fn7), $result);
        } else {
            addToComponents(Lit26, Lit44, Lit38, lambda$Fn8);
        }
        this.Horizontal_Arrangement3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit45, Lit46, lambda$Fn9), $result);
        } else {
            addToComponents(Lit26, Lit51, Lit46, lambda$Fn10);
        }
        this.Image2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit46, Lit52, Lit53, lambda$Fn11), $result);
        } else {
            addToComponents(Lit46, Lit56, Lit53, lambda$Fn12);
        }
        this.Vertical_Arrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit57, Lit58, lambda$Fn13), $result);
        } else {
            addToComponents(Lit26, Lit60, Lit58, lambda$Fn14);
        }
        this.Circular_Progress1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit58, Lit61, Lit62, lambda$Fn15), $result);
        } else {
            addToComponents(Lit58, Lit63, Lit62, lambda$Fn16);
        }
        this.Horizontal_Arrangement2 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit26, Lit64, Lit65, lambda$Fn17), $result);
        } else {
            addToComponents(Lit26, Lit66, Lit65, lambda$Fn18);
        }
        this.btn_login = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit67, Lit21, lambda$Fn19), $result);
        } else {
            addToComponents(Lit65, Lit75, Lit21, lambda$Fn20);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment2 = runtime.addToCurrentFormEnvironment(Lit86, this.btn_login$Click);
        } else {
            addToFormEnvironment(Lit86, this.btn_login$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btn_login", "Click");
        } else {
            addToEvents(Lit21, Lit87);
        }
        this.btn_keluar = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit88, Lit19, lambda$Fn21), $result);
        } else {
            addToComponents(Lit65, Lit92, Lit19, lambda$Fn22);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment3 = runtime.addToCurrentFormEnvironment(Lit93, this.btn_keluar$Click);
        } else {
            addToFormEnvironment(Lit93, this.btn_keluar$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btn_keluar", "Click");
        } else {
            addToEvents(Lit19, Lit87);
        }
        this.user = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit94, Lit95, lambda$Fn23), $result);
        } else {
            addToComponents(Lit0, Lit96, Lit95, lambda$Fn24);
        }
        this.Card_View1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit97, Lit98, lambda$Fn25), $result);
        } else {
            addToComponents(Lit95, Lit101, Lit98, lambda$Fn26);
        }
        this.Image1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit98, Lit102, Lit80, lambda$Fn27), $result);
        } else {
            addToComponents(Lit98, Lit103, Lit80, lambda$Fn28);
        }
        this.Space3 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit104, Lit105, lambda$Fn29), $result);
        } else {
            addToComponents(Lit95, Lit107, Lit105, lambda$Fn30);
        }
        this.txtnama = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit108, Lit81, lambda$Fn31), $result);
        } else {
            addToComponents(Lit95, Lit109, Lit81, lambda$Fn32);
        }
        this.txtemail = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit110, Lit82, lambda$Fn33), $result);
        } else {
            addToComponents(Lit95, Lit112, Lit82, lambda$Fn34);
        }
        this.txtid = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit113, Lit83, lambda$Fn35), $result);
        } else {
            addToComponents(Lit95, Lit114, Lit83, lambda$Fn36);
        }
        this.Space4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit115, Lit116, lambda$Fn37), $result);
        } else {
            addToComponents(Lit95, Lit118, Lit116, lambda$Fn38);
        }
        this.btn_lanjut = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit95, Lit119, Lit120, lambda$Fn39), $result);
        } else {
            addToComponents(Lit95, Lit122, Lit120, lambda$Fn40);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment4 = runtime.addToCurrentFormEnvironment(Lit131, this.btn_lanjut$Click);
        } else {
            addToFormEnvironment(Lit131, this.btn_lanjut$Click);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btn_lanjut", "Click");
        } else {
            addToEvents(Lit120, Lit87);
        }
        this.Firebase_Authentication1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit132, Lit17, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit133, Lit17, Boolean.FALSE);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment5 = runtime.addToCurrentFormEnvironment(Lit140, this.Firebase_Authentication1$SignUpFailed);
        } else {
            addToFormEnvironment(Lit140, this.Firebase_Authentication1$SignUpFailed);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Firebase_Authentication1", "SignUpFailed");
        } else {
            addToEvents(Lit17, Lit141);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment6 = runtime.addToCurrentFormEnvironment(Lit148, this.Firebase_Authentication1$LoginSuccess);
        } else {
            addToFormEnvironment(Lit148, this.Firebase_Authentication1$LoginSuccess);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Firebase_Authentication1", "LoginSuccess");
        } else {
            addToEvents(Lit17, Lit149);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment7 = runtime.addToCurrentFormEnvironment(Lit152, this.Firebase_Authentication1$CurrentUserSuccess);
        } else {
            addToFormEnvironment(Lit152, this.Firebase_Authentication1$CurrentUserSuccess);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Firebase_Authentication1", "CurrentUserSuccess");
        } else {
            addToEvents(Lit17, Lit153);
        }
        this.Notifier1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit154, Lit136, Boolean.FALSE), $result);
        } else {
            addToComponents(Lit0, Lit155, Lit136, Boolean.FALSE);
        }
        this.Firebase_Database1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit156, Lit126, lambda$Fn41), $result);
        } else {
            addToComponents(Lit0, Lit161, Lit126, lambda$Fn42);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment8 = runtime.addToCurrentFormEnvironment(Lit165, this.Firebase_Database1$GotValue);
        } else {
            addToFormEnvironment(Lit165, this.Firebase_Database1$GotValue);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Firebase_Database1", "GotValue");
        } else {
            addToEvents(Lit126, Lit166);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Object addToCurrentFormEnvironment9 = runtime.addToCurrentFormEnvironment(Lit170, this.Firebase_Database1$DataChanged);
        } else {
            addToFormEnvironment(Lit170, this.Firebase_Database1$DataChanged);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Firebase_Database1", "DataChanged");
        } else {
            addToEvents(Lit126, Lit171);
        }
        this.Push_Notifications1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit172, Lit173, lambda$Fn43), $result);
        } else {
            addToComponents(Lit0, Lit175, Lit173, lambda$Fn44);
        }
        runtime.initRuntime();
    }

    static Object lambda3() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "4587113544679424", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Ebimbingan", Lit4);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit0, Lit6, Lit7, Lit8);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit0, Lit9, Lit10, Lit8);
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(Lit0, Lit11, AlgorithmIdentifiers.NONE, Lit4);
        Object andCoerceProperty$Ex6 = runtime.setAndCoerceProperty$Ex(Lit0, Lit12, "portrait", Lit4);
        Object andCoerceProperty$Ex7 = runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Boolean.TRUE, Lit14);
        Object andCoerceProperty$Ex8 = runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "Screen1", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit14);
    }

    public Object Screen1$Initialize() {
        Object obj;
        runtime.setThisForm();
        if (runtime.callComponentMethod(Lit17, Lit18, LList.Empty, LList.Empty) != Boolean.FALSE) {
            Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.FALSE, Lit14);
            obj = runtime.setAndCoerceProperty$Ex(Lit21, Lit22, "MASUK", Lit4);
        } else {
            obj = Values.empty;
        }
        return obj;
    }

    static Object lambda4() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit26, Lit29, Lit30, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit31, Lit30, Lit8);
    }

    static Object lambda5() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit26, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit26, Lit29, Lit30, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit26, Lit31, Lit30, Lit8);
    }

    static Object lambda6() {
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit29, Lit35, Lit8);
    }

    static Object lambda7() {
        return runtime.setAndCoerceProperty$Ex(Lit34, Lit29, Lit35, Lit8);
    }

    static Object lambda8() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit40, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit38, Lit41, "Licorice-Regular.ttf", Lit4);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit38, Lit22, "Welcome", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit43, Lit8);
    }

    static Object lambda9() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Lit40, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit38, Lit41, "Licorice-Regular.ttf", Lit4);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit38, Lit22, "Welcome", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit42, Lit43, Lit8);
    }

    static Object lambda10() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit46, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit46, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit46, Lit29, Lit49, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit31, Lit50, Lit8);
    }

    static Object lambda11() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit46, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit46, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit46, Lit29, Lit49, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit46, Lit31, Lit50, Lit8);
    }

    static Object lambda12() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit53, Lit54, "logo_bimbingan.png", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit53, Lit55, Boolean.TRUE, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit31, Lit30, Lit8);
    }

    static Object lambda13() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit53, Lit54, "logo_bimbingan.png", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit53, Lit55, Boolean.TRUE, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit53, Lit31, Lit30, Lit8);
    }

    static Object lambda14() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit58, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit58, Lit47, Lit48, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit29, Lit59, Lit8);
    }

    static Object lambda15() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit58, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit58, Lit47, Lit48, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit58, Lit29, Lit59, Lit8);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit20, Boolean.FALSE, Lit14);
    }

    static Object lambda17() {
        return runtime.setAndCoerceProperty$Ex(Lit62, Lit20, Boolean.FALSE, Lit14);
    }

    static Object lambda18() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit65, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit65, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit65, Lit29, Lit30, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit31, Lit30, Lit8);
    }

    static Object lambda19() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit65, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit65, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit65, Lit29, Lit30, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit65, Lit31, Lit30, Lit8);
    }

    static Object lambda20() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit21, Lit68, Lit69, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit21, Lit70, Lit71, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit21, Lit22, "LOGIN", Lit4);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit21, Lit72, Lit73, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit31, Lit74, Lit8);
    }

    static Object lambda21() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit21, Lit68, Lit69, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit21, Lit70, Lit71, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit21, Lit22, "LOGIN", Lit4);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit21, Lit72, Lit73, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit31, Lit74, Lit8);
    }

    public Object btn_login$Click() {
        Object obj;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit21, Lit22), "LOGIN"), Lit76, "=") != Boolean.FALSE) {
            obj = runtime.callComponentMethod(Lit17, Lit77, LList.Empty, LList.Empty);
        } else if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.get$Mnproperty.apply2(Lit21, Lit22), "MASUK"), Lit78, "=") != Boolean.FALSE) {
            Object callComponentMethod = runtime.callComponentMethod(Lit17, Lit79, LList.Empty, LList.Empty);
            obj = runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("Home", runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list4(runtime.get$Mnproperty.apply2(Lit80, Lit54), runtime.get$Mnproperty.apply2(Lit81, Lit22), runtime.get$Mnproperty.apply2(Lit82, Lit22), runtime.get$Mnproperty.apply2(Lit83, Lit22)), Lit84, "make a list")), Lit85, "open another screen with start value");
        } else {
            obj = Values.empty;
        }
        return obj;
    }

    static Object lambda22() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit19, Lit68, Lit89, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit19, Lit70, Lit71, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit19, Lit22, "KELUAR", Lit4);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit19, Lit72, Lit90, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit31, Lit91, Lit8);
    }

    static Object lambda23() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit19, Lit68, Lit89, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit19, Lit70, Lit71, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit19, Lit22, "KELUAR", Lit4);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit19, Lit72, Lit90, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit31, Lit91, Lit8);
    }

    public Object btn_keluar$Click() {
        runtime.setThisForm();
        return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
    }

    static Object lambda24() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit95, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit95, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit95, Lit29, Lit30, Lit8);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit95, Lit20, Boolean.FALSE, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit31, Lit30, Lit8);
    }

    static Object lambda25() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit95, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit95, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit95, Lit29, Lit30, Lit8);
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(Lit95, Lit20, Boolean.FALSE, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit95, Lit31, Lit30, Lit8);
    }

    static Object lambda26() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit98, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit98, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit98, Lit29, Lit99, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit31, Lit100, Lit8);
    }

    static Object lambda27() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit98, Lit27, Lit28, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit98, Lit47, Lit48, Lit8);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit98, Lit29, Lit99, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit98, Lit31, Lit100, Lit8);
    }

    static Object lambda28() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit80, Lit55, Boolean.TRUE, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit31, Lit30, Lit8);
    }

    static Object lambda29() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit80, Lit55, Boolean.TRUE, Lit14);
        return runtime.setAndCoerceProperty$Ex(Lit80, Lit31, Lit30, Lit8);
    }

    static Object lambda30() {
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit29, Lit106, Lit8);
    }

    static Object lambda31() {
        return runtime.setAndCoerceProperty$Ex(Lit105, Lit29, Lit106, Lit8);
    }

    static Object lambda32() {
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit22, "Text for Label2", Lit4);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit81, Lit22, "Text for Label2", Lit4);
    }

    static Object lambda34() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit82, Lit22, "Text for Label2", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit82, Lit111, Lit71, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit31, Lit30, Lit8);
    }

    static Object lambda35() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit82, Lit22, "Text for Label2", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit82, Lit111, Lit71, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit31, Lit30, Lit8);
    }

    static Object lambda36() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit83, Lit22, "Text for Label3", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit83, Lit20, Boolean.FALSE, Lit14);
    }

    static Object lambda37() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit83, Lit22, "Text for Label3", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit83, Lit20, Boolean.FALSE, Lit14);
    }

    static Object lambda38() {
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit29, Lit117, Lit8);
    }

    static Object lambda39() {
        return runtime.setAndCoerceProperty$Ex(Lit116, Lit29, Lit117, Lit8);
    }

    static Object lambda40() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit120, Lit68, Lit121, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit120, Lit70, Lit71, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit120, Lit22, "LANJUT", Lit4);
    }

    static Object lambda41() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit120, Lit68, Lit121, Lit8);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit120, Lit70, Lit71, Lit8);
        return runtime.setAndCoerceProperty$Ex(Lit120, Lit22, "LANJUT", Lit4);
    }

    public Object btn_lanjut$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnnot, LList.list1(runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.callYailPrimitive(strings.string$Mnappend, LList.list3(runtime.get$Mnproperty.apply2(Lit83, Lit22), runtime.get$Mnproperty.apply2(Lit81, Lit22), runtime.get$Mnproperty.apply2(Lit82, Lit22)), Lit123, "join")), Lit124, "is text empty?")), Lit125, "not") != Boolean.FALSE) {
            Object callComponentMethod = runtime.callComponentMethod(Lit126, Lit127, LList.list2(runtime.get$Mnproperty.apply2(Lit83, Lit22), ""), Lit128);
        }
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("Home", runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list4(runtime.get$Mnproperty.apply2(Lit80, Lit54), runtime.get$Mnproperty.apply2(Lit81, Lit22), runtime.get$Mnproperty.apply2(Lit82, Lit22), runtime.get$Mnproperty.apply2(Lit83, Lit22)), Lit129, "make a list")), Lit130, "open another screen with start value");
    }

    public Object Firebase_Authentication1$SignUpFailed(Object $provider, Object $message) {
        Object obj;
        Object obj2;
        Object sanitizeComponentData = runtime.sanitizeComponentData($provider);
        Object $message2 = runtime.sanitizeComponentData($message);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(runtime.callYailPrimitive(strings.string$Mnappend, LList.list4(runtime.get$Mnproperty.apply2(Lit80, Lit54), runtime.get$Mnproperty.apply2(Lit81, Lit22), runtime.get$Mnproperty.apply2(Lit82, Lit22), runtime.get$Mnproperty.apply2(Lit83, Lit22)), Lit134, "join")), Lit135, "is text empty?") != Boolean.FALSE) {
            SimpleSymbol simpleSymbol = Lit136;
            SimpleSymbol simpleSymbol2 = Lit137;
            if ($message2 instanceof Package) {
                Object[] objArr = new Object[3];
                objArr[0] = "The variable ";
                Object[] objArr2 = objArr;
                objArr2[1] = runtime.getDisplayRepresentation(Lit138);
                Object[] objArr3 = objArr2;
                objArr3[2] = " is not bound in the current context";
                obj2 = runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
            } else {
                obj2 = $message2;
            }
            obj = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(obj2), Lit139);
        } else {
            obj = Values.empty;
        }
        return obj;
    }

    public Object Firebase_Authentication1$LoginSuccess(Object $provider, Object $userID, Object $name, Object $email, Object $phoneNumber, Object $profilePicture) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object sanitizeComponentData = runtime.sanitizeComponentData($provider);
        Object sanitizeComponentData2 = runtime.sanitizeComponentData($userID);
        Object sanitizeComponentData3 = runtime.sanitizeComponentData($name);
        Object sanitizeComponentData4 = runtime.sanitizeComponentData($email);
        Object sanitizeComponentData5 = runtime.sanitizeComponentData($phoneNumber);
        Object $profilePicture2 = runtime.sanitizeComponentData($profilePicture);
        Object $email2 = sanitizeComponentData4;
        Object $name2 = sanitizeComponentData3;
        Object $userID2 = sanitizeComponentData2;
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit136;
        SimpleSymbol simpleSymbol2 = Lit137;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        if ($name2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = runtime.getDisplayRepresentation(Lit142);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $name2;
        }
        Object callComponentMethod = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, LList.list2("Anda Berhasil Login ", obj), Lit143, "join")), Lit144);
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit26, Lit20, Boolean.FALSE, Lit14);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit95, Lit20, Boolean.TRUE, Lit14);
        SimpleSymbol simpleSymbol3 = Lit80;
        SimpleSymbol simpleSymbol4 = Lit54;
        if ($profilePicture2 instanceof Package) {
            Object[] objArr4 = new Object[3];
            objArr4[0] = "The variable ";
            Object[] objArr5 = objArr4;
            objArr5[1] = runtime.getDisplayRepresentation(Lit145);
            Object[] objArr6 = objArr5;
            objArr6[2] = " is not bound in the current context";
            obj2 = runtime.signalRuntimeError(strings.stringAppend(objArr6), "Unbound Variable");
        } else {
            obj2 = $profilePicture2;
        }
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(simpleSymbol3, simpleSymbol4, obj2, Lit4);
        SimpleSymbol simpleSymbol5 = Lit81;
        SimpleSymbol simpleSymbol6 = Lit22;
        if ($name2 instanceof Package) {
            Object[] objArr7 = new Object[3];
            objArr7[0] = "The variable ";
            Object[] objArr8 = objArr7;
            objArr8[1] = runtime.getDisplayRepresentation(Lit142);
            Object[] objArr9 = objArr8;
            objArr9[2] = " is not bound in the current context";
            obj3 = runtime.signalRuntimeError(strings.stringAppend(objArr9), "Unbound Variable");
        } else {
            obj3 = $name2;
        }
        Object andCoerceProperty$Ex4 = runtime.setAndCoerceProperty$Ex(simpleSymbol5, simpleSymbol6, obj3, Lit4);
        SimpleSymbol simpleSymbol7 = Lit82;
        SimpleSymbol simpleSymbol8 = Lit22;
        if ($email2 instanceof Package) {
            Object[] objArr10 = new Object[3];
            objArr10[0] = "The variable ";
            Object[] objArr11 = objArr10;
            objArr11[1] = runtime.getDisplayRepresentation(Lit146);
            Object[] objArr12 = objArr11;
            objArr12[2] = " is not bound in the current context";
            obj4 = runtime.signalRuntimeError(strings.stringAppend(objArr12), "Unbound Variable");
        } else {
            obj4 = $email2;
        }
        Object andCoerceProperty$Ex5 = runtime.setAndCoerceProperty$Ex(simpleSymbol7, simpleSymbol8, obj4, Lit4);
        SimpleSymbol simpleSymbol9 = Lit83;
        SimpleSymbol simpleSymbol10 = Lit22;
        if ($userID2 instanceof Package) {
            Object[] objArr13 = new Object[3];
            objArr13[0] = "The variable ";
            Object[] objArr14 = objArr13;
            objArr14[1] = runtime.getDisplayRepresentation(Lit147);
            Object[] objArr15 = objArr14;
            objArr15[2] = " is not bound in the current context";
            obj5 = runtime.signalRuntimeError(strings.stringAppend(objArr15), "Unbound Variable");
        } else {
            obj5 = $userID2;
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol9, simpleSymbol10, obj5, Lit4);
    }

    public Object Firebase_Authentication1$CurrentUserSuccess(Object $userID, Object $name, Object $email, Object $phoneNumber, Object $profilePicture) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object sanitizeComponentData = runtime.sanitizeComponentData($userID);
        Object sanitizeComponentData2 = runtime.sanitizeComponentData($name);
        Object sanitizeComponentData3 = runtime.sanitizeComponentData($email);
        Object sanitizeComponentData4 = runtime.sanitizeComponentData($phoneNumber);
        Object $profilePicture2 = runtime.sanitizeComponentData($profilePicture);
        Object $email2 = sanitizeComponentData3;
        Object $name2 = sanitizeComponentData2;
        Object $userID2 = sanitizeComponentData;
        runtime.setThisForm();
        SimpleSymbol simpleSymbol = Lit136;
        SimpleSymbol simpleSymbol2 = Lit137;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        if ($name2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = runtime.getDisplayRepresentation(Lit142);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $name2;
        }
        Object callComponentMethod = runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, LList.list2("Selamat Datang Kembali ", obj), Lit150, "join")), Lit151);
        SimpleSymbol simpleSymbol3 = Lit80;
        SimpleSymbol simpleSymbol4 = Lit54;
        if ($profilePicture2 instanceof Package) {
            Object[] objArr4 = new Object[3];
            objArr4[0] = "The variable ";
            Object[] objArr5 = objArr4;
            objArr5[1] = runtime.getDisplayRepresentation(Lit145);
            Object[] objArr6 = objArr5;
            objArr6[2] = " is not bound in the current context";
            obj2 = runtime.signalRuntimeError(strings.stringAppend(objArr6), "Unbound Variable");
        } else {
            obj2 = $profilePicture2;
        }
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(simpleSymbol3, simpleSymbol4, obj2, Lit4);
        SimpleSymbol simpleSymbol5 = Lit81;
        SimpleSymbol simpleSymbol6 = Lit22;
        if ($name2 instanceof Package) {
            Object[] objArr7 = new Object[3];
            objArr7[0] = "The variable ";
            Object[] objArr8 = objArr7;
            objArr8[1] = runtime.getDisplayRepresentation(Lit142);
            Object[] objArr9 = objArr8;
            objArr9[2] = " is not bound in the current context";
            obj3 = runtime.signalRuntimeError(strings.stringAppend(objArr9), "Unbound Variable");
        } else {
            obj3 = $name2;
        }
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(simpleSymbol5, simpleSymbol6, obj3, Lit4);
        SimpleSymbol simpleSymbol7 = Lit82;
        SimpleSymbol simpleSymbol8 = Lit22;
        if ($email2 instanceof Package) {
            Object[] objArr10 = new Object[3];
            objArr10[0] = "The variable ";
            Object[] objArr11 = objArr10;
            objArr11[1] = runtime.getDisplayRepresentation(Lit146);
            Object[] objArr12 = objArr11;
            objArr12[2] = " is not bound in the current context";
            obj4 = runtime.signalRuntimeError(strings.stringAppend(objArr12), "Unbound Variable");
        } else {
            obj4 = $email2;
        }
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(simpleSymbol7, simpleSymbol8, obj4, Lit4);
        SimpleSymbol simpleSymbol9 = Lit83;
        SimpleSymbol simpleSymbol10 = Lit22;
        if ($userID2 instanceof Package) {
            Object[] objArr13 = new Object[3];
            objArr13[0] = "The variable ";
            Object[] objArr14 = objArr13;
            objArr14[1] = runtime.getDisplayRepresentation(Lit147);
            Object[] objArr15 = objArr14;
            objArr15[2] = " is not bound in the current context";
            obj5 = runtime.signalRuntimeError(strings.stringAppend(objArr15), "Unbound Variable");
        } else {
            obj5 = $userID2;
        }
        return runtime.setAndCoerceProperty$Ex(simpleSymbol9, simpleSymbol10, obj5, Lit4);
    }

    static Object lambda42() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit126, Lit157, "https://makeroid-default-firebase.firebaseio.com/", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit126, Lit158, "mahendrabima278@gmail:com/", Lit4);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit126, Lit159, "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkIjp7InVpZCI6IjUzZTgyOWJkLTBmY2EtNGY3Yi1hYjhlLTQ4MjFkMjJmN2M4ZSIsInByb2plY3QiOiIiLCJkZXZlbG9wZXIiOiJtYWhlbmRyYWJpbWEyNzhAZ21haWw6Y29tIn0sInYiOjAsImV4cCI6MTY3MjcxNzEzODIsImlhdCI6MTY0Mjk0MDk4Mn0.KlJliu9qI93ArlCWUHHu8TBA_N48ZwYfP4TZqPv5Q7Q", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit160, "Ebimbingan", Lit4);
    }

    static Object lambda43() {
        Object andCoerceProperty$Ex = runtime.setAndCoerceProperty$Ex(Lit126, Lit157, "https://makeroid-default-firebase.firebaseio.com/", Lit4);
        Object andCoerceProperty$Ex2 = runtime.setAndCoerceProperty$Ex(Lit126, Lit158, "mahendrabima278@gmail:com/", Lit4);
        Object andCoerceProperty$Ex3 = runtime.setAndCoerceProperty$Ex(Lit126, Lit159, "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJkIjp7InVpZCI6IjUzZTgyOWJkLTBmY2EtNGY3Yi1hYjhlLTQ4MjFkMjJmN2M4ZSIsInByb2plY3QiOiIiLCJkZXZlbG9wZXIiOiJtYWhlbmRyYWJpbWEyNzhAZ21haWw6Y29tIn0sInYiOjAsImV4cCI6MTY3MjcxNzEzODIsImlhdCI6MTY0Mjk0MDk4Mn0.KlJliu9qI93ArlCWUHHu8TBA_N48ZwYfP4TZqPv5Q7Q", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit126, Lit160, "Ebimbingan", Lit4);
    }

    public Object Firebase_Database1$GotValue(Object $tag, Object $value) {
        Object sanitizeComponentData = runtime.sanitizeComponentData($tag);
        Object sanitizeComponentData2 = runtime.sanitizeComponentData($value);
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit126, Lit162, LList.list2(runtime.get$Mnproperty.apply2(Lit83, Lit22), runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list3(runtime.get$Mnproperty.apply2(Lit82, Lit22), runtime.get$Mnproperty.apply2(Lit81, Lit22), runtime.get$Mnproperty.apply2(Lit80, Lit54)), Lit163, "make a list")), Lit164);
    }

    public Object Firebase_Database1$DataChanged(Object $tag, Object $value) {
        Object obj;
        Object sanitizeComponentData = runtime.sanitizeComponentData($tag);
        Object sanitizeComponentData2 = runtime.sanitizeComponentData($value);
        Object $tag2 = sanitizeComponentData;
        runtime.setThisForm();
        ModuleMethod moduleMethod = runtime.yail$Mnequal$Qu;
        if ($tag2 instanceof Package) {
            Object[] objArr = new Object[3];
            objArr[0] = "The variable ";
            Object[] objArr2 = objArr;
            objArr2[1] = runtime.getDisplayRepresentation(Lit167);
            Object[] objArr3 = objArr2;
            objArr3[2] = " is not bound in the current context";
            obj = runtime.signalRuntimeError(strings.stringAppend(objArr3), "Unbound Variable");
        } else {
            obj = $tag2;
        }
        return runtime.callYailPrimitive(moduleMethod, LList.list2(obj, runtime.get$Mnproperty.apply2(Lit83, Lit22)), Lit168, "=") != Boolean.FALSE ? runtime.callComponentMethod(Lit126, Lit127, LList.list2(runtime.get$Mnproperty.apply2(Lit83, Lit22), ""), Lit169) : Values.empty;
    }

    static Object lambda44() {
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit174, "4358722c-6daa-4b48-8173-6e6a332640fe", Lit4);
    }

    static Object lambda45() {
        return runtime.setAndCoerceProperty$Ex(Lit173, Lit174, "4358722c-6daa-4b48-8173-6e6a332640fe", Lit4);
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main;

        public frame() {
        }

        public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object[] objArr2 = objArr;
            switch (moduleMethod2.selector) {
                case 63:
                    return this.$main.Firebase_Authentication1$LoginSuccess(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5]);
                case 64:
                    return this.$main.Firebase_Authentication1$CurrentUserSuccess(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4]);
                default:
                    return super.applyN(moduleMethod2, objArr2);
            }
        }

        public int matchN(ModuleMethod moduleMethod, Object[] objArr, CallContext callContext) {
            ModuleMethod moduleMethod2 = moduleMethod;
            Object[] objArr2 = objArr;
            CallContext callContext2 = callContext;
            switch (moduleMethod2.selector) {
                case 63:
                    callContext2.values = objArr2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 5;
                    return 0;
                case 64:
                    callContext2.values = objArr2;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 5;
                    return 0;
                default:
                    return super.matchN(moduleMethod2, objArr2, callContext2);
            }
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
                    if (!(obj7 instanceof Screen1)) {
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
                case 62:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 67:
                    callContext2.value1 = obj3;
                    callContext2.value2 = obj4;
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 2;
                    return 0;
                case 68:
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
                    if (!(obj9 instanceof Screen1)) {
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
                    if (!(obj17 instanceof Screen1)) {
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
                case 62:
                    return this.$main.Firebase_Authentication1$SignUpFailed(obj3, obj4);
                case 67:
                    return this.$main.Firebase_Database1$GotValue(obj3, obj4);
                case 68:
                    return this.$main.Firebase_Database1$DataChanged(obj3, obj4);
                default:
                    return super.apply2(moduleMethod2, obj3, obj4);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            ModuleMethod moduleMethod2 = moduleMethod;
            switch (moduleMethod2.selector) {
                case 17:
                    return Screen1.lambda2();
                case 18:
                    this.$main.$define();
                    return Values.empty;
                case 19:
                    return Screen1.lambda3();
                case 20:
                    return this.$main.Screen1$Initialize();
                case 21:
                    return Screen1.lambda4();
                case 22:
                    return Screen1.lambda5();
                case 23:
                    return Screen1.lambda6();
                case 24:
                    return Screen1.lambda7();
                case 25:
                    return Screen1.lambda8();
                case 26:
                    return Screen1.lambda9();
                case 27:
                    return Screen1.lambda10();
                case 28:
                    return Screen1.lambda11();
                case 29:
                    return Screen1.lambda12();
                case 30:
                    return Screen1.lambda13();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 33:
                    return Screen1.lambda16();
                case 34:
                    return Screen1.lambda17();
                case 35:
                    return Screen1.lambda18();
                case 36:
                    return Screen1.lambda19();
                case 37:
                    return Screen1.lambda20();
                case 38:
                    return Screen1.lambda21();
                case 39:
                    return this.$main.btn_login$Click();
                case 40:
                    return Screen1.lambda22();
                case 41:
                    return Screen1.lambda23();
                case 42:
                    return this.$main.btn_keluar$Click();
                case 43:
                    return Screen1.lambda24();
                case 44:
                    return Screen1.lambda25();
                case 45:
                    return Screen1.lambda26();
                case 46:
                    return Screen1.lambda27();
                case 47:
                    return Screen1.lambda28();
                case 48:
                    return Screen1.lambda29();
                case 49:
                    return Screen1.lambda30();
                case 50:
                    return Screen1.lambda31();
                case 51:
                    return Screen1.lambda32();
                case 52:
                    return Screen1.lambda33();
                case 53:
                    return Screen1.lambda34();
                case 54:
                    return Screen1.lambda35();
                case 55:
                    return Screen1.lambda36();
                case 56:
                    return Screen1.lambda37();
                case 57:
                    return Screen1.lambda38();
                case 58:
                    return Screen1.lambda39();
                case 59:
                    return Screen1.lambda40();
                case 60:
                    return Screen1.lambda41();
                case 61:
                    return this.$main.btn_lanjut$Click();
                case 65:
                    return Screen1.lambda42();
                case 66:
                    return Screen1.lambda43();
                case 69:
                    return Screen1.lambda44();
                case 70:
                    return Screen1.lambda45();
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
                case 43:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 44:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 45:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 46:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 47:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 48:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 49:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 50:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 51:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 52:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 53:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 54:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 55:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 56:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 57:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 58:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 59:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 60:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 61:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 65:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 66:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 69:
                    callContext2.proc = moduleMethod2;
                    callContext2.pc = 0;
                    return 0;
                case 70:
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
        Screen1 = this;
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
