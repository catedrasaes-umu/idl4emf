package org.csu.idl.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIDLLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int RULE_ID=11;
    public static final int T74=74;
    public static final int T79=79;
    public static final int RULE_BOOLEAN_LITERAL=10;
    public static final int T77=77;
    public static final int T78=78;
    public static final int RULE_WIDE_STRING_LITERAL=7;
    public static final int RULE_ANY_OTHER=15;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T72=72;
    public static final int T21=21;
    public static final int T71=71;
    public static final int T20=20;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int RULE_FLOATING_PT_LITERAL=9;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_HEX_LITERAL=6;
    public static final int RULE_INT=4;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T61=61;
    public static final int T32=32;
    public static final int T60=60;
    public static final int T31=31;
    public static final int RULE_FIXED_PT_LITERAL=8;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T43=43;
    public static final int Tokens=80;
    public static final int RULE_SL_COMMENT=13;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=12;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T52=52;
    public static final int RULE_WS=14;
    public static final int T51=51;
    public static final int T16=16;
    public static final int T54=54;
    public static final int T17=17;
    public static final int T53=53;
    public static final int T18=18;
    public static final int T56=56;
    public static final int T19=19;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public InternalIDLLexer() {;} 
    public InternalIDLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g"; }

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:10:5: ( 'float' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:10:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:11:5: ( 'double' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:11:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:12:5: ( 'short' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:12:7: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:13:5: ( 'long' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:13:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14:5: ( 'char' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14:7: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:15:5: ( 'wchar' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:15:7: 'wchar'
            {
            match("wchar"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:16:5: ( 'string' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:16:7: 'string'
            {
            match("string"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:17:5: ( 'wstring' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:17:7: 'wstring'
            {
            match("wstring"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:18:5: ( 'boolean' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:18:7: 'boolean'
            {
            match("boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:19:5: ( 'octet' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:19:7: 'octet'
            {
            match("octet"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:20:5: ( 'any' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:20:7: 'any'
            {
            match("any"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:21:5: ( 'Object' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:21:7: 'Object'
            {
            match("Object"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:22:5: ( 'void' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:22:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:23:5: ( ';' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:23:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:24:5: ( 'abstract' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:24:7: 'abstract'
            {
            match("abstract"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:25:5: ( 'local' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:25:7: 'local'
            {
            match("local"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:26:5: ( '>>' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:26:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:27:5: ( '<<' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:27:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:28:5: ( '+' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:28:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:29:5: ( '-' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:29:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:30:5: ( '*' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:30:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:31:5: ( '/' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:31:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:32:5: ( '%' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:32:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:33:5: ( '~' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:33:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:34:5: ( 'in' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:34:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:35:5: ( 'out' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:35:7: 'out'
            {
            match("out"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:36:5: ( 'inout' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:36:7: 'inout'
            {
            match("inout"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:37:5: ( '#include' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:37:7: '#include'
            {
            match("#include"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:38:5: ( 'module' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:38:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:39:5: ( '{' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:39:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:40:5: ( '}' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:40:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:41:5: ( 'interface' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:41:7: 'interface'
            {
            match("interface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:42:5: ( ':' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:42:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:43:5: ( ',' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:43:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:44:5: ( '(' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:44:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:45:5: ( ')' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:45:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:46:5: ( 'raises' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:46:7: 'raises'
            {
            match("raises"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:47:5: ( 'context' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:47:7: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:48:5: ( 'attribute' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:48:7: 'attribute'
            {
            match("attribute"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:49:5: ( 'getraises' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:49:7: 'getraises'
            {
            match("getraises"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:50:5: ( 'setraises' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:50:7: 'setraises'
            {
            match("setraises"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:51:5: ( 'exception' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:51:7: 'exception'
            {
            match("exception"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:52:5: ( 'native' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:52:7: 'native'
            {
            match("native"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:53:5: ( 'typedef' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:53:7: 'typedef'
            {
            match("typedef"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:54:5: ( '[' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:54:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:55:5: ( ']' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:55:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:56:5: ( 'struct' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:56:7: 'struct'
            {
            match("struct"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:57:5: ( 'union' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:57:7: 'union'
            {
            match("union"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:58:5: ( 'switch' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:58:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:59:5: ( 'case' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:59:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:60:5: ( 'default' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:60:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:61:5: ( 'enum' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:61:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:62:5: ( 'const' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:62:7: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:63:5: ( '=' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:63:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:64:5: ( 'sequence' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:64:7: 'sequence'
            {
            match("sequence"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:65:5: ( '<' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:65:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:66:5: ( '>' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:66:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:67:5: ( 'fixed' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:67:7: 'fixed'
            {
            match("fixed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:68:5: ( 'unsigned' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:68:7: 'unsigned'
            {
            match("unsigned"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:69:5: ( 'oneway' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:69:7: 'oneway'
            {
            match("oneway"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:70:5: ( 'readonly' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:70:7: 'readonly'
            {
            match("readonly"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:71:5: ( '|' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:71:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:72:5: ( '^' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:72:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:73:5: ( '&' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:73:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start RULE_WIDE_STRING_LITERAL
    public final void mRULE_WIDE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_WIDE_STRING_LITERAL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14050:26: ( 'L' RULE_STRING )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14050:28: 'L' RULE_STRING
            {
            match('L'); 
            mRULE_STRING(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WIDE_STRING_LITERAL

    // $ANTLR start RULE_FIXED_PT_LITERAL
    public final void mRULE_FIXED_PT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FIXED_PT_LITERAL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:23: ( ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT ) )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:25: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:25: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:26: RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:48: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='E'||LA2_0=='e') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:49: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }

                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:59: ( '+' | '-' )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0=='+'||LA1_0=='-') ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse =
                                            new MismatchedSetException(null,input);
                                        recover(mse);    throw mse;
                                    }


                                    }
                                    break;

                            }

                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:81: '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:94: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:95: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }

                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:105: ( '+' | '-' )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0=='+'||LA3_0=='-') ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse =
                                            new MismatchedSetException(null,input);
                                        recover(mse);    throw mse;
                                    }


                                    }
                                    break;

                            }

                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:127: RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    mRULE_INT(); 
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14052:146: ( '+' | '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_FIXED_PT_LITERAL

    // $ANTLR start RULE_FLOATING_PT_LITERAL
    public final void mRULE_FLOATING_PT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOATING_PT_LITERAL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14054:26: ( ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) ) )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14054:28: ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) )
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14054:28: ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14054:29: RULE_INT '.' RULE_INT ( 'd' | 'D' )
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14054:61: RULE_INT ( 'd' | 'D' )
                    {
                    mRULE_INT(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14054:80: '.' RULE_INT ( 'd' | 'D' )
                    {
                    match('.'); 
                    mRULE_INT(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_FLOATING_PT_LITERAL

    // $ANTLR start RULE_BOOLEAN_LITERAL
    public final void mRULE_BOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LITERAL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14056:22: ( ( 'TRUE' | 'FALSE' ) )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14056:24: ( 'TRUE' | 'FALSE' )
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14056:24: ( 'TRUE' | 'FALSE' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='T') ) {
                alt8=1;
            }
            else if ( (LA8_0=='F') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("14056:24: ( 'TRUE' | 'FALSE' )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14056:25: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14056:32: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_BOOLEAN_LITERAL

    // $ANTLR start RULE_HEX_LITERAL
    public final void mRULE_HEX_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_HEX_LITERAL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14058:18: ( '0' 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14058:20: '0' 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            match('x'); 
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14058:28: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_HEX_LITERAL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '::' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '::' )* )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '::' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '::' )*
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '::' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt10=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt10=2;
                }
                break;
            case '_':
                {
                alt10=3;
                }
                break;
            case ':':
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("14060:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '::' )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:21: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:30: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:34: '::'
                    {
                    match("::"); 


                    }
                    break;

            }

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '::' )*
            loop11:
            do {
                int alt11=6;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt11=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt11=2;
                    }
                    break;
                case '_':
                    {
                    alt11=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt11=4;
                    }
                    break;
                case ':':
                    {
                    alt11=5;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:41: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:50: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:59: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:63: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14060:72: '::'
            	    {
            	    match("::"); 


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14062:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14062:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14062:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    alt12=1;
                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFE')) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14062:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14062:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14064:10: ( ( '0' .. '9' )+ )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14064:12: ( '0' .. '9' )+
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14064:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14064:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14066:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14066:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14066:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFE')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14066:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFE')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:41: ( '\\r' )? '\\n'
                    {
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14068:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14070:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14070:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14070:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14072:16: ( . )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14072:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:8: ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | RULE_WIDE_STRING_LITERAL | RULE_FIXED_PT_LITERAL | RULE_FLOATING_PT_LITERAL | RULE_BOOLEAN_LITERAL | RULE_HEX_LITERAL | RULE_ID | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=76;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:10: T16
                {
                mT16(); 

                }
                break;
            case 2 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:14: T17
                {
                mT17(); 

                }
                break;
            case 3 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:18: T18
                {
                mT18(); 

                }
                break;
            case 4 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:22: T19
                {
                mT19(); 

                }
                break;
            case 5 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:26: T20
                {
                mT20(); 

                }
                break;
            case 6 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:30: T21
                {
                mT21(); 

                }
                break;
            case 7 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:34: T22
                {
                mT22(); 

                }
                break;
            case 8 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:38: T23
                {
                mT23(); 

                }
                break;
            case 9 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:42: T24
                {
                mT24(); 

                }
                break;
            case 10 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:46: T25
                {
                mT25(); 

                }
                break;
            case 11 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:50: T26
                {
                mT26(); 

                }
                break;
            case 12 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:54: T27
                {
                mT27(); 

                }
                break;
            case 13 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:58: T28
                {
                mT28(); 

                }
                break;
            case 14 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:62: T29
                {
                mT29(); 

                }
                break;
            case 15 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:66: T30
                {
                mT30(); 

                }
                break;
            case 16 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:70: T31
                {
                mT31(); 

                }
                break;
            case 17 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:74: T32
                {
                mT32(); 

                }
                break;
            case 18 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:78: T33
                {
                mT33(); 

                }
                break;
            case 19 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:82: T34
                {
                mT34(); 

                }
                break;
            case 20 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:86: T35
                {
                mT35(); 

                }
                break;
            case 21 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:90: T36
                {
                mT36(); 

                }
                break;
            case 22 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:94: T37
                {
                mT37(); 

                }
                break;
            case 23 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:98: T38
                {
                mT38(); 

                }
                break;
            case 24 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:102: T39
                {
                mT39(); 

                }
                break;
            case 25 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:106: T40
                {
                mT40(); 

                }
                break;
            case 26 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:110: T41
                {
                mT41(); 

                }
                break;
            case 27 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:114: T42
                {
                mT42(); 

                }
                break;
            case 28 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:118: T43
                {
                mT43(); 

                }
                break;
            case 29 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:122: T44
                {
                mT44(); 

                }
                break;
            case 30 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:126: T45
                {
                mT45(); 

                }
                break;
            case 31 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:130: T46
                {
                mT46(); 

                }
                break;
            case 32 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:134: T47
                {
                mT47(); 

                }
                break;
            case 33 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:138: T48
                {
                mT48(); 

                }
                break;
            case 34 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:142: T49
                {
                mT49(); 

                }
                break;
            case 35 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:146: T50
                {
                mT50(); 

                }
                break;
            case 36 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:150: T51
                {
                mT51(); 

                }
                break;
            case 37 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:154: T52
                {
                mT52(); 

                }
                break;
            case 38 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:158: T53
                {
                mT53(); 

                }
                break;
            case 39 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:162: T54
                {
                mT54(); 

                }
                break;
            case 40 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:166: T55
                {
                mT55(); 

                }
                break;
            case 41 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:170: T56
                {
                mT56(); 

                }
                break;
            case 42 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:174: T57
                {
                mT57(); 

                }
                break;
            case 43 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:178: T58
                {
                mT58(); 

                }
                break;
            case 44 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:182: T59
                {
                mT59(); 

                }
                break;
            case 45 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:186: T60
                {
                mT60(); 

                }
                break;
            case 46 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:190: T61
                {
                mT61(); 

                }
                break;
            case 47 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:194: T62
                {
                mT62(); 

                }
                break;
            case 48 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:198: T63
                {
                mT63(); 

                }
                break;
            case 49 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:202: T64
                {
                mT64(); 

                }
                break;
            case 50 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:206: T65
                {
                mT65(); 

                }
                break;
            case 51 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:210: T66
                {
                mT66(); 

                }
                break;
            case 52 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:214: T67
                {
                mT67(); 

                }
                break;
            case 53 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:218: T68
                {
                mT68(); 

                }
                break;
            case 54 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:222: T69
                {
                mT69(); 

                }
                break;
            case 55 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:226: T70
                {
                mT70(); 

                }
                break;
            case 56 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:230: T71
                {
                mT71(); 

                }
                break;
            case 57 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:234: T72
                {
                mT72(); 

                }
                break;
            case 58 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:238: T73
                {
                mT73(); 

                }
                break;
            case 59 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:242: T74
                {
                mT74(); 

                }
                break;
            case 60 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:246: T75
                {
                mT75(); 

                }
                break;
            case 61 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:250: T76
                {
                mT76(); 

                }
                break;
            case 62 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:254: T77
                {
                mT77(); 

                }
                break;
            case 63 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:258: T78
                {
                mT78(); 

                }
                break;
            case 64 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:262: T79
                {
                mT79(); 

                }
                break;
            case 65 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:266: RULE_WIDE_STRING_LITERAL
                {
                mRULE_WIDE_STRING_LITERAL(); 

                }
                break;
            case 66 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:291: RULE_FIXED_PT_LITERAL
                {
                mRULE_FIXED_PT_LITERAL(); 

                }
                break;
            case 67 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:313: RULE_FLOATING_PT_LITERAL
                {
                mRULE_FLOATING_PT_LITERAL(); 

                }
                break;
            case 68 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:338: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 69 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:359: RULE_HEX_LITERAL
                {
                mRULE_HEX_LITERAL(); 

                }
                break;
            case 70 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:376: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:384: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:396: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:405: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:421: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:437: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:445: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA6_eotS =
        "\5\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\2\56\3\uffff";
    static final String DFA6_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "14052:25: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )";
        }
    }
    static final String DFA7_eotS =
        "\5\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\2\56\3\uffff";
    static final String DFA7_maxS =
        "\1\71\1\144\3\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\3\1\1\1\2";
    static final String DFA7_specialS =
        "\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "14054:28: ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) )";
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\13\70\1\uffff\1\120\1\122\3\uffff\1\130\2\uffff\1\70\1"+
        "\65\1\70\2\uffff\1\140\3\uffff\5\70\2\uffff\1\70\4\uffff\1\70\1"+
        "\164\1\65\2\70\1\164\3\uffff\1\65\2\uffff\2\70\1\uffff\25\70\15"+
        "\uffff\1\u0099\1\uffff\1\70\6\uffff\7\70\2\uffff\1\70\10\uffff\1"+
        "\164\2\uffff\1\167\2\70\2\uffff\21\70\1\u00ba\2\70\1\u00bd\6\70"+
        "\1\uffff\12\70\1\167\14\70\1\u00da\3\70\1\u00de\1\u00df\3\70\1\uffff"+
        "\2\70\1\uffff\3\70\1\u00e8\6\70\1\u00ef\5\70\1\u00f5\1\70\1\u00f7"+
        "\1\u00f8\7\70\1\u0100\1\uffff\1\u0101\1\u0102\1\70\2\uffff\1\70"+
        "\1\u0105\1\70\1\u0107\4\70\1\uffff\1\70\1\u010d\4\70\1\uffff\3\70"+
        "\1\u0115\1\70\1\uffff\1\u00f5\2\uffff\1\70\1\u0118\1\u0119\1\u011a"+
        "\1\u011b\2\70\3\uffff\2\70\1\uffff\1\70\1\uffff\1\u0121\2\70\1\u0124"+
        "\1\70\1\uffff\1\u0126\1\u0127\3\70\1\u012b\1\70\1\uffff\1\70\1\u012e"+
        "\4\uffff\2\70\1\u0131\1\u0132\1\u0133\1\uffff\2\70\1\uffff\1\70"+
        "\2\uffff\3\70\1\uffff\1\u013a\1\70\1\uffff\1\70\1\u013d\3\uffff"+
        "\1\u013e\2\70\1\u0141\2\70\1\uffff\1\u0144\1\u0145\2\uffff\1\u0146"+
        "\1\u0147\1\uffff\1\u0148\1\u0149\6\uffff";
    static final String DFA19_eofS =
        "\u014a\uffff";
    static final String DFA19_minS =
        "\1\0\1\151\2\145\1\157\1\141\1\143\1\157\1\143\2\142\1\157\1\uffff"+
        "\1\76\1\74\3\uffff\1\52\2\uffff\1\156\1\151\1\157\2\uffff\1\72\3"+
        "\uffff\1\141\1\145\1\156\1\141\1\171\2\uffff\1\156\4\uffff\1\42"+
        "\1\56\1\60\1\122\1\101\1\56\3\uffff\1\0\2\uffff\1\157\1\170\1\uffff"+
        "\1\146\1\165\1\151\1\162\1\161\1\157\1\143\1\156\1\163\1\141\1\164"+
        "\1\150\1\157\2\164\1\145\1\171\1\163\1\164\1\152\1\151\15\uffff"+
        "\1\60\1\uffff\1\144\6\uffff\1\151\1\141\1\164\1\165\1\143\1\164"+
        "\1\160\2\uffff\1\151\7\uffff\1\60\1\56\2\uffff\1\60\1\125\1\114"+
        "\2\uffff\1\141\1\145\1\141\1\142\1\164\1\151\1\162\1\165\1\162\1"+
        "\147\1\141\1\163\1\145\2\162\1\141\1\154\1\60\1\145\1\167\1\60\1"+
        "\164\1\162\1\145\1\144\1\145\1\165\1\uffff\1\165\1\163\1\144\1\162"+
        "\1\155\1\145\1\151\1\145\1\157\1\151\1\60\1\105\1\123\1\164\1\144"+
        "\1\165\1\154\1\143\1\156\1\143\1\141\1\145\1\164\1\60\1\154\1\164"+
        "\1\145\2\60\1\151\1\162\1\145\1\uffff\1\164\1\141\1\uffff\1\162"+
        "\1\151\1\143\1\60\1\162\1\164\1\154\1\145\1\157\1\141\1\60\1\160"+
        "\1\166\1\144\1\156\1\147\1\60\1\105\2\60\1\154\1\145\1\150\1\147"+
        "\1\164\1\151\1\156\1\60\1\uffff\2\60\1\170\2\uffff\1\156\1\60\1"+
        "\141\1\60\1\171\1\141\1\142\1\164\1\uffff\1\146\1\60\1\145\1\163"+
        "\1\156\1\151\1\uffff\1\164\2\145\1\60\1\156\1\uffff\1\60\2\uffff"+
        "\1\164\4\60\1\163\1\143\3\uffff\1\164\1\147\1\uffff\1\156\1\uffff"+
        "\1\60\1\143\1\165\1\60\1\141\1\uffff\2\60\1\154\1\163\1\151\1\60"+
        "\1\146\1\uffff\1\145\1\60\4\uffff\2\145\3\60\1\uffff\2\164\1\uffff"+
        "\1\143\2\uffff\1\171\1\145\1\157\1\uffff\1\60\1\144\1\uffff\1\163"+
        "\1\60\3\uffff\1\60\2\145\1\60\1\163\1\156\1\uffff\2\60\2\uffff\2"+
        "\60\1\uffff\2\60\6\uffff";
    static final String DFA19_maxS =
        "\1\ufffe\1\154\1\157\1\167\2\157\1\163\1\157\1\165\1\164\1\142\1"+
        "\157\1\uffff\1\76\1\74\3\uffff\1\57\2\uffff\1\156\1\151\1\157\2"+
        "\uffff\1\72\3\uffff\2\145\1\170\1\141\1\171\2\uffff\1\156\4\uffff"+
        "\1\42\1\170\1\71\1\122\1\101\1\145\3\uffff\1\ufffe\2\uffff\1\157"+
        "\1\170\1\uffff\1\146\1\165\1\151\1\162\1\164\1\157\2\156\1\163\1"+
        "\141\1\164\1\150\1\157\2\164\1\145\1\171\1\163\1\164\1\152\1\151"+
        "\15\uffff\1\172\1\uffff\1\144\6\uffff\1\151\1\141\1\164\1\165\1"+
        "\143\1\164\1\160\2\uffff\1\163\7\uffff\1\71\1\145\2\uffff\1\144"+
        "\1\125\1\114\2\uffff\1\141\1\145\1\141\1\142\1\164\1\165\1\162\1"+
        "\165\1\162\1\147\1\141\1\164\1\145\2\162\1\141\1\154\1\172\1\145"+
        "\1\167\1\172\1\164\1\162\1\145\1\144\1\145\1\165\1\uffff\1\165\1"+
        "\163\1\144\1\162\1\155\1\145\1\151\1\145\1\157\1\151\1\144\1\105"+
        "\1\123\1\164\1\144\1\165\1\154\1\143\1\156\1\143\1\141\1\145\1\164"+
        "\1\172\1\154\1\164\1\145\2\172\1\151\1\162\1\145\1\uffff\1\164\1"+
        "\141\1\uffff\1\162\1\151\1\143\1\172\1\162\1\164\1\154\1\145\1\157"+
        "\1\141\1\172\1\160\1\166\1\144\1\156\1\147\1\172\1\105\2\172\1\154"+
        "\1\145\1\150\1\147\1\164\1\151\1\156\1\172\1\uffff\2\172\1\170\2"+
        "\uffff\1\156\1\172\1\141\1\172\1\171\1\141\1\142\1\164\1\uffff\1"+
        "\146\1\172\1\145\1\163\1\156\1\151\1\uffff\1\164\2\145\1\172\1\156"+
        "\1\uffff\1\172\2\uffff\1\164\4\172\1\163\1\143\3\uffff\1\164\1\147"+
        "\1\uffff\1\156\1\uffff\1\172\1\143\1\165\1\172\1\141\1\uffff\2\172"+
        "\1\154\1\163\1\151\1\172\1\146\1\uffff\1\145\1\172\4\uffff\2\145"+
        "\3\172\1\uffff\2\164\1\uffff\1\143\2\uffff\1\171\1\145\1\157\1\uffff"+
        "\1\172\1\144\1\uffff\1\163\1\172\3\uffff\1\172\2\145\1\172\1\163"+
        "\1\156\1\uffff\2\172\2\uffff\2\172\1\uffff\2\172\6\uffff";
    static final String DFA19_acceptS =
        "\14\uffff\1\16\2\uffff\1\23\1\24\1\25\1\uffff\1\27\1\30\3\uffff"+
        "\1\36\1\37\1\uffff\1\42\1\43\1\44\5\uffff\1\55\1\56\1\uffff\1\66"+
        "\1\76\1\77\1\100\6\uffff\3\106\1\uffff\1\113\1\114\2\uffff\1\106"+
        "\25\uffff\1\16\1\21\1\71\1\22\1\70\1\23\1\24\1\25\1\111\1\112\1"+
        "\26\1\27\1\30\1\uffff\1\34\1\uffff\1\36\1\37\1\41\1\42\1\43\1\44"+
        "\7\uffff\1\55\1\56\1\uffff\1\66\1\76\1\77\1\100\1\101\1\105\1\110"+
        "\2\uffff\1\102\1\103\3\uffff\1\107\1\113\33\uffff\1\31\40\uffff"+
        "\1\32\2\uffff\1\13\34\uffff\1\4\3\uffff\1\62\1\5\10\uffff\1\15\6"+
        "\uffff\1\64\5\uffff\1\104\1\uffff\1\1\1\72\7\uffff\1\3\1\20\1\65"+
        "\2\uffff\1\6\1\uffff\1\12\5\uffff\1\33\7\uffff\1\60\2\uffff\1\2"+
        "\1\61\1\7\1\57\5\uffff\1\74\2\uffff\1\14\1\uffff\1\35\1\45\3\uffff"+
        "\1\53\2\uffff\1\63\2\uffff\1\46\1\10\1\11\6\uffff\1\54\2\uffff\1"+
        "\67\1\17\2\uffff\1\75\2\uffff\1\73\1\51\1\47\1\40\1\50\1\52";
    static final String DFA19_specialS =
        "\u014a\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\65\1\63\1\26\1\65\1\23\1"+
            "\51\1\65\1\34\1\35\1\21\1\17\1\33\1\20\1\54\1\22\1\53\11\57"+
            "\1\32\1\14\1\16\1\46\1\15\2\65\5\61\1\56\5\61\1\52\2\61\1\12"+
            "\4\61\1\55\6\61\1\43\1\65\1\44\1\50\1\62\1\65\1\11\1\7\1\5\1"+
            "\2\1\40\1\1\1\37\1\60\1\25\2\60\1\4\1\27\1\41\1\10\2\60\1\36"+
            "\1\3\1\42\1\45\1\13\1\6\3\60\1\30\1\47\1\31\1\24\uff80\65",
            "\1\67\2\uffff\1\66",
            "\1\71\11\uffff\1\72",
            "\1\75\2\uffff\1\76\13\uffff\1\74\2\uffff\1\73",
            "\1\77",
            "\1\101\6\uffff\1\102\6\uffff\1\100",
            "\1\104\17\uffff\1\103",
            "\1\105",
            "\1\107\12\uffff\1\110\6\uffff\1\106",
            "\1\112\13\uffff\1\111\5\uffff\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\117",
            "\1\121",
            "",
            "",
            "",
            "\1\126\4\uffff\1\127",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\70",
            "",
            "",
            "",
            "\1\144\3\uffff\1\145",
            "\1\146",
            "\1\147\11\uffff\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "\1\155",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\165\1\uffff\12\166\12\uffff\1\170\1\167\36\uffff\1\170\1"+
            "\167\22\uffff\1\163",
            "\12\171",
            "\1\172",
            "\1\173",
            "\1\165\1\uffff\12\166\12\uffff\1\170\1\167\36\uffff\1\170\1"+
            "\167",
            "",
            "",
            "",
            "\uffff\174",
            "",
            "",
            "\1\176",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\2\uffff\1\u0084",
            "\1\u0086",
            "\1\u0088\12\uffff\1\u0087",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u0098\4\70"+
            "\1\u0097\6\70",
            "",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "",
            "\1\u00a2\11\uffff\1\u00a3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a4",
            "\1\165\1\uffff\12\166\12\uffff\1\170\1\167\36\uffff\1\170\1"+
            "\167",
            "",
            "",
            "\12\171\12\uffff\1\170\37\uffff\1\170",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\13\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00bb",
            "\1\u00bc",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\u00a4\12\uffff\1\170\37\uffff\1\170",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00f6",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0103",
            "",
            "",
            "\1\u0104",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0106",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0116",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u0117",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u011c",
            "\1\u011d",
            "",
            "",
            "",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0122",
            "\1\u0123",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0125",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u012c",
            "",
            "\1\u012d",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "\1\u012f",
            "\1\u0130",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u013b",
            "",
            "\1\u013c",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u013f",
            "\1\u0140",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0142",
            "\1\u0143",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | RULE_WIDE_STRING_LITERAL | RULE_FIXED_PT_LITERAL | RULE_FLOATING_PT_LITERAL | RULE_BOOLEAN_LITERAL | RULE_HEX_LITERAL | RULE_ID | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
    }
 

}