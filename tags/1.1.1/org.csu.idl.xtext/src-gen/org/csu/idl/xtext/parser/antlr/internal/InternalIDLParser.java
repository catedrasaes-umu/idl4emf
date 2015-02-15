package org.csu.idl.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.csu.idl.xtext.services.IDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEX_LITERAL", "RULE_WIDE_STRING_LITERAL", "RULE_FIXED_PT_LITERAL", "RULE_FLOATING_PT_LITERAL", "RULE_BOOLEAN_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#include'", "';'", "'module'", "'{'", "'}'", "'abstract'", "'local'", "'interface'", "':'", "','", "'oneway'", "'('", "')'", "'raises'", "'context'", "'readonly'", "'attribute'", "'getraises'", "'setraises'", "'exception'", "'native'", "'typedef'", "'['", "']'", "'struct'", "'union'", "'switch'", "'case'", "'default'", "'enum'", "'const'", "'='", "'sequence'", "'<'", "'>'", "'string'", "'wstring'", "'fixed'", "'long'", "'double'", "'unsigned'", "'short'", "'|'", "'^'", "'&'", "'>>'", "'<<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'in'", "'out'", "'inout'", "'float'", "'char'", "'wchar'", "'boolean'", "'octet'", "'any'", "'Object'", "'void'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int RULE_BOOLEAN_LITERAL=11;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int RULE_WIDE_STRING_LITERAL=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_FLOATING_PT_LITERAL=10;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_HEX_LITERAL=7;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int RULE_FIXED_PT_LITERAL=9;
    public static final int T__43=43;
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
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalIDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIDLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private IDLGrammarAccess grammarAccess;
     	
        public InternalIDLParser(TokenStream input, IDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "specification";	
       	}
       	
       	@Override
       	protected IDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulespecification"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:74:1: entryRulespecification returns [EObject current=null] : iv_rulespecification= rulespecification EOF ;
    public final EObject entryRulespecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulespecification = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:75:2: (iv_rulespecification= rulespecification EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:76:2: iv_rulespecification= rulespecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulespecification_in_entryRulespecification81);
            iv_rulespecification=rulespecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulespecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulespecification91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulespecification"


    // $ANTLR start "rulespecification"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:83:1: rulespecification returns [EObject current=null] : ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* ) ;
    public final EObject rulespecification() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_1_0 = null;

        EObject lv_contains_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:86:28: ( ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:87:1: ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:87:1: ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:87:2: () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )*
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:87:2: ()
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSpecificationAccess().getTranslationUnitAction_0(),
                          current);
                  
            }

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:96:2: ( (lv_includes_1_0= ruleinclude_decl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:97:1: (lv_includes_1_0= ruleinclude_decl )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:97:1: (lv_includes_1_0= ruleinclude_decl )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:98:3: lv_includes_1_0= ruleinclude_decl
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getIncludesInclude_declParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleinclude_decl_in_rulespecification149);
            	    lv_includes_1_0=ruleinclude_decl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"includes",
            	              		lv_includes_1_0, 
            	              		"include_decl");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:114:3: ( (lv_contains_2_0= ruledefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=23)||(LA2_0>=35 && LA2_0<=37)||(LA2_0>=40 && LA2_0<=41)||(LA2_0>=45 && LA2_0<=46)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:115:1: (lv_contains_2_0= ruledefinition )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:115:1: (lv_contains_2_0= ruledefinition )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:116:3: lv_contains_2_0= ruledefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSpecificationAccess().getContainsDefinitionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruledefinition_in_rulespecification171);
            	    lv_contains_2_0=ruledefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contains",
            	              		lv_contains_2_0, 
            	              		"definition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulespecification"


    // $ANTLR start "entryRuleinclude_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:140:1: entryRuleinclude_decl returns [EObject current=null] : iv_ruleinclude_decl= ruleinclude_decl EOF ;
    public final EObject entryRuleinclude_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinclude_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:141:2: (iv_ruleinclude_decl= ruleinclude_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:142:2: iv_ruleinclude_decl= ruleinclude_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInclude_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinclude_decl_in_entryRuleinclude_decl208);
            iv_ruleinclude_decl=ruleinclude_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinclude_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinclude_decl218); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinclude_decl"


    // $ANTLR start "ruleinclude_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:149:1: ruleinclude_decl returns [EObject current=null] : (otherlv_0= '#include' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleinclude_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:152:28: ( (otherlv_0= '#include' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:153:1: (otherlv_0= '#include' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:153:1: (otherlv_0= '#include' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:153:3: otherlv_0= '#include' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleinclude_decl255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInclude_declAccess().getIncludeKeyword_0());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:157:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:158:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:158:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:159:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleinclude_decl272); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getInclude_declAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInclude_declRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinclude_decl"


    // $ANTLR start "entryRuledefinition"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:183:1: entryRuledefinition returns [EObject current=null] : iv_ruledefinition= ruledefinition EOF ;
    public final EObject entryRuledefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefinition = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:184:2: (iv_ruledefinition= ruledefinition EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:185:2: iv_ruledefinition= ruledefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruledefinition_in_entryRuledefinition313);
            iv_ruledefinition=ruledefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruledefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledefinition323); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledefinition"


    // $ANTLR start "ruledefinition"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:192:1: ruledefinition returns [EObject current=null] : ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_interface_decl_6= ruleinterface_decl otherlv_7= ';' ) | (this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';' ) | (this_module_10= rulemodule otherlv_11= ';' ) ) ;
    public final EObject ruledefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_type_decl_0 = null;

        EObject this_const_decl_2 = null;

        EObject this_except_decl_4 = null;

        EObject this_interface_decl_6 = null;

        EObject this_interface_fwd_8 = null;

        EObject this_module_10 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:195:28: ( ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_interface_decl_6= ruleinterface_decl otherlv_7= ';' ) | (this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';' ) | (this_module_10= rulemodule otherlv_11= ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:196:1: ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_interface_decl_6= ruleinterface_decl otherlv_7= ';' ) | (this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';' ) | (this_module_10= rulemodule otherlv_11= ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:196:1: ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_interface_decl_6= ruleinterface_decl otherlv_7= ';' ) | (this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';' ) | (this_module_10= rulemodule otherlv_11= ';' ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:196:2: (this_type_decl_0= ruletype_decl otherlv_1= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:196:2: (this_type_decl_0= ruletype_decl otherlv_1= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:197:2: this_type_decl_0= ruletype_decl otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getType_declParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_ruledefinition374);
                    this_type_decl_0=ruletype_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_type_decl_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:213:6: (this_const_decl_2= ruleconst_decl otherlv_3= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:213:6: (this_const_decl_2= ruleconst_decl otherlv_3= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:214:2: this_const_decl_2= ruleconst_decl otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getConst_declParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_ruledefinition418);
                    this_const_decl_2=ruleconst_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_const_decl_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:230:6: (this_except_decl_4= ruleexcept_decl otherlv_5= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:230:6: (this_except_decl_4= ruleexcept_decl otherlv_5= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:231:2: this_except_decl_4= ruleexcept_decl otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getExcept_declParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_ruledefinition462);
                    this_except_decl_4=ruleexcept_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_except_decl_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:247:6: (this_interface_decl_6= ruleinterface_decl otherlv_7= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:247:6: (this_interface_decl_6= ruleinterface_decl otherlv_7= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:248:2: this_interface_decl_6= ruleinterface_decl otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getInterface_declParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinterface_decl_in_ruledefinition506);
                    this_interface_decl_6=ruleinterface_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_interface_decl_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:264:6: (this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:264:6: (this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:265:2: this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getInterface_fwdParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinterface_fwd_in_ruledefinition550);
                    this_interface_fwd_8=ruleinterface_fwd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_interface_fwd_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:281:6: (this_module_10= rulemodule otherlv_11= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:281:6: (this_module_10= rulemodule otherlv_11= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:282:2: this_module_10= rulemodule otherlv_11= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getModuleParserRuleCall_5_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulemodule_in_ruledefinition594);
                    this_module_10=rulemodule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_module_10; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledefinition"


    // $ANTLR start "entryRulemodule"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:305:1: entryRulemodule returns [EObject current=null] : iv_rulemodule= rulemodule EOF ;
    public final EObject entryRulemodule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodule = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:306:2: (iv_rulemodule= rulemodule EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:307:2: iv_rulemodule= rulemodule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemodule_in_entryRulemodule642);
            iv_rulemodule=rulemodule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemodule; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemodule652); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemodule"


    // $ANTLR start "rulemodule"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:314:1: rulemodule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_contains_3_0= ruledefinition ) ) | otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject rulemodule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_contains_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:317:28: ( (otherlv_0= 'module' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_contains_3_0= ruledefinition ) ) | otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:318:1: (otherlv_0= 'module' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_contains_3_0= ruledefinition ) ) | otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:318:1: (otherlv_0= 'module' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_contains_3_0= ruledefinition ) ) | otherlv_4= ';' )* otherlv_5= '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:318:3: otherlv_0= 'module' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_contains_3_0= ruledefinition ) ) | otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulemodule689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:322:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:323:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:323:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:324:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemodule706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_1_0, grammarAccess.getModuleAccess().getIdentifierIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulemodule723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:344:1: ( ( (lv_contains_3_0= ruledefinition ) ) | otherlv_4= ';' )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||(LA4_0>=21 && LA4_0<=23)||(LA4_0>=35 && LA4_0<=37)||(LA4_0>=40 && LA4_0<=41)||(LA4_0>=45 && LA4_0<=46)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:344:2: ( (lv_contains_3_0= ruledefinition ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:344:2: ( (lv_contains_3_0= ruledefinition ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:345:1: (lv_contains_3_0= ruledefinition )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:345:1: (lv_contains_3_0= ruledefinition )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:346:3: lv_contains_3_0= ruledefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getContainsDefinitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruledefinition_in_rulemodule745);
            	    lv_contains_3_0=ruledefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contains",
            	              		lv_contains_3_0, 
            	              		"definition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:363:7: otherlv_4= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemodule763); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getSemicolonKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulemodule777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemodule"


    // $ANTLR start "entryRuleinterface_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:379:1: entryRuleinterface_decl returns [EObject current=null] : iv_ruleinterface_decl= ruleinterface_decl EOF ;
    public final EObject entryRuleinterface_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:380:2: (iv_ruleinterface_decl= ruleinterface_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:381:2: iv_ruleinterface_decl= ruleinterface_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinterface_decl_in_entryRuleinterface_decl813);
            iv_ruleinterface_decl=ruleinterface_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterface_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinterface_decl823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinterface_decl"


    // $ANTLR start "ruleinterface_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:388:1: ruleinterface_decl returns [EObject current=null] : ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '{' ( ( (lv_contains_9_0= ruleexport ) ) | otherlv_10= ';' )* otherlv_11= '}' ) ;
    public final EObject ruleinterface_decl() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token lv_isCustom_1_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_contains_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:391:28: ( ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '{' ( ( (lv_contains_9_0= ruleexport ) ) | otherlv_10= ';' )* otherlv_11= '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:1: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '{' ( ( (lv_contains_9_0= ruleexport ) ) | otherlv_10= ';' )* otherlv_11= '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:1: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '{' ( ( (lv_contains_9_0= ruleexport ) ) | otherlv_10= ';' )* otherlv_11= '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )? otherlv_8= '{' ( ( (lv_contains_9_0= ruleexport ) ) | otherlv_10= ';' )* otherlv_11= '}'
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:393:1: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:393:1: (lv_isAbstract_0_0= 'abstract' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:394:3: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleinterface_decl867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isAbstract_0_0, grammarAccess.getInterface_declAccess().getIsAbstractAbstractKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterface_declRule());
                      	        }
                             		setWithLastConsumed(current, "isAbstract", true, "abstract");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:408:6: ( (lv_isCustom_1_0= 'local' ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:408:6: ( (lv_isCustom_1_0= 'local' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:409:1: (lv_isCustom_1_0= 'local' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:409:1: (lv_isCustom_1_0= 'local' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:410:3: lv_isCustom_1_0= 'local'
                    {
                    lv_isCustom_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleinterface_decl904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isCustom_1_0, grammarAccess.getInterface_declAccess().getIsCustomLocalKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterface_declRule());
                      	        }
                             		setWithLastConsumed(current, "isCustom", true, "local");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleinterface_decl931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInterface_declAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:427:1: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:428:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:428:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:429:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_3_0, grammarAccess.getInterface_declAccess().getIdentifierIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterface_declRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:445:2: (otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:445:4: otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleinterface_decl966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInterface_declAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:449:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:450:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:450:1: (otherlv_5= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:451:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterface_declRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getInterface_declAccess().getDerivesFromInterfaceDefCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:465:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:465:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleinterface_decl1003); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getInterface_declAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:469:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:470:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:470:1: (otherlv_7= RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:471:3: otherlv_7= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getInterface_declRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl1027); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_7, grammarAccess.getInterface_declAccess().getDerivesFromInterfaceDefCrossReference_3_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleinterface_decl1043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInterface_declAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:489:1: ( ( (lv_contains_9_0= ruleexport ) ) | otherlv_10= ';' )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==26||(LA8_0>=31 && LA8_0<=32)||(LA8_0>=35 && LA8_0<=37)||(LA8_0>=40 && LA8_0<=41)||(LA8_0>=45 && LA8_0<=46)||(LA8_0>=51 && LA8_0<=52)||(LA8_0>=54 && LA8_0<=57)||(LA8_0>=72 && LA8_0<=79)) ) {
                    alt8=1;
                }
                else if ( (LA8_0==17) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:489:2: ( (lv_contains_9_0= ruleexport ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:489:2: ( (lv_contains_9_0= ruleexport ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:490:1: (lv_contains_9_0= ruleexport )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:490:1: (lv_contains_9_0= ruleexport )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:491:3: lv_contains_9_0= ruleexport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterface_declAccess().getContainsExportParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleexport_in_ruleinterface_decl1065);
            	    lv_contains_9_0=ruleexport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterface_declRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contains",
            	              		lv_contains_9_0, 
            	              		"export");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:508:7: otherlv_10= ';'
            	    {
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleinterface_decl1083); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getInterface_declAccess().getSemicolonKeyword_5_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleinterface_decl1097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getInterface_declAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinterface_decl"


    // $ANTLR start "entryRuleinterface_fwd"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:524:1: entryRuleinterface_fwd returns [EObject current=null] : iv_ruleinterface_fwd= ruleinterface_fwd EOF ;
    public final EObject entryRuleinterface_fwd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_fwd = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:525:2: (iv_ruleinterface_fwd= ruleinterface_fwd EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:526:2: iv_ruleinterface_fwd= ruleinterface_fwd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterface_fwdRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinterface_fwd_in_entryRuleinterface_fwd1133);
            iv_ruleinterface_fwd=ruleinterface_fwd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinterface_fwd; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinterface_fwd1143); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinterface_fwd"


    // $ANTLR start "ruleinterface_fwd"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:533:1: ruleinterface_fwd returns [EObject current=null] : ( (otherlv_0= 'abstract' | otherlv_1= 'local' )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ) ;
    public final EObject ruleinterface_fwd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:536:28: ( ( (otherlv_0= 'abstract' | otherlv_1= 'local' )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:537:1: ( (otherlv_0= 'abstract' | otherlv_1= 'local' )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:537:1: ( (otherlv_0= 'abstract' | otherlv_1= 'local' )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:537:2: (otherlv_0= 'abstract' | otherlv_1= 'local' )? otherlv_2= 'interface' ( (lv_identifier_3_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:537:2: (otherlv_0= 'abstract' | otherlv_1= 'local' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:537:4: otherlv_0= 'abstract'
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleinterface_fwd1181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getInterface_fwdAccess().getAbstractKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:542:7: otherlv_1= 'local'
                    {
                    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleinterface_fwd1199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getInterface_fwdAccess().getLocalKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleinterface_fwd1213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInterface_fwdAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:550:1: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:551:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:551:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:552:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_fwd1230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_3_0, grammarAccess.getInterface_fwdAccess().getIdentifierIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterface_fwdRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinterface_fwd"


    // $ANTLR start "entryRuleexport"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:576:1: entryRuleexport returns [EObject current=null] : iv_ruleexport= ruleexport EOF ;
    public final EObject entryRuleexport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexport = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:577:2: (iv_ruleexport= ruleexport EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:578:2: iv_ruleexport= ruleexport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleexport_in_entryRuleexport1271);
            iv_ruleexport=ruleexport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleexport1281); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexport"


    // $ANTLR start "ruleexport"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:585:1: ruleexport returns [EObject current=null] : ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_attr_decl_6= ruleattr_decl otherlv_7= ';' ) | (this_op_decl_8= ruleop_decl otherlv_9= ';' ) ) ;
    public final EObject ruleexport() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_type_decl_0 = null;

        EObject this_const_decl_2 = null;

        EObject this_except_decl_4 = null;

        EObject this_attr_decl_6 = null;

        EObject this_op_decl_8 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:588:28: ( ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_attr_decl_6= ruleattr_decl otherlv_7= ';' ) | (this_op_decl_8= ruleop_decl otherlv_9= ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:589:1: ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_attr_decl_6= ruleattr_decl otherlv_7= ';' ) | (this_op_decl_8= ruleop_decl otherlv_9= ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:589:1: ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_attr_decl_6= ruleattr_decl otherlv_7= ';' ) | (this_op_decl_8= ruleop_decl otherlv_9= ';' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
            case 40:
            case 41:
            case 45:
                {
                alt10=1;
                }
                break;
            case 46:
                {
                alt10=2;
                }
                break;
            case 35:
                {
                alt10=3;
                }
                break;
            case 31:
            case 32:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
            case 26:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:589:2: (this_type_decl_0= ruletype_decl otherlv_1= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:589:2: (this_type_decl_0= ruletype_decl otherlv_1= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:590:2: this_type_decl_0= ruletype_decl otherlv_1= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExportAccess().getType_declParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_ruleexport1332);
                    this_type_decl_0=ruletype_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_type_decl_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExportAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:606:6: (this_const_decl_2= ruleconst_decl otherlv_3= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:606:6: (this_const_decl_2= ruleconst_decl otherlv_3= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:607:2: this_const_decl_2= ruleconst_decl otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExportAccess().getConst_declParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_ruleexport1376);
                    this_const_decl_2=ruleconst_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_const_decl_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExportAccess().getSemicolonKeyword_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:623:6: (this_except_decl_4= ruleexcept_decl otherlv_5= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:623:6: (this_except_decl_4= ruleexcept_decl otherlv_5= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:624:2: this_except_decl_4= ruleexcept_decl otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExportAccess().getExcept_declParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_ruleexport1420);
                    this_except_decl_4=ruleexcept_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_except_decl_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExportAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:640:6: (this_attr_decl_6= ruleattr_decl otherlv_7= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:640:6: (this_attr_decl_6= ruleattr_decl otherlv_7= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:641:2: this_attr_decl_6= ruleattr_decl otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExportAccess().getAttr_declParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleattr_decl_in_ruleexport1464);
                    this_attr_decl_6=ruleattr_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_attr_decl_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExportAccess().getSemicolonKeyword_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:657:6: (this_op_decl_8= ruleop_decl otherlv_9= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:657:6: (this_op_decl_8= ruleop_decl otherlv_9= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:658:2: this_op_decl_8= ruleop_decl otherlv_9= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExportAccess().getOp_declParserRuleCall_4_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleop_decl_in_ruleexport1508);
                    this_op_decl_8=ruleop_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_op_decl_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getExportAccess().getSemicolonKeyword_4_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexport"


    // $ANTLR start "entryRuleop_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:681:1: entryRuleop_decl returns [EObject current=null] : iv_ruleop_decl= ruleop_decl EOF ;
    public final EObject entryRuleop_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleop_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:682:2: (iv_ruleop_decl= ruleop_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:683:2: iv_ruleop_decl= ruleop_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOp_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleop_decl_in_entryRuleop_decl1556);
            iv_ruleop_decl=ruleop_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleop_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleop_decl1566); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleop_decl"


    // $ANTLR start "ruleop_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:690:1: ruleop_decl returns [EObject current=null] : ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? otherlv_8= ')' (otherlv_9= 'raises' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'context' otherlv_16= '(' ( (lv_contexts_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* otherlv_20= ')' )? ) ;
    public final EObject ruleop_decl() throws RecognitionException {
        EObject current = null;

        Token lv_isOneway_0_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_contexts_17_0=null;
        Token otherlv_18=null;
        Token lv_contexts_19_0=null;
        Token otherlv_20=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:693:28: ( ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? otherlv_8= ')' (otherlv_9= 'raises' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'context' otherlv_16= '(' ( (lv_contexts_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* otherlv_20= ')' )? ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:694:1: ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? otherlv_8= ')' (otherlv_9= 'raises' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'context' otherlv_16= '(' ( (lv_contexts_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* otherlv_20= ')' )? )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:694:1: ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? otherlv_8= ')' (otherlv_9= 'raises' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'context' otherlv_16= '(' ( (lv_contexts_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* otherlv_20= ')' )? )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:694:2: ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? otherlv_8= ')' (otherlv_9= 'raises' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )? (otherlv_15= 'context' otherlv_16= '(' ( (lv_contexts_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* otherlv_20= ')' )?
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:694:2: ( (lv_isOneway_0_0= 'oneway' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:695:1: (lv_isOneway_0_0= 'oneway' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:695:1: (lv_isOneway_0_0= 'oneway' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:696:3: lv_isOneway_0_0= 'oneway'
                    {
                    lv_isOneway_0_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleop_decl1609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isOneway_0_0, grammarAccess.getOp_declAccess().getIsOnewayOnewayKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOp_declRule());
                      	        }
                             		setWithLastConsumed(current, "isOneway", true, "oneway");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:709:3: ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=51 && LA12_0<=52)||(LA12_0>=54 && LA12_0<=57)||(LA12_0>=72 && LA12_0<=79)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:709:4: ( (lv_containedType_1_0= ruleop_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:709:4: ( (lv_containedType_1_0= ruleop_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:710:1: (lv_containedType_1_0= ruleop_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:710:1: (lv_containedType_1_0= ruleop_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:711:3: lv_containedType_1_0= ruleop_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOp_declAccess().getContainedTypeOp_type_specParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleop_type_spec_in_ruleop_decl1645);
                    lv_containedType_1_0=ruleop_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOp_declRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_1_0, 
                              		"op_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:728:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:728:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:729:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:729:1: (otherlv_2= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:730:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOp_declRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getOp_declAccess().getSharedTypeTypedefDefCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:744:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:745:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:745:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:746:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_3_0, grammarAccess.getOp_declAccess().getIdentifierIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOp_declRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:766:1: ( ( (lv_parameters_5_0= ruleparam_decl ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=69 && LA14_0<=71)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:766:2: ( (lv_parameters_5_0= ruleparam_decl ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )*
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:766:2: ( (lv_parameters_5_0= ruleparam_decl ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:767:1: (lv_parameters_5_0= ruleparam_decl )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:767:1: (lv_parameters_5_0= ruleparam_decl )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:768:3: lv_parameters_5_0= ruleparam_decl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOp_declAccess().getParametersParam_declParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_ruleop_decl1732);
                    lv_parameters_5_0=ruleparam_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOp_declRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_5_0, 
                              		"param_decl");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:784:2: (otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:784:4: otherlv_6= ',' ( (lv_parameters_7_0= ruleparam_decl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1745); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getOp_declAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:788:1: ( (lv_parameters_7_0= ruleparam_decl ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:789:1: (lv_parameters_7_0= ruleparam_decl )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:789:1: (lv_parameters_7_0= ruleparam_decl )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:790:3: lv_parameters_7_0= ruleparam_decl
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOp_declAccess().getParametersParam_declParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_ruleop_decl1766);
                    	    lv_parameters_7_0=ruleparam_decl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOp_declRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_7_0, 
                    	              		"param_decl");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOp_declAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:810:1: (otherlv_9= 'raises' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:810:3: otherlv_9= 'raises' otherlv_10= '(' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleop_decl1795); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOp_declAccess().getRaisesKeyword_6_0());
                          
                    }
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:818:1: ( (otherlv_11= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:819:1: (otherlv_11= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:819:1: (otherlv_11= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:820:3: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOp_declRule());
                      	        }
                              
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_11, grammarAccess.getOp_declAccess().getCanRaiseExceptionDefCrossReference_6_2_0()); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:834:2: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==25) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:834:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1844); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_12, grammarAccess.getOp_declAccess().getCommaKeyword_6_3_0());
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:838:1: ( (otherlv_13= RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:839:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:839:1: (otherlv_13= RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:840:3: otherlv_13= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOp_declRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1868); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_13, grammarAccess.getOp_declAccess().getCanRaiseExceptionDefCrossReference_6_3_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getOp_declAccess().getRightParenthesisKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:858:3: (otherlv_15= 'context' otherlv_16= '(' ( (lv_contexts_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* otherlv_20= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:858:5: otherlv_15= 'context' otherlv_16= '(' ( (lv_contexts_17_0= RULE_STRING ) ) (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleop_decl1897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getOp_declAccess().getContextKeyword_7_0());
                          
                    }
                    otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_7_1());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:866:1: ( (lv_contexts_17_0= RULE_STRING ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:867:1: (lv_contexts_17_0= RULE_STRING )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:867:1: (lv_contexts_17_0= RULE_STRING )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:868:3: lv_contexts_17_0= RULE_STRING
                    {
                    lv_contexts_17_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleop_decl1926); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_contexts_17_0, grammarAccess.getOp_declAccess().getContextsSTRINGTerminalRuleCall_7_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOp_declRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"contexts",
                              		lv_contexts_17_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:884:2: (otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:884:4: otherlv_18= ',' ( (lv_contexts_19_0= RULE_STRING ) )
                    	    {
                    	    otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1944); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getOp_declAccess().getCommaKeyword_7_3_0());
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:888:1: ( (lv_contexts_19_0= RULE_STRING ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:889:1: (lv_contexts_19_0= RULE_STRING )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:889:1: (lv_contexts_19_0= RULE_STRING )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:890:3: lv_contexts_19_0= RULE_STRING
                    	    {
                    	    lv_contexts_19_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleop_decl1961); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_contexts_19_0, grammarAccess.getOp_declAccess().getContextsSTRINGTerminalRuleCall_7_3_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOp_declRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"contexts",
                    	              		lv_contexts_19_0, 
                    	              		"STRING");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getOp_declAccess().getRightParenthesisKeyword_7_4());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleop_decl"


    // $ANTLR start "entryRuleop_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:918:1: entryRuleop_type_spec returns [EObject current=null] : iv_ruleop_type_spec= ruleop_type_spec EOF ;
    public final EObject entryRuleop_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleop_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:919:2: (iv_ruleop_type_spec= ruleop_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:920:2: iv_ruleop_type_spec= ruleop_type_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOp_type_specRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleop_type_spec_in_entryRuleop_type_spec2018);
            iv_ruleop_type_spec=ruleop_type_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleop_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleop_type_spec2028); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleop_type_spec"


    // $ANTLR start "ruleop_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:927:1: ruleop_type_spec returns [EObject current=null] : (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) ) ;
    public final EObject ruleop_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_base_type_spec_0 = null;

        Enumerator lv_kind_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:930:28: ( (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:931:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:931:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=51 && LA19_0<=52)||(LA19_0>=54 && LA19_0<=57)||(LA19_0>=72 && LA19_0<=78)) ) {
                alt19=1;
            }
            else if ( (LA19_0==79) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:932:2: this_base_type_spec_0= rulebase_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOp_type_specAccess().getBase_type_specParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleop_type_spec2078);
                    this_base_type_spec_0=rulebase_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_base_type_spec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:944:6: ( () ( (lv_kind_2_0= rulevoid_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:944:6: ( () ( (lv_kind_2_0= rulevoid_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:944:7: () ( (lv_kind_2_0= rulevoid_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:944:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:945:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getOp_type_specAccess().getPrimitiveDefAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:953:2: ( (lv_kind_2_0= rulevoid_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:954:1: (lv_kind_2_0= rulevoid_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:954:1: (lv_kind_2_0= rulevoid_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:955:3: lv_kind_2_0= rulevoid_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOp_type_specAccess().getKindVoid_typeEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulevoid_type_in_ruleop_type_spec2117);
                    lv_kind_2_0=rulevoid_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOp_type_specRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"void_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleop_type_spec"


    // $ANTLR start "entryRuleparam_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:979:1: entryRuleparam_decl returns [EObject current=null] : iv_ruleparam_decl= ruleparam_decl EOF ;
    public final EObject entryRuleparam_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparam_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:980:2: (iv_ruleparam_decl= ruleparam_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:981:2: iv_ruleparam_decl= ruleparam_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParam_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_entryRuleparam_decl2154);
            iv_ruleparam_decl=ruleparam_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleparam_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleparam_decl2164); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparam_decl"


    // $ANTLR start "ruleparam_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:988:1: ruleparam_decl returns [EObject current=null] : ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ) ;
    public final EObject ruleparam_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_identifier_3_0=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_containedType_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:991:28: ( ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:992:1: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:992:1: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:992:2: ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:992:2: ( (lv_direction_0_0= ruleparam_attribute ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:993:1: (lv_direction_0_0= ruleparam_attribute )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:993:1: (lv_direction_0_0= ruleparam_attribute )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:994:3: lv_direction_0_0= ruleparam_attribute
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParam_declAccess().getDirectionParam_attributeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleparam_attribute_in_ruleparam_decl2210);
            lv_direction_0_0=ruleparam_attribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParam_declRule());
              	        }
                     		set(
                     			current, 
                     			"direction",
                      		lv_direction_0_0, 
                      		"param_attribute");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1010:2: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=51 && LA20_0<=52)||(LA20_0>=54 && LA20_0<=57)||(LA20_0>=72 && LA20_0<=78)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1010:3: ( (lv_containedType_1_0= rulebase_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1010:3: ( (lv_containedType_1_0= rulebase_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1011:1: (lv_containedType_1_0= rulebase_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1011:1: (lv_containedType_1_0= rulebase_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1012:3: lv_containedType_1_0= rulebase_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParam_declAccess().getContainedTypeBase_type_specParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleparam_decl2232);
                    lv_containedType_1_0=rulebase_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParam_declRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_1_0, 
                              		"base_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1029:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1029:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1030:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1030:1: (otherlv_2= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1031:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParam_declRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleparam_decl2262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getParam_declAccess().getSharedTypeTypedefDefCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1045:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1046:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1046:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1047:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleparam_decl2280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_3_0, grammarAccess.getParam_declAccess().getIdentifierIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParam_declRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_3_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparam_decl"


    // $ANTLR start "entryRuleattr_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1071:1: entryRuleattr_decl returns [EObject current=null] : iv_ruleattr_decl= ruleattr_decl EOF ;
    public final EObject entryRuleattr_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1072:2: (iv_ruleattr_decl= ruleattr_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1073:2: iv_ruleattr_decl= ruleattr_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttr_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleattr_decl_in_entryRuleattr_decl2321);
            iv_ruleattr_decl=ruleattr_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleattr_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleattr_decl2331); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleattr_decl"


    // $ANTLR start "ruleattr_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1080:1: ruleattr_decl returns [EObject current=null] : (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec ) ;
    public final EObject ruleattr_decl() throws RecognitionException {
        EObject current = null;

        EObject this_readonly_attr_spec_0 = null;

        EObject this_attr_spec_1 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1083:28: ( (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1084:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1084:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==32) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1085:2: this_readonly_attr_spec_0= rulereadonly_attr_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttr_declAccess().getReadonly_attr_specParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulereadonly_attr_spec_in_ruleattr_decl2381);
                    this_readonly_attr_spec_0=rulereadonly_attr_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_readonly_attr_spec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1098:2: this_attr_spec_1= ruleattr_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttr_declAccess().getAttr_specParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleattr_spec_in_ruleattr_decl2411);
                    this_attr_spec_1=ruleattr_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_attr_spec_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleattr_decl"


    // $ANTLR start "entryRulereadonly_attr_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1117:1: entryRulereadonly_attr_spec returns [EObject current=null] : iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF ;
    public final EObject entryRulereadonly_attr_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadonly_attr_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1118:2: (iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1119:2: iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadonly_attr_specRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulereadonly_attr_spec_in_entryRulereadonly_attr_spec2446);
            iv_rulereadonly_attr_spec=rulereadonly_attr_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulereadonly_attr_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulereadonly_attr_spec2456); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereadonly_attr_spec"


    // $ANTLR start "rulereadonly_attr_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1126:1: rulereadonly_attr_spec returns [EObject current=null] : ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) ) ;
    public final EObject rulereadonly_attr_spec() throws RecognitionException {
        EObject current = null;

        Token lv_isReadonly_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_identifier_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_isReadonly_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_identifier_15_0=null;
        EObject lv_containedType_2_0 = null;

        EObject lv_containedType_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1129:28: ( ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1130:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1130:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1130:2: ( ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1130:2: ( ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1130:3: ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1130:3: ( (lv_isReadonly_0_0= 'readonly' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1131:1: (lv_isReadonly_0_0= 'readonly' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1131:1: (lv_isReadonly_0_0= 'readonly' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1132:3: lv_isReadonly_0_0= 'readonly'
                    {
                    lv_isReadonly_0_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulereadonly_attr_spec2500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isReadonly_0_0, grammarAccess.getReadonly_attr_specAccess().getIsReadonlyReadonlyKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                      	        }
                             		setWithLastConsumed(current, "isReadonly", true, "readonly");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulereadonly_attr_spec2525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReadonly_attr_specAccess().getAttributeKeyword_0_1());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1149:1: ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=51 && LA22_0<=52)||(LA22_0>=54 && LA22_0<=57)||(LA22_0>=72 && LA22_0<=78)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1149:2: ( (lv_containedType_2_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1149:2: ( (lv_containedType_2_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1150:1: (lv_containedType_2_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1150:1: (lv_containedType_2_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1151:3: lv_containedType_2_0= rulebase_type_spec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReadonly_attr_specAccess().getContainedTypeBase_type_specParserRuleCall_0_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2547);
                            lv_containedType_2_0=rulebase_type_spec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReadonly_attr_specRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"containedType",
                                      		lv_containedType_2_0, 
                                      		"base_type_spec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1168:6: ( (otherlv_3= RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1168:6: ( (otherlv_3= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1169:1: (otherlv_3= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1169:1: (otherlv_3= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1170:3: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                              	        }
                                      
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2577); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_3, grammarAccess.getReadonly_attr_specAccess().getSharedTypeTypedefDefCrossReference_0_2_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1184:3: ( (lv_identifier_4_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1185:1: (lv_identifier_4_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1185:1: (lv_identifier_4_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1186:3: lv_identifier_4_0= RULE_ID
                    {
                    lv_identifier_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_4_0, grammarAccess.getReadonly_attr_specAccess().getIdentifierIDTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_rulereadonly_attr_spec2612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReadonly_attr_specAccess().getRaisesKeyword_0_4());
                          
                    }
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulereadonly_attr_spec2624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getReadonly_attr_specAccess().getLeftParenthesisKeyword_0_5());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1210:1: ( (otherlv_7= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1211:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1211:1: (otherlv_7= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1212:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getReadonly_attr_specAccess().getGetRaisesExceptionDefCrossReference_0_6_0()); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1226:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1226:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulereadonly_attr_spec2661); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getReadonly_attr_specAccess().getCommaKeyword_0_7_0());
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1230:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1231:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1231:1: (otherlv_9= RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1232:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2685); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getReadonly_attr_specAccess().getGetRaisesExceptionDefCrossReference_0_7_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulereadonly_attr_spec2699); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getReadonly_attr_specAccess().getRightParenthesisKeyword_0_8());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1251:6: ( ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1251:6: ( ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1251:7: ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1251:7: ( (lv_isReadonly_11_0= 'readonly' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1252:1: (lv_isReadonly_11_0= 'readonly' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1252:1: (lv_isReadonly_11_0= 'readonly' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1253:3: lv_isReadonly_11_0= 'readonly'
                    {
                    lv_isReadonly_11_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulereadonly_attr_spec2725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isReadonly_11_0, grammarAccess.getReadonly_attr_specAccess().getIsReadonlyReadonlyKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                      	        }
                             		setWithLastConsumed(current, "isReadonly", true, "readonly");
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulereadonly_attr_spec2750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getReadonly_attr_specAccess().getAttributeKeyword_1_1());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1270:1: ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=51 && LA24_0<=52)||(LA24_0>=54 && LA24_0<=57)||(LA24_0>=72 && LA24_0<=78)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==RULE_ID) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1270:2: ( (lv_containedType_13_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1270:2: ( (lv_containedType_13_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1271:1: (lv_containedType_13_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1271:1: (lv_containedType_13_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1272:3: lv_containedType_13_0= rulebase_type_spec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getReadonly_attr_specAccess().getContainedTypeBase_type_specParserRuleCall_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2772);
                            lv_containedType_13_0=rulebase_type_spec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getReadonly_attr_specRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"containedType",
                                      		lv_containedType_13_0, 
                                      		"base_type_spec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1289:6: ( (otherlv_14= RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1289:6: ( (otherlv_14= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1290:1: (otherlv_14= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1290:1: (otherlv_14= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1291:3: otherlv_14= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                              	        }
                                      
                            }
                            otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2802); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_14, grammarAccess.getReadonly_attr_specAccess().getSharedTypeTypedefDefCrossReference_1_2_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1305:3: ( (lv_identifier_15_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:1: (lv_identifier_15_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:1: (lv_identifier_15_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1307:3: lv_identifier_15_0= RULE_ID
                    {
                    lv_identifier_15_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_15_0, grammarAccess.getReadonly_attr_specAccess().getIdentifierIDTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadonly_attr_specRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_15_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereadonly_attr_spec"


    // $ANTLR start "entryRuleattr_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1331:1: entryRuleattr_spec returns [EObject current=null] : iv_ruleattr_spec= ruleattr_spec EOF ;
    public final EObject entryRuleattr_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1332:2: (iv_ruleattr_spec= ruleattr_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1333:2: iv_ruleattr_spec= ruleattr_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttr_specRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleattr_spec_in_entryRuleattr_spec2862);
            iv_ruleattr_spec=ruleattr_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleattr_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleattr_spec2872); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleattr_spec"


    // $ANTLR start "ruleattr_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1340:1: ruleattr_spec returns [EObject current=null] : ( (otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) ) ) | (otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) ) ;
    public final EObject ruleattr_spec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token lv_identifier_25_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_containedType_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1343:28: ( ( (otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) ) ) | (otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1344:1: ( (otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) ) ) | (otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1344:1: ( (otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) ) ) | (otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1344:2: (otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1344:2: (otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1344:4: otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) )
                    {
                    otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleattr_spec2910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAttr_specAccess().getAttributeKeyword_0_0());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1348:1: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=51 && LA26_0<=52)||(LA26_0>=54 && LA26_0<=57)||(LA26_0>=72 && LA26_0<=78)) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==RULE_ID) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1348:2: ( (lv_containedType_1_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1348:2: ( (lv_containedType_1_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1349:1: (lv_containedType_1_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1349:1: (lv_containedType_1_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1350:3: lv_containedType_1_0= rulebase_type_spec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttr_specAccess().getContainedTypeBase_type_specParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleattr_spec2932);
                            lv_containedType_1_0=rulebase_type_spec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAttr_specRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"containedType",
                                      		lv_containedType_1_0, 
                                      		"base_type_spec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1367:6: ( (otherlv_2= RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1367:6: ( (otherlv_2= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1368:1: (otherlv_2= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1368:1: (otherlv_2= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1369:3: otherlv_2= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttr_specRule());
                              	        }
                                      
                            }
                            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2962); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_2, grammarAccess.getAttr_specAccess().getSharedTypeTypedefDefCrossReference_0_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1383:3: ( (lv_identifier_3_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1384:1: (lv_identifier_3_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1384:1: (lv_identifier_3_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1385:3: lv_identifier_3_0= RULE_ID
                    {
                    lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_3_0, grammarAccess.getAttr_specAccess().getIdentifierIDTerminalRuleCall_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttr_specRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1401:2: ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==33) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==34) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1401:3: (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1401:3: (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1401:5: otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )?
                            {
                            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleattr_spec2999); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getAttr_specAccess().getGetraisesKeyword_0_3_0_0());
                                  
                            }
                            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec3011); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_0_1());
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1409:1: ( (otherlv_6= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1410:1: (otherlv_6= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1410:1: (otherlv_6= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1411:3: otherlv_6= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttr_specRule());
                              	        }
                                      
                            }
                            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3035); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_6, grammarAccess.getAttr_specAccess().getGetRaisesExceptionDefCrossReference_0_3_0_2_0()); 
                              	
                            }

                            }


                            }

                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1425:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==25) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1425:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                            	    {
                            	    otherlv_7=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec3048); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_7, grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_0_3_0());
                            	          
                            	    }
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1429:1: ( (otherlv_8= RULE_ID ) )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1430:1: (otherlv_8= RULE_ID )
                            	    {
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1430:1: (otherlv_8= RULE_ID )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1431:3: otherlv_8= RULE_ID
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      		  /* */ 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getAttr_specRule());
                            	      	        }
                            	              
                            	    }
                            	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3072); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		newLeafNode(otherlv_8, grammarAccess.getAttr_specAccess().getGetRaisesExceptionDefCrossReference_0_3_0_3_1_0()); 
                            	      	
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec3086); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getAttr_specAccess().getRightParenthesisKeyword_0_3_0_4());
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1449:1: (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==34) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1449:3: otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')'
                                    {
                                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleattr_spec3099); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_10, grammarAccess.getAttr_specAccess().getSetraisesKeyword_0_3_0_5_0());
                                          
                                    }
                                    otherlv_11=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec3111); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_11, grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_0_5_1());
                                          
                                    }
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1457:1: ( (otherlv_12= RULE_ID ) )
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1458:1: (otherlv_12= RULE_ID )
                                    {
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1458:1: (otherlv_12= RULE_ID )
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1459:3: otherlv_12= RULE_ID
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      		  /* */ 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = createModelElement(grammarAccess.getAttr_specRule());
                                      	        }
                                              
                                    }
                                    otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3135); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		newLeafNode(otherlv_12, grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_0_5_2_0()); 
                                      	
                                    }

                                    }


                                    }

                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1473:2: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                                    loop28:
                                    do {
                                        int alt28=2;
                                        int LA28_0 = input.LA(1);

                                        if ( (LA28_0==25) ) {
                                            alt28=1;
                                        }


                                        switch (alt28) {
                                    	case 1 :
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1473:4: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                                    	    {
                                    	    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec3148); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_13, grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_0_5_3_0());
                                    	          
                                    	    }
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1477:1: ( (otherlv_14= RULE_ID ) )
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1478:1: (otherlv_14= RULE_ID )
                                    	    {
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1478:1: (otherlv_14= RULE_ID )
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1479:3: otherlv_14= RULE_ID
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      		  /* */ 
                                    	      		
                                    	    }
                                    	    if ( state.backtracking==0 ) {

                                    	      			if (current==null) {
                                    	      	            current = createModelElement(grammarAccess.getAttr_specRule());
                                    	      	        }
                                    	              
                                    	    }
                                    	    otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3172); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      		newLeafNode(otherlv_14, grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_0_5_3_1_0()); 
                                    	      	
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop28;
                                        }
                                    } while (true);

                                    otherlv_15=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec3186); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_15, grammarAccess.getAttr_specAccess().getRightParenthesisKeyword_0_3_0_5_4());
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1498:6: (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1498:6: (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1498:8: otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')'
                            {
                            otherlv_16=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleattr_spec3208); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_16, grammarAccess.getAttr_specAccess().getSetraisesKeyword_0_3_1_0());
                                  
                            }
                            otherlv_17=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec3220); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_17, grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_1_1());
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1506:1: ( (otherlv_18= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1507:1: (otherlv_18= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1507:1: (otherlv_18= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1508:3: otherlv_18= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttr_specRule());
                              	        }
                                      
                            }
                            otherlv_18=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3244); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_18, grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_1_2_0()); 
                              	
                            }

                            }


                            }

                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1522:2: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==25) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1522:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                            	    {
                            	    otherlv_19=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec3257); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_19, grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_1_3_0());
                            	          
                            	    }
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1526:1: ( (otherlv_20= RULE_ID ) )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1527:1: (otherlv_20= RULE_ID )
                            	    {
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1527:1: (otherlv_20= RULE_ID )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1528:3: otherlv_20= RULE_ID
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      		  /* */ 
                            	      		
                            	    }
                            	    if ( state.backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getAttr_specRule());
                            	      	        }
                            	              
                            	    }
                            	    otherlv_20=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3281); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		newLeafNode(otherlv_20, grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_1_3_1_0()); 
                            	      	
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec3295); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_21, grammarAccess.getAttr_specAccess().getRightParenthesisKeyword_0_3_1_4());
                                  
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1547:6: (otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1547:6: (otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1547:8: otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) )
                    {
                    otherlv_22=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleattr_spec3317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getAttr_specAccess().getAttributeKeyword_1_0());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1551:1: ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=51 && LA32_0<=52)||(LA32_0>=54 && LA32_0<=57)||(LA32_0>=72 && LA32_0<=78)) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_ID) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1551:2: ( (lv_containedType_23_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1551:2: ( (lv_containedType_23_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1552:1: (lv_containedType_23_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1552:1: (lv_containedType_23_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1553:3: lv_containedType_23_0= rulebase_type_spec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAttr_specAccess().getContainedTypeBase_type_specParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleattr_spec3339);
                            lv_containedType_23_0=rulebase_type_spec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAttr_specRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"containedType",
                                      		lv_containedType_23_0, 
                                      		"base_type_spec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1570:6: ( (otherlv_24= RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1570:6: ( (otherlv_24= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1571:1: (otherlv_24= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1571:1: (otherlv_24= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1572:3: otherlv_24= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAttr_specRule());
                              	        }
                                      
                            }
                            otherlv_24=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3369); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_24, grammarAccess.getAttr_specAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1586:3: ( (lv_identifier_25_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1587:1: (lv_identifier_25_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1587:1: (lv_identifier_25_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1588:3: lv_identifier_25_0= RULE_ID
                    {
                    lv_identifier_25_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_25_0, grammarAccess.getAttr_specAccess().getIdentifierIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttr_specRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_25_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleattr_spec"


    // $ANTLR start "entryRuleexcept_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1612:1: entryRuleexcept_decl returns [EObject current=null] : iv_ruleexcept_decl= ruleexcept_decl EOF ;
    public final EObject entryRuleexcept_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexcept_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1613:2: (iv_ruleexcept_decl= ruleexcept_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1614:2: iv_ruleexcept_decl= ruleexcept_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExcept_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_entryRuleexcept_decl3429);
            iv_ruleexcept_decl=ruleexcept_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleexcept_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleexcept_decl3439); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexcept_decl"


    // $ANTLR start "ruleexcept_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1621:1: ruleexcept_decl returns [EObject current=null] : (otherlv_0= 'exception' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )* otherlv_4= '}' ) ;
    public final EObject ruleexcept_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1624:28: ( (otherlv_0= 'exception' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )* otherlv_4= '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1625:1: (otherlv_0= 'exception' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )* otherlv_4= '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1625:1: (otherlv_0= 'exception' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )* otherlv_4= '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1625:3: otherlv_0= 'exception' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleexcept_decl3476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExcept_declAccess().getExceptionKeyword_0());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1629:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1630:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1630:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1631:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleexcept_decl3493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_1_0, grammarAccess.getExcept_declAccess().getIdentifierIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExcept_declRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleexcept_decl3510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExcept_declAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1651:1: ( (lv_members_3_0= rulemember ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==40||LA34_0==48||(LA34_0>=51 && LA34_0<=57)||(LA34_0>=72 && LA34_0<=78)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1652:1: (lv_members_3_0= rulemember )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1652:1: (lv_members_3_0= rulemember )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1653:3: lv_members_3_0= rulemember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExcept_declAccess().getMembersMemberParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemember_in_ruleexcept_decl3531);
            	    lv_members_3_0=rulemember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExcept_declRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_3_0, 
            	              		"member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleexcept_decl3544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExcept_declAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexcept_decl"


    // $ANTLR start "entryRuletype_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1681:1: entryRuletype_decl returns [EObject current=null] : iv_ruletype_decl= ruletype_decl EOF ;
    public final EObject entryRuletype_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1682:2: (iv_ruletype_decl= ruletype_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1683:2: iv_ruletype_decl= ruletype_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getType_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_entryRuletype_decl3580);
            iv_ruletype_decl=ruletype_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletype_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletype_decl3590); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_decl"


    // $ANTLR start "ruletype_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1690:1: ruletype_decl returns [EObject current=null] : (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | (otherlv_4= 'native' this_ID_5= RULE_ID ) | ruleconstr_forward_decl ) ;
    public final EObject ruletype_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token this_ID_5=null;
        EObject this_alias_type_0 = null;

        EObject this_struct_type_1 = null;

        EObject this_union_type_2 = null;

        EObject this_enum_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1693:28: ( (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | (otherlv_4= 'native' this_ID_5= RULE_ID ) | ruleconstr_forward_decl ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1694:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | (otherlv_4= 'native' this_ID_5= RULE_ID ) | ruleconstr_forward_decl )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1694:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | (otherlv_4= 'native' this_ID_5= RULE_ID ) | ruleconstr_forward_decl )
            int alt35=6;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1695:2: this_alias_type_0= rulealias_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declAccess().getAlias_typeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulealias_type_in_ruletype_decl3640);
                    this_alias_type_0=rulealias_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_alias_type_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1708:2: this_struct_type_1= rulestruct_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declAccess().getStruct_typeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_ruletype_decl3670);
                    this_struct_type_1=rulestruct_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_struct_type_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1721:2: this_union_type_2= ruleunion_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declAccess().getUnion_typeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunion_type_in_ruletype_decl3700);
                    this_union_type_2=ruleunion_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_union_type_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1734:2: this_enum_type_3= ruleenum_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declAccess().getEnum_typeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_ruletype_decl3730);
                    this_enum_type_3=ruleenum_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_enum_type_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1746:6: (otherlv_4= 'native' this_ID_5= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1746:6: (otherlv_4= 'native' this_ID_5= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1746:8: otherlv_4= 'native' this_ID_5= RULE_ID
                    {
                    otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruletype_decl3748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getType_declAccess().getNativeKeyword_4_0());
                          
                    }
                    this_ID_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruletype_decl3759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_5, grammarAccess.getType_declAccess().getIDTerminalRuleCall_4_1()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1756:2: ruleconstr_forward_decl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getType_declAccess().getConstr_forward_declParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconstr_forward_decl_in_ruletype_decl3784);
                    ruleconstr_forward_decl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_decl"


    // $ANTLR start "entryRulealias_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1774:1: entryRulealias_type returns [EObject current=null] : iv_rulealias_type= rulealias_type EOF ;
    public final EObject entryRulealias_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealias_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1775:2: (iv_rulealias_type= rulealias_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1776:2: iv_rulealias_type= rulealias_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlias_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulealias_type_in_entryRulealias_type3819);
            iv_rulealias_type=rulealias_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulealias_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulealias_type3829); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulealias_type"


    // $ANTLR start "rulealias_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1783:1: rulealias_type returns [EObject current=null] : ( (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | (otherlv_2= 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) ) ;
    public final EObject rulealias_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_identifier_5_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_containedType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1786:28: ( ( (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | (otherlv_2= 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:1: ( (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | (otherlv_2= 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:1: ( (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | (otherlv_2= 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred51_InternalIDL()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:2: (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:2: (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:4: otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) )
                    {
                    otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulealias_type3867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAlias_typeAccess().getTypedefKeyword_0_0());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1791:1: ( (lv_containedType_1_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1792:1: (lv_containedType_1_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1792:1: (lv_containedType_1_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1793:3: lv_containedType_1_0= rulearray_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulealias_type3888);
                    lv_containedType_1_0=rulearray_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAlias_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_1_0, 
                              		"array_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1810:6: (otherlv_2= 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1810:6: (otherlv_2= 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1810:8: otherlv_2= 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulealias_type3908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAlias_typeAccess().getTypedefKeyword_1_0());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1814:1: ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( (otherlv_4= RULE_ID ) ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==48||(LA36_0>=51 && LA36_0<=57)||(LA36_0>=72 && LA36_0<=78)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_ID) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1814:2: ( (lv_containedType_3_0= rulesimple_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1814:2: ( (lv_containedType_3_0= rulesimple_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1815:1: (lv_containedType_3_0= rulesimple_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1815:1: (lv_containedType_3_0= rulesimple_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1816:3: lv_containedType_3_0= rulesimple_type_spec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeSimple_type_specParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulealias_type3930);
                            lv_containedType_3_0=rulesimple_type_spec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAlias_typeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"containedType",
                                      		lv_containedType_3_0, 
                                      		"simple_type_spec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1833:6: ( (otherlv_4= RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1833:6: ( (otherlv_4= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1834:1: (otherlv_4= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1834:1: (otherlv_4= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1835:3: otherlv_4= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAlias_typeRule());
                              	        }
                                      
                            }
                            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulealias_type3960); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_4, grammarAccess.getAlias_typeAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1849:3: ( (lv_identifier_5_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1850:1: (lv_identifier_5_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1850:1: (lv_identifier_5_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1851:3: lv_identifier_5_0= RULE_ID
                    {
                    lv_identifier_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulealias_type3978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_5_0, grammarAccess.getAlias_typeAccess().getIdentifierIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAlias_typeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_5_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulealias_type"


    // $ANTLR start "entryRulearray_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1875:1: entryRulearray_type_spec returns [EObject current=null] : iv_rulearray_type_spec= rulearray_type_spec EOF ;
    public final EObject entryRulearray_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1876:2: (iv_rulearray_type_spec= rulearray_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1877:2: iv_rulearray_type_spec= rulearray_type_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArray_type_specRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_entryRulearray_type_spec4020);
            iv_rulearray_type_spec=rulearray_type_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearray_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulearray_type_spec4030); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearray_type_spec"


    // $ANTLR start "rulearray_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1884:1: rulearray_type_spec returns [EObject current=null] : ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_bounds_4_0= ruleconst_exp ) ) otherlv_5= ']' )+ ) ;
    public final EObject rulearray_type_spec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_containedType_0_0 = null;

        EObject lv_bounds_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1887:28: ( ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_bounds_4_0= ruleconst_exp ) ) otherlv_5= ']' )+ ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1888:1: ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_bounds_4_0= ruleconst_exp ) ) otherlv_5= ']' )+ )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1888:1: ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_bounds_4_0= ruleconst_exp ) ) otherlv_5= ']' )+ )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1888:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( (otherlv_1= RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_bounds_4_0= ruleconst_exp ) ) otherlv_5= ']' )+
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1888:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48||(LA38_0>=51 && LA38_0<=57)||(LA38_0>=72 && LA38_0<=78)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1888:3: ( (lv_containedType_0_0= rulesimple_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1888:3: ( (lv_containedType_0_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1889:1: (lv_containedType_0_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1889:1: (lv_containedType_0_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1890:3: lv_containedType_0_0= rulesimple_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArray_type_specAccess().getContainedTypeSimple_type_specParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulearray_type_spec4077);
                    lv_containedType_0_0=rulesimple_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArray_type_specRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_0_0, 
                              		"simple_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1907:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1907:6: ( (otherlv_1= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1908:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1908:1: (otherlv_1= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1909:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getArray_type_specRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulearray_type_spec4107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getArray_type_specAccess().getSharedTypeTypedefDefCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1923:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1924:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1924:1: (lv_name_2_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1925:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulearray_type_spec4125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getArray_type_specAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getArray_type_specRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1941:2: (otherlv_3= '[' ( (lv_bounds_4_0= ruleconst_exp ) ) otherlv_5= ']' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==38) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1941:4: otherlv_3= '[' ( (lv_bounds_4_0= ruleconst_exp ) ) otherlv_5= ']'
            	    {
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_rulearray_type_spec4143); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getArray_type_specAccess().getLeftSquareBracketKeyword_2_0());
            	          
            	    }
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1945:1: ( (lv_bounds_4_0= ruleconst_exp ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1946:1: (lv_bounds_4_0= ruleconst_exp )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1946:1: (lv_bounds_4_0= ruleconst_exp )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1947:3: lv_bounds_4_0= ruleconst_exp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArray_type_specAccess().getBoundsConst_expParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulearray_type_spec4164);
            	    lv_bounds_4_0=ruleconst_exp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArray_type_specRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bounds",
            	              		lv_bounds_4_0, 
            	              		"const_exp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulearray_type_spec4176); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getArray_type_specAccess().getRightSquareBracketKeyword_2_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearray_type_spec"


    // $ANTLR start "entryRulesimple_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1975:1: entryRulesimple_type_spec returns [EObject current=null] : iv_rulesimple_type_spec= rulesimple_type_spec EOF ;
    public final EObject entryRulesimple_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1976:2: (iv_rulesimple_type_spec= rulesimple_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1977:2: iv_rulesimple_type_spec= rulesimple_type_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimple_type_specRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_entryRulesimple_type_spec4214);
            iv_rulesimple_type_spec=rulesimple_type_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesimple_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesimple_type_spec4224); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_type_spec"


    // $ANTLR start "rulesimple_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1984:1: rulesimple_type_spec returns [EObject current=null] : (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec ) ;
    public final EObject rulesimple_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_base_type_spec_0 = null;

        EObject this_template_type_spec_1 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1987:28: ( (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1988:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1988:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )
            int alt40=2;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt40=1;
                }
                break;
            case 51:
                {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==49) ) {
                    alt40=2;
                }
                else if ( (LA40_2==EOF||LA40_2==RULE_ID||LA40_2==25||LA40_2==50) ) {
                    alt40=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA40_3 = input.LA(2);

                if ( (LA40_3==EOF||LA40_3==RULE_ID||LA40_3==25||LA40_3==50) ) {
                    alt40=1;
                }
                else if ( (LA40_3==49) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 3, input);

                    throw nvae;
                }
                }
                break;
            case 48:
            case 53:
                {
                alt40=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1989:2: this_base_type_spec_0= rulebase_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimple_type_specAccess().getBase_type_specParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulesimple_type_spec4274);
                    this_base_type_spec_0=rulebase_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_base_type_spec_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2002:2: this_template_type_spec_1= ruletemplate_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimple_type_specAccess().getTemplate_type_specParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletemplate_type_spec_in_rulesimple_type_spec4304);
                    this_template_type_spec_1=ruletemplate_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_template_type_spec_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_type_spec"


    // $ANTLR start "entryRulebase_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2021:1: entryRulebase_type_spec returns [EObject current=null] : iv_rulebase_type_spec= rulebase_type_spec EOF ;
    public final EObject entryRulebase_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebase_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2022:2: (iv_rulebase_type_spec= rulebase_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2023:2: iv_rulebase_type_spec= rulebase_type_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBase_type_specRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_entryRulebase_type_spec4339);
            iv_rulebase_type_spec=rulebase_type_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebase_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebase_type_spec4349); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebase_type_spec"


    // $ANTLR start "rulebase_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2030:1: rulebase_type_spec returns [EObject current=null] : (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) ) ;
    public final EObject rulebase_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_primitive_def_0 = null;

        Enumerator lv_kind_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2033:28: ( (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2034:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2034:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=51 && LA41_0<=52)||(LA41_0>=54 && LA41_0<=57)||(LA41_0>=72 && LA41_0<=77)) ) {
                alt41=1;
            }
            else if ( (LA41_0==78) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2035:2: this_primitive_def_0= ruleprimitive_def
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBase_type_specAccess().getPrimitive_defParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_rulebase_type_spec4399);
                    this_primitive_def_0=ruleprimitive_def();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_primitive_def_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2047:6: ( (lv_kind_1_0= ruleobject_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2047:6: ( (lv_kind_1_0= ruleobject_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2048:1: (lv_kind_1_0= ruleobject_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2048:1: (lv_kind_1_0= ruleobject_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2049:3: lv_kind_1_0= ruleobject_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBase_type_specAccess().getKindObject_typeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleobject_type_in_rulebase_type_spec4425);
                    lv_kind_1_0=ruleobject_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBase_type_specRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_1_0, 
                              		"object_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebase_type_spec"


    // $ANTLR start "entryRuletemplate_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2073:1: entryRuletemplate_type_spec returns [EObject current=null] : iv_ruletemplate_type_spec= ruletemplate_type_spec EOF ;
    public final EObject entryRuletemplate_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletemplate_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2074:2: (iv_ruletemplate_type_spec= ruletemplate_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2075:2: iv_ruletemplate_type_spec= ruletemplate_type_spec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplate_type_specRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletemplate_type_spec_in_entryRuletemplate_type_spec4461);
            iv_ruletemplate_type_spec=ruletemplate_type_spec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletemplate_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletemplate_type_spec4471); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletemplate_type_spec"


    // $ANTLR start "ruletemplate_type_spec"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2082:1: ruletemplate_type_spec returns [EObject current=null] : (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type ) ;
    public final EObject ruletemplate_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_sequence_type_0 = null;

        EObject this_stringdef_type_1 = null;

        EObject this_wide_stringdef_type_2 = null;

        EObject this_fixed_pt_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2085:28: ( (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2086:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2086:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt42=1;
                }
                break;
            case 51:
                {
                alt42=2;
                }
                break;
            case 52:
                {
                alt42=3;
                }
                break;
            case 53:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2087:2: this_sequence_type_0= rulesequence_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplate_type_specAccess().getSequence_typeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesequence_type_in_ruletemplate_type_spec4521);
                    this_sequence_type_0=rulesequence_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_sequence_type_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2100:2: this_stringdef_type_1= rulestringdef_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplate_type_specAccess().getStringdef_typeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_ruletemplate_type_spec4551);
                    this_stringdef_type_1=rulestringdef_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_stringdef_type_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2113:2: this_wide_stringdef_type_2= rulewide_stringdef_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplate_type_specAccess().getWide_stringdef_typeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_ruletemplate_type_spec4581);
                    this_wide_stringdef_type_2=rulewide_stringdef_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_wide_stringdef_type_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2126:2: this_fixed_pt_type_3= rulefixed_pt_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplate_type_specAccess().getFixed_pt_typeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefixed_pt_type_in_ruletemplate_type_spec4611);
                    this_fixed_pt_type_3=rulefixed_pt_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_fixed_pt_type_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletemplate_type_spec"


    // $ANTLR start "entryRulestruct_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2147:1: entryRulestruct_type returns [EObject current=null] : iv_rulestruct_type= rulestruct_type EOF ;
    public final EObject entryRulestruct_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestruct_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2148:2: (iv_rulestruct_type= rulestruct_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2149:2: iv_rulestruct_type= rulestruct_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStruct_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_entryRulestruct_type4648);
            iv_rulestruct_type=rulestruct_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestruct_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulestruct_type4658); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestruct_type"


    // $ANTLR start "rulestruct_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2156:1: rulestruct_type returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )+ otherlv_4= '}' ) ;
    public final EObject rulestruct_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2159:28: ( (otherlv_0= 'struct' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )+ otherlv_4= '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2160:1: (otherlv_0= 'struct' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )+ otherlv_4= '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2160:1: (otherlv_0= 'struct' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )+ otherlv_4= '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2160:3: otherlv_0= 'struct' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= rulemember ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_rulestruct_type4695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStruct_typeAccess().getStructKeyword_0());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2164:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2165:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2165:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2166:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulestruct_type4712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_1_0, grammarAccess.getStruct_typeAccess().getIdentifierIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStruct_typeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulestruct_type4729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStruct_typeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2186:1: ( (lv_members_3_0= rulemember ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==40||LA43_0==48||(LA43_0>=51 && LA43_0<=57)||(LA43_0>=72 && LA43_0<=78)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2187:1: (lv_members_3_0= rulemember )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2187:1: (lv_members_3_0= rulemember )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2188:3: lv_members_3_0= rulemember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStruct_typeAccess().getMembersMemberParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemember_in_rulestruct_type4750);
            	    lv_members_3_0=rulemember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStruct_typeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_3_0, 
            	              		"member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulestruct_type4763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStruct_typeAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestruct_type"


    // $ANTLR start "entryRulemember"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2216:1: entryRulemember returns [EObject current=null] : iv_rulemember= rulemember EOF ;
    public final EObject entryRulemember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemember = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2217:2: (iv_rulemember= rulemember EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2218:2: iv_rulemember= rulemember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemember_in_entryRulemember4799);
            iv_rulemember=rulemember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemember4809); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemember"


    // $ANTLR start "rulemember"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2225:1: rulemember returns [EObject current=null] : ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';' ) ) ;
    public final EObject rulemember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_identifier_3_0=null;
        Token otherlv_4=null;
        Token lv_identifier_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_identifier_9_0=null;
        Token otherlv_10=null;
        EObject lv_containedType_0_0 = null;

        EObject lv_containedType_2_0 = null;

        EObject lv_containedType_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2228:28: ( ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';' ) )
            int alt44=4;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:3: ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:3: ( (lv_containedType_0_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2230:1: (lv_containedType_0_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2230:1: (lv_containedType_0_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2231:3: lv_containedType_0_0= rulearray_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getContainedTypeArray_type_specParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulemember4856);
                    lv_containedType_0_0=rulearray_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_0_0, 
                              		"array_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemember4868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:7: ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:7: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2253:1: (lv_containedType_2_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2253:1: (lv_containedType_2_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2254:3: lv_containedType_2_0= rulesimple_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getContainedTypeSimple_type_specParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulemember4897);
                    lv_containedType_2_0=rulesimple_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_2_0, 
                              		"simple_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2270:2: ( (lv_identifier_3_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2271:1: (lv_identifier_3_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2271:1: (lv_identifier_3_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2272:3: lv_identifier_3_0= RULE_ID
                    {
                    lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_3_0, grammarAccess.getMemberAccess().getIdentifierIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMemberRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_3_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemember4931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMemberAccess().getSemicolonKeyword_1_2());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2293:6: ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2293:6: ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2293:7: ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2293:7: ( (lv_containedType_5_0= rulestruct_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2294:1: (lv_containedType_5_0= rulestruct_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2294:1: (lv_containedType_5_0= rulestruct_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2295:3: lv_containedType_5_0= rulestruct_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMemberAccess().getContainedTypeStruct_typeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_rulemember4960);
                    lv_containedType_5_0=rulestruct_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_5_0, 
                              		"struct_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2311:2: ( (lv_identifier_6_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2312:1: (lv_identifier_6_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2312:1: (lv_identifier_6_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2313:3: lv_identifier_6_0= RULE_ID
                    {
                    lv_identifier_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_6_0, grammarAccess.getMemberAccess().getIdentifierIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMemberRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemember4994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMemberAccess().getSemicolonKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2334:6: ( ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2334:6: ( ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2334:7: ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2334:7: ( (otherlv_8= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2335:1: (otherlv_8= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2335:1: (otherlv_8= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2336:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getMemberRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember5026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getMemberAccess().getSharedTypeTypedefDefCrossReference_3_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2350:2: ( (lv_identifier_9_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2351:1: (lv_identifier_9_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2351:1: (lv_identifier_9_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2352:3: lv_identifier_9_0= RULE_ID
                    {
                    lv_identifier_9_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember5043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_9_0, grammarAccess.getMemberAccess().getIdentifierIDTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMemberRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_9_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulemember5060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getMemberAccess().getSemicolonKeyword_3_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemember"


    // $ANTLR start "entryRuleunion_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2380:1: entryRuleunion_type returns [EObject current=null] : iv_ruleunion_type= ruleunion_type EOF ;
    public final EObject entryRuleunion_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunion_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2381:2: (iv_ruleunion_type= ruleunion_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2382:2: iv_ruleunion_type= ruleunion_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnion_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunion_type_in_entryRuleunion_type5097);
            iv_ruleunion_type=ruleunion_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunion_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunion_type5107); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunion_type"


    // $ANTLR start "ruleunion_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2389:1: ruleunion_type returns [EObject current=null] : (otherlv_0= 'union' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= 'switch' otherlv_3= '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ otherlv_9= '}' ) ;
    public final EObject ruleunion_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_containedDiscrim_4_0 = null;

        EObject lv_unionMembers_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2392:28: ( (otherlv_0= 'union' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= 'switch' otherlv_3= '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ otherlv_9= '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2393:1: (otherlv_0= 'union' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= 'switch' otherlv_3= '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ otherlv_9= '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2393:1: (otherlv_0= 'union' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= 'switch' otherlv_3= '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ otherlv_9= '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2393:3: otherlv_0= 'union' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= 'switch' otherlv_3= '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( (otherlv_5= RULE_ID ) ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleunion_type5144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnion_typeAccess().getUnionKeyword_0());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2397:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2398:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2398:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2399:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleunion_type5161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_1_0, grammarAccess.getUnion_typeAccess().getIdentifierIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnion_typeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleunion_type5178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUnion_typeAccess().getSwitchKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleunion_type5190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnion_typeAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2423:1: ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45||LA45_0==54||(LA45_0>=56 && LA45_0<=57)||LA45_0==73||LA45_0==75) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2423:2: ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2423:2: ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2424:1: (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2424:1: (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2425:3: lv_containedDiscrim_4_0= ruleswitch_type_spec_cont
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnion_typeAccess().getContainedDiscrimSwitch_type_spec_contParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleswitch_type_spec_cont_in_ruleunion_type5212);
                    lv_containedDiscrim_4_0=ruleswitch_type_spec_cont();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnion_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"containedDiscrim",
                              		lv_containedDiscrim_4_0, 
                              		"switch_type_spec_cont");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2442:6: ( (otherlv_5= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2442:6: ( (otherlv_5= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2443:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2443:1: (otherlv_5= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2444:3: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnion_typeRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleunion_type5242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getUnion_typeAccess().getSharedDiscrimEnumDefCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleunion_type5255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getUnion_typeAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleunion_type5267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUnion_typeAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2466:1: ( (lv_unionMembers_8_0= rulecase_stmt ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=43 && LA46_0<=44)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2467:1: (lv_unionMembers_8_0= rulecase_stmt )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2467:1: (lv_unionMembers_8_0= rulecase_stmt )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2468:3: lv_unionMembers_8_0= rulecase_stmt
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnion_typeAccess().getUnionMembersCase_stmtParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulecase_stmt_in_ruleunion_type5288);
            	    lv_unionMembers_8_0=rulecase_stmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnion_typeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"unionMembers",
            	              		lv_unionMembers_8_0, 
            	              		"case_stmt");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleunion_type5301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getUnion_typeAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunion_type"


    // $ANTLR start "entryRuleswitch_type_spec_cont"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2496:1: entryRuleswitch_type_spec_cont returns [EObject current=null] : iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF ;
    public final EObject entryRuleswitch_type_spec_cont() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitch_type_spec_cont = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2497:2: (iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2498:2: iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitch_type_spec_contRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleswitch_type_spec_cont_in_entryRuleswitch_type_spec_cont5337);
            iv_ruleswitch_type_spec_cont=ruleswitch_type_spec_cont();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleswitch_type_spec_cont; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleswitch_type_spec_cont5347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleswitch_type_spec_cont"


    // $ANTLR start "ruleswitch_type_spec_cont"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2505:1: ruleswitch_type_spec_cont returns [EObject current=null] : (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type ) ;
    public final EObject ruleswitch_type_spec_cont() throws RecognitionException {
        EObject current = null;

        EObject this_integer_type_0 = null;

        Enumerator lv_kind_2_0 = null;

        Enumerator lv_kind_4_0 = null;

        EObject this_enum_type_5 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2508:28: ( (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2509:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2509:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 54:
            case 56:
            case 57:
                {
                alt47=1;
                }
                break;
            case 73:
                {
                alt47=2;
                }
                break;
            case 75:
                {
                alt47=3;
                }
                break;
            case 45:
                {
                alt47=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2510:2: this_integer_type_0= ruleinteger_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getInteger_typeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_ruleswitch_type_spec_cont5397);
                    this_integer_type_0=ruleinteger_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_integer_type_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2522:6: ( () ( (lv_kind_2_0= rulechar_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2522:6: ( () ( (lv_kind_2_0= rulechar_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2522:7: () ( (lv_kind_2_0= rulechar_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2522:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2523:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSwitch_type_spec_contAccess().getPrimitiveDefAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2531:2: ( (lv_kind_2_0= rulechar_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2532:1: (lv_kind_2_0= rulechar_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2532:1: (lv_kind_2_0= rulechar_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2533:3: lv_kind_2_0= rulechar_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getKindChar_typeEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulechar_type_in_ruleswitch_type_spec_cont5436);
                    lv_kind_2_0=rulechar_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitch_type_spec_contRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"char_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2550:6: ( () ( (lv_kind_4_0= ruleboolean_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2550:6: ( () ( (lv_kind_4_0= ruleboolean_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2550:7: () ( (lv_kind_4_0= ruleboolean_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2550:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2551:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSwitch_type_spec_contAccess().getPrimitiveDefAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2559:2: ( (lv_kind_4_0= ruleboolean_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2560:1: (lv_kind_4_0= ruleboolean_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2560:1: (lv_kind_4_0= ruleboolean_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2561:3: lv_kind_4_0= ruleboolean_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getKindBoolean_typeEnumRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolean_type_in_ruleswitch_type_spec_cont5477);
                    lv_kind_4_0=ruleboolean_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitch_type_spec_contRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_4_0, 
                              		"boolean_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2579:2: this_enum_type_5= ruleenum_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getEnum_typeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_ruleswitch_type_spec_cont5509);
                    this_enum_type_5=ruleenum_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_enum_type_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleswitch_type_spec_cont"


    // $ANTLR start "entryRulecase_stmt"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2598:1: entryRulecase_stmt returns [EObject current=null] : iv_rulecase_stmt= rulecase_stmt EOF ;
    public final EObject entryRulecase_stmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_stmt = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2599:2: (iv_rulecase_stmt= rulecase_stmt EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2600:2: iv_rulecase_stmt= rulecase_stmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCase_stmtRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulecase_stmt_in_entryRulecase_stmt5544);
            iv_rulecase_stmt=rulecase_stmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecase_stmt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecase_stmt5554); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_stmt"


    // $ANTLR start "rulecase_stmt"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2607:1: rulecase_stmt returns [EObject current=null] : ( ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' ) | ( ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) otherlv_15= ';' ) ) ;
    public final EObject rulecase_stmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_isDefault_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_isDefault_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token lv_identifier_14_0=null;
        Token otherlv_15=null;
        EObject lv_label_1_0 = null;

        EObject lv_containedType_5_0 = null;

        EObject lv_label_8_0 = null;

        EObject lv_containedType_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2610:28: ( ( ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' ) | ( ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) otherlv_15= ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:1: ( ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' ) | ( ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:1: ( ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' ) | ( ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) otherlv_15= ';' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred71_InternalIDL()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==44) ) {
                int LA51_2 = input.LA(2);

                if ( (synpred71_InternalIDL()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:2: ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:2: ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:3: ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:3: ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=3;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==43) ) {
                            alt48=1;
                        }
                        else if ( (LA48_0==44) ) {
                            alt48=2;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:4: (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:4: (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:6: otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':'
                    	    {
                    	    otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulecase_stmt5594); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_0, grammarAccess.getCase_stmtAccess().getCaseKeyword_0_0_0_0());
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2615:1: ( (lv_label_1_0= ruleconst_exp ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2616:1: (lv_label_1_0= ruleconst_exp )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2616:1: (lv_label_1_0= ruleconst_exp )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2617:3: lv_label_1_0= ruleconst_exp
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_0_0_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulecase_stmt5615);
                    	    lv_label_1_0=ruleconst_exp();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCase_stmtRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"label",
                    	              		lv_label_1_0, 
                    	              		"const_exp");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5627); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getCase_stmtAccess().getColonKeyword_0_0_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:6: ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:6: ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:7: ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':'
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:7: ( (lv_isDefault_3_0= 'default' ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2639:1: (lv_isDefault_3_0= 'default' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2639:1: (lv_isDefault_3_0= 'default' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2640:3: lv_isDefault_3_0= 'default'
                    	    {
                    	    lv_isDefault_3_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulecase_stmt5653); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              newLeafNode(lv_isDefault_3_0, grammarAccess.getCase_stmtAccess().getIsDefaultDefaultKeyword_0_0_1_0_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getCase_stmtRule());
                    	      	        }
                    	             		setWithLastConsumed(current, "isDefault", true, "default");
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5678); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCase_stmtAccess().getColonKeyword_0_0_1_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2657:4: ( (lv_containedType_5_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2658:1: (lv_containedType_5_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2658:1: (lv_containedType_5_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2659:3: lv_containedType_5_0= rulearray_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulecase_stmt5702);
                    lv_containedType_5_0=rulearray_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCase_stmtRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_5_0, 
                              		"array_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulecase_stmt5714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCase_stmtAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2680:6: ( ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) otherlv_15= ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2680:6: ( ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) otherlv_15= ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2680:7: ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) otherlv_15= ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2680:7: ( (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' ) | ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=3;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==43) ) {
                            alt49=1;
                        }
                        else if ( (LA49_0==44) ) {
                            alt49=2;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2680:8: (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2680:8: (otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2680:10: otherlv_7= 'case' ( (lv_label_8_0= ruleconst_exp ) ) otherlv_9= ':'
                    	    {
                    	    otherlv_7=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulecase_stmt5736); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getCase_stmtAccess().getCaseKeyword_1_0_0_0());
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2684:1: ( (lv_label_8_0= ruleconst_exp ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2685:1: (lv_label_8_0= ruleconst_exp )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2685:1: (lv_label_8_0= ruleconst_exp )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2686:3: lv_label_8_0= ruleconst_exp
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_1_0_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulecase_stmt5757);
                    	    lv_label_8_0=ruleconst_exp();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCase_stmtRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"label",
                    	              		lv_label_8_0, 
                    	              		"const_exp");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5769); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getCase_stmtAccess().getColonKeyword_1_0_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2707:6: ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2707:6: ( ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2707:7: ( (lv_isDefault_10_0= 'default' ) ) otherlv_11= ':'
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2707:7: ( (lv_isDefault_10_0= 'default' ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2708:1: (lv_isDefault_10_0= 'default' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2708:1: (lv_isDefault_10_0= 'default' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2709:3: lv_isDefault_10_0= 'default'
                    	    {
                    	    lv_isDefault_10_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_rulecase_stmt5795); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              newLeafNode(lv_isDefault_10_0, grammarAccess.getCase_stmtAccess().getIsDefaultDefaultKeyword_1_0_1_0_0());
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getCase_stmtRule());
                    	      	        }
                    	             		setWithLastConsumed(current, "isDefault", true, "default");
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5820); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCase_stmtAccess().getColonKeyword_1_0_1_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2726:4: ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( (otherlv_13= RULE_ID ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==48||(LA50_0>=51 && LA50_0<=57)||(LA50_0>=72 && LA50_0<=78)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_ID) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2726:5: ( (lv_containedType_12_0= rulesimple_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2726:5: ( (lv_containedType_12_0= rulesimple_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2727:1: (lv_containedType_12_0= rulesimple_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2727:1: (lv_containedType_12_0= rulesimple_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2728:3: lv_containedType_12_0= rulesimple_type_spec
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeSimple_type_specParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulecase_stmt5845);
                            lv_containedType_12_0=rulesimple_type_spec();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCase_stmtRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"containedType",
                                      		lv_containedType_12_0, 
                                      		"simple_type_spec");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2745:6: ( (otherlv_13= RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2745:6: ( (otherlv_13= RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2746:1: (otherlv_13= RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2746:1: (otherlv_13= RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2747:3: otherlv_13= RULE_ID
                            {
                            if ( state.backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getCase_stmtRule());
                              	        }
                                      
                            }
                            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulecase_stmt5875); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_13, grammarAccess.getCase_stmtAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2761:3: ( (lv_identifier_14_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2762:1: (lv_identifier_14_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2762:1: (lv_identifier_14_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2763:3: lv_identifier_14_0= RULE_ID
                    {
                    lv_identifier_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulecase_stmt5893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_identifier_14_0, grammarAccess.getCase_stmtAccess().getIdentifierIDTerminalRuleCall_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCase_stmtRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"identifier",
                              		lv_identifier_14_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulecase_stmt5910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCase_stmtAccess().getSemicolonKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_stmt"


    // $ANTLR start "entryRuleenum_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2791:1: entryRuleenum_type returns [EObject current=null] : iv_ruleenum_type= ruleenum_type EOF ;
    public final EObject entryRuleenum_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2792:2: (iv_ruleenum_type= ruleenum_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2793:2: iv_ruleenum_type= ruleenum_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnum_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_entryRuleenum_type5947);
            iv_ruleenum_type=ruleenum_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenum_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleenum_type5957); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenum_type"


    // $ANTLR start "ruleenum_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2800:1: ruleenum_type returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleenum_member ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleenum_member ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleenum_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_identifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2803:28: ( (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleenum_member ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleenum_member ) ) )* otherlv_6= '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2804:1: (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleenum_member ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleenum_member ) ) )* otherlv_6= '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2804:1: (otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleenum_member ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleenum_member ) ) )* otherlv_6= '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2804:3: otherlv_0= 'enum' ( (lv_identifier_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleenum_member ) ) (otherlv_4= ',' ( (lv_members_5_0= ruleenum_member ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleenum_type5994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnum_typeAccess().getEnumKeyword_0());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2808:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2809:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2809:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2810:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleenum_type6011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_1_0, grammarAccess.getEnum_typeAccess().getIdentifierIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnum_typeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleenum_type6028); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnum_typeAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2830:1: ( (lv_members_3_0= ruleenum_member ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2831:1: (lv_members_3_0= ruleenum_member )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2831:1: (lv_members_3_0= ruleenum_member )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2832:3: lv_members_3_0= ruleenum_member
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnum_typeAccess().getMembersEnum_memberParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_ruleenum_type6049);
            lv_members_3_0=ruleenum_member();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnum_typeRule());
              	        }
                     		add(
                     			current, 
                     			"members",
                      		lv_members_3_0, 
                      		"enum_member");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2848:2: (otherlv_4= ',' ( (lv_members_5_0= ruleenum_member ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==25) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2848:4: otherlv_4= ',' ( (lv_members_5_0= ruleenum_member ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleenum_type6062); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEnum_typeAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2852:1: ( (lv_members_5_0= ruleenum_member ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2853:1: (lv_members_5_0= ruleenum_member )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2853:1: (lv_members_5_0= ruleenum_member )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2854:3: lv_members_5_0= ruleenum_member
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnum_typeAccess().getMembersEnum_memberParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_ruleenum_type6083);
            	    lv_members_5_0=ruleenum_member();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnum_typeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"members",
            	              		lv_members_5_0, 
            	              		"enum_member");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleenum_type6097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEnum_typeAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenum_type"


    // $ANTLR start "entryRuleenum_member"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2882:1: entryRuleenum_member returns [EObject current=null] : iv_ruleenum_member= ruleenum_member EOF ;
    public final EObject entryRuleenum_member() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_member = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2883:2: (iv_ruleenum_member= ruleenum_member EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2884:2: iv_ruleenum_member= ruleenum_member EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnum_memberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_entryRuleenum_member6133);
            iv_ruleenum_member=ruleenum_member();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleenum_member; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleenum_member6143); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenum_member"


    // $ANTLR start "ruleenum_member"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2891:1: ruleenum_member returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleenum_member() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2894:28: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2895:1: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2895:1: ( (lv_identifier_0_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2896:1: (lv_identifier_0_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2896:1: (lv_identifier_0_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2897:3: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleenum_member6184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_0_0, grammarAccess.getEnum_memberAccess().getIdentifierIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnum_memberRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenum_member"


    // $ANTLR start "entryRuleconstr_forward_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2921:1: entryRuleconstr_forward_decl returns [String current=null] : iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF ;
    public final String entryRuleconstr_forward_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstr_forward_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2922:2: (iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2923:2: iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstr_forward_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconstr_forward_decl_in_entryRuleconstr_forward_decl6225);
            iv_ruleconstr_forward_decl=ruleconstr_forward_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstr_forward_decl.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconstr_forward_decl6236); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstr_forward_decl"


    // $ANTLR start "ruleconstr_forward_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2930:1: ruleconstr_forward_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleconstr_forward_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2933:28: ( ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2934:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2934:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==40) ) {
                alt53=1;
            }
            else if ( (LA53_0==41) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2934:2: (kw= 'struct' this_ID_1= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2934:2: (kw= 'struct' this_ID_1= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2935:2: kw= 'struct' this_ID_1= RULE_ID
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleconstr_forward_decl6275); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstr_forward_declAccess().getStructKeyword_0_0()); 
                          
                    }
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstr_forward_decl6290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getConstr_forward_declAccess().getIDTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2948:6: (kw= 'union' this_ID_3= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2948:6: (kw= 'union' this_ID_3= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2949:2: kw= 'union' this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleconstr_forward_decl6316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstr_forward_declAccess().getUnionKeyword_1_0()); 
                          
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstr_forward_decl6331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getConstr_forward_declAccess().getIDTerminalRuleCall_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstr_forward_decl"


    // $ANTLR start "entryRuleconst_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2969:1: entryRuleconst_decl returns [EObject current=null] : iv_ruleconst_decl= ruleconst_decl EOF ;
    public final EObject entryRuleconst_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2970:2: (iv_ruleconst_decl= ruleconst_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2971:2: iv_ruleconst_decl= ruleconst_decl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConst_declRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_entryRuleconst_decl6377);
            iv_ruleconst_decl=ruleconst_decl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconst_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_decl6387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconst_decl"


    // $ANTLR start "ruleconst_decl"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2978:1: ruleconst_decl returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_constValue_5_0= ruleconst_exp ) ) ) ;
    public final EObject ruleconst_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_identifier_3_0=null;
        Token otherlv_4=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_constValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2981:28: ( (otherlv_0= 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_constValue_5_0= ruleconst_exp ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2982:1: (otherlv_0= 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_constValue_5_0= ruleconst_exp ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2982:1: (otherlv_0= 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_constValue_5_0= ruleconst_exp ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2982:3: otherlv_0= 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_constValue_5_0= ruleconst_exp ) )
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleconst_decl6424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConst_declAccess().getConstKeyword_0());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2986:1: ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=51 && LA54_0<=57)||(LA54_0>=72 && LA54_0<=77)) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2986:2: ( (lv_containedType_1_0= ruleconst_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2986:2: ( (lv_containedType_1_0= ruleconst_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2987:1: (lv_containedType_1_0= ruleconst_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2987:1: (lv_containedType_1_0= ruleconst_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2988:3: lv_containedType_1_0= ruleconst_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConst_declAccess().getContainedTypeConst_typeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_type_in_ruleconst_decl6446);
                    lv_containedType_1_0=ruleconst_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConst_declRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_1_0, 
                              		"const_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3005:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3005:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3006:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3006:1: (otherlv_2= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3007:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getConst_declRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconst_decl6476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getConst_declAccess().getSharedTypeAliasDefCrossReference_1_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3022:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3022:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3023:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconst_decl6494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_identifier_3_0, grammarAccess.getConst_declAccess().getIdentifierIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConst_declRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"identifier",
                      		lv_identifier_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleconst_decl6511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConst_declAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3043:1: ( (lv_constValue_5_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3044:1: (lv_constValue_5_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3044:1: (lv_constValue_5_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3045:3: lv_constValue_5_0= ruleconst_exp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConst_declAccess().getConstValueConst_expParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_ruleconst_decl6532);
            lv_constValue_5_0=ruleconst_exp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConst_declRule());
              	        }
                     		set(
                     			current, 
                     			"constValue",
                      		lv_constValue_5_0, 
                      		"const_exp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconst_decl"


    // $ANTLR start "entryRuleconst_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3069:1: entryRuleconst_type returns [EObject current=null] : iv_ruleconst_type= ruleconst_type EOF ;
    public final EObject entryRuleconst_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3070:2: (iv_ruleconst_type= ruleconst_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3071:2: iv_ruleconst_type= ruleconst_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConst_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_type_in_entryRuleconst_type6568);
            iv_ruleconst_type=ruleconst_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconst_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_type6578); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconst_type"


    // $ANTLR start "ruleconst_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3078:1: ruleconst_type returns [EObject current=null] : (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type ) ;
    public final EObject ruleconst_type() throws RecognitionException {
        EObject current = null;

        EObject this_primitive_def_0 = null;

        EObject this_stringdef_type_1 = null;

        EObject this_wide_stringdef_type_2 = null;

        EObject this_fixed_pt_const_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3081:28: ( (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3082:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3082:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
            case 56:
            case 57:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt55=1;
                }
                break;
            case 51:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==EOF||LA55_2==RULE_ID) ) {
                    alt55=1;
                }
                else if ( (LA55_2==49) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==EOF||LA55_3==RULE_ID) ) {
                    alt55=1;
                }
                else if ( (LA55_3==49) ) {
                    alt55=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3083:2: this_primitive_def_0= ruleprimitive_def
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConst_typeAccess().getPrimitive_defParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_ruleconst_type6628);
                    this_primitive_def_0=ruleprimitive_def();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_primitive_def_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3096:2: this_stringdef_type_1= rulestringdef_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConst_typeAccess().getStringdef_typeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_ruleconst_type6658);
                    this_stringdef_type_1=rulestringdef_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_stringdef_type_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3109:2: this_wide_stringdef_type_2= rulewide_stringdef_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConst_typeAccess().getWide_stringdef_typeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_ruleconst_type6688);
                    this_wide_stringdef_type_2=rulewide_stringdef_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_wide_stringdef_type_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3122:2: this_fixed_pt_const_type_3= rulefixed_pt_const_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConst_typeAccess().getFixed_pt_const_typeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefixed_pt_const_type_in_ruleconst_type6718);
                    this_fixed_pt_const_type_3=rulefixed_pt_const_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_fixed_pt_const_type_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconst_type"


    // $ANTLR start "entryRuleprimitive_def"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3141:1: entryRuleprimitive_def returns [EObject current=null] : iv_ruleprimitive_def= ruleprimitive_def EOF ;
    public final EObject entryRuleprimitive_def() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimitive_def = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3142:2: (iv_ruleprimitive_def= ruleprimitive_def EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3143:2: iv_ruleprimitive_def= ruleprimitive_def EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitive_defRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_entryRuleprimitive_def6753);
            iv_ruleprimitive_def=ruleprimitive_def();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimitive_def; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleprimitive_def6763); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprimitive_def"


    // $ANTLR start "ruleprimitive_def"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3150:1: ruleprimitive_def returns [EObject current=null] : (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type ) ;
    public final EObject ruleprimitive_def() throws RecognitionException {
        EObject current = null;

        EObject this_integer_type_0 = null;

        EObject this_floating_pt_type_1 = null;

        EObject this_charstr_type_2 = null;

        EObject this_other_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3153:28: ( (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3154:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3154:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 56:
            case 57:
                {
                alt56=1;
                }
                break;
            case 54:
                {
                int LA56_2 = input.LA(2);

                if ( (LA56_2==EOF||LA56_2==RULE_ID||LA56_2==25||LA56_2==50||LA56_2==54) ) {
                    alt56=1;
                }
                else if ( (LA56_2==55) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
                }
                break;
            case 55:
            case 72:
                {
                alt56=2;
                }
                break;
            case 51:
            case 52:
            case 73:
            case 74:
                {
                alt56=3;
                }
                break;
            case 75:
            case 76:
            case 77:
                {
                alt56=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3155:2: this_integer_type_0= ruleinteger_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitive_defAccess().getInteger_typeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_ruleprimitive_def6813);
                    this_integer_type_0=ruleinteger_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_integer_type_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3168:2: this_floating_pt_type_1= rulefloating_pt_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitive_defAccess().getFloating_pt_typeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefloating_pt_type_in_ruleprimitive_def6843);
                    this_floating_pt_type_1=rulefloating_pt_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_floating_pt_type_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3181:2: this_charstr_type_2= rulecharstr_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitive_defAccess().getCharstr_typeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulecharstr_type_in_ruleprimitive_def6873);
                    this_charstr_type_2=rulecharstr_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_charstr_type_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3194:2: this_other_type_3= ruleother_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitive_defAccess().getOther_typeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleother_type_in_ruleprimitive_def6903);
                    this_other_type_3=ruleother_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_other_type_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprimitive_def"


    // $ANTLR start "entryRulesequence_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3213:1: entryRulesequence_type returns [EObject current=null] : iv_rulesequence_type= rulesequence_type EOF ;
    public final EObject entryRulesequence_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesequence_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3214:2: (iv_rulesequence_type= rulesequence_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3215:2: iv_rulesequence_type= rulesequence_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequence_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesequence_type_in_entryRulesequence_type6938);
            iv_rulesequence_type=rulesequence_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesequence_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesequence_type6948); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesequence_type"


    // $ANTLR start "rulesequence_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3222:1: rulesequence_type returns [EObject current=null] : (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? otherlv_6= '>' ) ;
    public final EObject rulesequence_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_containedType_2_0 = null;

        EObject lv_bound_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3225:28: ( (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? otherlv_6= '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3226:1: (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? otherlv_6= '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3226:1: (otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? otherlv_6= '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3226:3: otherlv_0= 'sequence' otherlv_1= '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? otherlv_6= '>'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulesequence_type6985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSequence_typeAccess().getSequenceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulesequence_type6997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSequence_typeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3234:1: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==48||(LA57_0>=51 && LA57_0<=57)||(LA57_0>=72 && LA57_0<=78)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3234:2: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3234:2: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3235:1: (lv_containedType_2_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3235:1: (lv_containedType_2_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3236:3: lv_containedType_2_0= rulesimple_type_spec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSequence_typeAccess().getContainedTypeSimple_type_specParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulesequence_type7019);
                    lv_containedType_2_0=rulesimple_type_spec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSequence_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"containedType",
                              		lv_containedType_2_0, 
                              		"simple_type_spec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3253:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3253:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3254:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3254:1: (otherlv_3= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3255:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSequence_typeRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulesequence_type7049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getSequence_typeAccess().getSharedTypeTypedefDefCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3269:3: (otherlv_4= ',' ( (lv_bound_5_0= ruleconst_exp ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==25) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3269:5: otherlv_4= ',' ( (lv_bound_5_0= ruleconst_exp ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulesequence_type7063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSequence_typeAccess().getCommaKeyword_3_0());
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3273:1: ( (lv_bound_5_0= ruleconst_exp ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3274:1: (lv_bound_5_0= ruleconst_exp )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3274:1: (lv_bound_5_0= ruleconst_exp )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3275:3: lv_bound_5_0= ruleconst_exp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSequence_typeAccess().getBoundConst_expParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulesequence_type7084);
                    lv_bound_5_0=ruleconst_exp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSequence_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"bound",
                              		lv_bound_5_0, 
                              		"const_exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulesequence_type7098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSequence_typeAccess().getGreaterThanSignKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesequence_type"


    // $ANTLR start "entryRulestringdef_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3303:1: entryRulestringdef_type returns [EObject current=null] : iv_rulestringdef_type= rulestringdef_type EOF ;
    public final EObject entryRulestringdef_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringdef_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3304:2: (iv_rulestringdef_type= rulestringdef_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3305:2: iv_rulestringdef_type= rulestringdef_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringdef_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_entryRulestringdef_type7134);
            iv_rulestringdef_type=rulestringdef_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestringdef_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulestringdef_type7144); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestringdef_type"


    // $ANTLR start "rulestringdef_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3312:1: rulestringdef_type returns [EObject current=null] : (otherlv_0= 'string' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' ) ;
    public final EObject rulestringdef_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_bound_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3315:28: ( (otherlv_0= 'string' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3316:1: (otherlv_0= 'string' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3316:1: (otherlv_0= 'string' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3316:3: otherlv_0= 'string' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulestringdef_type7181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringdef_typeAccess().getStringKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulestringdef_type7193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringdef_typeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3324:1: ( (lv_bound_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3325:1: (lv_bound_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3325:1: (lv_bound_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3326:3: lv_bound_2_0= ruleconst_exp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringdef_typeAccess().getBoundConst_expParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulestringdef_type7214);
            lv_bound_2_0=ruleconst_exp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringdef_typeRule());
              	        }
                     		set(
                     			current, 
                     			"bound",
                      		lv_bound_2_0, 
                      		"const_exp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulestringdef_type7226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStringdef_typeAccess().getGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestringdef_type"


    // $ANTLR start "entryRulewide_stringdef_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3354:1: entryRulewide_stringdef_type returns [EObject current=null] : iv_rulewide_stringdef_type= rulewide_stringdef_type EOF ;
    public final EObject entryRulewide_stringdef_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewide_stringdef_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3355:2: (iv_rulewide_stringdef_type= rulewide_stringdef_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3356:2: iv_rulewide_stringdef_type= rulewide_stringdef_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWide_stringdef_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_entryRulewide_stringdef_type7262);
            iv_rulewide_stringdef_type=rulewide_stringdef_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulewide_stringdef_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulewide_stringdef_type7272); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewide_stringdef_type"


    // $ANTLR start "rulewide_stringdef_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3363:1: rulewide_stringdef_type returns [EObject current=null] : (otherlv_0= 'wstring' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' ) ;
    public final EObject rulewide_stringdef_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_bound_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3366:28: ( (otherlv_0= 'wstring' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3367:1: (otherlv_0= 'wstring' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3367:1: (otherlv_0= 'wstring' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3367:3: otherlv_0= 'wstring' otherlv_1= '<' ( (lv_bound_2_0= ruleconst_exp ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulewide_stringdef_type7309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWide_stringdef_typeAccess().getWstringKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulewide_stringdef_type7321); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWide_stringdef_typeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3375:1: ( (lv_bound_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3376:1: (lv_bound_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3376:1: (lv_bound_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3377:3: lv_bound_2_0= ruleconst_exp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWide_stringdef_typeAccess().getBoundConst_expParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulewide_stringdef_type7342);
            lv_bound_2_0=ruleconst_exp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWide_stringdef_typeRule());
              	        }
                     		set(
                     			current, 
                     			"bound",
                      		lv_bound_2_0, 
                      		"const_exp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulewide_stringdef_type7354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWide_stringdef_typeAccess().getGreaterThanSignKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewide_stringdef_type"


    // $ANTLR start "entryRulefixed_pt_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3405:1: entryRulefixed_pt_type returns [EObject current=null] : iv_rulefixed_pt_type= rulefixed_pt_type EOF ;
    public final EObject entryRulefixed_pt_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_pt_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3406:2: (iv_rulefixed_pt_type= rulefixed_pt_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3407:2: iv_rulefixed_pt_type= rulefixed_pt_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixed_pt_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefixed_pt_type_in_entryRulefixed_pt_type7390);
            iv_rulefixed_pt_type=rulefixed_pt_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefixed_pt_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefixed_pt_type7400); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefixed_pt_type"


    // $ANTLR start "rulefixed_pt_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3414:1: rulefixed_pt_type returns [EObject current=null] : (otherlv_0= 'fixed' otherlv_1= '<' ( (lv_digits_2_0= ruleconst_exp ) ) otherlv_3= ',' ( (lv_scale_4_0= ruleconst_exp ) ) otherlv_5= '>' ) ;
    public final EObject rulefixed_pt_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_digits_2_0 = null;

        EObject lv_scale_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3417:28: ( (otherlv_0= 'fixed' otherlv_1= '<' ( (lv_digits_2_0= ruleconst_exp ) ) otherlv_3= ',' ( (lv_scale_4_0= ruleconst_exp ) ) otherlv_5= '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3418:1: (otherlv_0= 'fixed' otherlv_1= '<' ( (lv_digits_2_0= ruleconst_exp ) ) otherlv_3= ',' ( (lv_scale_4_0= ruleconst_exp ) ) otherlv_5= '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3418:1: (otherlv_0= 'fixed' otherlv_1= '<' ( (lv_digits_2_0= ruleconst_exp ) ) otherlv_3= ',' ( (lv_scale_4_0= ruleconst_exp ) ) otherlv_5= '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3418:3: otherlv_0= 'fixed' otherlv_1= '<' ( (lv_digits_2_0= ruleconst_exp ) ) otherlv_3= ',' ( (lv_scale_4_0= ruleconst_exp ) ) otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulefixed_pt_type7437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFixed_pt_typeAccess().getFixedKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_rulefixed_pt_type7449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFixed_pt_typeAccess().getLessThanSignKeyword_1());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3426:1: ( (lv_digits_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3427:1: (lv_digits_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3427:1: (lv_digits_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3428:3: lv_digits_2_0= ruleconst_exp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixed_pt_typeAccess().getDigitsConst_expParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulefixed_pt_type7470);
            lv_digits_2_0=ruleconst_exp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFixed_pt_typeRule());
              	        }
                     		set(
                     			current, 
                     			"digits",
                      		lv_digits_2_0, 
                      		"const_exp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulefixed_pt_type7482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFixed_pt_typeAccess().getCommaKeyword_3());
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3448:1: ( (lv_scale_4_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3449:1: (lv_scale_4_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3449:1: (lv_scale_4_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3450:3: lv_scale_4_0= ruleconst_exp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixed_pt_typeAccess().getScaleConst_expParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulefixed_pt_type7503);
            lv_scale_4_0=ruleconst_exp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFixed_pt_typeRule());
              	        }
                     		set(
                     			current, 
                     			"scale",
                      		lv_scale_4_0, 
                      		"const_exp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_rulefixed_pt_type7515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFixed_pt_typeAccess().getGreaterThanSignKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixed_pt_type"


    // $ANTLR start "entryRulefloating_pt_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3478:1: entryRulefloating_pt_type returns [EObject current=null] : iv_rulefloating_pt_type= rulefloating_pt_type EOF ;
    public final EObject entryRulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloating_pt_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3479:2: (iv_rulefloating_pt_type= rulefloating_pt_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3480:2: iv_rulefloating_pt_type= rulefloating_pt_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloating_pt_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefloating_pt_type_in_entryRulefloating_pt_type7551);
            iv_rulefloating_pt_type=rulefloating_pt_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloating_pt_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefloating_pt_type7561); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloating_pt_type"


    // $ANTLR start "rulefloating_pt_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3487:1: rulefloating_pt_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) ;
    public final EObject rulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3490:28: ( ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3491:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3491:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt59=1;
                }
                break;
            case 55:
                {
                alt59=2;
                }
                break;
            case 54:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3491:2: ( (lv_kind_0_0= rulefloat_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3491:2: ( (lv_kind_0_0= rulefloat_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3492:1: (lv_kind_0_0= rulefloat_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3492:1: (lv_kind_0_0= rulefloat_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3493:3: lv_kind_0_0= rulefloat_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindFloat_typeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefloat_type_in_rulefloating_pt_type7607);
                    lv_kind_0_0=rulefloat_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloating_pt_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_0_0, 
                              		"float_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3510:6: ( (lv_kind_1_0= ruledouble_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3510:6: ( (lv_kind_1_0= ruledouble_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3511:1: (lv_kind_1_0= ruledouble_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3511:1: (lv_kind_1_0= ruledouble_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3512:3: lv_kind_1_0= ruledouble_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindDouble_typeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruledouble_type_in_rulefloating_pt_type7634);
                    lv_kind_1_0=ruledouble_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloating_pt_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_1_0, 
                              		"double_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3529:6: ( (lv_kind_2_0= rulelongdouble_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3529:6: ( (lv_kind_2_0= rulelongdouble_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3530:1: (lv_kind_2_0= rulelongdouble_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3530:1: (lv_kind_2_0= rulelongdouble_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3531:3: lv_kind_2_0= rulelongdouble_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindLongdouble_typeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelongdouble_type_in_rulefloating_pt_type7661);
                    lv_kind_2_0=rulelongdouble_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFloating_pt_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"longdouble_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloating_pt_type"


    // $ANTLR start "entryRulelongdouble_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3555:1: entryRulelongdouble_type returns [String current=null] : iv_rulelongdouble_type= rulelongdouble_type EOF ;
    public final String entryRulelongdouble_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelongdouble_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3556:2: (iv_rulelongdouble_type= rulelongdouble_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3557:2: iv_rulelongdouble_type= rulelongdouble_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLongdouble_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulelongdouble_type_in_entryRulelongdouble_type7698);
            iv_rulelongdouble_type=rulelongdouble_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelongdouble_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulelongdouble_type7709); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelongdouble_type"


    // $ANTLR start "rulelongdouble_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3564:1: rulelongdouble_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'double' ) ;
    public final AntlrDatatypeRuleToken rulelongdouble_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3567:28: ( (kw= 'long' kw= 'double' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3568:1: (kw= 'long' kw= 'double' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3568:1: (kw= 'long' kw= 'double' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3569:2: kw= 'long' kw= 'double'
            {
            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulelongdouble_type7747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLongdouble_typeAccess().getLongKeyword_0()); 
                  
            }
            kw=(Token)match(input,55,FollowSets000.FOLLOW_55_in_rulelongdouble_type7760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLongdouble_typeAccess().getDoubleKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelongdouble_type"


    // $ANTLR start "entryRuleinteger_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3588:1: entryRuleinteger_type returns [EObject current=null] : iv_ruleinteger_type= ruleinteger_type EOF ;
    public final EObject entryRuleinteger_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteger_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3589:2: (iv_ruleinteger_type= ruleinteger_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3590:2: iv_ruleinteger_type= ruleinteger_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteger_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_entryRuleinteger_type7800);
            iv_ruleinteger_type=ruleinteger_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleinteger_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinteger_type7810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinteger_type"


    // $ANTLR start "ruleinteger_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3597:1: ruleinteger_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) ;
    public final EObject ruleinteger_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;

        AntlrDatatypeRuleToken lv_kind_3_0 = null;

        AntlrDatatypeRuleToken lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_kind_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3600:28: ( ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3601:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3601:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
            int alt60=6;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3601:2: ( (lv_kind_0_0= ruleshort_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3601:2: ( (lv_kind_0_0= ruleshort_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3602:1: (lv_kind_0_0= ruleshort_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3602:1: (lv_kind_0_0= ruleshort_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3603:3: lv_kind_0_0= ruleshort_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteger_typeAccess().getKindShort_typeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleshort_type_in_ruleinteger_type7856);
                    lv_kind_0_0=ruleshort_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_0_0, 
                              		"short_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3620:6: ( (lv_kind_1_0= rulelong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3620:6: ( (lv_kind_1_0= rulelong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3621:1: (lv_kind_1_0= rulelong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3621:1: (lv_kind_1_0= rulelong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3622:3: lv_kind_1_0= rulelong_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteger_typeAccess().getKindLong_typeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelong_type_in_ruleinteger_type7883);
                    lv_kind_1_0=rulelong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_1_0, 
                              		"long_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3639:6: ( (lv_kind_2_0= rulelonglong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3639:6: ( (lv_kind_2_0= rulelonglong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3640:1: (lv_kind_2_0= rulelonglong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3640:1: (lv_kind_2_0= rulelonglong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3641:3: lv_kind_2_0= rulelonglong_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteger_typeAccess().getKindLonglong_typeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelonglong_type_in_ruleinteger_type7910);
                    lv_kind_2_0=rulelonglong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"longlong_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3658:6: ( (lv_kind_3_0= ruleushort_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3658:6: ( (lv_kind_3_0= ruleushort_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3659:1: (lv_kind_3_0= ruleushort_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3659:1: (lv_kind_3_0= ruleushort_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3660:3: lv_kind_3_0= ruleushort_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteger_typeAccess().getKindUshort_typeParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleushort_type_in_ruleinteger_type7937);
                    lv_kind_3_0=ruleushort_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_3_0, 
                              		"ushort_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3677:6: ( (lv_kind_4_0= ruleulong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3677:6: ( (lv_kind_4_0= ruleulong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3678:1: (lv_kind_4_0= ruleulong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3678:1: (lv_kind_4_0= ruleulong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3679:3: lv_kind_4_0= ruleulong_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlong_typeParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleulong_type_in_ruleinteger_type7964);
                    lv_kind_4_0=ruleulong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_4_0, 
                              		"ulong_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3696:6: ( (lv_kind_5_0= ruleulonglong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3696:6: ( (lv_kind_5_0= ruleulonglong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3697:1: (lv_kind_5_0= ruleulonglong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3697:1: (lv_kind_5_0= ruleulonglong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3698:3: lv_kind_5_0= ruleulonglong_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlonglong_typeParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleulonglong_type_in_ruleinteger_type7991);
                    lv_kind_5_0=ruleulonglong_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteger_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_5_0, 
                              		"ulonglong_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinteger_type"


    // $ANTLR start "entryRulelonglong_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3722:1: entryRulelonglong_type returns [String current=null] : iv_rulelonglong_type= rulelonglong_type EOF ;
    public final String entryRulelonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelonglong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3723:2: (iv_rulelonglong_type= rulelonglong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3724:2: iv_rulelonglong_type= rulelonglong_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLonglong_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulelonglong_type_in_entryRulelonglong_type8028);
            iv_rulelonglong_type=rulelonglong_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulelonglong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulelonglong_type8039); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelonglong_type"


    // $ANTLR start "rulelonglong_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3731:1: rulelonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken rulelonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3734:28: ( (kw= 'long' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3735:1: (kw= 'long' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3735:1: (kw= 'long' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3736:2: kw= 'long' kw= 'long'
            {
            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulelonglong_type8077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLonglong_typeAccess().getLongKeyword_0()); 
                  
            }
            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulelonglong_type8090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLonglong_typeAccess().getLongKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelonglong_type"


    // $ANTLR start "entryRuleushort_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3755:1: entryRuleushort_type returns [String current=null] : iv_ruleushort_type= ruleushort_type EOF ;
    public final String entryRuleushort_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleushort_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3756:2: (iv_ruleushort_type= ruleushort_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3757:2: iv_ruleushort_type= ruleushort_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUshort_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleushort_type_in_entryRuleushort_type8131);
            iv_ruleushort_type=ruleushort_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleushort_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleushort_type8142); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleushort_type"


    // $ANTLR start "ruleushort_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3764:1: ruleushort_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'short' ) ;
    public final AntlrDatatypeRuleToken ruleushort_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3767:28: ( (kw= 'unsigned' kw= 'short' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3768:1: (kw= 'unsigned' kw= 'short' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3768:1: (kw= 'unsigned' kw= 'short' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3769:2: kw= 'unsigned' kw= 'short'
            {
            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleushort_type8180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUshort_typeAccess().getUnsignedKeyword_0()); 
                  
            }
            kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleushort_type8193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUshort_typeAccess().getShortKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleushort_type"


    // $ANTLR start "entryRuleulong_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3788:1: entryRuleulong_type returns [String current=null] : iv_ruleulong_type= ruleulong_type EOF ;
    public final String entryRuleulong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3789:2: (iv_ruleulong_type= ruleulong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3790:2: iv_ruleulong_type= ruleulong_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUlong_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleulong_type_in_entryRuleulong_type8234);
            iv_ruleulong_type=ruleulong_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleulong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleulong_type8245); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleulong_type"


    // $ANTLR start "ruleulong_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3797:1: ruleulong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3800:28: ( (kw= 'unsigned' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3801:1: (kw= 'unsigned' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3801:1: (kw= 'unsigned' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3802:2: kw= 'unsigned' kw= 'long'
            {
            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleulong_type8283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUlong_typeAccess().getUnsignedKeyword_0()); 
                  
            }
            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleulong_type8296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUlong_typeAccess().getLongKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleulong_type"


    // $ANTLR start "entryRuleulonglong_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3821:1: entryRuleulonglong_type returns [String current=null] : iv_ruleulonglong_type= ruleulonglong_type EOF ;
    public final String entryRuleulonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulonglong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3822:2: (iv_ruleulonglong_type= ruleulonglong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3823:2: iv_ruleulonglong_type= ruleulonglong_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUlonglong_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleulonglong_type_in_entryRuleulonglong_type8337);
            iv_ruleulonglong_type=ruleulonglong_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleulonglong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleulonglong_type8348); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleulonglong_type"


    // $ANTLR start "ruleulonglong_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3830:1: ruleulonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3833:28: ( (kw= 'unsigned' kw= 'long' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3834:1: (kw= 'unsigned' kw= 'long' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3834:1: (kw= 'unsigned' kw= 'long' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3835:2: kw= 'unsigned' kw= 'long' kw= 'long'
            {
            kw=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleulonglong_type8386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUlonglong_typeAccess().getUnsignedKeyword_0()); 
                  
            }
            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleulonglong_type8399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUlonglong_typeAccess().getLongKeyword_1()); 
                  
            }
            kw=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleulonglong_type8412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUlonglong_typeAccess().getLongKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleulonglong_type"


    // $ANTLR start "entryRulecharstr_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3860:1: entryRulecharstr_type returns [EObject current=null] : iv_rulecharstr_type= rulecharstr_type EOF ;
    public final EObject entryRulecharstr_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharstr_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3861:2: (iv_rulecharstr_type= rulecharstr_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3862:2: iv_rulecharstr_type= rulecharstr_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharstr_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulecharstr_type_in_entryRulecharstr_type8452);
            iv_rulecharstr_type=rulecharstr_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecharstr_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecharstr_type8462); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecharstr_type"


    // $ANTLR start "rulecharstr_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3869:1: rulecharstr_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) ;
    public final EObject rulecharstr_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        Enumerator lv_kind_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3872:28: ( ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3873:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3873:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt61=1;
                }
                break;
            case 74:
                {
                alt61=2;
                }
                break;
            case 51:
                {
                alt61=3;
                }
                break;
            case 52:
                {
                alt61=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3873:2: ( (lv_kind_0_0= rulechar_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3873:2: ( (lv_kind_0_0= rulechar_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3874:1: (lv_kind_0_0= rulechar_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3874:1: (lv_kind_0_0= rulechar_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3875:3: lv_kind_0_0= rulechar_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindChar_typeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulechar_type_in_rulecharstr_type8508);
                    lv_kind_0_0=rulechar_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_0_0, 
                              		"char_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3892:6: ( (lv_kind_1_0= rulewide_char_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3892:6: ( (lv_kind_1_0= rulewide_char_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3893:1: (lv_kind_1_0= rulewide_char_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3893:1: (lv_kind_1_0= rulewide_char_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3894:3: lv_kind_1_0= rulewide_char_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_char_typeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_char_type_in_rulecharstr_type8535);
                    lv_kind_1_0=rulewide_char_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_1_0, 
                              		"wide_char_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3911:6: ( (lv_kind_2_0= rulestring_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3911:6: ( (lv_kind_2_0= rulestring_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3912:1: (lv_kind_2_0= rulestring_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3912:1: (lv_kind_2_0= rulestring_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3913:3: lv_kind_2_0= rulestring_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindString_typeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestring_type_in_rulecharstr_type8562);
                    lv_kind_2_0=rulestring_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"string_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3930:6: ( (lv_kind_3_0= rulewide_string_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3930:6: ( (lv_kind_3_0= rulewide_string_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3931:1: (lv_kind_3_0= rulewide_string_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3931:1: (lv_kind_3_0= rulewide_string_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3932:3: lv_kind_3_0= rulewide_string_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_string_typeEnumRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_string_type_in_rulecharstr_type8589);
                    lv_kind_3_0=rulewide_string_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCharstr_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_3_0, 
                              		"wide_string_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecharstr_type"


    // $ANTLR start "entryRuleother_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3956:1: entryRuleother_type returns [EObject current=null] : iv_ruleother_type= ruleother_type EOF ;
    public final EObject entryRuleother_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleother_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3957:2: (iv_ruleother_type= ruleother_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3958:2: iv_ruleother_type= ruleother_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOther_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleother_type_in_entryRuleother_type8625);
            iv_ruleother_type=ruleother_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleother_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleother_type8635); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleother_type"


    // $ANTLR start "ruleother_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3965:1: ruleother_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) ;
    public final EObject ruleother_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3968:28: ( ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3969:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3969:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt62=1;
                }
                break;
            case 76:
                {
                alt62=2;
                }
                break;
            case 77:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3969:2: ( (lv_kind_0_0= ruleboolean_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3969:2: ( (lv_kind_0_0= ruleboolean_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3970:1: (lv_kind_0_0= ruleboolean_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3970:1: (lv_kind_0_0= ruleboolean_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3971:3: lv_kind_0_0= ruleboolean_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOther_typeAccess().getKindBoolean_typeEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolean_type_in_ruleother_type8681);
                    lv_kind_0_0=ruleboolean_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOther_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_0_0, 
                              		"boolean_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3988:6: ( (lv_kind_1_0= ruleoctet_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3988:6: ( (lv_kind_1_0= ruleoctet_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3989:1: (lv_kind_1_0= ruleoctet_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3989:1: (lv_kind_1_0= ruleoctet_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3990:3: lv_kind_1_0= ruleoctet_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOther_typeAccess().getKindOctet_typeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleoctet_type_in_ruleother_type8708);
                    lv_kind_1_0=ruleoctet_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOther_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_1_0, 
                              		"octet_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4007:6: ( (lv_kind_2_0= ruleany_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4007:6: ( (lv_kind_2_0= ruleany_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4008:1: (lv_kind_2_0= ruleany_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4008:1: (lv_kind_2_0= ruleany_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4009:3: lv_kind_2_0= ruleany_type
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOther_typeAccess().getKindAny_typeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleany_type_in_ruleother_type8735);
                    lv_kind_2_0=ruleany_type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOther_typeRule());
                      	        }
                             		set(
                             			current, 
                             			"kind",
                              		lv_kind_2_0, 
                              		"any_type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleother_type"


    // $ANTLR start "entryRulefixed_pt_const_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4033:1: entryRulefixed_pt_const_type returns [EObject current=null] : iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF ;
    public final EObject entryRulefixed_pt_const_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_pt_const_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4034:2: (iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4035:2: iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixed_pt_const_typeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefixed_pt_const_type_in_entryRulefixed_pt_const_type8771);
            iv_rulefixed_pt_const_type=rulefixed_pt_const_type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefixed_pt_const_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefixed_pt_const_type8781); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefixed_pt_const_type"


    // $ANTLR start "rulefixed_pt_const_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4042:1: rulefixed_pt_const_type returns [EObject current=null] : ( () otherlv_1= 'fixed' ) ;
    public final EObject rulefixed_pt_const_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4045:28: ( ( () otherlv_1= 'fixed' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4046:1: ( () otherlv_1= 'fixed' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4046:1: ( () otherlv_1= 'fixed' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4046:2: () otherlv_1= 'fixed'
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4046:2: ()
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4047:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFixed_pt_const_typeAccess().getFixedDefAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_rulefixed_pt_const_type8830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFixed_pt_const_typeAccess().getFixedKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixed_pt_const_type"


    // $ANTLR start "entryRuleconst_exp"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4067:1: entryRuleconst_exp returns [EObject current=null] : iv_ruleconst_exp= ruleconst_exp EOF ;
    public final EObject entryRuleconst_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_exp = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4068:2: (iv_ruleconst_exp= ruleconst_exp EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4069:2: iv_ruleconst_exp= ruleconst_exp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConst_expRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_entryRuleconst_exp8866);
            iv_ruleconst_exp=ruleconst_exp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconst_exp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_exp8876); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconst_exp"


    // $ANTLR start "ruleconst_exp"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4076:1: ruleconst_exp returns [EObject current=null] : this_or_expr_0= ruleor_expr ;
    public final EObject ruleconst_exp() throws RecognitionException {
        EObject current = null;

        EObject this_or_expr_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4079:28: (this_or_expr_0= ruleor_expr )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4081:2: this_or_expr_0= ruleor_expr
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConst_expAccess().getOr_exprParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleor_expr_in_ruleconst_exp8925);
            this_or_expr_0=ruleor_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_or_expr_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconst_exp"


    // $ANTLR start "entryRuleor_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4100:1: entryRuleor_expr returns [EObject current=null] : iv_ruleor_expr= ruleor_expr EOF ;
    public final EObject entryRuleor_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleor_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4101:2: (iv_ruleor_expr= ruleor_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4102:2: iv_ruleor_expr= ruleor_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOr_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleor_expr_in_entryRuleor_expr8959);
            iv_ruleor_expr=ruleor_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleor_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleor_expr8969); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleor_expr"


    // $ANTLR start "ruleor_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4109:1: ruleor_expr returns [EObject current=null] : (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* ) ;
    public final EObject ruleor_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_xor_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4112:28: ( (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4113:1: (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4113:1: (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4114:2: this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOr_exprAccess().getXor_exprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_ruleor_expr9019);
            this_xor_expr_0=rulexor_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_xor_expr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4125:1: ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==58) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4125:2: () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4125:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4126:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOr_exprAccess().getBinaryExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4134:2: ( (lv_operator_2_0= '|' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4135:1: (lv_operator_2_0= '|' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4135:1: (lv_operator_2_0= '|' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4136:3: lv_operator_2_0= '|'
            	    {
            	    lv_operator_2_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleor_expr9049); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_operator_2_0, grammarAccess.getOr_exprAccess().getOperatorVerticalLineKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOr_exprRule());
            	      	        }
            	             		setWithLastConsumed(current, "operator", lv_operator_2_0, "|");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4149:2: ( (lv_right_3_0= rulexor_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4150:1: (lv_right_3_0= rulexor_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4150:1: (lv_right_3_0= rulexor_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4151:3: lv_right_3_0= rulexor_expr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOr_exprAccess().getRightXor_exprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_ruleor_expr9083);
            	    lv_right_3_0=rulexor_expr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOr_exprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"xor_expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleor_expr"


    // $ANTLR start "entryRulexor_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4175:1: entryRulexor_expr returns [EObject current=null] : iv_rulexor_expr= rulexor_expr EOF ;
    public final EObject entryRulexor_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulexor_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4176:2: (iv_rulexor_expr= rulexor_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4177:2: iv_rulexor_expr= rulexor_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXor_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_entryRulexor_expr9121);
            iv_rulexor_expr=rulexor_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulexor_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulexor_expr9131); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulexor_expr"


    // $ANTLR start "rulexor_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4184:1: rulexor_expr returns [EObject current=null] : (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* ) ;
    public final EObject rulexor_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_and_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4187:28: ( (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4188:1: (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4188:1: (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4189:2: this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXor_exprAccess().getAnd_exprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_rulexor_expr9181);
            this_and_expr_0=ruleand_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_and_expr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4200:1: ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==59) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4200:2: () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4200:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4201:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXor_exprAccess().getBinaryExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4209:2: ( (lv_operator_2_0= '^' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4210:1: (lv_operator_2_0= '^' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4210:1: (lv_operator_2_0= '^' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4211:3: lv_operator_2_0= '^'
            	    {
            	    lv_operator_2_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_rulexor_expr9211); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_operator_2_0, grammarAccess.getXor_exprAccess().getOperatorCircumflexAccentKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXor_exprRule());
            	      	        }
            	             		setWithLastConsumed(current, "operator", lv_operator_2_0, "^");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4224:2: ( (lv_right_3_0= ruleand_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4225:1: (lv_right_3_0= ruleand_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4225:1: (lv_right_3_0= ruleand_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4226:3: lv_right_3_0= ruleand_expr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXor_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_rulexor_expr9245);
            	    lv_right_3_0=ruleand_expr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXor_exprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"and_expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulexor_expr"


    // $ANTLR start "entryRuleand_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4250:1: entryRuleand_expr returns [EObject current=null] : iv_ruleand_expr= ruleand_expr EOF ;
    public final EObject entryRuleand_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4251:2: (iv_ruleand_expr= ruleand_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4252:2: iv_ruleand_expr= ruleand_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnd_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_entryRuleand_expr9283);
            iv_ruleand_expr=ruleand_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleand_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleand_expr9293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleand_expr"


    // $ANTLR start "ruleand_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4259:1: ruleand_expr returns [EObject current=null] : (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* ) ;
    public final EObject ruleand_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_shift_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4262:28: ( (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4263:1: (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4263:1: (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4264:2: this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAnd_exprAccess().getShift_exprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_ruleand_expr9343);
            this_shift_expr_0=ruleshift_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_shift_expr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4275:1: ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==60) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4275:2: () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4275:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4276:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAnd_exprAccess().getBinaryExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4284:2: ( (lv_operator_2_0= '&' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4285:1: (lv_operator_2_0= '&' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4285:1: (lv_operator_2_0= '&' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4286:3: lv_operator_2_0= '&'
            	    {
            	    lv_operator_2_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleand_expr9373); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_operator_2_0, grammarAccess.getAnd_exprAccess().getOperatorAmpersandKeyword_1_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAnd_exprRule());
            	      	        }
            	             		setWithLastConsumed(current, "operator", lv_operator_2_0, "&");
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4299:2: ( (lv_right_3_0= ruleshift_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4300:1: (lv_right_3_0= ruleshift_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4300:1: (lv_right_3_0= ruleshift_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4301:3: lv_right_3_0= ruleshift_expr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnd_exprAccess().getRightShift_exprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_ruleand_expr9407);
            	    lv_right_3_0=ruleshift_expr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnd_exprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"shift_expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleand_expr"


    // $ANTLR start "entryRuleshift_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4325:1: entryRuleshift_expr returns [EObject current=null] : iv_ruleshift_expr= ruleshift_expr EOF ;
    public final EObject entryRuleshift_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleshift_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4326:2: (iv_ruleshift_expr= ruleshift_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4327:2: iv_ruleshift_expr= ruleshift_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShift_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_entryRuleshift_expr9445);
            iv_ruleshift_expr=ruleshift_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleshift_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleshift_expr9455); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleshift_expr"


    // $ANTLR start "ruleshift_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4334:1: ruleshift_expr returns [EObject current=null] : (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* ) ;
    public final EObject ruleshift_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_add_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4337:28: ( (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4338:1: (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4338:1: (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4339:2: this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShift_exprAccess().getAdd_exprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_ruleshift_expr9505);
            this_add_expr_0=ruleadd_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_add_expr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4350:1: ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=61 && LA67_0<=62)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4350:2: () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4350:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4351:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShift_exprAccess().getBinaryExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4359:2: ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4360:1: ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4360:1: ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4361:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4361:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==61) ) {
            	        alt66=1;
            	    }
            	    else if ( (LA66_0==62) ) {
            	        alt66=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4362:3: lv_operator_2_1= '>>'
            	            {
            	            lv_operator_2_1=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleshift_expr9537); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getShift_exprAccess().getOperatorGreaterThanSignGreaterThanSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getShift_exprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4374:8: lv_operator_2_2= '<<'
            	            {
            	            lv_operator_2_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleshift_expr9566); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getShift_exprAccess().getOperatorLessThanSignLessThanSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getShift_exprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4389:2: ( (lv_right_3_0= ruleadd_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4390:1: (lv_right_3_0= ruleadd_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4390:1: (lv_right_3_0= ruleadd_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4391:3: lv_right_3_0= ruleadd_expr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShift_exprAccess().getRightAdd_exprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_ruleshift_expr9603);
            	    lv_right_3_0=ruleadd_expr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShift_exprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"add_expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleshift_expr"


    // $ANTLR start "entryRuleadd_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4415:1: entryRuleadd_expr returns [EObject current=null] : iv_ruleadd_expr= ruleadd_expr EOF ;
    public final EObject entryRuleadd_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadd_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4416:2: (iv_ruleadd_expr= ruleadd_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4417:2: iv_ruleadd_expr= ruleadd_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdd_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_entryRuleadd_expr9641);
            iv_ruleadd_expr=ruleadd_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleadd_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleadd_expr9651); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleadd_expr"


    // $ANTLR start "ruleadd_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4424:1: ruleadd_expr returns [EObject current=null] : (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* ) ;
    public final EObject ruleadd_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_mult_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4427:28: ( (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4428:1: (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4428:1: (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4429:2: this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdd_exprAccess().getMult_exprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_ruleadd_expr9701);
            this_mult_expr_0=rulemult_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_mult_expr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4440:1: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=63 && LA69_0<=64)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4440:2: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4440:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4441:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdd_exprAccess().getBinaryExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4449:2: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4450:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4450:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4451:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4451:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==63) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==64) ) {
            	        alt68=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4452:3: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleadd_expr9733); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getAdd_exprAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdd_exprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4464:8: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleadd_expr9762); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getAdd_exprAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdd_exprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4479:2: ( (lv_right_3_0= rulemult_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4480:1: (lv_right_3_0= rulemult_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4480:1: (lv_right_3_0= rulemult_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4481:3: lv_right_3_0= rulemult_expr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdd_exprAccess().getRightMult_exprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_ruleadd_expr9799);
            	    lv_right_3_0=rulemult_expr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdd_exprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"mult_expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleadd_expr"


    // $ANTLR start "entryRulemult_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4505:1: entryRulemult_expr returns [EObject current=null] : iv_rulemult_expr= rulemult_expr EOF ;
    public final EObject entryRulemult_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemult_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4506:2: (iv_rulemult_expr= rulemult_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4507:2: iv_rulemult_expr= rulemult_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMult_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_entryRulemult_expr9837);
            iv_rulemult_expr=rulemult_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemult_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemult_expr9847); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemult_expr"


    // $ANTLR start "rulemult_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4514:1: rulemult_expr returns [EObject current=null] : (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* ) ;
    public final EObject rulemult_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_unary_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4517:28: ( (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4518:1: (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4518:1: (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4519:2: this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMult_exprAccess().getUnary_exprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_rulemult_expr9897);
            this_unary_expr_0=ruleunary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_unary_expr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4530:1: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=65 && LA71_0<=67)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4530:2: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4530:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4531:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMult_exprAccess().getBinaryExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4539:2: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4540:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4540:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4541:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4541:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    int alt70=3;
            	    switch ( input.LA(1) ) {
            	    case 65:
            	        {
            	        alt70=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt70=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt70=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 70, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt70) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4542:3: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_rulemult_expr9929); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_1, grammarAccess.getMult_exprAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMult_exprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4554:8: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,66,FollowSets000.FOLLOW_66_in_rulemult_expr9958); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_2, grammarAccess.getMult_exprAccess().getOperatorSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMult_exprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4566:8: lv_operator_2_3= '%'
            	            {
            	            lv_operator_2_3=(Token)match(input,67,FollowSets000.FOLLOW_67_in_rulemult_expr9987); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_operator_2_3, grammarAccess.getMult_exprAccess().getOperatorPercentSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMult_exprRule());
            	              	        }
            	                     		setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4581:2: ( (lv_right_3_0= ruleunary_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4582:1: (lv_right_3_0= ruleunary_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4582:1: (lv_right_3_0= ruleunary_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4583:3: lv_right_3_0= ruleunary_expr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMult_exprAccess().getRightUnary_exprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_rulemult_expr10024);
            	    lv_right_3_0=ruleunary_expr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMult_exprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"unary_expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemult_expr"


    // $ANTLR start "entryRuleunary_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4607:1: entryRuleunary_expr returns [EObject current=null] : iv_ruleunary_expr= ruleunary_expr EOF ;
    public final EObject entryRuleunary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4608:2: (iv_ruleunary_expr= ruleunary_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4609:2: iv_ruleunary_expr= ruleunary_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_entryRuleunary_expr10062);
            iv_ruleunary_expr=ruleunary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunary_expr10072); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary_expr"


    // $ANTLR start "ruleunary_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4616:1: ruleunary_expr returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr ) ;
    public final EObject ruleunary_expr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject this_primary_expr_3 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4619:28: ( ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=63 && LA72_0<=64)||LA72_0==68) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_BOOLEAN_LITERAL)||LA72_0==27) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:2: ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:2: ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:3: () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:3: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4621:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnary_exprAccess().getUnaryExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4629:2: ( (lv_operator_1_0= ruleunary_operator ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4630:1: (lv_operator_1_0= ruleunary_operator )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4630:1: (lv_operator_1_0= ruleunary_operator )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4631:3: lv_operator_1_0= ruleunary_operator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_exprAccess().getOperatorUnary_operatorParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunary_operator_in_ruleunary_expr10131);
                    lv_operator_1_0=ruleunary_operator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_exprRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"unary_operator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4647:2: ( (lv_expression_2_0= ruleprimary_expr ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4648:1: (lv_expression_2_0= ruleprimary_expr )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4648:1: (lv_expression_2_0= ruleprimary_expr )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4649:3: lv_expression_2_0= ruleprimary_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnary_exprAccess().getExpressionPrimary_exprParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_ruleunary_expr10152);
                    lv_expression_2_0=ruleprimary_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnary_exprRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"primary_expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4667:2: this_primary_expr_3= ruleprimary_expr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_ruleunary_expr10184);
                    this_primary_expr_3=ruleprimary_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_primary_expr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary_expr"


    // $ANTLR start "entryRuleunary_operator"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4686:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4687:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4688:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnary_operatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_operator_in_entryRuleunary_operator10220);
            iv_ruleunary_operator=ruleunary_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary_operator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunary_operator10231); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary_operator"


    // $ANTLR start "ruleunary_operator"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4695:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4698:28: ( (kw= '-' | kw= '+' | kw= '~' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4699:1: (kw= '-' | kw= '+' | kw= '~' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4699:1: (kw= '-' | kw= '+' | kw= '~' )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt73=1;
                }
                break;
            case 63:
                {
                alt73=2;
                }
                break;
            case 68:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4700:2: kw= '-'
                    {
                    kw=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleunary_operator10269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4707:2: kw= '+'
                    {
                    kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleunary_operator10288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4714:2: kw= '~'
                    {
                    kw=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleunary_operator10307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnary_operatorAccess().getTildeKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary_operator"


    // $ANTLR start "entryRuleprimary_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4727:1: entryRuleprimary_expr returns [EObject current=null] : iv_ruleprimary_expr= ruleprimary_expr EOF ;
    public final EObject entryRuleprimary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimary_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4728:2: (iv_ruleprimary_expr= ruleprimary_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4729:2: iv_ruleprimary_expr= ruleprimary_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimary_exprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_entryRuleprimary_expr10347);
            iv_ruleprimary_expr=ruleprimary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleprimary_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleprimary_expr10357); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprimary_expr"


    // $ANTLR start "ruleprimary_expr"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4736:1: ruleprimary_expr returns [EObject current=null] : (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | (otherlv_2= '(' this_const_exp_3= ruleconst_exp otherlv_4= ')' ) ) ;
    public final EObject ruleprimary_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_constantDefRef_0 = null;

        EObject this_valueExpression_1 = null;

        EObject this_const_exp_3 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4739:28: ( (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | (otherlv_2= '(' this_const_exp_3= ruleconst_exp otherlv_4= ')' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4740:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | (otherlv_2= '(' this_const_exp_3= ruleconst_exp otherlv_4= ')' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4740:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | (otherlv_2= '(' this_const_exp_3= ruleconst_exp otherlv_4= ')' ) )
            int alt74=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt74=1;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_HEX_LITERAL:
            case RULE_WIDE_STRING_LITERAL:
            case RULE_FIXED_PT_LITERAL:
            case RULE_FLOATING_PT_LITERAL:
            case RULE_BOOLEAN_LITERAL:
                {
                alt74=2;
                }
                break;
            case 27:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4741:2: this_constantDefRef_0= ruleconstantDefRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_exprAccess().getConstantDefRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconstantDefRef_in_ruleprimary_expr10407);
                    this_constantDefRef_0=ruleconstantDefRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_constantDefRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4754:2: this_valueExpression_1= rulevalueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_exprAccess().getValueExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulevalueExpression_in_ruleprimary_expr10437);
                    this_valueExpression_1=rulevalueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_valueExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4766:6: (otherlv_2= '(' this_const_exp_3= ruleconst_exp otherlv_4= ')' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4766:6: (otherlv_2= '(' this_const_exp_3= ruleconst_exp otherlv_4= ')' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4766:8: otherlv_2= '(' this_const_exp_3= ruleconst_exp otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleprimary_expr10455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_exprAccess().getConst_expParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_ruleprimary_expr10480);
                    this_const_exp_3=ruleconst_exp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_const_exp_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleprimary_expr10491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprimary_expr"


    // $ANTLR start "entryRuleconstantDefRef"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4794:1: entryRuleconstantDefRef returns [EObject current=null] : iv_ruleconstantDefRef= ruleconstantDefRef EOF ;
    public final EObject entryRuleconstantDefRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefRef = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4795:2: (iv_ruleconstantDefRef= ruleconstantDefRef EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4796:2: iv_ruleconstantDefRef= ruleconstantDefRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconstantDefRef_in_entryRuleconstantDefRef10528);
            iv_ruleconstantDefRef=ruleconstantDefRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleconstantDefRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconstantDefRef10538); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstantDefRef"


    // $ANTLR start "ruleconstantDefRef"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4803:1: ruleconstantDefRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleconstantDefRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4806:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4807:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4807:1: ( (otherlv_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4808:1: (otherlv_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4808:1: (otherlv_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4809:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDefRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstantDefRef10586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getConstantDefRefAccess().getConstantConstantCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstantDefRef"


    // $ANTLR start "entryRulevalueExpression"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4831:1: entryRulevalueExpression returns [EObject current=null] : iv_rulevalueExpression= rulevalueExpression EOF ;
    public final EObject entryRulevalueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalueExpression = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4832:2: (iv_rulevalueExpression= rulevalueExpression EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4833:2: iv_rulevalueExpression= rulevalueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulevalueExpression_in_entryRulevalueExpression10621);
            iv_rulevalueExpression=rulevalueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevalueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalueExpression10631); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalueExpression"


    // $ANTLR start "rulevalueExpression"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4840:1: rulevalueExpression returns [EObject current=null] : ( (lv_value_0_0= ruleliteral ) ) ;
    public final EObject rulevalueExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4843:28: ( ( (lv_value_0_0= ruleliteral ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4844:1: ( (lv_value_0_0= ruleliteral ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4844:1: ( (lv_value_0_0= ruleliteral ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4845:1: (lv_value_0_0= ruleliteral )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4845:1: (lv_value_0_0= ruleliteral )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4846:3: lv_value_0_0= ruleliteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueExpressionAccess().getValueLiteralParserRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleliteral_in_rulevalueExpression10676);
            lv_value_0_0=ruleliteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalueExpression"


    // $ANTLR start "entryRuleliteral"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4870:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4871:2: (iv_ruleliteral= ruleliteral EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4872:2: iv_ruleliteral= ruleliteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleliteral_in_entryRuleliteral10712);
            iv_ruleliteral=ruleliteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleliteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleliteral10723); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleliteral"


    // $ANTLR start "ruleliteral"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4879:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleliteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_HEX_LITERAL_2=null;
        Token this_WIDE_STRING_LITERAL_3=null;
        Token this_FIXED_PT_LITERAL_4=null;
        Token this_FLOATING_PT_LITERAL_5=null;
        Token this_BOOLEAN_LITERAL_6=null;

         enterRule(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4882:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4883:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4883:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )
            int alt75=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt75=1;
                }
                break;
            case RULE_STRING:
                {
                alt75=2;
                }
                break;
            case RULE_HEX_LITERAL:
                {
                alt75=3;
                }
                break;
            case RULE_WIDE_STRING_LITERAL:
                {
                alt75=4;
                }
                break;
            case RULE_FIXED_PT_LITERAL:
                {
                alt75=5;
                }
                break;
            case RULE_FLOATING_PT_LITERAL:
                {
                alt75=6;
                }
                break;
            case RULE_BOOLEAN_LITERAL:
                {
                alt75=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4883:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleliteral10763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4891:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleliteral10789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4899:10: this_HEX_LITERAL_2= RULE_HEX_LITERAL
                    {
                    this_HEX_LITERAL_2=(Token)match(input,RULE_HEX_LITERAL,FollowSets000.FOLLOW_RULE_HEX_LITERAL_in_ruleliteral10815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_LITERAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_LITERAL_2, grammarAccess.getLiteralAccess().getHEX_LITERALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4907:10: this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL
                    {
                    this_WIDE_STRING_LITERAL_3=(Token)match(input,RULE_WIDE_STRING_LITERAL,FollowSets000.FOLLOW_RULE_WIDE_STRING_LITERAL_in_ruleliteral10841); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_WIDE_STRING_LITERAL_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WIDE_STRING_LITERAL_3, grammarAccess.getLiteralAccess().getWIDE_STRING_LITERALTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4915:10: this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL
                    {
                    this_FIXED_PT_LITERAL_4=(Token)match(input,RULE_FIXED_PT_LITERAL,FollowSets000.FOLLOW_RULE_FIXED_PT_LITERAL_in_ruleliteral10867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FIXED_PT_LITERAL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FIXED_PT_LITERAL_4, grammarAccess.getLiteralAccess().getFIXED_PT_LITERALTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4923:10: this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL
                    {
                    this_FLOATING_PT_LITERAL_5=(Token)match(input,RULE_FLOATING_PT_LITERAL,FollowSets000.FOLLOW_RULE_FLOATING_PT_LITERAL_in_ruleliteral10893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOATING_PT_LITERAL_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOATING_PT_LITERAL_5, grammarAccess.getLiteralAccess().getFLOATING_PT_LITERALTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4931:10: this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL
                    {
                    this_BOOLEAN_LITERAL_6=(Token)match(input,RULE_BOOLEAN_LITERAL,FollowSets000.FOLLOW_RULE_BOOLEAN_LITERAL_in_ruleliteral10919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_LITERAL_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_LITERAL_6, grammarAccess.getLiteralAccess().getBOOLEAN_LITERALTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleliteral"


    // $ANTLR start "ruleparam_attribute"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4946:1: ruleparam_attribute returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleparam_attribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4948:28: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4949:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4949:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt76=1;
                }
                break;
            case 70:
                {
                alt76=2;
                }
                break;
            case 71:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4949:2: (enumLiteral_0= 'in' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4949:2: (enumLiteral_0= 'in' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4949:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleparam_attribute10978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4955:6: (enumLiteral_1= 'out' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4955:6: (enumLiteral_1= 'out' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4955:8: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleparam_attribute10995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4961:6: (enumLiteral_2= 'inout' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4961:6: (enumLiteral_2= 'inout' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4961:8: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleparam_attribute11012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_INOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getParam_attributeAccess().getPARAM_INOUTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparam_attribute"


    // $ANTLR start "rulefloat_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4971:1: rulefloat_type returns [Enumerator current=null] : (enumLiteral_0= 'float' ) ;
    public final Enumerator rulefloat_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4973:28: ( (enumLiteral_0= 'float' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4974:1: (enumLiteral_0= 'float' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4974:1: (enumLiteral_0= 'float' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4974:3: enumLiteral_0= 'float'
            {
            enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_rulefloat_type11056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getFloat_typeAccess().getPK_FLOATEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getFloat_typeAccess().getPK_FLOATEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat_type"


    // $ANTLR start "ruledouble_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4984:1: ruledouble_type returns [Enumerator current=null] : (enumLiteral_0= 'double' ) ;
    public final Enumerator ruledouble_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4986:28: ( (enumLiteral_0= 'double' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4987:1: (enumLiteral_0= 'double' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4987:1: (enumLiteral_0= 'double' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4987:3: enumLiteral_0= 'double'
            {
            enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruledouble_type11099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getDouble_typeAccess().getPK_DOUBLEEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getDouble_typeAccess().getPK_DOUBLEEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledouble_type"


    // $ANTLR start "ruleshort_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4997:1: ruleshort_type returns [Enumerator current=null] : (enumLiteral_0= 'short' ) ;
    public final Enumerator ruleshort_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4999:28: ( (enumLiteral_0= 'short' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5000:1: (enumLiteral_0= 'short' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5000:1: (enumLiteral_0= 'short' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5000:3: enumLiteral_0= 'short'
            {
            enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleshort_type11142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getShort_typeAccess().getPK_SHORTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getShort_typeAccess().getPK_SHORTEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleshort_type"


    // $ANTLR start "rulelong_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5010:1: rulelong_type returns [Enumerator current=null] : (enumLiteral_0= 'long' ) ;
    public final Enumerator rulelong_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5012:28: ( (enumLiteral_0= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5013:1: (enumLiteral_0= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5013:1: (enumLiteral_0= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5013:3: enumLiteral_0= 'long'
            {
            enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_rulelong_type11185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLong_typeAccess().getPK_LONGEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLong_typeAccess().getPK_LONGEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelong_type"


    // $ANTLR start "rulechar_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5023:1: rulechar_type returns [Enumerator current=null] : (enumLiteral_0= 'char' ) ;
    public final Enumerator rulechar_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5025:28: ( (enumLiteral_0= 'char' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5026:1: (enumLiteral_0= 'char' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5026:1: (enumLiteral_0= 'char' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5026:3: enumLiteral_0= 'char'
            {
            enumLiteral_0=(Token)match(input,73,FollowSets000.FOLLOW_73_in_rulechar_type11228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getChar_typeAccess().getPK_CHAREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getChar_typeAccess().getPK_CHAREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechar_type"


    // $ANTLR start "rulewide_char_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5036:1: rulewide_char_type returns [Enumerator current=null] : (enumLiteral_0= 'wchar' ) ;
    public final Enumerator rulewide_char_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5038:28: ( (enumLiteral_0= 'wchar' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5039:1: (enumLiteral_0= 'wchar' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5039:1: (enumLiteral_0= 'wchar' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5039:3: enumLiteral_0= 'wchar'
            {
            enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulewide_char_type11271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getWide_char_typeAccess().getPK_WCHAREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getWide_char_typeAccess().getPK_WCHAREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewide_char_type"


    // $ANTLR start "rulestring_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5049:1: rulestring_type returns [Enumerator current=null] : (enumLiteral_0= 'string' ) ;
    public final Enumerator rulestring_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5051:28: ( (enumLiteral_0= 'string' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5052:1: (enumLiteral_0= 'string' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5052:1: (enumLiteral_0= 'string' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5052:3: enumLiteral_0= 'string'
            {
            enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulestring_type11314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getString_typeAccess().getPK_STRINGEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getString_typeAccess().getPK_STRINGEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestring_type"


    // $ANTLR start "rulewide_string_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5062:1: rulewide_string_type returns [Enumerator current=null] : (enumLiteral_0= 'wstring' ) ;
    public final Enumerator rulewide_string_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5064:28: ( (enumLiteral_0= 'wstring' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5065:1: (enumLiteral_0= 'wstring' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5065:1: (enumLiteral_0= 'wstring' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5065:3: enumLiteral_0= 'wstring'
            {
            enumLiteral_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_rulewide_string_type11357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getWide_string_typeAccess().getPK_WSTRINGEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getWide_string_typeAccess().getPK_WSTRINGEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewide_string_type"


    // $ANTLR start "ruleboolean_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5075:1: ruleboolean_type returns [Enumerator current=null] : (enumLiteral_0= 'boolean' ) ;
    public final Enumerator ruleboolean_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5077:28: ( (enumLiteral_0= 'boolean' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5078:1: (enumLiteral_0= 'boolean' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5078:1: (enumLiteral_0= 'boolean' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5078:3: enumLiteral_0= 'boolean'
            {
            enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleboolean_type11400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getBoolean_typeAccess().getPK_BOOLEANEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getBoolean_typeAccess().getPK_BOOLEANEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolean_type"


    // $ANTLR start "ruleoctet_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5088:1: ruleoctet_type returns [Enumerator current=null] : (enumLiteral_0= 'octet' ) ;
    public final Enumerator ruleoctet_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5090:28: ( (enumLiteral_0= 'octet' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5091:1: (enumLiteral_0= 'octet' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5091:1: (enumLiteral_0= 'octet' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5091:3: enumLiteral_0= 'octet'
            {
            enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleoctet_type11443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getOctet_typeAccess().getPK_OCTETEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getOctet_typeAccess().getPK_OCTETEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoctet_type"


    // $ANTLR start "ruleany_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5101:1: ruleany_type returns [Enumerator current=null] : (enumLiteral_0= 'any' ) ;
    public final Enumerator ruleany_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5103:28: ( (enumLiteral_0= 'any' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5104:1: (enumLiteral_0= 'any' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5104:1: (enumLiteral_0= 'any' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5104:3: enumLiteral_0= 'any'
            {
            enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleany_type11486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAny_typeAccess().getPK_ANYEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAny_typeAccess().getPK_ANYEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleany_type"


    // $ANTLR start "ruleobject_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5114:1: ruleobject_type returns [Enumerator current=null] : (enumLiteral_0= 'Object' ) ;
    public final Enumerator ruleobject_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5116:28: ( (enumLiteral_0= 'Object' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5117:1: (enumLiteral_0= 'Object' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5117:1: (enumLiteral_0= 'Object' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5117:3: enumLiteral_0= 'Object'
            {
            enumLiteral_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleobject_type11529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getObject_typeAccess().getPK_OBJREFEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getObject_typeAccess().getPK_OBJREFEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleobject_type"


    // $ANTLR start "rulevoid_type"
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5127:1: rulevoid_type returns [Enumerator current=null] : (enumLiteral_0= 'void' ) ;
    public final Enumerator rulevoid_type() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5129:28: ( (enumLiteral_0= 'void' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5130:1: (enumLiteral_0= 'void' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5130:1: (enumLiteral_0= 'void' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5130:3: enumLiteral_0= 'void'
            {
            enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_rulevoid_type11572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getVoid_typeAccess().getPK_VOIDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getVoid_typeAccess().getPK_VOIDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevoid_type"

    // $ANTLR start synpred51_InternalIDL
    public final void synpred51_InternalIDL_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        EObject lv_containedType_1_0 = null;


        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:2: ( (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:2: (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:2: (otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1787:4: otherlv_0= 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) )
        {
        otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_synpred51_InternalIDL3867); if (state.failed) return ;
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1791:1: ( (lv_containedType_1_0= rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1792:1: (lv_containedType_1_0= rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1792:1: (lv_containedType_1_0= rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1793:3: lv_containedType_1_0= rulearray_type_spec
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred51_InternalIDL3888);
        lv_containedType_1_0=rulearray_type_spec();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred51_InternalIDL

    // $ANTLR start synpred61_InternalIDL
    public final void synpred61_InternalIDL_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_containedType_0_0 = null;


        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:2: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:3: ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2229:3: ( (lv_containedType_0_0= rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2230:1: (lv_containedType_0_0= rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2230:1: (lv_containedType_0_0= rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2231:3: lv_containedType_0_0= rulearray_type_spec
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMemberAccess().getContainedTypeArray_type_specParserRuleCall_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred61_InternalIDL4856);
        lv_containedType_0_0=rulearray_type_spec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred61_InternalIDL4868); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred61_InternalIDL

    // $ANTLR start synpred62_InternalIDL
    public final void synpred62_InternalIDL_fragment() throws RecognitionException {   
        Token lv_identifier_3_0=null;
        Token otherlv_4=null;
        EObject lv_containedType_2_0 = null;


        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:6: ( ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:7: ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2252:7: ( (lv_containedType_2_0= rulesimple_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2253:1: (lv_containedType_2_0= rulesimple_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2253:1: (lv_containedType_2_0= rulesimple_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2254:3: lv_containedType_2_0= rulesimple_type_spec
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMemberAccess().getContainedTypeSimple_type_specParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_synpred62_InternalIDL4897);
        lv_containedType_2_0=rulesimple_type_spec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2270:2: ( (lv_identifier_3_0= RULE_ID ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2271:1: (lv_identifier_3_0= RULE_ID )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2271:1: (lv_identifier_3_0= RULE_ID )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2272:3: lv_identifier_3_0= RULE_ID
        {
        lv_identifier_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred62_InternalIDL4914); if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred62_InternalIDL4931); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred62_InternalIDL

    // $ANTLR start synpred71_InternalIDL
    public final void synpred71_InternalIDL_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_isDefault_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_label_1_0 = null;

        EObject lv_containedType_5_0 = null;


        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:2: ( ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:2: ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:2: ( ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:3: ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) otherlv_6= ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:3: ( (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' ) | ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' ) )+
        int cnt93=0;
        loop93:
        do {
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==43) ) {
                alt93=1;
            }
            else if ( (LA93_0==44) ) {
                alt93=2;
            }


            switch (alt93) {
        	case 1 :
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:4: (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:4: (otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':' )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2611:6: otherlv_0= 'case' ( (lv_label_1_0= ruleconst_exp ) ) otherlv_2= ':'
        	    {
        	    otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_synpred71_InternalIDL5594); if (state.failed) return ;
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2615:1: ( (lv_label_1_0= ruleconst_exp ) )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2616:1: (lv_label_1_0= ruleconst_exp )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2616:1: (lv_label_1_0= ruleconst_exp )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2617:3: lv_label_1_0= ruleconst_exp
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_0_0_0_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_synpred71_InternalIDL5615);
        	    lv_label_1_0=ruleconst_exp();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred71_InternalIDL5627); if (state.failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:6: ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:6: ( ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':' )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:7: ( (lv_isDefault_3_0= 'default' ) ) otherlv_4= ':'
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:7: ( (lv_isDefault_3_0= 'default' ) )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2639:1: (lv_isDefault_3_0= 'default' )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2639:1: (lv_isDefault_3_0= 'default' )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2640:3: lv_isDefault_3_0= 'default'
        	    {
        	    lv_isDefault_3_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_synpred71_InternalIDL5653); if (state.failed) return ;

        	    }


        	    }

        	    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_synpred71_InternalIDL5678); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt93 >= 1 ) break loop93;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(93, input);
                    throw eee;
            }
            cnt93++;
        } while (true);

        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2657:4: ( (lv_containedType_5_0= rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2658:1: (lv_containedType_5_0= rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2658:1: (lv_containedType_5_0= rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2659:3: lv_containedType_5_0= rulearray_type_spec
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred71_InternalIDL5702);
        lv_containedType_5_0=rulearray_type_spec();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred71_InternalIDL5714); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred71_InternalIDL

    // Delegated rules

    public final boolean synpred61_InternalIDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalIDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalIDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalIDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalIDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalIDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalIDL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalIDL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\22\3\uffff\2\27\1\5\1\uffff\1\21\2\uffff";
    static final String DFA3_maxS =
        "\1\56\3\uffff\2\27\1\5\1\uffff\1\30\2\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\6\1\uffff\1\5\1\4";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\7\2\uffff\1\4\1\5\1\6\13\uffff\1\3\2\1\2\uffff\2\1\3\uffff\1\1\1\2",
            "",
            "",
            "",
            "\1\6",
            "\1\6",
            "\1\10",
            "",
            "\1\11\1\uffff\1\12\4\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "196:1: ( (this_type_decl_0= ruletype_decl otherlv_1= ';' ) | (this_const_decl_2= ruleconst_decl otherlv_3= ';' ) | (this_except_decl_4= ruleexcept_decl otherlv_5= ';' ) | (this_interface_decl_6= ruleinterface_decl otherlv_7= ';' ) | (this_interface_fwd_8= ruleinterface_fwd otherlv_9= ';' ) | (this_module_10= rulemodule otherlv_11= ';' ) )";
        }
    }
    static final String DFA25_eotS =
        "\31\uffff";
    static final String DFA25_eofS =
        "\21\uffff\1\26\7\uffff";
    static final String DFA25_minS =
        "\1\37\1\40\3\5\1\66\13\5\1\21\4\5\2\uffff\1\5";
    static final String DFA25_maxS =
        "\1\37\1\40\1\116\1\5\1\67\1\71\13\5\1\35\2\5\1\66\1\5\2\uffff\1\5";
    static final String DFA25_acceptS =
        "\26\uffff\1\2\1\1\1\uffff";
    static final String DFA25_specialS =
        "\31\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\2",
            "\1\20\55\uffff\1\12\1\13\1\uffff\1\4\1\7\1\5\1\3\16\uffff\1\6\1\10\1\11\1\14\1\15\1\16\1\17",
            "\1\21",
            "\1\21\60\uffff\1\23\1\22",
            "\1\24\2\uffff\1\25",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\26\13\uffff\1\27",
            "\1\21",
            "\1\21",
            "\1\21\60\uffff\1\30",
            "\1\21",
            "",
            "",
            "\1\21"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1130:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) otherlv_1= 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) otherlv_5= 'raises' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) otherlv_12= 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( (otherlv_14= RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )";
        }
    }
    static final String DFA33_eotS =
        "\30\uffff";
    static final String DFA33_eofS =
        "\20\uffff\1\26\7\uffff";
    static final String DFA33_minS =
        "\1\40\3\5\1\66\13\5\1\21\4\5\2\uffff\1\5";
    static final String DFA33_maxS =
        "\1\40\1\116\1\5\1\67\1\71\13\5\1\42\2\5\1\66\1\5\2\uffff\1\5";
    static final String DFA33_acceptS =
        "\25\uffff\1\1\1\2\1\uffff";
    static final String DFA33_specialS =
        "\30\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1",
            "\1\17\55\uffff\1\11\1\12\1\uffff\1\3\1\6\1\4\1\2\16\uffff\1\5\1\7\1\10\1\13\1\14\1\15\1\16",
            "\1\20",
            "\1\20\60\uffff\1\22\1\21",
            "\1\23\2\uffff\1\24",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\26\17\uffff\2\25",
            "\1\20",
            "\1\20",
            "\1\20\60\uffff\1\27",
            "\1\20",
            "",
            "",
            "\1\20"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1344:1: ( (otherlv_0= 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( (otherlv_2= RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( (otherlv_4= 'getraises' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ')' (otherlv_10= 'setraises' otherlv_11= '(' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )? ) | (otherlv_16= 'setraises' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ')' ) ) ) | (otherlv_22= 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( (otherlv_24= RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )";
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\6\uffff\2\11\3\uffff";
    static final String DFA35_minS =
        "\1\44\1\uffff\2\5\2\uffff\2\21\3\uffff";
    static final String DFA35_maxS =
        "\1\55\1\uffff\2\5\2\uffff\1\23\1\52\3\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\2\1\6\1\3";
    static final String DFA35_specialS =
        "\13\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\5\1\1\2\uffff\1\2\1\3\3\uffff\1\4",
            "",
            "\1\6",
            "\1\7",
            "",
            "",
            "\1\11\1\uffff\1\10",
            "\1\11\30\uffff\1\12",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1694:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | (otherlv_4= 'native' this_ID_5= RULE_ID ) | ruleconstr_forward_decl )";
        }
    }
    static final String DFA44_eotS =
        "\25\uffff";
    static final String DFA44_eofS =
        "\25\uffff";
    static final String DFA44_minS =
        "\1\5\20\0\4\uffff";
    static final String DFA44_maxS =
        "\1\116\20\0\4\uffff";
    static final String DFA44_acceptS =
        "\21\uffff\1\3\1\1\1\2\1\4";
    static final String DFA44_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\4\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\20\42\uffff\1\21\7\uffff\1\16\2\uffff\1\10\1\11\1\17\1\2\1\5\1\3\1\1\16\uffff\1\4\1\6\1\7\1\12\1\13\1\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "2229:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) otherlv_1= ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) otherlv_4= ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( ( (otherlv_8= RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) otherlv_10= ';' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_2 = input.LA(1);

                         
                        int index44_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_3 = input.LA(1);

                         
                        int index44_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_4 = input.LA(1);

                         
                        int index44_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_8 = input.LA(1);

                         
                        int index44_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA44_14 = input.LA(1);

                         
                        int index44_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA44_15 = input.LA(1);

                         
                        int index44_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (synpred62_InternalIDL()) ) {s = 19;}

                         
                        input.seek(index44_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA44_16 = input.LA(1);

                         
                        int index44_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalIDL()) ) {s = 18;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index44_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\12\uffff";
    static final String DFA60_eofS =
        "\2\uffff\1\4\3\uffff\1\11\3\uffff";
    static final String DFA60_minS =
        "\1\66\1\uffff\1\5\1\66\2\uffff\1\5\3\uffff";
    static final String DFA60_maxS =
        "\1\71\1\uffff\1\66\1\71\2\uffff\1\66\3\uffff";
    static final String DFA60_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff\1\4\1\6\1\5";
    static final String DFA60_specialS =
        "\12\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\1\uffff\1\3\1\1",
            "",
            "\1\4\23\uffff\1\4\2\uffff\1\4\25\uffff\1\4\3\uffff\1\5",
            "\1\6\2\uffff\1\7",
            "",
            "",
            "\1\11\23\uffff\1\11\2\uffff\1\11\25\uffff\1\11\3\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3601:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulespecification_in_entryRulespecification81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulespecification91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinclude_decl_in_rulespecification149 = new BitSet(new long[]{0x0000633800E50002L});
        public static final BitSet FOLLOW_ruledefinition_in_rulespecification171 = new BitSet(new long[]{0x0000633800E40002L});
        public static final BitSet FOLLOW_ruleinclude_decl_in_entryRuleinclude_decl208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinclude_decl218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleinclude_decl255 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleinclude_decl272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledefinition_in_entryRuledefinition313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledefinition323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_ruledefinition374 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_ruledefinition418 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_ruledefinition462 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_decl_in_ruledefinition506 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_fwd_in_ruledefinition550 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemodule_in_ruledefinition594 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemodule_in_entryRulemodule642 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemodule652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rulemodule689 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemodule706 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulemodule723 = new BitSet(new long[]{0x0000633800F60000L});
        public static final BitSet FOLLOW_ruledefinition_in_rulemodule745 = new BitSet(new long[]{0x0000633800F60000L});
        public static final BitSet FOLLOW_17_in_rulemodule763 = new BitSet(new long[]{0x0000633800F60000L});
        public static final BitSet FOLLOW_20_in_rulemodule777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_decl_in_entryRuleinterface_decl813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinterface_decl823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleinterface_decl867 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleinterface_decl904 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleinterface_decl931 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl948 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_24_in_ruleinterface_decl966 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl990 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_25_in_ruleinterface_decl1003 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl1027 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_19_in_ruleinterface_decl1043 = new BitSet(new long[]{0x03D8633984120020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_ruleexport_in_ruleinterface_decl1065 = new BitSet(new long[]{0x03D8633984120020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_17_in_ruleinterface_decl1083 = new BitSet(new long[]{0x03D8633984120020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_20_in_ruleinterface_decl1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_fwd_in_entryRuleinterface_fwd1133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinterface_fwd1143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleinterface_fwd1181 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleinterface_fwd1199 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleinterface_fwd1213 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_fwd1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexport_in_entryRuleexport1271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleexport1281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_ruleexport1332 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_ruleexport1376 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_ruleexport1420 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_decl_in_ruleexport1464 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_decl_in_ruleexport1508 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_decl_in_entryRuleop_decl1556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleop_decl1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleop_decl1609 = new BitSet(new long[]{0x03D8000000000020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_ruleop_type_spec_in_ruleop_decl1645 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1675 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1693 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1710 = new BitSet(new long[]{0x0000000010000000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleparam_decl_in_ruleop_decl1732 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1745 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleparam_decl_in_ruleop_decl1766 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1782 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_29_in_ruleop_decl1795 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1807 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1831 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1844 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1868 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1882 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleop_decl1897 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1909 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleop_decl1926 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1944 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleop_decl1961 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_type_spec_in_entryRuleop_type_spec2018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleop_type_spec2028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleop_type_spec2078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevoid_type_in_ruleop_type_spec2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleparam_decl_in_entryRuleparam_decl2154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleparam_decl2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleparam_attribute_in_ruleparam_decl2210 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleparam_decl2232 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleparam_decl2262 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleparam_decl2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_decl_in_entryRuleattr_decl2321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleattr_decl2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereadonly_attr_spec_in_ruleattr_decl2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_spec_in_ruleattr_decl2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereadonly_attr_spec_in_entryRulereadonly_attr_spec2446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulereadonly_attr_spec2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulereadonly_attr_spec2500 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulereadonly_attr_spec2525 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2547 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2577 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2595 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulereadonly_attr_spec2612 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulereadonly_attr_spec2624 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2648 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_rulereadonly_attr_spec2661 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2685 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_rulereadonly_attr_spec2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulereadonly_attr_spec2725 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulereadonly_attr_spec2750 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2772 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2802 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_spec_in_entryRuleattr_spec2862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleattr_spec2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleattr_spec2910 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleattr_spec2932 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2962 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2980 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleattr_spec2999 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec3011 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3035 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec3048 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3072 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec3086 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleattr_spec3099 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec3111 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3135 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec3148 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3172 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleattr_spec3208 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec3220 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3244 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec3257 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3281 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec3295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleattr_spec3317 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleattr_spec3339 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3369 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_entryRuleexcept_decl3429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleexcept_decl3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleexcept_decl3476 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleexcept_decl3493 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleexcept_decl3510 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulemember_in_ruleexcept_decl3531 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_20_in_ruleexcept_decl3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_entryRuletype_decl3580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletype_decl3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulealias_type_in_ruletype_decl3640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_ruletype_decl3670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunion_type_in_ruletype_decl3700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_ruletype_decl3730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruletype_decl3748 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruletype_decl3759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstr_forward_decl_in_ruletype_decl3784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulealias_type_in_entryRulealias_type3819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulealias_type3829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulealias_type3867 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulealias_type3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulealias_type3908 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulealias_type3930 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulealias_type3960 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulealias_type3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_entryRulearray_type_spec4020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulearray_type_spec4030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulearray_type_spec4077 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulearray_type_spec4107 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulearray_type_spec4125 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_rulearray_type_spec4143 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulearray_type_spec4164 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulearray_type_spec4176 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_entryRulesimple_type_spec4214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesimple_type_spec4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulesimple_type_spec4274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletemplate_type_spec_in_rulesimple_type_spec4304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_entryRulebase_type_spec4339 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebase_type_spec4349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_rulebase_type_spec4399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleobject_type_in_rulebase_type_spec4425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletemplate_type_spec_in_entryRuletemplate_type_spec4461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletemplate_type_spec4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesequence_type_in_ruletemplate_type_spec4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_ruletemplate_type_spec4551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_ruletemplate_type_spec4581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_type_in_ruletemplate_type_spec4611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_entryRulestruct_type4648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulestruct_type4658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulestruct_type4695 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulestruct_type4712 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulestruct_type4729 = new BitSet(new long[]{0x03F9010000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulemember_in_rulestruct_type4750 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_20_in_rulestruct_type4763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemember_in_entryRulemember4799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemember4809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulemember4856 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulemember4897 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4914 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_rulemember4960 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4977 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember5026 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember5043 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunion_type_in_entryRuleunion_type5097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunion_type5107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleunion_type5144 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleunion_type5161 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleunion_type5178 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleunion_type5190 = new BitSet(new long[]{0x0340200000000020L,0x0000000000000A00L});
        public static final BitSet FOLLOW_ruleswitch_type_spec_cont_in_ruleunion_type5212 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleunion_type5242 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleunion_type5255 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleunion_type5267 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_rulecase_stmt_in_ruleunion_type5288 = new BitSet(new long[]{0x0000180000100000L});
        public static final BitSet FOLLOW_20_in_ruleunion_type5301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleswitch_type_spec_cont_in_entryRuleswitch_type_spec_cont5337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleswitch_type_spec_cont5347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_ruleswitch_type_spec_cont5397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulechar_type_in_ruleswitch_type_spec_cont5436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolean_type_in_ruleswitch_type_spec_cont5477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_ruleswitch_type_spec_cont5509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecase_stmt_in_entryRulecase_stmt5544 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecase_stmt5554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulecase_stmt5594 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulecase_stmt5615 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5627 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_rulecase_stmt5653 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5678 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulecase_stmt5702 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulecase_stmt5714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulecase_stmt5736 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulecase_stmt5757 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5769 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_rulecase_stmt5795 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5820 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulecase_stmt5845 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulecase_stmt5875 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulecase_stmt5893 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulecase_stmt5910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_entryRuleenum_type5947 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleenum_type5957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleenum_type5994 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleenum_type6011 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleenum_type6028 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleenum_member_in_ruleenum_type6049 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_25_in_ruleenum_type6062 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleenum_member_in_ruleenum_type6083 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_20_in_ruleenum_type6097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_member_in_entryRuleenum_member6133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleenum_member6143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleenum_member6184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstr_forward_decl_in_entryRuleconstr_forward_decl6225 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconstr_forward_decl6236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleconstr_forward_decl6275 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstr_forward_decl6290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleconstr_forward_decl6316 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstr_forward_decl6331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_entryRuleconst_decl6377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_decl6387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleconst_decl6424 = new BitSet(new long[]{0x03F8000000000020L,0x0000000000003F00L});
        public static final BitSet FOLLOW_ruleconst_type_in_ruleconst_decl6446 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconst_decl6476 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconst_decl6494 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleconst_decl6511 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_ruleconst_decl6532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_type_in_entryRuleconst_type6568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_type6578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_ruleconst_type6628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_ruleconst_type6658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_ruleconst_type6688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_const_type_in_ruleconst_type6718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_entryRuleprimitive_def6753 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleprimitive_def6763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_ruleprimitive_def6813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloating_pt_type_in_ruleprimitive_def6843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecharstr_type_in_ruleprimitive_def6873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleother_type_in_ruleprimitive_def6903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesequence_type_in_entryRulesequence_type6938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesequence_type6948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulesequence_type6985 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulesequence_type6997 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulesequence_type7019 = new BitSet(new long[]{0x0004000002000000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulesequence_type7049 = new BitSet(new long[]{0x0004000002000000L});
        public static final BitSet FOLLOW_25_in_rulesequence_type7063 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulesequence_type7084 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulesequence_type7098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_entryRulestringdef_type7134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulestringdef_type7144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulestringdef_type7181 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulestringdef_type7193 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulestringdef_type7214 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulestringdef_type7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_entryRulewide_stringdef_type7262 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulewide_stringdef_type7272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulewide_stringdef_type7309 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulewide_stringdef_type7321 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulewide_stringdef_type7342 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulewide_stringdef_type7354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_type_in_entryRulefixed_pt_type7390 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefixed_pt_type7400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulefixed_pt_type7437 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulefixed_pt_type7449 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulefixed_pt_type7470 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulefixed_pt_type7482 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulefixed_pt_type7503 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulefixed_pt_type7515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloating_pt_type_in_entryRulefloating_pt_type7551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefloating_pt_type7561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloat_type_in_rulefloating_pt_type7607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledouble_type_in_rulefloating_pt_type7634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelongdouble_type_in_rulefloating_pt_type7661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelongdouble_type_in_entryRulelongdouble_type7698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulelongdouble_type7709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelongdouble_type7747 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_rulelongdouble_type7760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_entryRuleinteger_type7800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinteger_type7810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleshort_type_in_ruleinteger_type7856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelong_type_in_ruleinteger_type7883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelonglong_type_in_ruleinteger_type7910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleushort_type_in_ruleinteger_type7937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulong_type_in_ruleinteger_type7964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulonglong_type_in_ruleinteger_type7991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelonglong_type_in_entryRulelonglong_type8028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulelonglong_type8039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelonglong_type8077 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_rulelonglong_type8090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleushort_type_in_entryRuleushort_type8131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleushort_type8142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleushort_type8180 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleushort_type8193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulong_type_in_entryRuleulong_type8234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleulong_type8245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleulong_type8283 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulong_type8296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulonglong_type_in_entryRuleulonglong_type8337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleulonglong_type8348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleulonglong_type8386 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulonglong_type8399 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulonglong_type8412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecharstr_type_in_entryRulecharstr_type8452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecharstr_type8462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulechar_type_in_rulecharstr_type8508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_char_type_in_rulecharstr_type8535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestring_type_in_rulecharstr_type8562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_string_type_in_rulecharstr_type8589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleother_type_in_entryRuleother_type8625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleother_type8635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolean_type_in_ruleother_type8681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoctet_type_in_ruleother_type8708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleany_type_in_ruleother_type8735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_const_type_in_entryRulefixed_pt_const_type8771 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefixed_pt_const_type8781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulefixed_pt_const_type8830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_exp_in_entryRuleconst_exp8866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_exp8876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleor_expr_in_ruleconst_exp8925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleor_expr_in_entryRuleor_expr8959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleor_expr8969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulexor_expr_in_ruleor_expr9019 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleor_expr9049 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_rulexor_expr_in_ruleor_expr9083 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_rulexor_expr_in_entryRulexor_expr9121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulexor_expr9131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleand_expr_in_rulexor_expr9181 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_rulexor_expr9211 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleand_expr_in_rulexor_expr9245 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_ruleand_expr_in_entryRuleand_expr9283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleand_expr9293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleshift_expr_in_ruleand_expr9343 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleand_expr9373 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleshift_expr_in_ruleand_expr9407 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleshift_expr_in_entryRuleshift_expr9445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleshift_expr9455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleadd_expr_in_ruleshift_expr9505 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleshift_expr9537 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_62_in_ruleshift_expr9566 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleadd_expr_in_ruleshift_expr9603 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_ruleadd_expr_in_entryRuleadd_expr9641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleadd_expr9651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemult_expr_in_ruleadd_expr9701 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_63_in_ruleadd_expr9733 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_64_in_ruleadd_expr9762 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_rulemult_expr_in_ruleadd_expr9799 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_rulemult_expr_in_entryRulemult_expr9837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemult_expr9847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_expr_in_rulemult_expr9897 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
        public static final BitSet FOLLOW_65_in_rulemult_expr9929 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_66_in_rulemult_expr9958 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_67_in_rulemult_expr9987 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleunary_expr_in_rulemult_expr10024 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
        public static final BitSet FOLLOW_ruleunary_expr_in_entryRuleunary_expr10062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunary_expr10072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_operator_in_ruleunary_expr10131 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_ruleunary_expr10152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_ruleunary_expr10184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator10220 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator10231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleunary_operator10269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleunary_operator10288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleunary_operator10307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_entryRuleprimary_expr10347 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleprimary_expr10357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstantDefRef_in_ruleprimary_expr10407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalueExpression_in_ruleprimary_expr10437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleprimary_expr10455 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_ruleprimary_expr10480 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleprimary_expr10491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstantDefRef_in_entryRuleconstantDefRef10528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconstantDefRef10538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstantDefRef10586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalueExpression_in_entryRulevalueExpression10621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalueExpression10631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleliteral_in_rulevalueExpression10676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral10712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleliteral10723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleliteral10763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral10789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HEX_LITERAL_in_ruleliteral10815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WIDE_STRING_LITERAL_in_ruleliteral10841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FIXED_PT_LITERAL_in_ruleliteral10867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOATING_PT_LITERAL_in_ruleliteral10893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_LITERAL_in_ruleliteral10919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleparam_attribute10978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleparam_attribute10995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleparam_attribute11012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rulefloat_type11056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruledouble_type11099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleshort_type11142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelong_type11185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rulechar_type11228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulewide_char_type11271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulestring_type11314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulewide_string_type11357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleboolean_type11400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleoctet_type11443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleany_type11486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleobject_type11529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulevoid_type11572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_synpred51_InternalIDL3867 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred51_InternalIDL3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred61_InternalIDL4856 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred61_InternalIDL4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_synpred62_InternalIDL4897 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred62_InternalIDL4914 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred62_InternalIDL4931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_synpred71_InternalIDL5594 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_synpred71_InternalIDL5615 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred71_InternalIDL5627 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_synpred71_InternalIDL5653 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred71_InternalIDL5678 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred71_InternalIDL5702 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred71_InternalIDL5714 = new BitSet(new long[]{0x0000000000000002L});
    }


}