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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=11;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int RULE_BOOLEAN_LITERAL=10;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int RULE_WIDE_STRING_LITERAL=7;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_FLOATING_PT_LITERAL=9;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_HEX_LITERAL=6;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_FIXED_PT_LITERAL=8;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=14;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalIDLLexer() {;} 
    public InternalIDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalIDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:11:7: ( 'float' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:11:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:12:7: ( 'double' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:12:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:13:7: ( 'short' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:13:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14:7: ( 'long' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:15:7: ( 'char' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:15:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:16:7: ( 'wchar' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:16:9: 'wchar'
            {
            match("wchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:17:7: ( 'string' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:17:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:18:7: ( 'wstring' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:18:9: 'wstring'
            {
            match("wstring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:19:7: ( 'boolean' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:19:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:20:7: ( 'octet' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:20:9: 'octet'
            {
            match("octet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:21:7: ( 'any' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:21:9: 'any'
            {
            match("any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:22:7: ( 'Object' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:22:9: 'Object'
            {
            match("Object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:23:7: ( 'void' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:23:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:24:7: ( ';' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:25:7: ( 'abstract' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:25:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:26:7: ( 'local' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:26:9: 'local'
            {
            match("local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:27:7: ( '>>' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:27:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:28:7: ( '<<' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:28:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:29:7: ( '+' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:30:7: ( '-' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:31:7: ( '*' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:32:7: ( '/' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:32:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:33:7: ( '%' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:33:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:34:7: ( '~' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:34:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:35:7: ( 'in' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:35:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:36:7: ( 'out' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:36:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:37:7: ( 'inout' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:37:9: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:38:7: ( '#include' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:38:9: '#include'
            {
            match("#include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:39:7: ( 'module' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:39:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:40:7: ( '{' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:40:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:41:7: ( '}' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:41:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:42:7: ( 'interface' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:42:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:43:7: ( ':' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:43:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:44:7: ( ',' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:44:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:45:7: ( '(' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:45:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:46:7: ( ')' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:46:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:47:7: ( 'raises' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:47:9: 'raises'
            {
            match("raises"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:48:7: ( 'context' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:48:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:49:7: ( 'attribute' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:49:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:50:7: ( 'getraises' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:50:9: 'getraises'
            {
            match("getraises"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:51:7: ( 'setraises' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:51:9: 'setraises'
            {
            match("setraises"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:52:7: ( 'exception' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:52:9: 'exception'
            {
            match("exception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:53:7: ( 'native' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:53:9: 'native'
            {
            match("native"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:54:7: ( 'typedef' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:54:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:55:7: ( '[' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:55:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:56:7: ( ']' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:56:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:57:7: ( 'struct' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:57:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:58:7: ( 'union' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:58:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:59:7: ( 'switch' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:59:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:60:7: ( 'case' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:60:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:61:7: ( 'enum' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:61:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:62:7: ( 'const' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:62:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:63:7: ( '=' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:63:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:64:7: ( 'sequence' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:64:9: 'sequence'
            {
            match("sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:65:7: ( '<' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:65:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:66:7: ( '>' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:66:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:67:7: ( 'fixed' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:67:9: 'fixed'
            {
            match("fixed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:68:7: ( 'unsigned' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:68:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:69:7: ( 'oneway' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:69:9: 'oneway'
            {
            match("oneway"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:70:7: ( 'readonly' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:70:9: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:71:7: ( 'default' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:71:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:72:7: ( '|' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:72:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:73:7: ( '^' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:73:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:74:7: ( '&' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:74:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_WIDE_STRING_LITERAL"
    public final void mRULE_WIDE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_WIDE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14091:26: ( 'L' RULE_STRING )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14091:28: 'L' RULE_STRING
            {
            match('L'); 
            mRULE_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WIDE_STRING_LITERAL"

    // $ANTLR start "RULE_FIXED_PT_LITERAL"
    public final void mRULE_FIXED_PT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FIXED_PT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:23: ( ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT ) )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:25: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:25: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:26: RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:48: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='E'||LA2_0=='e') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:49: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:59: ( '+' | '-' )?
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
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


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
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:81: '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    {
                    match('.'); 
                    mRULE_INT(); 
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:94: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:95: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:105: ( '+' | '-' )?
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
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


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
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:127: RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    mRULE_INT(); 
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14093:146: ( '+' | '-' )?
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
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIXED_PT_LITERAL"

    // $ANTLR start "RULE_FLOATING_PT_LITERAL"
    public final void mRULE_FLOATING_PT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOATING_PT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14095:26: ( ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) ) )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14095:28: ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) )
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14095:28: ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14095:29: RULE_INT '.' RULE_INT ( 'd' | 'D' )
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14095:61: RULE_INT ( 'd' | 'D' )
                    {
                    mRULE_INT(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14095:80: '.' RULE_INT ( 'd' | 'D' )
                    {
                    match('.'); 
                    mRULE_INT(); 
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATING_PT_LITERAL"

    // $ANTLR start "RULE_BOOLEAN_LITERAL"
    public final void mRULE_BOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14097:22: ( ( 'TRUE' | 'FALSE' ) )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14097:24: ( 'TRUE' | 'FALSE' )
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14097:24: ( 'TRUE' | 'FALSE' )
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
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14097:25: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14097:32: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_LITERAL"

    // $ANTLR start "RULE_HEX_LITERAL"
    public final void mRULE_HEX_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14099:18: ( '0' 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14099:20: '0' 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            match('x'); 
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14099:28: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_LITERAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '::' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '::' )* )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '::' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '::' )*
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '::' )
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
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:21: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:30: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:34: '::'
                    {
                    match("::"); 


                    }
                    break;

            }

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '::' )*
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
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:41: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:50: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:59: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:63: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14101:72: '::'
            	    {
            	    match("::"); 


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14103:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14103:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14103:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    alt12=1;
                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14103:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14103:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14105:10: ( ( '0' .. '9' )+ )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14105:12: ( '0' .. '9' )+
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14105:12: ( '0' .. '9' )+
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
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14105:13: '0' .. '9'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14107:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14107:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14107:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14107:52: .
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:41: ( '\\r' )? '\\n'
                    {
                    // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14109:41: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14111:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14113:16: ( . )
            // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:14113:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_WIDE_STRING_LITERAL | RULE_FIXED_PT_LITERAL | RULE_FLOATING_PT_LITERAL | RULE_BOOLEAN_LITERAL | RULE_HEX_LITERAL | RULE_ID | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=76;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:394: RULE_WIDE_STRING_LITERAL
                {
                mRULE_WIDE_STRING_LITERAL(); 

                }
                break;
            case 66 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:419: RULE_FIXED_PT_LITERAL
                {
                mRULE_FIXED_PT_LITERAL(); 

                }
                break;
            case 67 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:441: RULE_FLOATING_PT_LITERAL
                {
                mRULE_FLOATING_PT_LITERAL(); 

                }
                break;
            case 68 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:466: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 69 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:487: RULE_HEX_LITERAL
                {
                mRULE_HEX_LITERAL(); 

                }
                break;
            case 70 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:504: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:512: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:524: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:533: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 74 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:549: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 75 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:565: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // ../org.csu.idl.xtext.ui/src-gen/org/csu/idl/xtext/ui/contentassist/antlr/internal/InternalIDL.g:1:573: RULE_ANY_OTHER
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

    static class DFA6 extends DFA {

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
            return "14093:25: ( RULE_INT '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | '.' RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? | RULE_INT ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )";
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
            return "14095:28: ( RULE_INT '.' RULE_INT ( 'd' | 'D' ) | RULE_INT ( 'd' | 'D' ) | '.' RULE_INT ( 'd' | 'D' ) )";
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\13\70\1\uffff\1\120\1\122\3\uffff\1\130\2\uffff\1\70\1\65\1\70\2\uffff\1\140\3\uffff\5\70\2\uffff\1\70\4\uffff\1\70\1\164\1\65\2\70\1\164\3\uffff\1\65\2\uffff\2\70\1\uffff\25\70\15\uffff\1\u0099\1\uffff\1\70\6\uffff\7\70\2\uffff\1\70\10\uffff\1\164\2\uffff\1\167\2\70\2\uffff\22\70\1\u00bb\1\70\1\u00bd\6\70\1\uffff\12\70\1\167\14\70\1\u00da\1\70\1\u00dc\2\70\1\u00df\4\70\1\uffff\1\70\1\uffff\3\70\1\u00e8\7\70\1\u00f0\4\70\1\u00f5\1\70\1\u00f7\1\u00f8\2\70\1\u00fb\5\70\1\uffff\1\u0101\1\uffff\1\70\1\u0103\1\uffff\1\u0104\2\70\1\u0107\4\70\1\uffff\1\u010c\6\70\1\uffff\2\70\1\u0115\1\70\1\uffff\1\u00f5\2\uffff\1\u0117\1\70\1\uffff\1\u0119\1\u011a\2\70\1\u011d\1\uffff\1\70\2\uffff\2\70\1\uffff\1\u0121\2\70\1\u0124\1\uffff\1\70\1\u0126\1\u0127\3\70\1\u012b\1\70\1\uffff\1\70\1\uffff\1\u012e\2\uffff\2\70\1\uffff\1\u0131\1\u0132\1\u0133\1\uffff\2\70\1\uffff\1\70\2\uffff\3\70\1\uffff\1\u013a\1\70\1\uffff\1\70\1\u013d\3\uffff\1\u013e\2\70\1\u0141\2\70\1\uffff\1\u0144\1\u0145\2\uffff\1\u0146\1\u0147\1\uffff\1\u0148\1\u0149\6\uffff";
    static final String DFA19_eofS =
        "\u014a\uffff";
    static final String DFA19_minS =
        "\1\0\1\151\2\145\1\157\1\141\1\143\1\157\1\143\2\142\1\157\1\uffff\1\76\1\74\3\uffff\1\52\2\uffff\1\156\1\151\1\157\2\uffff\1\72\3\uffff\1\141\1\145\1\156\1\141\1\171\2\uffff\1\156\4\uffff\1\42\1\56\1\60\1\122\1\101\1\56\3\uffff\1\0\2\uffff\1\157\1\170\1\uffff\1\165\1\146\1\157\1\162\1\161\1\151\1\143\1\141\1\156\1\163\1\150\1\164\1\157\2\164\1\145\1\171\1\163\1\164\1\152\1\151\15\uffff\1\60\1\uffff\1\144\6\uffff\1\151\1\141\1\164\1\143\1\165\1\164\1\160\2\uffff\1\151\7\uffff\1\60\1\56\2\uffff\1\60\1\125\1\114\2\uffff\1\141\1\145\1\142\1\141\1\162\1\151\1\162\1\165\1\164\1\147\1\141\1\162\1\163\1\145\1\141\1\162\1\154\1\145\1\60\1\167\1\60\1\164\1\162\1\145\1\144\1\165\1\145\1\uffff\1\165\1\163\1\144\1\162\1\145\1\155\1\151\1\145\1\157\1\151\1\60\1\105\1\123\1\164\1\144\1\154\1\165\1\164\1\156\1\143\1\141\1\145\1\143\1\60\1\154\1\60\1\145\1\164\1\60\1\162\1\151\1\145\1\164\1\uffff\1\141\1\uffff\1\162\1\151\1\143\1\60\1\164\1\162\1\154\1\145\1\157\1\141\1\160\1\60\1\166\1\144\1\156\1\147\1\60\1\105\2\60\1\145\1\154\1\60\1\147\1\164\1\151\1\156\1\150\1\uffff\1\60\1\uffff\1\170\1\60\1\uffff\1\60\1\156\1\141\1\60\1\171\1\141\1\142\1\164\1\uffff\1\60\1\146\1\145\1\163\1\156\1\151\1\164\1\uffff\2\145\1\60\1\156\1\uffff\1\60\2\uffff\1\60\1\164\1\uffff\2\60\1\163\1\143\1\60\1\uffff\1\164\2\uffff\1\147\1\156\1\uffff\1\60\1\143\1\165\1\60\1\uffff\1\141\2\60\1\154\1\163\1\151\1\60\1\146\1\uffff\1\145\1\uffff\1\60\2\uffff\2\145\1\uffff\3\60\1\uffff\2\164\1\uffff\1\143\2\uffff\1\171\1\145\1\157\1\uffff\1\60\1\144\1\uffff\1\163\1\60\3\uffff\1\60\2\145\1\60\1\163\1\156\1\uffff\2\60\2\uffff\2\60\1\uffff\2\60\6\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\154\1\157\1\167\2\157\1\163\1\157\1\165\1\164\1\142\1\157\1\uffff\1\76\1\74\3\uffff\1\57\2\uffff\1\156\1\151\1\157\2\uffff\1\72\3\uffff\2\145\1\170\1\141\1\171\2\uffff\1\156\4\uffff\1\42\1\170\1\71\1\122\1\101\1\145\3\uffff\1\uffff\2\uffff\1\157\1\170\1\uffff\1\165\1\146\1\157\1\162\1\164\1\151\1\156\1\141\1\156\1\163\1\150\1\164\1\157\2\164\1\145\1\171\1\163\1\164\1\152\1\151\15\uffff\1\172\1\uffff\1\144\6\uffff\1\151\1\141\1\164\1\143\1\165\1\164\1\160\2\uffff\1\163\7\uffff\1\71\1\145\2\uffff\1\144\1\125\1\114\2\uffff\1\141\1\145\1\142\1\141\1\162\1\165\1\162\1\165\1\164\1\147\1\141\1\162\1\164\1\145\1\141\1\162\1\154\1\145\1\172\1\167\1\172\1\164\1\162\1\145\1\144\1\165\1\145\1\uffff\1\165\1\163\1\144\1\162\1\145\1\155\1\151\1\145\1\157\1\151\1\144\1\105\1\123\1\164\1\144\1\154\1\165\1\164\1\156\1\143\1\141\1\145\1\143\1\172\1\154\1\172\1\145\1\164\1\172\1\162\1\151\1\145\1\164\1\uffff\1\141\1\uffff\1\162\1\151\1\143\1\172\1\164\1\162\1\154\1\145\1\157\1\141\1\160\1\172\1\166\1\144\1\156\1\147\1\172\1\105\2\172\1\145\1\154\1\172\1\147\1\164\1\151\1\156\1\150\1\uffff\1\172\1\uffff\1\170\1\172\1\uffff\1\172\1\156\1\141\1\172\1\171\1\141\1\142\1\164\1\uffff\1\172\1\146\1\145\1\163\1\156\1\151\1\164\1\uffff\2\145\1\172\1\156\1\uffff\1\172\2\uffff\1\172\1\164\1\uffff\2\172\1\163\1\143\1\172\1\uffff\1\164\2\uffff\1\147\1\156\1\uffff\1\172\1\143\1\165\1\172\1\uffff\1\141\2\172\1\154\1\163\1\151\1\172\1\146\1\uffff\1\145\1\uffff\1\172\2\uffff\2\145\1\uffff\3\172\1\uffff\2\164\1\uffff\1\143\2\uffff\1\171\1\145\1\157\1\uffff\1\172\1\144\1\uffff\1\163\1\172\3\uffff\1\172\2\145\1\172\1\163\1\156\1\uffff\2\172\2\uffff\2\172\1\uffff\2\172\6\uffff";
    static final String DFA19_acceptS =
        "\14\uffff\1\16\2\uffff\1\23\1\24\1\25\1\uffff\1\27\1\30\3\uffff\1\36\1\37\1\uffff\1\42\1\43\1\44\5\uffff\1\55\1\56\1\uffff\1\65\1\76\1\77\1\100\6\uffff\3\106\1\uffff\1\113\1\114\2\uffff\1\106\25\uffff\1\16\1\21\1\70\1\22\1\67\1\23\1\24\1\25\1\111\1\112\1\26\1\27\1\30\1\uffff\1\34\1\uffff\1\36\1\37\1\41\1\42\1\43\1\44\7\uffff\1\55\1\56\1\uffff\1\65\1\76\1\77\1\100\1\101\1\105\1\110\2\uffff\1\102\1\103\3\uffff\1\107\1\113\33\uffff\1\31\41\uffff\1\32\1\uffff\1\13\34\uffff\1\4\1\uffff\1\5\2\uffff\1\62\10\uffff\1\15\7\uffff\1\63\4\uffff\1\104\1\uffff\1\1\1\71\2\uffff\1\3\5\uffff\1\20\1\uffff\1\64\1\6\2\uffff\1\12\4\uffff\1\33\10\uffff\1\60\1\uffff\1\2\1\uffff\1\7\1\57\2\uffff\1\61\3\uffff\1\73\2\uffff\1\14\1\uffff\1\35\1\45\3\uffff\1\53\2\uffff\1\75\2\uffff\1\46\1\10\1\11\6\uffff\1\54\2\uffff\1\66\1\17\2\uffff\1\74\2\uffff\1\72\1\51\1\47\1\40\1\50\1\52";
    static final String DFA19_specialS =
        "\1\1\62\uffff\1\0\u0116\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\65\2\64\2\65\1\64\22\65\1\64\1\65\1\63\1\26\1\65\1\23\1\51\1\65\1\34\1\35\1\21\1\17\1\33\1\20\1\54\1\22\1\53\11\57\1\32\1\14\1\16\1\46\1\15\2\65\5\61\1\56\5\61\1\52\2\61\1\12\4\61\1\55\6\61\1\43\1\65\1\44\1\50\1\62\1\65\1\11\1\7\1\5\1\2\1\40\1\1\1\37\1\60\1\25\2\60\1\4\1\27\1\41\1\10\2\60\1\36\1\3\1\42\1\45\1\13\1\6\3\60\1\30\1\47\1\31\1\24\uff81\65",
            "\1\67\2\uffff\1\66",
            "\1\72\11\uffff\1\71",
            "\1\75\2\uffff\1\73\13\uffff\1\74\2\uffff\1\76",
            "\1\77",
            "\1\102\6\uffff\1\100\6\uffff\1\101",
            "\1\103\17\uffff\1\104",
            "\1\105",
            "\1\106\12\uffff\1\110\6\uffff\1\107",
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
            "\1\150\11\uffff\1\147",
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
            "\1\165\1\uffff\12\166\12\uffff\1\170\1\167\36\uffff\1\170\1\167\22\uffff\1\163",
            "\12\171",
            "\1\172",
            "\1\173",
            "\1\165\1\uffff\12\166\12\uffff\1\170\1\167\36\uffff\1\170\1\167",
            "",
            "",
            "",
            "\0\174",
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
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\16\70\1\u0097\4\70\1\u0098\6\70",
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
            "\1\165\1\uffff\12\166\12\uffff\1\170\1\167\36\uffff\1\170\1\167",
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
            "\1\u00b3",
            "\1\u00b5\1\u00b4",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
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
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00dd",
            "\1\u00de",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
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
            "\1\u00ef",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
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
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0102",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0105",
            "\1\u0106",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0116",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0118",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u011b",
            "\1\u011c",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u011e",
            "",
            "",
            "\1\u011f",
            "\1\u0120",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0122",
            "\1\u0123",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0125",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u012c",
            "",
            "\1\u012d",
            "",
            "\13\70\6\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u012f",
            "\1\u0130",
            "",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_WIDE_STRING_LITERAL | RULE_FIXED_PT_LITERAL | RULE_FLOATING_PT_LITERAL | RULE_BOOLEAN_LITERAL | RULE_HEX_LITERAL | RULE_ID | RULE_STRING | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_51 = input.LA(1);

                        s = -1;
                        if ( ((LA19_51>='\u0000' && LA19_51<='\uFFFF')) ) {s = 124;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='f') ) {s = 1;}

                        else if ( (LA19_0=='d') ) {s = 2;}

                        else if ( (LA19_0=='s') ) {s = 3;}

                        else if ( (LA19_0=='l') ) {s = 4;}

                        else if ( (LA19_0=='c') ) {s = 5;}

                        else if ( (LA19_0=='w') ) {s = 6;}

                        else if ( (LA19_0=='b') ) {s = 7;}

                        else if ( (LA19_0=='o') ) {s = 8;}

                        else if ( (LA19_0=='a') ) {s = 9;}

                        else if ( (LA19_0=='O') ) {s = 10;}

                        else if ( (LA19_0=='v') ) {s = 11;}

                        else if ( (LA19_0==';') ) {s = 12;}

                        else if ( (LA19_0=='>') ) {s = 13;}

                        else if ( (LA19_0=='<') ) {s = 14;}

                        else if ( (LA19_0=='+') ) {s = 15;}

                        else if ( (LA19_0=='-') ) {s = 16;}

                        else if ( (LA19_0=='*') ) {s = 17;}

                        else if ( (LA19_0=='/') ) {s = 18;}

                        else if ( (LA19_0=='%') ) {s = 19;}

                        else if ( (LA19_0=='~') ) {s = 20;}

                        else if ( (LA19_0=='i') ) {s = 21;}

                        else if ( (LA19_0=='#') ) {s = 22;}

                        else if ( (LA19_0=='m') ) {s = 23;}

                        else if ( (LA19_0=='{') ) {s = 24;}

                        else if ( (LA19_0=='}') ) {s = 25;}

                        else if ( (LA19_0==':') ) {s = 26;}

                        else if ( (LA19_0==',') ) {s = 27;}

                        else if ( (LA19_0=='(') ) {s = 28;}

                        else if ( (LA19_0==')') ) {s = 29;}

                        else if ( (LA19_0=='r') ) {s = 30;}

                        else if ( (LA19_0=='g') ) {s = 31;}

                        else if ( (LA19_0=='e') ) {s = 32;}

                        else if ( (LA19_0=='n') ) {s = 33;}

                        else if ( (LA19_0=='t') ) {s = 34;}

                        else if ( (LA19_0=='[') ) {s = 35;}

                        else if ( (LA19_0==']') ) {s = 36;}

                        else if ( (LA19_0=='u') ) {s = 37;}

                        else if ( (LA19_0=='=') ) {s = 38;}

                        else if ( (LA19_0=='|') ) {s = 39;}

                        else if ( (LA19_0=='^') ) {s = 40;}

                        else if ( (LA19_0=='&') ) {s = 41;}

                        else if ( (LA19_0=='L') ) {s = 42;}

                        else if ( (LA19_0=='0') ) {s = 43;}

                        else if ( (LA19_0=='.') ) {s = 44;}

                        else if ( (LA19_0=='T') ) {s = 45;}

                        else if ( (LA19_0=='F') ) {s = 46;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 47;}

                        else if ( (LA19_0=='h'||(LA19_0>='j' && LA19_0<='k')||(LA19_0>='p' && LA19_0<='q')||(LA19_0>='x' && LA19_0<='z')) ) {s = 48;}

                        else if ( ((LA19_0>='A' && LA19_0<='E')||(LA19_0>='G' && LA19_0<='K')||(LA19_0>='M' && LA19_0<='N')||(LA19_0>='P' && LA19_0<='S')||(LA19_0>='U' && LA19_0<='Z')) ) {s = 49;}

                        else if ( (LA19_0=='_') ) {s = 50;}

                        else if ( (LA19_0=='\"') ) {s = 51;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 52;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||LA19_0=='$'||LA19_0=='\''||(LA19_0>='?' && LA19_0<='@')||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='\u007F' && LA19_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}