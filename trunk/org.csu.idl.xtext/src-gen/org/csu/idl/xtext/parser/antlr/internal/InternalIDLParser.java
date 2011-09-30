package org.csu.idl.xtext.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
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
    public static final int RULE_FIXED_PT_LITERAL=9;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_BOOLEAN_LITERAL=11;
    public static final int RULE_FLOATING_PT_LITERAL=10;
    public static final int RULE_WIDE_STRING_LITERAL=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_HEX_LITERAL=7;
    public static final int RULE_INT=6;
    public static final int RULE_WS=14;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;

        public InternalIDLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[250+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private IDLGrammarAccess grammarAccess;
     	
        public InternalIDLParser(TokenStream input, IAstFactory factory, IDLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/csu/idl/xtext/parser/antlr/internal/InternalIDL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "specification";	
       	}
       	
       	@Override
       	protected IDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRulespecification
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:84:1: entryRulespecification returns [EObject current=null] : iv_rulespecification= rulespecification EOF ;
    public final EObject entryRulespecification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulespecification = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:85:2: (iv_rulespecification= rulespecification EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:86:2: iv_rulespecification= rulespecification EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSpecificationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulespecification_in_entryRulespecification81);
            iv_rulespecification=rulespecification();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulespecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulespecification91); if (failed) return current;

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
    // $ANTLR end entryRulespecification


    // $ANTLR start rulespecification
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:93:1: rulespecification returns [EObject current=null] : ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* ) ;
    public final EObject rulespecification() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_1_0 = null;

        EObject lv_contains_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:98:6: ( ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:99:1: ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:99:1: ( () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:99:2: () ( (lv_includes_1_0= ruleinclude_decl ) )* ( (lv_contains_2_0= ruledefinition ) )*
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:99:2: ()
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:100:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSpecificationAccess().getTranslationUnitAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSpecificationAccess().getTranslationUnitAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:113:2: ( (lv_includes_1_0= ruleinclude_decl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:114:1: (lv_includes_1_0= ruleinclude_decl )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:114:1: (lv_includes_1_0= ruleinclude_decl )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:115:3: lv_includes_1_0= ruleinclude_decl
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getIncludesInclude_declParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleinclude_decl_in_rulespecification149);
            	    lv_includes_1_0=ruleinclude_decl();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"includes",
            	      	        		lv_includes_1_0, 
            	      	        		"include_decl", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:137:3: ( (lv_contains_2_0= ruledefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||(LA2_0>=21 && LA2_0<=23)||(LA2_0>=35 && LA2_0<=37)||(LA2_0>=40 && LA2_0<=41)||(LA2_0>=45 && LA2_0<=46)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:138:1: (lv_contains_2_0= ruledefinition )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:138:1: (lv_contains_2_0= ruledefinition )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:139:3: lv_contains_2_0= ruledefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSpecificationAccess().getContainsDefinitionParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruledefinition_in_rulespecification171);
            	    lv_contains_2_0=ruledefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSpecificationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"contains",
            	      	        		lv_contains_2_0, 
            	      	        		"definition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulespecification


    // $ANTLR start entryRuleinclude_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:169:1: entryRuleinclude_decl returns [EObject current=null] : iv_ruleinclude_decl= ruleinclude_decl EOF ;
    public final EObject entryRuleinclude_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinclude_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:170:2: (iv_ruleinclude_decl= ruleinclude_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:171:2: iv_ruleinclude_decl= ruleinclude_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInclude_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinclude_decl_in_entryRuleinclude_decl208);
            iv_ruleinclude_decl=ruleinclude_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleinclude_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinclude_decl218); if (failed) return current;

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
    // $ANTLR end entryRuleinclude_decl


    // $ANTLR start ruleinclude_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:178:1: ruleinclude_decl returns [EObject current=null] : ( '#include' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleinclude_decl() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:183:6: ( ( '#include' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:184:1: ( '#include' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:184:1: ( '#include' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:184:3: '#include' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleinclude_decl253); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInclude_declAccess().getIncludeKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:188:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:189:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:189:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:190:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleinclude_decl270); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInclude_declAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInclude_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importURI",
              	        		lv_importURI_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleinclude_decl


    // $ANTLR start entryRuledefinition
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:220:1: entryRuledefinition returns [EObject current=null] : iv_ruledefinition= ruledefinition EOF ;
    public final EObject entryRuledefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledefinition = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:221:2: (iv_ruledefinition= ruledefinition EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:222:2: iv_ruledefinition= ruledefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefinitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruledefinition_in_entryRuledefinition311);
            iv_ruledefinition=ruledefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruledefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuledefinition321); if (failed) return current;

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
    // $ANTLR end entryRuledefinition


    // $ANTLR start ruledefinition
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:229:1: ruledefinition returns [EObject current=null] : ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) ) ;
    public final EObject ruledefinition() throws RecognitionException {
        EObject current = null;

        EObject this_type_decl_0 = null;

        EObject this_const_decl_2 = null;

        EObject this_except_decl_4 = null;

        EObject this_interface_decl_6 = null;

        EObject this_interface_fwd_8 = null;

        EObject this_module_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:234:6: ( ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
            case 40:
            case 41:
            case 45:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==23) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==RULE_ID) ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8==17) ) {
                            alt3=5;
                        }
                        else if ( (LA3_8==19||LA3_8==24) ) {
                            alt3=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==23) ) {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==RULE_ID) ) {
                        int LA3_8 = input.LA(4);

                        if ( (LA3_8==17) ) {
                            alt3=5;
                        }
                        else if ( (LA3_8==19||LA3_8==24) ) {
                            alt3=4;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA3_6 = input.LA(2);

                if ( (LA3_6==RULE_ID) ) {
                    int LA3_8 = input.LA(3);

                    if ( (LA3_8==17) ) {
                        alt3=5;
                    }
                    else if ( (LA3_8==19||LA3_8==24) ) {
                        alt3=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 8, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("235:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_interface_decl_6= ruleinterface_decl ';' ) | (this_interface_fwd_8= ruleinterface_fwd ';' ) | (this_module_10= rulemodule ';' ) )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:235:2: (this_type_decl_0= ruletype_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:235:2: (this_type_decl_0= ruletype_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:236:2: this_type_decl_0= ruletype_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getType_declParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_ruledefinition372);
                    this_type_decl_0=ruletype_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_type_decl_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition381); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionAccess().getSemicolonKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:252:6: (this_const_decl_2= ruleconst_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:252:6: (this_const_decl_2= ruleconst_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:253:2: this_const_decl_2= ruleconst_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getConst_declParserRuleCall_1_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_ruledefinition414);
                    this_const_decl_2=ruleconst_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_const_decl_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition423); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionAccess().getSemicolonKeyword_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:269:6: (this_except_decl_4= ruleexcept_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:269:6: (this_except_decl_4= ruleexcept_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:270:2: this_except_decl_4= ruleexcept_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getExcept_declParserRuleCall_2_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_ruledefinition456);
                    this_except_decl_4=ruleexcept_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_except_decl_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition465); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionAccess().getSemicolonKeyword_2_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:286:6: (this_interface_decl_6= ruleinterface_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:286:6: (this_interface_decl_6= ruleinterface_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:287:2: this_interface_decl_6= ruleinterface_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getInterface_declParserRuleCall_3_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinterface_decl_in_ruledefinition498);
                    this_interface_decl_6=ruleinterface_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_interface_decl_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition507); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:303:6: (this_interface_fwd_8= ruleinterface_fwd ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:303:6: (this_interface_fwd_8= ruleinterface_fwd ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:304:2: this_interface_fwd_8= ruleinterface_fwd ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getInterface_fwdParserRuleCall_4_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinterface_fwd_in_ruledefinition540);
                    this_interface_fwd_8=ruleinterface_fwd();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_interface_fwd_8; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition549); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionAccess().getSemicolonKeyword_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:320:6: (this_module_10= rulemodule ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:320:6: (this_module_10= rulemodule ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:321:2: this_module_10= rulemodule ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionAccess().getModuleParserRuleCall_5_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulemodule_in_ruledefinition582);
                    this_module_10=rulemodule();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_module_10; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruledefinition591); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDefinitionAccess().getSemicolonKeyword_5_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruledefinition


    // $ANTLR start entryRulemodule
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:344:1: entryRulemodule returns [EObject current=null] : iv_rulemodule= rulemodule EOF ;
    public final EObject entryRulemodule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemodule = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:345:2: (iv_rulemodule= rulemodule EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:346:2: iv_rulemodule= rulemodule EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemodule_in_entryRulemodule628);
            iv_rulemodule=rulemodule();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemodule; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemodule638); if (failed) return current;

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
    // $ANTLR end entryRulemodule


    // $ANTLR start rulemodule
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:353:1: rulemodule returns [EObject current=null] : ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( ( (lv_contains_3_0= ruledefinition ) ) | ';' )* '}' ) ;
    public final EObject rulemodule() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_contains_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:358:6: ( ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( ( (lv_contains_3_0= ruledefinition ) ) | ';' )* '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:359:1: ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( ( (lv_contains_3_0= ruledefinition ) ) | ';' )* '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:359:1: ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( ( (lv_contains_3_0= ruledefinition ) ) | ';' )* '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:359:3: 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( ( (lv_contains_3_0= ruledefinition ) ) | ';' )* '}'
            {
            match(input,18,FollowSets000.FOLLOW_18_in_rulemodule673); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:363:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:364:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:364:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:365:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemodule690); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getModuleAccess().getIdentifierIDTerminalRuleCall_1_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_rulemodule705); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:391:1: ( ( (lv_contains_3_0= ruledefinition ) ) | ';' )*
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:391:2: ( (lv_contains_3_0= ruledefinition ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:391:2: ( (lv_contains_3_0= ruledefinition ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:1: (lv_contains_3_0= ruledefinition )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:1: (lv_contains_3_0= ruledefinition )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:393:3: lv_contains_3_0= ruledefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getContainsDefinitionParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruledefinition_in_rulemodule727);
            	    lv_contains_3_0=ruledefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"contains",
            	      	        		lv_contains_3_0, 
            	      	        		"definition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:416:7: ';'
            	    {
            	    match(input,17,FollowSets000.FOLLOW_17_in_rulemodule743); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getModuleAccess().getSemicolonKeyword_3_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_rulemodule755); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulemodule


    // $ANTLR start entryRuleinterface_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:432:1: entryRuleinterface_decl returns [EObject current=null] : iv_ruleinterface_decl= ruleinterface_decl EOF ;
    public final EObject entryRuleinterface_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:433:2: (iv_ruleinterface_decl= ruleinterface_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:434:2: iv_ruleinterface_decl= ruleinterface_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterface_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinterface_decl_in_entryRuleinterface_decl791);
            iv_ruleinterface_decl=ruleinterface_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleinterface_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinterface_decl801); if (failed) return current;

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
    // $ANTLR end entryRuleinterface_decl


    // $ANTLR start ruleinterface_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:441:1: ruleinterface_decl returns [EObject current=null] : ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( ( (lv_contains_9_0= ruleexport ) ) | ';' )* '}' ) ;
    public final EObject ruleinterface_decl() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token lv_isCustom_1_0=null;
        Token lv_identifier_3_0=null;
        EObject lv_contains_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:446:6: ( ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( ( (lv_contains_9_0= ruleexport ) ) | ';' )* '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:447:1: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( ( (lv_contains_9_0= ruleexport ) ) | ';' )* '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:447:1: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( ( (lv_contains_9_0= ruleexport ) ) | ';' )* '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:447:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( ( (lv_contains_9_0= ruleexport ) ) | ';' )* '}'
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:447:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )?
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:447:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:447:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:448:1: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:448:1: (lv_isAbstract_0_0= 'abstract' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:449:3: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleinterface_decl845); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_declAccess().getIsAbstractAbstractKeyword_0_0_0(), "isAbstract"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterface_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isAbstract", true, "abstract", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:469:6: ( (lv_isCustom_1_0= 'local' ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:469:6: ( (lv_isCustom_1_0= 'local' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:470:1: (lv_isCustom_1_0= 'local' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:470:1: (lv_isCustom_1_0= 'local' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:471:3: lv_isCustom_1_0= 'local'
                    {
                    lv_isCustom_1_0=(Token)input.LT(1);
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleinterface_decl882); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_declAccess().getIsCustomLocalKeyword_0_1_0(), "isCustom"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterface_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isCustom", true, "local", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleinterface_decl907); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterface_declAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:494:1: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:495:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:495:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:496:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl924); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterface_declAccess().getIdentifierIDTerminalRuleCall_2_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterface_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:518:2: ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:518:4: ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleinterface_decl940); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_declAccess().getColonKeyword_3_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:522:1: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:523:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:523:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:524:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getInterface_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl962); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getInterface_declAccess().getDerivesFromInterfaceDefCrossReference_3_1_0(), "derivesFrom"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:539:2: ( ',' ( ( RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:539:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleinterface_decl973); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterface_declAccess().getCommaKeyword_3_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:543:1: ( ( RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:544:1: ( RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:544:1: ( RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:545:3: RULE_ID
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterface_declRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl995); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		createLeafNode(grammarAccess.getInterface_declAccess().getDerivesFromInterfaceDefCrossReference_3_2_1_0(), "derivesFrom"); 
                    	      	
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

            match(input,19,FollowSets000.FOLLOW_19_in_ruleinterface_decl1009); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterface_declAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:564:1: ( ( (lv_contains_9_0= ruleexport ) ) | ';' )*
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:564:2: ( (lv_contains_9_0= ruleexport ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:564:2: ( (lv_contains_9_0= ruleexport ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:565:1: (lv_contains_9_0= ruleexport )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:565:1: (lv_contains_9_0= ruleexport )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:566:3: lv_contains_9_0= ruleexport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterface_declAccess().getContainsExportParserRuleCall_5_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleexport_in_ruleinterface_decl1031);
            	    lv_contains_9_0=ruleexport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInterface_declRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"contains",
            	      	        		lv_contains_9_0, 
            	      	        		"export", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:589:7: ';'
            	    {
            	    match(input,17,FollowSets000.FOLLOW_17_in_ruleinterface_decl1047); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInterface_declAccess().getSemicolonKeyword_5_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleinterface_decl1059); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterface_declAccess().getRightCurlyBracketKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleinterface_decl


    // $ANTLR start entryRuleinterface_fwd
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:605:1: entryRuleinterface_fwd returns [EObject current=null] : iv_ruleinterface_fwd= ruleinterface_fwd EOF ;
    public final EObject entryRuleinterface_fwd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_fwd = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:606:2: (iv_ruleinterface_fwd= ruleinterface_fwd EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:607:2: iv_ruleinterface_fwd= ruleinterface_fwd EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterface_fwdRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinterface_fwd_in_entryRuleinterface_fwd1095);
            iv_ruleinterface_fwd=ruleinterface_fwd();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleinterface_fwd; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinterface_fwd1105); if (failed) return current;

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
    // $ANTLR end entryRuleinterface_fwd


    // $ANTLR start ruleinterface_fwd
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:614:1: ruleinterface_fwd returns [EObject current=null] : ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ) ;
    public final EObject ruleinterface_fwd() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:619:6: ( ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:620:1: ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:620:1: ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:620:2: ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:620:2: ( 'abstract' | 'local' )?
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:620:4: 'abstract'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleinterface_fwd1141); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_fwdAccess().getAbstractKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:625:7: 'local'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleinterface_fwd1157); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_fwdAccess().getLocalKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleinterface_fwd1169); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterface_fwdAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:633:1: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:634:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:634:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:635:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_fwd1186); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterface_fwdAccess().getIdentifierIDTerminalRuleCall_2_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterface_fwdRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleinterface_fwd


    // $ANTLR start entryRuleexport
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:665:1: entryRuleexport returns [EObject current=null] : iv_ruleexport= ruleexport EOF ;
    public final EObject entryRuleexport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexport = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:666:2: (iv_ruleexport= ruleexport EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:667:2: iv_ruleexport= ruleexport EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExportRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleexport_in_entryRuleexport1227);
            iv_ruleexport=ruleexport();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleexport1237); if (failed) return current;

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
    // $ANTLR end entryRuleexport


    // $ANTLR start ruleexport
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:674:1: ruleexport returns [EObject current=null] : ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) ) ;
    public final EObject ruleexport() throws RecognitionException {
        EObject current = null;

        EObject this_type_decl_0 = null;

        EObject this_const_decl_2 = null;

        EObject this_except_decl_4 = null;

        EObject this_attr_decl_6 = null;

        EObject this_op_decl_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:679:6: ( ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:680:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:680:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("680:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:680:2: (this_type_decl_0= ruletype_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:680:2: (this_type_decl_0= ruletype_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:681:2: this_type_decl_0= ruletype_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getType_declParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_ruleexport1288);
                    this_type_decl_0=ruletype_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_type_decl_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1297); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:697:6: (this_const_decl_2= ruleconst_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:697:6: (this_const_decl_2= ruleconst_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:698:2: this_const_decl_2= ruleconst_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getConst_declParserRuleCall_1_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_ruleexport1330);
                    this_const_decl_2=ruleconst_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_const_decl_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1339); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:714:6: (this_except_decl_4= ruleexcept_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:714:6: (this_except_decl_4= ruleexcept_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:715:2: this_except_decl_4= ruleexcept_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getExcept_declParserRuleCall_2_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_ruleexport1372);
                    this_except_decl_4=ruleexcept_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_except_decl_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1381); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_2_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:731:6: (this_attr_decl_6= ruleattr_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:731:6: (this_attr_decl_6= ruleattr_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:732:2: this_attr_decl_6= ruleattr_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getAttr_declParserRuleCall_3_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleattr_decl_in_ruleexport1414);
                    this_attr_decl_6=ruleattr_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_attr_decl_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1423); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_3_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:748:6: (this_op_decl_8= ruleop_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:748:6: (this_op_decl_8= ruleop_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:749:2: this_op_decl_8= ruleop_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getOp_declParserRuleCall_4_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleop_decl_in_ruleexport1456);
                    this_op_decl_8=ruleop_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_op_decl_8; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1465); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_4_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleexport


    // $ANTLR start entryRuleop_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:772:1: entryRuleop_decl returns [EObject current=null] : iv_ruleop_decl= ruleop_decl EOF ;
    public final EObject entryRuleop_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleop_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:773:2: (iv_ruleop_decl= ruleop_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:774:2: iv_ruleop_decl= ruleop_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOp_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleop_decl_in_entryRuleop_decl1502);
            iv_ruleop_decl=ruleop_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleop_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleop_decl1512); if (failed) return current;

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
    // $ANTLR end entryRuleop_decl


    // $ANTLR start ruleop_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:781:1: ruleop_decl returns [EObject current=null] : ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? ) ;
    public final EObject ruleop_decl() throws RecognitionException {
        EObject current = null;

        Token lv_isOneway_0_0=null;
        Token lv_identifier_3_0=null;
        Token lv_contexts_17_0=null;
        Token lv_contexts_19_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:786:6: ( ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:787:1: ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:787:1: ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:787:2: ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )?
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:787:2: ( (lv_isOneway_0_0= 'oneway' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:788:1: (lv_isOneway_0_0= 'oneway' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:788:1: (lv_isOneway_0_0= 'oneway' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:789:3: lv_isOneway_0_0= 'oneway'
                    {
                    lv_isOneway_0_0=(Token)input.LT(1);
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleop_decl1555); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getIsOnewayOnewayKeyword_0_0(), "isOneway"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isOneway", true, "oneway", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:808:3: ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=51 && LA12_0<=52)||(LA12_0>=54 && LA12_0<=57)||(LA12_0>=72 && LA12_0<=79)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("808:3: ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:808:4: ( (lv_containedType_1_0= ruleop_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:808:4: ( (lv_containedType_1_0= ruleop_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:809:1: (lv_containedType_1_0= ruleop_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:809:1: (lv_containedType_1_0= ruleop_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:810:3: lv_containedType_1_0= ruleop_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOp_declAccess().getContainedTypeOp_type_specParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleop_type_spec_in_ruleop_decl1591);
                    lv_containedType_1_0=ruleop_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_1_0, 
                      	        		"op_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:833:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:833:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:834:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:834:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:835:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1619); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getOp_declAccess().getSharedTypeTypedefDefCrossReference_1_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:850:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:851:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:851:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:852:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1637); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getOp_declAccess().getIdentifierIDTerminalRuleCall_2_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1652); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:878:1: ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=69 && LA14_0<=71)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:878:2: ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )*
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:878:2: ( (lv_parameters_5_0= ruleparam_decl ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:879:1: (lv_parameters_5_0= ruleparam_decl )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:879:1: (lv_parameters_5_0= ruleparam_decl )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:880:3: lv_parameters_5_0= ruleparam_decl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOp_declAccess().getParametersParam_declParserRuleCall_4_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_ruleop_decl1674);
                    lv_parameters_5_0=ruleparam_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"parameters",
                      	        		lv_parameters_5_0, 
                      	        		"param_decl", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:902:2: ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:902:4: ',' ( (lv_parameters_7_0= ruleparam_decl ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1685); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOp_declAccess().getCommaKeyword_4_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:906:1: ( (lv_parameters_7_0= ruleparam_decl ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:907:1: (lv_parameters_7_0= ruleparam_decl )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:907:1: (lv_parameters_7_0= ruleparam_decl )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:908:3: lv_parameters_7_0= ruleparam_decl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOp_declAccess().getParametersParam_declParserRuleCall_4_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_ruleop_decl1706);
                    	    lv_parameters_7_0=ruleparam_decl();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"parameters",
                    	      	        		lv_parameters_7_0, 
                    	      	        		"param_decl", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1720); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOp_declAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:934:1: ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:934:3: 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleop_decl1731); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getRaisesKeyword_6_0(), null); 
                          
                    }
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1741); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_6_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:942:1: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:943:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:943:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:944:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1763); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getOp_declAccess().getCanRaiseExceptionDefCrossReference_6_2_0(), "canRaise"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:959:2: ( ',' ( ( RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==25) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:959:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1774); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOp_declAccess().getCommaKeyword_6_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:963:1: ( ( RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:964:1: ( RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:964:1: ( RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:965:3: RULE_ID
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1796); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		createLeafNode(grammarAccess.getOp_declAccess().getCanRaiseExceptionDefCrossReference_6_3_1_0(), "canRaise"); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1808); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getRightParenthesisKeyword_6_4(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:984:3: ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:984:5: 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleop_decl1821); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getContextKeyword_7_0(), null); 
                          
                    }
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1831); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_7_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:992:1: ( (lv_contexts_17_0= RULE_STRING ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:993:1: (lv_contexts_17_0= RULE_STRING )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:993:1: (lv_contexts_17_0= RULE_STRING )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:994:3: lv_contexts_17_0= RULE_STRING
                    {
                    lv_contexts_17_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleop_decl1848); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getOp_declAccess().getContextsSTRINGTerminalRuleCall_7_2_0(), "contexts"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"contexts",
                      	        		lv_contexts_17_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1016:2: ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1016:4: ',' ( (lv_contexts_19_0= RULE_STRING ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1864); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOp_declAccess().getCommaKeyword_7_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1020:1: ( (lv_contexts_19_0= RULE_STRING ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1021:1: (lv_contexts_19_0= RULE_STRING )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1021:1: (lv_contexts_19_0= RULE_STRING )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1022:3: lv_contexts_19_0= RULE_STRING
                    	    {
                    	    lv_contexts_19_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleop_decl1881); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      			createLeafNode(grammarAccess.getOp_declAccess().getContextsSTRINGTerminalRuleCall_7_3_1_0(), "contexts"); 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOp_declRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"contexts",
                    	      	        		lv_contexts_19_0, 
                    	      	        		"STRING", 
                    	      	        		lastConsumedNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1898); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getRightParenthesisKeyword_7_4(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleop_decl


    // $ANTLR start entryRuleop_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1056:1: entryRuleop_type_spec returns [EObject current=null] : iv_ruleop_type_spec= ruleop_type_spec EOF ;
    public final EObject entryRuleop_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleop_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1057:2: (iv_ruleop_type_spec= ruleop_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1058:2: iv_ruleop_type_spec= ruleop_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOp_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleop_type_spec_in_entryRuleop_type_spec1936);
            iv_ruleop_type_spec=ruleop_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleop_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleop_type_spec1946); if (failed) return current;

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
    // $ANTLR end entryRuleop_type_spec


    // $ANTLR start ruleop_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1065:1: ruleop_type_spec returns [EObject current=null] : (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) ) ;
    public final EObject ruleop_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_base_type_spec_0 = null;

        Enumerator lv_kind_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1070:6: ( (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1071:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1071:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=51 && LA19_0<=52)||(LA19_0>=54 && LA19_0<=57)||(LA19_0>=72 && LA19_0<=78)) ) {
                alt19=1;
            }
            else if ( (LA19_0==79) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1071:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1072:2: this_base_type_spec_0= rulebase_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOp_type_specAccess().getBase_type_specParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleop_type_spec1996);
                    this_base_type_spec_0=rulebase_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_base_type_spec_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1084:6: ( () ( (lv_kind_2_0= rulevoid_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1084:6: ( () ( (lv_kind_2_0= rulevoid_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1084:7: () ( (lv_kind_2_0= rulevoid_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1084:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1085:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOp_type_specAccess().getPrimitiveDefAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOp_type_specAccess().getPrimitiveDefAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1098:2: ( (lv_kind_2_0= rulevoid_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1099:1: (lv_kind_2_0= rulevoid_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1099:1: (lv_kind_2_0= rulevoid_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1100:3: lv_kind_2_0= rulevoid_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOp_type_specAccess().getKindVoid_typeEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulevoid_type_in_ruleop_type_spec2035);
                    lv_kind_2_0=rulevoid_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOp_type_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_2_0, 
                      	        		"void_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleop_type_spec


    // $ANTLR start entryRuleparam_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1130:1: entryRuleparam_decl returns [EObject current=null] : iv_ruleparam_decl= ruleparam_decl EOF ;
    public final EObject entryRuleparam_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparam_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1131:2: (iv_ruleparam_decl= ruleparam_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1132:2: iv_ruleparam_decl= ruleparam_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParam_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_entryRuleparam_decl2072);
            iv_ruleparam_decl=ruleparam_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleparam_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleparam_decl2082); if (failed) return current;

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
    // $ANTLR end entryRuleparam_decl


    // $ANTLR start ruleparam_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1139:1: ruleparam_decl returns [EObject current=null] : ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ) ;
    public final EObject ruleparam_decl() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_containedType_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1144:6: ( ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1145:1: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1145:1: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1145:2: ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1145:2: ( (lv_direction_0_0= ruleparam_attribute ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1146:1: (lv_direction_0_0= ruleparam_attribute )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1146:1: (lv_direction_0_0= ruleparam_attribute )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1147:3: lv_direction_0_0= ruleparam_attribute
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParam_declAccess().getDirectionParam_attributeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleparam_attribute_in_ruleparam_decl2128);
            lv_direction_0_0=ruleparam_attribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParam_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"direction",
              	        		lv_direction_0_0, 
              	        		"param_attribute", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1169:2: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=51 && LA20_0<=52)||(LA20_0>=54 && LA20_0<=57)||(LA20_0>=72 && LA20_0<=78)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1169:2: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1169:3: ( (lv_containedType_1_0= rulebase_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1169:3: ( (lv_containedType_1_0= rulebase_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1170:1: (lv_containedType_1_0= rulebase_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1170:1: (lv_containedType_1_0= rulebase_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1171:3: lv_containedType_1_0= rulebase_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParam_declAccess().getContainedTypeBase_type_specParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleparam_decl2150);
                    lv_containedType_1_0=rulebase_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getParam_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_1_0, 
                      	        		"base_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1194:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1194:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1195:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1195:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1196:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getParam_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleparam_decl2178); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getParam_declAccess().getSharedTypeTypedefDefCrossReference_1_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1211:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1212:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1212:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1213:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleparam_decl2196); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParam_declAccess().getIdentifierIDTerminalRuleCall_2_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParam_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleparam_decl


    // $ANTLR start entryRuleattr_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1243:1: entryRuleattr_decl returns [EObject current=null] : iv_ruleattr_decl= ruleattr_decl EOF ;
    public final EObject entryRuleattr_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1244:2: (iv_ruleattr_decl= ruleattr_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1245:2: iv_ruleattr_decl= ruleattr_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttr_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleattr_decl_in_entryRuleattr_decl2237);
            iv_ruleattr_decl=ruleattr_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleattr_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleattr_decl2247); if (failed) return current;

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
    // $ANTLR end entryRuleattr_decl


    // $ANTLR start ruleattr_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1252:1: ruleattr_decl returns [EObject current=null] : (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec ) ;
    public final EObject ruleattr_decl() throws RecognitionException {
        EObject current = null;

        EObject this_readonly_attr_spec_0 = null;

        EObject this_attr_spec_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1257:6: ( (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1258:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1258:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==32) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1258:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1259:2: this_readonly_attr_spec_0= rulereadonly_attr_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttr_declAccess().getReadonly_attr_specParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulereadonly_attr_spec_in_ruleattr_decl2297);
                    this_readonly_attr_spec_0=rulereadonly_attr_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_readonly_attr_spec_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1272:2: this_attr_spec_1= ruleattr_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttr_declAccess().getAttr_specParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleattr_spec_in_ruleattr_decl2327);
                    this_attr_spec_1=ruleattr_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_attr_spec_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleattr_decl


    // $ANTLR start entryRulereadonly_attr_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1291:1: entryRulereadonly_attr_spec returns [EObject current=null] : iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF ;
    public final EObject entryRulereadonly_attr_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadonly_attr_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1292:2: (iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1293:2: iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReadonly_attr_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulereadonly_attr_spec_in_entryRulereadonly_attr_spec2362);
            iv_rulereadonly_attr_spec=rulereadonly_attr_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulereadonly_attr_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulereadonly_attr_spec2372); if (failed) return current;

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
    // $ANTLR end entryRulereadonly_attr_spec


    // $ANTLR start rulereadonly_attr_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1300:1: rulereadonly_attr_spec returns [EObject current=null] : ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) ) ;
    public final EObject rulereadonly_attr_spec() throws RecognitionException {
        EObject current = null;

        Token lv_isReadonly_0_0=null;
        Token lv_identifier_4_0=null;
        Token lv_isReadonly_11_0=null;
        Token lv_identifier_15_0=null;
        EObject lv_containedType_2_0 = null;

        EObject lv_containedType_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1305:6: ( ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==32) ) {
                    switch ( input.LA(3) ) {
                    case 57:
                        {
                        int LA25_3 = input.LA(4);

                        if ( (LA25_3==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 54:
                        {
                        switch ( input.LA(4) ) {
                        case 54:
                            {
                            int LA25_18 = input.LA(5);

                            if ( (LA25_18==RULE_ID) ) {
                                int LA25_17 = input.LA(6);

                                if ( (LA25_17==29) ) {
                                    alt25=1;
                                }
                                else if ( (LA25_17==EOF||LA25_17==17) ) {
                                    alt25=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 18, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 55:
                            {
                            int LA25_19 = input.LA(5);

                            if ( (LA25_19==RULE_ID) ) {
                                int LA25_17 = input.LA(6);

                                if ( (LA25_17==29) ) {
                                    alt25=1;
                                }
                                else if ( (LA25_17==EOF||LA25_17==17) ) {
                                    alt25=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 19, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 56:
                        {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==57) ) {
                            int LA25_20 = input.LA(5);

                            if ( (LA25_20==RULE_ID) ) {
                                int LA25_17 = input.LA(6);

                                if ( (LA25_17==29) ) {
                                    alt25=1;
                                }
                                else if ( (LA25_17==EOF||LA25_17==17) ) {
                                    alt25=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 20, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA25_5==54) ) {
                            int LA25_21 = input.LA(5);

                            if ( (LA25_21==54) ) {
                                int LA25_24 = input.LA(6);

                                if ( (LA25_24==RULE_ID) ) {
                                    int LA25_17 = input.LA(7);

                                    if ( (LA25_17==29) ) {
                                        alt25=1;
                                    }
                                    else if ( (LA25_17==EOF||LA25_17==17) ) {
                                        alt25=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 24, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA25_21==RULE_ID) ) {
                                int LA25_17 = input.LA(6);

                                if ( (LA25_17==29) ) {
                                    alt25=1;
                                }
                                else if ( (LA25_17==EOF||LA25_17==17) ) {
                                    alt25=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 21, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 72:
                        {
                        int LA25_6 = input.LA(4);

                        if ( (LA25_6==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                        {
                        int LA25_7 = input.LA(4);

                        if ( (LA25_7==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 73:
                        {
                        int LA25_8 = input.LA(4);

                        if ( (LA25_8==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 74:
                        {
                        int LA25_9 = input.LA(4);

                        if ( (LA25_9==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 51:
                        {
                        int LA25_10 = input.LA(4);

                        if ( (LA25_10==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 10, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                        {
                        int LA25_11 = input.LA(4);

                        if ( (LA25_11==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 75:
                        {
                        int LA25_12 = input.LA(4);

                        if ( (LA25_12==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 76:
                        {
                        int LA25_13 = input.LA(4);

                        if ( (LA25_13==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 77:
                        {
                        int LA25_14 = input.LA(4);

                        if ( (LA25_14==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 14, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 78:
                        {
                        int LA25_15 = input.LA(4);

                        if ( (LA25_15==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 15, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA25_16 = input.LA(4);

                        if ( (LA25_16==RULE_ID) ) {
                            int LA25_17 = input.LA(5);

                            if ( (LA25_17==29) ) {
                                alt25=1;
                            }
                            else if ( (LA25_17==EOF||LA25_17==17) ) {
                                alt25=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1306:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:2: ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:2: ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:3: ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1306:3: ( (lv_isReadonly_0_0= 'readonly' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1307:1: (lv_isReadonly_0_0= 'readonly' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1307:1: (lv_isReadonly_0_0= 'readonly' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1308:3: lv_isReadonly_0_0= 'readonly'
                    {
                    lv_isReadonly_0_0=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_rulereadonly_attr_spec2416); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getIsReadonlyReadonlyKeyword_0_0_0(), "isReadonly"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isReadonly", true, "readonly", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_rulereadonly_attr_spec2439); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getAttributeKeyword_0_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1331:1: ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=51 && LA22_0<=52)||(LA22_0>=54 && LA22_0<=57)||(LA22_0>=72 && LA22_0<=78)) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1331:1: ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1331:2: ( (lv_containedType_2_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1331:2: ( (lv_containedType_2_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1332:1: (lv_containedType_2_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1332:1: (lv_containedType_2_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1333:3: lv_containedType_2_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getReadonly_attr_specAccess().getContainedTypeBase_type_specParserRuleCall_0_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2461);
                            lv_containedType_2_0=rulebase_type_spec();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"containedType",
                              	        		lv_containedType_2_0, 
                              	        		"base_type_spec", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1356:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1356:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1357:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1357:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1358:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2489); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getReadonly_attr_specAccess().getSharedTypeTypedefDefCrossReference_0_2_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1373:3: ( (lv_identifier_4_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1374:1: (lv_identifier_4_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1374:1: (lv_identifier_4_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1375:3: lv_identifier_4_0= RULE_ID
                    {
                    lv_identifier_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2507); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getReadonly_attr_specAccess().getIdentifierIDTerminalRuleCall_0_3_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_4_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,29,FollowSets000.FOLLOW_29_in_rulereadonly_attr_spec2522); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getRaisesKeyword_0_4(), null); 
                          
                    }
                    match(input,27,FollowSets000.FOLLOW_27_in_rulereadonly_attr_spec2532); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getLeftParenthesisKeyword_0_5(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1405:1: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1406:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1406:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1407:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2554); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getReadonly_attr_specAccess().getGetRaisesExceptionDefCrossReference_0_6_0(), "getRaises"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1422:2: ( ',' ( ( RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1422:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_rulereadonly_attr_spec2565); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getCommaKeyword_0_7_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1426:1: ( ( RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1427:1: ( RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1427:1: ( RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1428:3: RULE_ID
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2587); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      		createLeafNode(grammarAccess.getReadonly_attr_specAccess().getGetRaisesExceptionDefCrossReference_0_7_1_0(), "getRaises"); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match(input,28,FollowSets000.FOLLOW_28_in_rulereadonly_attr_spec2599); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getRightParenthesisKeyword_0_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1448:6: ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1448:6: ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1448:7: ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1448:7: ( (lv_isReadonly_11_0= 'readonly' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1449:1: (lv_isReadonly_11_0= 'readonly' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1449:1: (lv_isReadonly_11_0= 'readonly' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1450:3: lv_isReadonly_11_0= 'readonly'
                    {
                    lv_isReadonly_11_0=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_rulereadonly_attr_spec2625); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getIsReadonlyReadonlyKeyword_1_0_0(), "isReadonly"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isReadonly", true, "readonly", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,32,FollowSets000.FOLLOW_32_in_rulereadonly_attr_spec2648); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getAttributeKeyword_1_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1473:1: ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=51 && LA24_0<=52)||(LA24_0>=54 && LA24_0<=57)||(LA24_0>=72 && LA24_0<=78)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==RULE_ID) ) {
                        alt24=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1473:1: ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1473:2: ( (lv_containedType_13_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1473:2: ( (lv_containedType_13_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1474:1: (lv_containedType_13_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1474:1: (lv_containedType_13_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1475:3: lv_containedType_13_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getReadonly_attr_specAccess().getContainedTypeBase_type_specParserRuleCall_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2670);
                            lv_containedType_13_0=rulebase_type_spec();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"containedType",
                              	        		lv_containedType_13_0, 
                              	        		"base_type_spec", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1498:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1498:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1499:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1499:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1500:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2698); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getReadonly_attr_specAccess().getSharedTypeTypedefDefCrossReference_1_2_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1515:3: ( (lv_identifier_15_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1516:1: (lv_identifier_15_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1516:1: (lv_identifier_15_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1517:3: lv_identifier_15_0= RULE_ID
                    {
                    lv_identifier_15_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2716); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getReadonly_attr_specAccess().getIdentifierIDTerminalRuleCall_1_3_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getReadonly_attr_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_15_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulereadonly_attr_spec


    // $ANTLR start entryRuleattr_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1547:1: entryRuleattr_spec returns [EObject current=null] : iv_ruleattr_spec= ruleattr_spec EOF ;
    public final EObject entryRuleattr_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1548:2: (iv_ruleattr_spec= ruleattr_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1549:2: iv_ruleattr_spec= ruleattr_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttr_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleattr_spec_in_entryRuleattr_spec2758);
            iv_ruleattr_spec=ruleattr_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleattr_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleattr_spec2768); if (failed) return current;

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
    // $ANTLR end entryRuleattr_spec


    // $ANTLR start ruleattr_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1556:1: ruleattr_spec returns [EObject current=null] : ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) ) ;
    public final EObject ruleattr_spec() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;
        Token lv_identifier_25_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_containedType_23_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1561:6: ( ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                switch ( input.LA(2) ) {
                case 57:
                    {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 54:
                    {
                    switch ( input.LA(3) ) {
                    case 54:
                        {
                        int LA33_17 = input.LA(4);

                        if ( (LA33_17==RULE_ID) ) {
                            int LA33_16 = input.LA(5);

                            if ( (LA33_16==EOF||LA33_16==17) ) {
                                alt33=2;
                            }
                            else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                                alt33=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 17, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 55:
                        {
                        int LA33_18 = input.LA(4);

                        if ( (LA33_18==RULE_ID) ) {
                            int LA33_16 = input.LA(5);

                            if ( (LA33_16==EOF||LA33_16==17) ) {
                                alt33=2;
                            }
                            else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                                alt33=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 18, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 56:
                    {
                    int LA33_4 = input.LA(3);

                    if ( (LA33_4==57) ) {
                        int LA33_19 = input.LA(4);

                        if ( (LA33_19==RULE_ID) ) {
                            int LA33_16 = input.LA(5);

                            if ( (LA33_16==EOF||LA33_16==17) ) {
                                alt33=2;
                            }
                            else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                                alt33=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 19, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA33_4==54) ) {
                        int LA33_20 = input.LA(4);

                        if ( (LA33_20==54) ) {
                            int LA33_23 = input.LA(5);

                            if ( (LA33_23==RULE_ID) ) {
                                int LA33_16 = input.LA(6);

                                if ( (LA33_16==EOF||LA33_16==17) ) {
                                    alt33=2;
                                }
                                else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                                    alt33=1;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 23, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA33_20==RULE_ID) ) {
                            int LA33_16 = input.LA(5);

                            if ( (LA33_16==EOF||LA33_16==17) ) {
                                alt33=2;
                            }
                            else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                                alt33=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 20, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 72:
                    {
                    int LA33_5 = input.LA(3);

                    if ( (LA33_5==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 55:
                    {
                    int LA33_6 = input.LA(3);

                    if ( (LA33_6==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 73:
                    {
                    int LA33_7 = input.LA(3);

                    if ( (LA33_7==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 74:
                    {
                    int LA33_8 = input.LA(3);

                    if ( (LA33_8==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 51:
                    {
                    int LA33_9 = input.LA(3);

                    if ( (LA33_9==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                    {
                    int LA33_10 = input.LA(3);

                    if ( (LA33_10==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 75:
                    {
                    int LA33_11 = input.LA(3);

                    if ( (LA33_11==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 76:
                    {
                    int LA33_12 = input.LA(3);

                    if ( (LA33_12==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case 77:
                    {
                    int LA33_13 = input.LA(3);

                    if ( (LA33_13==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case 78:
                    {
                    int LA33_14 = input.LA(3);

                    if ( (LA33_14==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA33_15 = input.LA(3);

                    if ( (LA33_15==RULE_ID) ) {
                        int LA33_16 = input.LA(4);

                        if ( (LA33_16==EOF||LA33_16==17) ) {
                            alt33=2;
                        }
                        else if ( ((LA33_16>=33 && LA33_16<=34)) ) {
                            alt33=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1562:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1562:2: ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1562:2: ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1562:4: 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) )
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleattr_spec2804); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttr_specAccess().getAttributeKeyword_0_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1566:1: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=51 && LA26_0<=52)||(LA26_0>=54 && LA26_0<=57)||(LA26_0>=72 && LA26_0<=78)) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==RULE_ID) ) {
                        alt26=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1566:1: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1566:2: ( (lv_containedType_1_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1566:2: ( (lv_containedType_1_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1567:1: (lv_containedType_1_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1567:1: (lv_containedType_1_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1568:3: lv_containedType_1_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAttr_specAccess().getContainedTypeBase_type_specParserRuleCall_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleattr_spec2826);
                            lv_containedType_1_0=rulebase_type_spec();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"containedType",
                              	        		lv_containedType_1_0, 
                              	        		"base_type_spec", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1591:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1591:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1592:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1592:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1593:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2854); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getSharedTypeTypedefDefCrossReference_0_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1608:3: ( (lv_identifier_3_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1609:1: (lv_identifier_3_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1609:1: (lv_identifier_3_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1610:3: lv_identifier_3_0= RULE_ID
                    {
                    lv_identifier_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2872); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getAttr_specAccess().getIdentifierIDTerminalRuleCall_0_2_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_3_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1632:2: ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==33) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==34) ) {
                        alt31=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1632:2: ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) )", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1632:3: ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1632:3: ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1632:5: 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                            {
                            match(input,33,FollowSets000.FOLLOW_33_in_ruleattr_spec2889); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getGetraisesKeyword_0_3_0_0(), null); 
                                  
                            }
                            match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec2899); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_0_1(), null); 
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1640:1: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1641:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1641:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1642:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2921); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getGetRaisesExceptionDefCrossReference_0_3_0_2_0(), "getRaises"); 
                              	
                            }

                            }


                            }

                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1657:2: ( ',' ( ( RULE_ID ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==25) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1657:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec2932); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_0_3_0(), null); 
                            	          
                            	    }
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1661:1: ( ( RULE_ID ) )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1662:1: ( RULE_ID )
                            	    {
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1662:1: ( RULE_ID )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1663:3: RULE_ID
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      		  /* */ 
                            	      		
                            	    }
                            	    if ( backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode, current);
                            	      	        }
                            	              
                            	    }
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2954); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      		createLeafNode(grammarAccess.getAttr_specAccess().getGetRaisesExceptionDefCrossReference_0_3_0_3_1_0(), "getRaises"); 
                            	      	
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);

                            match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec2966); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getRightParenthesisKeyword_0_3_0_4(), null); 
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1682:1: ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==34) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1682:3: 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                                    {
                                    match(input,34,FollowSets000.FOLLOW_34_in_ruleattr_spec2977); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getAttr_specAccess().getSetraisesKeyword_0_3_0_5_0(), null); 
                                          
                                    }
                                    match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec2987); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_0_5_1(), null); 
                                          
                                    }
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1690:1: ( ( RULE_ID ) )
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1691:1: ( RULE_ID )
                                    {
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1691:1: ( RULE_ID )
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1692:3: RULE_ID
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      		  /* */ 
                                      		
                                    }
                                    if ( backtracking==0 ) {

                                      			if (current==null) {
                                      	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode, current);
                                      	        }
                                              
                                    }
                                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3009); if (failed) return current;
                                    if ( backtracking==0 ) {

                                      		createLeafNode(grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_0_5_2_0(), "setRaises"); 
                                      	
                                    }

                                    }


                                    }

                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1707:2: ( ',' ( ( RULE_ID ) ) )*
                                    loop28:
                                    do {
                                        int alt28=2;
                                        int LA28_0 = input.LA(1);

                                        if ( (LA28_0==25) ) {
                                            alt28=1;
                                        }


                                        switch (alt28) {
                                    	case 1 :
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1707:4: ',' ( ( RULE_ID ) )
                                    	    {
                                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec3020); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	              createLeafNode(grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_0_5_3_0(), null); 
                                    	          
                                    	    }
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1711:1: ( ( RULE_ID ) )
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1712:1: ( RULE_ID )
                                    	    {
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1712:1: ( RULE_ID )
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1713:3: RULE_ID
                                    	    {
                                    	    if ( backtracking==0 ) {
                                    	       
                                    	      		  /* */ 
                                    	      		
                                    	    }
                                    	    if ( backtracking==0 ) {

                                    	      			if (current==null) {
                                    	      	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                                    	      	            associateNodeWithAstElement(currentNode, current);
                                    	      	        }
                                    	              
                                    	    }
                                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3042); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	      		createLeafNode(grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_0_5_3_1_0(), "setRaises"); 
                                    	      	
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop28;
                                        }
                                    } while (true);

                                    match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec3054); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getAttr_specAccess().getRightParenthesisKeyword_0_3_0_5_4(), null); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1733:6: ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1733:6: ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1733:8: 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,34,FollowSets000.FOLLOW_34_in_ruleattr_spec3074); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getSetraisesKeyword_0_3_1_0(), null); 
                                  
                            }
                            match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec3084); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_1_1(), null); 
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1741:1: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1742:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1742:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1743:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3106); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_1_2_0(), "setRaises"); 
                              	
                            }

                            }


                            }

                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1758:2: ( ',' ( ( RULE_ID ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==25) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1758:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec3117); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_1_3_0(), null); 
                            	          
                            	    }
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1762:1: ( ( RULE_ID ) )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1763:1: ( RULE_ID )
                            	    {
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1763:1: ( RULE_ID )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1764:3: RULE_ID
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      		  /* */ 
                            	      		
                            	    }
                            	    if ( backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode, current);
                            	      	        }
                            	              
                            	    }
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3139); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      		createLeafNode(grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_1_3_1_0(), "setRaises"); 
                            	      	
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec3151); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getRightParenthesisKeyword_0_3_1_4(), null); 
                                  
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1784:6: ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1784:6: ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1784:8: 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) )
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleattr_spec3171); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttr_specAccess().getAttributeKeyword_1_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1788:1: ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=51 && LA32_0<=52)||(LA32_0>=54 && LA32_0<=57)||(LA32_0>=72 && LA32_0<=78)) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_ID) ) {
                        alt32=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1788:1: ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1788:2: ( (lv_containedType_23_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1788:2: ( (lv_containedType_23_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1789:1: (lv_containedType_23_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1789:1: (lv_containedType_23_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1790:3: lv_containedType_23_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAttr_specAccess().getContainedTypeBase_type_specParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleattr_spec3193);
                            lv_containedType_23_0=rulebase_type_spec();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"containedType",
                              	        		lv_containedType_23_0, 
                              	        		"base_type_spec", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1813:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1813:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1814:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1814:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1815:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3221); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1830:3: ( (lv_identifier_25_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1831:1: (lv_identifier_25_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1831:1: (lv_identifier_25_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1832:3: lv_identifier_25_0= RULE_ID
                    {
                    lv_identifier_25_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3239); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getAttr_specAccess().getIdentifierIDTerminalRuleCall_1_2_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttr_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_25_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleattr_spec


    // $ANTLR start entryRuleexcept_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1862:1: entryRuleexcept_decl returns [EObject current=null] : iv_ruleexcept_decl= ruleexcept_decl EOF ;
    public final EObject entryRuleexcept_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexcept_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1863:2: (iv_ruleexcept_decl= ruleexcept_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1864:2: iv_ruleexcept_decl= ruleexcept_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExcept_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_entryRuleexcept_decl3281);
            iv_ruleexcept_decl=ruleexcept_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexcept_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleexcept_decl3291); if (failed) return current;

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
    // $ANTLR end entryRuleexcept_decl


    // $ANTLR start ruleexcept_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1871:1: ruleexcept_decl returns [EObject current=null] : ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' ) ;
    public final EObject ruleexcept_decl() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_members_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1876:6: ( ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1877:1: ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1877:1: ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1877:3: 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}'
            {
            match(input,35,FollowSets000.FOLLOW_35_in_ruleexcept_decl3326); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExcept_declAccess().getExceptionKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1881:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1882:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1882:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1883:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleexcept_decl3343); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getExcept_declAccess().getIdentifierIDTerminalRuleCall_1_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExcept_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleexcept_decl3358); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExcept_declAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1909:1: ( (lv_members_3_0= rulemember ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==40||LA34_0==48||(LA34_0>=51 && LA34_0<=57)||(LA34_0>=72 && LA34_0<=78)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1910:1: (lv_members_3_0= rulemember )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1910:1: (lv_members_3_0= rulemember )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1911:3: lv_members_3_0= rulemember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExcept_declAccess().getMembersMemberParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemember_in_ruleexcept_decl3379);
            	    lv_members_3_0=rulemember();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExcept_declRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"members",
            	      	        		lv_members_3_0, 
            	      	        		"member", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleexcept_decl3390); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExcept_declAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleexcept_decl


    // $ANTLR start entryRuletype_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1945:1: entryRuletype_decl returns [EObject current=null] : iv_ruletype_decl= ruletype_decl EOF ;
    public final EObject entryRuletype_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1946:2: (iv_ruletype_decl= ruletype_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1947:2: iv_ruletype_decl= ruletype_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getType_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_entryRuletype_decl3426);
            iv_ruletype_decl=ruletype_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletype_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletype_decl3436); if (failed) return current;

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
    // $ANTLR end entryRuletype_decl


    // $ANTLR start ruletype_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1954:1: ruletype_decl returns [EObject current=null] : (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl ) ;
    public final EObject ruletype_decl() throws RecognitionException {
        EObject current = null;

        EObject this_alias_type_0 = null;

        EObject this_struct_type_1 = null;

        EObject this_union_type_2 = null;

        EObject this_enum_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1959:6: ( (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1960:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1960:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )
            int alt35=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt35=1;
                }
                break;
            case 40:
                {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==RULE_ID) ) {
                    int LA35_6 = input.LA(3);

                    if ( (LA35_6==19) ) {
                        alt35=2;
                    }
                    else if ( (LA35_6==EOF||LA35_6==17) ) {
                        alt35=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1960:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1960:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                int LA35_3 = input.LA(2);

                if ( (LA35_3==RULE_ID) ) {
                    int LA35_7 = input.LA(3);

                    if ( (LA35_7==42) ) {
                        alt35=3;
                    }
                    else if ( (LA35_7==EOF||LA35_7==17) ) {
                        alt35=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1960:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1960:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt35=4;
                }
                break;
            case 36:
                {
                alt35=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1960:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1961:2: this_alias_type_0= rulealias_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getAlias_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulealias_type_in_ruletype_decl3486);
                    this_alias_type_0=rulealias_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_alias_type_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1974:2: this_struct_type_1= rulestruct_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getStruct_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_ruletype_decl3516);
                    this_struct_type_1=rulestruct_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_struct_type_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1987:2: this_union_type_2= ruleunion_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getUnion_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunion_type_in_ruletype_decl3546);
                    this_union_type_2=ruleunion_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_union_type_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2000:2: this_enum_type_3= ruleenum_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getEnum_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_ruletype_decl3576);
                    this_enum_type_3=ruleenum_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_enum_type_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2012:6: ( 'native' RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2012:6: ( 'native' RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2012:8: 'native' RULE_ID
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruletype_decl3592); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getType_declAccess().getNativeKeyword_4_0(), null); 
                          
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruletype_decl3601); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getType_declAccess().getIDTerminalRuleCall_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2022:2: ruleconstr_forward_decl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getConstr_forward_declParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconstr_forward_decl_in_ruletype_decl3626);
                    ruleconstr_forward_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruletype_decl


    // $ANTLR start entryRulealias_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2040:1: entryRulealias_type returns [EObject current=null] : iv_rulealias_type= rulealias_type EOF ;
    public final EObject entryRulealias_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealias_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2041:2: (iv_rulealias_type= rulealias_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2042:2: iv_rulealias_type= rulealias_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAlias_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulealias_type_in_entryRulealias_type3661);
            iv_rulealias_type=rulealias_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulealias_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulealias_type3671); if (failed) return current;

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
    // $ANTLR end entryRulealias_type


    // $ANTLR start rulealias_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2049:1: rulealias_type returns [EObject current=null] : ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) ) ;
    public final EObject rulealias_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_5_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_containedType_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2054:6: ( ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred51()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2055:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2055:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:2: ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:2: ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:4: 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rulealias_type3707); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAlias_typeAccess().getTypedefKeyword_0_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2059:1: ( (lv_containedType_1_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2060:1: (lv_containedType_1_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2060:1: (lv_containedType_1_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2061:3: lv_containedType_1_0= rulearray_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulealias_type3728);
                    lv_containedType_1_0=rulearray_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAlias_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_1_0, 
                      	        		"array_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2084:6: ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2084:6: ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2084:8: 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rulealias_type3746); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAlias_typeAccess().getTypedefKeyword_1_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2088:1: ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==48||(LA36_0>=51 && LA36_0<=57)||(LA36_0>=72 && LA36_0<=78)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_ID) ) {
                        alt36=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2088:1: ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2088:2: ( (lv_containedType_3_0= rulesimple_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2088:2: ( (lv_containedType_3_0= rulesimple_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2089:1: (lv_containedType_3_0= rulesimple_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2089:1: (lv_containedType_3_0= rulesimple_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2090:3: lv_containedType_3_0= rulesimple_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeSimple_type_specParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulealias_type3768);
                            lv_containedType_3_0=rulesimple_type_spec();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getAlias_typeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"containedType",
                              	        		lv_containedType_3_0, 
                              	        		"simple_type_spec", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2113:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2113:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2114:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2114:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2115:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getAlias_typeRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulealias_type3796); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAlias_typeAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2130:3: ( (lv_identifier_5_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2131:1: (lv_identifier_5_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2131:1: (lv_identifier_5_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2132:3: lv_identifier_5_0= RULE_ID
                    {
                    lv_identifier_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulealias_type3814); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getAlias_typeAccess().getIdentifierIDTerminalRuleCall_1_2_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAlias_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_5_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulealias_type


    // $ANTLR start entryRulearray_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2162:1: entryRulearray_type_spec returns [EObject current=null] : iv_rulearray_type_spec= rulearray_type_spec EOF ;
    public final EObject entryRulearray_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2163:2: (iv_rulearray_type_spec= rulearray_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2164:2: iv_rulearray_type_spec= rulearray_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArray_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_entryRulearray_type_spec3856);
            iv_rulearray_type_spec=rulearray_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulearray_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulearray_type_spec3866); if (failed) return current;

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
    // $ANTLR end entryRulearray_type_spec


    // $ANTLR start rulearray_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2171:1: rulearray_type_spec returns [EObject current=null] : ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ ) ;
    public final EObject rulearray_type_spec() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_containedType_0_0 = null;

        EObject lv_bounds_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2176:6: ( ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2177:1: ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2177:1: ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2177:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2177:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48||(LA38_0>=51 && LA38_0<=57)||(LA38_0>=72 && LA38_0<=78)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2177:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2177:3: ( (lv_containedType_0_0= rulesimple_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2177:3: ( (lv_containedType_0_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2178:1: (lv_containedType_0_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2178:1: (lv_containedType_0_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2179:3: lv_containedType_0_0= rulesimple_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArray_type_specAccess().getContainedTypeSimple_type_specParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulearray_type_spec3913);
                    lv_containedType_0_0=rulesimple_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArray_type_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_0_0, 
                      	        		"simple_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2202:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2202:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2203:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2203:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2204:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getArray_type_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulearray_type_spec3941); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getArray_type_specAccess().getSharedTypeTypedefDefCrossReference_0_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2219:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2220:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2220:1: (lv_name_2_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2221:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulearray_type_spec3959); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getArray_type_specAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getArray_type_specRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2243:2: ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2243:4: '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']'
            	    {
            	    match(input,38,FollowSets000.FOLLOW_38_in_rulearray_type_spec3975); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getArray_type_specAccess().getLeftSquareBracketKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2247:1: ( (lv_bounds_4_0= ruleconst_exp ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2248:1: (lv_bounds_4_0= ruleconst_exp )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2248:1: (lv_bounds_4_0= ruleconst_exp )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2249:3: lv_bounds_4_0= ruleconst_exp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getArray_type_specAccess().getBoundsConst_expParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulearray_type_spec3996);
            	    lv_bounds_4_0=ruleconst_exp();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getArray_type_specRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"bounds",
            	      	        		lv_bounds_4_0, 
            	      	        		"const_exp", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    match(input,39,FollowSets000.FOLLOW_39_in_rulearray_type_spec4006); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getArray_type_specAccess().getRightSquareBracketKeyword_2_2(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulearray_type_spec


    // $ANTLR start entryRulesimple_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2283:1: entryRulesimple_type_spec returns [EObject current=null] : iv_rulesimple_type_spec= rulesimple_type_spec EOF ;
    public final EObject entryRulesimple_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2284:2: (iv_rulesimple_type_spec= rulesimple_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2285:2: iv_rulesimple_type_spec= rulesimple_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimple_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_entryRulesimple_type_spec4044);
            iv_rulesimple_type_spec=rulesimple_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesimple_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesimple_type_spec4054); if (failed) return current;

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
    // $ANTLR end entryRulesimple_type_spec


    // $ANTLR start rulesimple_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2292:1: rulesimple_type_spec returns [EObject current=null] : (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec ) ;
    public final EObject rulesimple_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_base_type_spec_0 = null;

        EObject this_template_type_spec_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2297:6: ( (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2298:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2298:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )
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
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2298:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )", 40, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA40_3 = input.LA(2);

                if ( (LA40_3==49) ) {
                    alt40=2;
                }
                else if ( (LA40_3==EOF||LA40_3==RULE_ID||LA40_3==25||LA40_3==50) ) {
                    alt40=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2298:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )", 40, 3, input);

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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2298:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2299:2: this_base_type_spec_0= rulebase_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSimple_type_specAccess().getBase_type_specParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulesimple_type_spec4104);
                    this_base_type_spec_0=rulebase_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_base_type_spec_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2312:2: this_template_type_spec_1= ruletemplate_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSimple_type_specAccess().getTemplate_type_specParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletemplate_type_spec_in_rulesimple_type_spec4134);
                    this_template_type_spec_1=ruletemplate_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_template_type_spec_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulesimple_type_spec


    // $ANTLR start entryRulebase_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2331:1: entryRulebase_type_spec returns [EObject current=null] : iv_rulebase_type_spec= rulebase_type_spec EOF ;
    public final EObject entryRulebase_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebase_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2332:2: (iv_rulebase_type_spec= rulebase_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2333:2: iv_rulebase_type_spec= rulebase_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBase_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_entryRulebase_type_spec4169);
            iv_rulebase_type_spec=rulebase_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulebase_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebase_type_spec4179); if (failed) return current;

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
    // $ANTLR end entryRulebase_type_spec


    // $ANTLR start rulebase_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2340:1: rulebase_type_spec returns [EObject current=null] : (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) ) ;
    public final EObject rulebase_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_primitive_def_0 = null;

        Enumerator lv_kind_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2345:6: ( (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2346:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2346:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=51 && LA41_0<=52)||(LA41_0>=54 && LA41_0<=57)||(LA41_0>=72 && LA41_0<=77)) ) {
                alt41=1;
            }
            else if ( (LA41_0==78) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2346:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2347:2: this_primitive_def_0= ruleprimitive_def
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBase_type_specAccess().getPrimitive_defParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_rulebase_type_spec4229);
                    this_primitive_def_0=ruleprimitive_def();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_primitive_def_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2359:6: ( (lv_kind_1_0= ruleobject_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2359:6: ( (lv_kind_1_0= ruleobject_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2360:1: (lv_kind_1_0= ruleobject_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2360:1: (lv_kind_1_0= ruleobject_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2361:3: lv_kind_1_0= ruleobject_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBase_type_specAccess().getKindObject_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleobject_type_in_rulebase_type_spec4255);
                    lv_kind_1_0=ruleobject_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getBase_type_specRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_1_0, 
                      	        		"object_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulebase_type_spec


    // $ANTLR start entryRuletemplate_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2391:1: entryRuletemplate_type_spec returns [EObject current=null] : iv_ruletemplate_type_spec= ruletemplate_type_spec EOF ;
    public final EObject entryRuletemplate_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletemplate_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2392:2: (iv_ruletemplate_type_spec= ruletemplate_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2393:2: iv_ruletemplate_type_spec= ruletemplate_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplate_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletemplate_type_spec_in_entryRuletemplate_type_spec4291);
            iv_ruletemplate_type_spec=ruletemplate_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletemplate_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletemplate_type_spec4301); if (failed) return current;

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
    // $ANTLR end entryRuletemplate_type_spec


    // $ANTLR start ruletemplate_type_spec
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2400:1: ruletemplate_type_spec returns [EObject current=null] : (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type ) ;
    public final EObject ruletemplate_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_sequence_type_0 = null;

        EObject this_stringdef_type_1 = null;

        EObject this_wide_stringdef_type_2 = null;

        EObject this_fixed_pt_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2405:6: ( (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2406:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2406:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2406:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2407:2: this_sequence_type_0= rulesequence_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getSequence_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesequence_type_in_ruletemplate_type_spec4351);
                    this_sequence_type_0=rulesequence_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_sequence_type_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2420:2: this_stringdef_type_1= rulestringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getStringdef_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_ruletemplate_type_spec4381);
                    this_stringdef_type_1=rulestringdef_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_stringdef_type_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2433:2: this_wide_stringdef_type_2= rulewide_stringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getWide_stringdef_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_ruletemplate_type_spec4411);
                    this_wide_stringdef_type_2=rulewide_stringdef_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_wide_stringdef_type_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2446:2: this_fixed_pt_type_3= rulefixed_pt_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getFixed_pt_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefixed_pt_type_in_ruletemplate_type_spec4441);
                    this_fixed_pt_type_3=rulefixed_pt_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_fixed_pt_type_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruletemplate_type_spec


    // $ANTLR start entryRulestruct_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2467:1: entryRulestruct_type returns [EObject current=null] : iv_rulestruct_type= rulestruct_type EOF ;
    public final EObject entryRulestruct_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestruct_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2468:2: (iv_rulestruct_type= rulestruct_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2469:2: iv_rulestruct_type= rulestruct_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStruct_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_entryRulestruct_type4478);
            iv_rulestruct_type=rulestruct_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestruct_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulestruct_type4488); if (failed) return current;

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
    // $ANTLR end entryRulestruct_type


    // $ANTLR start rulestruct_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2476:1: rulestruct_type returns [EObject current=null] : ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' ) ;
    public final EObject rulestruct_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_members_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2481:6: ( ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2482:1: ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2482:1: ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2482:3: 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}'
            {
            match(input,40,FollowSets000.FOLLOW_40_in_rulestruct_type4523); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStruct_typeAccess().getStructKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2486:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2487:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2487:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2488:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulestruct_type4540); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStruct_typeAccess().getIdentifierIDTerminalRuleCall_1_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStruct_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_rulestruct_type4555); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStruct_typeAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2514:1: ( (lv_members_3_0= rulemember ) )+
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2515:1: (lv_members_3_0= rulemember )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2515:1: (lv_members_3_0= rulemember )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2516:3: lv_members_3_0= rulemember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStruct_typeAccess().getMembersMemberParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemember_in_rulestruct_type4576);
            	    lv_members_3_0=rulemember();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStruct_typeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"members",
            	      	        		lv_members_3_0, 
            	      	        		"member", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_rulestruct_type4587); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStruct_typeAccess().getRightCurlyBracketKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulestruct_type


    // $ANTLR start entryRulemember
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2550:1: entryRulemember returns [EObject current=null] : iv_rulemember= rulemember EOF ;
    public final EObject entryRulemember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemember = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2551:2: (iv_rulemember= rulemember EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2552:2: iv_rulemember= rulemember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMemberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemember_in_entryRulemember4623);
            iv_rulemember=rulemember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemember4633); if (failed) return current;

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
    // $ANTLR end entryRulemember


    // $ANTLR start rulemember
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2559:1: rulemember returns [EObject current=null] : ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) ) ;
    public final EObject rulemember() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;
        Token lv_identifier_6_0=null;
        Token lv_identifier_9_0=null;
        EObject lv_containedType_0_0 = null;

        EObject lv_containedType_2_0 = null;

        EObject lv_containedType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2564:6: ( ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA44_1 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA44_2 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA44_3 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 3, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA44_4 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 4, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                int LA44_5 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case 73:
                {
                int LA44_6 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 6, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                int LA44_7 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 7, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                int LA44_8 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 8, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA44_9 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 9, input);

                    throw nvae;
                }
                }
                break;
            case 75:
                {
                int LA44_10 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 10, input);

                    throw nvae;
                }
                }
                break;
            case 76:
                {
                int LA44_11 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 11, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                int LA44_12 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 12, input);

                    throw nvae;
                }
                }
                break;
            case 78:
                {
                int LA44_13 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 13, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA44_14 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 14, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA44_15 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (synpred62()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 15, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA44_16 = input.LA(2);

                if ( (synpred61()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 16, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt44=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2565:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:3: ( (lv_containedType_0_0= rulearray_type_spec ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:3: ( (lv_containedType_0_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2566:1: (lv_containedType_0_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2566:1: (lv_containedType_0_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2567:3: lv_containedType_0_0= rulearray_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeArray_type_specParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulemember4680);
                    lv_containedType_0_0=rulearray_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_0_0, 
                      	        		"array_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4690); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMemberAccess().getSemicolonKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:7: ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:7: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2595:1: (lv_containedType_2_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2595:1: (lv_containedType_2_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2596:3: lv_containedType_2_0= rulesimple_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeSimple_type_specParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulemember4719);
                    lv_containedType_2_0=rulesimple_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_2_0, 
                      	        		"simple_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2618:2: ( (lv_identifier_3_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2619:1: (lv_identifier_3_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2619:1: (lv_identifier_3_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2620:3: lv_identifier_3_0= RULE_ID
                    {
                    lv_identifier_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4736); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getMemberAccess().getIdentifierIDTerminalRuleCall_1_1_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_3_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4751); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMemberAccess().getSemicolonKeyword_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2647:6: ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2647:6: ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2647:7: ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2647:7: ( (lv_containedType_5_0= rulestruct_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2648:1: (lv_containedType_5_0= rulestruct_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2648:1: (lv_containedType_5_0= rulestruct_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2649:3: lv_containedType_5_0= rulestruct_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeStruct_typeParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_rulemember4780);
                    lv_containedType_5_0=rulestruct_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_5_0, 
                      	        		"struct_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2671:2: ( (lv_identifier_6_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2672:1: (lv_identifier_6_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2672:1: (lv_identifier_6_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2673:3: lv_identifier_6_0= RULE_ID
                    {
                    lv_identifier_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4797); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getMemberAccess().getIdentifierIDTerminalRuleCall_2_1_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_6_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4812); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMemberAccess().getSemicolonKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2700:6: ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2700:6: ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2700:7: ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2700:7: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2701:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2701:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2702:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4842); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getMemberAccess().getSharedTypeTypedefDefCrossReference_3_0_0(), "sharedType"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2717:2: ( (lv_identifier_9_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2718:1: (lv_identifier_9_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2718:1: (lv_identifier_9_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2719:3: lv_identifier_9_0= RULE_ID
                    {
                    lv_identifier_9_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4859); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getMemberAccess().getIdentifierIDTerminalRuleCall_3_1_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMemberRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_9_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4874); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMemberAccess().getSemicolonKeyword_3_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulemember


    // $ANTLR start entryRuleunion_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2753:1: entryRuleunion_type returns [EObject current=null] : iv_ruleunion_type= ruleunion_type EOF ;
    public final EObject entryRuleunion_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunion_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2754:2: (iv_ruleunion_type= ruleunion_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2755:2: iv_ruleunion_type= ruleunion_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnion_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunion_type_in_entryRuleunion_type4911);
            iv_ruleunion_type=ruleunion_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunion_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunion_type4921); if (failed) return current;

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
    // $ANTLR end entryRuleunion_type


    // $ANTLR start ruleunion_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2762:1: ruleunion_type returns [EObject current=null] : ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' ) ;
    public final EObject ruleunion_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_containedDiscrim_4_0 = null;

        EObject lv_unionMembers_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2767:6: ( ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2768:1: ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2768:1: ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2768:3: 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}'
            {
            match(input,41,FollowSets000.FOLLOW_41_in_ruleunion_type4956); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getUnionKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2772:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2773:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2773:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2774:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleunion_type4973); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getUnion_typeAccess().getIdentifierIDTerminalRuleCall_1_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getUnion_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,42,FollowSets000.FOLLOW_42_in_ruleunion_type4988); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getSwitchKeyword_2(), null); 
                  
            }
            match(input,27,FollowSets000.FOLLOW_27_in_ruleunion_type4998); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2804:1: ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45||LA45_0==54||(LA45_0>=56 && LA45_0<=57)||LA45_0==73||LA45_0==75) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2804:1: ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2804:2: ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2804:2: ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2805:1: (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2805:1: (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2806:3: lv_containedDiscrim_4_0= ruleswitch_type_spec_cont
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnion_typeAccess().getContainedDiscrimSwitch_type_spec_contParserRuleCall_4_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleswitch_type_spec_cont_in_ruleunion_type5020);
                    lv_containedDiscrim_4_0=ruleswitch_type_spec_cont();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnion_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedDiscrim",
                      	        		lv_containedDiscrim_4_0, 
                      	        		"switch_type_spec_cont", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2829:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2829:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2830:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2830:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2831:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getUnion_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleunion_type5048); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getUnion_typeAccess().getSharedDiscrimEnumDefCrossReference_4_1_0(), "sharedDiscrim"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleunion_type5059); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            match(input,19,FollowSets000.FOLLOW_19_in_ruleunion_type5069); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getLeftCurlyBracketKeyword_6(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2854:1: ( (lv_unionMembers_8_0= rulecase_stmt ) )+
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2855:1: (lv_unionMembers_8_0= rulecase_stmt )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2855:1: (lv_unionMembers_8_0= rulecase_stmt )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2856:3: lv_unionMembers_8_0= rulecase_stmt
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUnion_typeAccess().getUnionMembersCase_stmtParserRuleCall_7_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulecase_stmt_in_ruleunion_type5090);
            	    lv_unionMembers_8_0=rulecase_stmt();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getUnion_typeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"unionMembers",
            	      	        		lv_unionMembers_8_0, 
            	      	        		"case_stmt", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleunion_type5101); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getRightCurlyBracketKeyword_8(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleunion_type


    // $ANTLR start entryRuleswitch_type_spec_cont
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2890:1: entryRuleswitch_type_spec_cont returns [EObject current=null] : iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF ;
    public final EObject entryRuleswitch_type_spec_cont() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitch_type_spec_cont = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2891:2: (iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2892:2: iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSwitch_type_spec_contRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleswitch_type_spec_cont_in_entryRuleswitch_type_spec_cont5137);
            iv_ruleswitch_type_spec_cont=ruleswitch_type_spec_cont();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleswitch_type_spec_cont; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleswitch_type_spec_cont5147); if (failed) return current;

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
    // $ANTLR end entryRuleswitch_type_spec_cont


    // $ANTLR start ruleswitch_type_spec_cont
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2899:1: ruleswitch_type_spec_cont returns [EObject current=null] : (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type ) ;
    public final EObject ruleswitch_type_spec_cont() throws RecognitionException {
        EObject current = null;

        EObject this_integer_type_0 = null;

        Enumerator lv_kind_2_0 = null;

        Enumerator lv_kind_4_0 = null;

        EObject this_enum_type_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2904:6: ( (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2905:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2905:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2905:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2906:2: this_integer_type_0= ruleinteger_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getInteger_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_ruleswitch_type_spec_cont5197);
                    this_integer_type_0=ruleinteger_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_integer_type_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2918:6: ( () ( (lv_kind_2_0= rulechar_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2918:6: ( () ( (lv_kind_2_0= rulechar_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2918:7: () ( (lv_kind_2_0= rulechar_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2918:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2919:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getSwitch_type_spec_contAccess().getPrimitiveDefAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getPrimitiveDefAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2932:2: ( (lv_kind_2_0= rulechar_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2933:1: (lv_kind_2_0= rulechar_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2933:1: (lv_kind_2_0= rulechar_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2934:3: lv_kind_2_0= rulechar_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getKindChar_typeEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulechar_type_in_ruleswitch_type_spec_cont5236);
                    lv_kind_2_0=rulechar_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSwitch_type_spec_contRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_2_0, 
                      	        		"char_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2957:6: ( () ( (lv_kind_4_0= ruleboolean_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2957:6: ( () ( (lv_kind_4_0= ruleboolean_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2957:7: () ( (lv_kind_4_0= ruleboolean_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2957:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2958:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getSwitch_type_spec_contAccess().getPrimitiveDefAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getPrimitiveDefAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2971:2: ( (lv_kind_4_0= ruleboolean_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2972:1: (lv_kind_4_0= ruleboolean_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2972:1: (lv_kind_4_0= ruleboolean_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2973:3: lv_kind_4_0= ruleboolean_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getKindBoolean_typeEnumRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolean_type_in_ruleswitch_type_spec_cont5277);
                    lv_kind_4_0=ruleboolean_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSwitch_type_spec_contRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_4_0, 
                      	        		"boolean_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2997:2: this_enum_type_5= ruleenum_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getEnum_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_ruleswitch_type_spec_cont5309);
                    this_enum_type_5=ruleenum_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_enum_type_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleswitch_type_spec_cont


    // $ANTLR start entryRulecase_stmt
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3016:1: entryRulecase_stmt returns [EObject current=null] : iv_rulecase_stmt= rulecase_stmt EOF ;
    public final EObject entryRulecase_stmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_stmt = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3017:2: (iv_rulecase_stmt= rulecase_stmt EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3018:2: iv_rulecase_stmt= rulecase_stmt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCase_stmtRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulecase_stmt_in_entryRulecase_stmt5344);
            iv_rulecase_stmt=rulecase_stmt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulecase_stmt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecase_stmt5354); if (failed) return current;

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
    // $ANTLR end entryRulecase_stmt


    // $ANTLR start rulecase_stmt
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3025:1: rulecase_stmt returns [EObject current=null] : ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) ) ;
    public final EObject rulecase_stmt() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_14_0=null;
        EObject lv_label_1_0 = null;

        EObject lv_containedType_5_0 = null;

        EObject lv_label_8_0 = null;

        EObject lv_containedType_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3030:6: ( ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred71()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3031:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==44) ) {
                int LA51_2 = input.LA(2);

                if ( (synpred71()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3031:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )", 51, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3031:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:2: ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:2: ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:3: ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:3: ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+
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
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:4: ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:4: ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:6: 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':'
                    	    {
                    	    match(input,43,FollowSets000.FOLLOW_43_in_rulecase_stmt5392); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getCaseKeyword_0_0_0_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3035:1: ( (lv_label_1_0= ruleconst_exp ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3036:1: (lv_label_1_0= ruleconst_exp )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3036:1: (lv_label_1_0= ruleconst_exp )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3037:3: lv_label_1_0= ruleconst_exp
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_0_0_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulecase_stmt5413);
                    	    lv_label_1_0=ruleconst_exp();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCase_stmtRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"label",
                    	      	        		lv_label_1_0, 
                    	      	        		"const_exp", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5423); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getColonKeyword_0_0_0_2(), null); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:6: ( 'default' ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:6: ( 'default' ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:8: 'default' ':'
                    	    {
                    	    match(input,44,FollowSets000.FOLLOW_44_in_rulecase_stmt5441); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getDefaultKeyword_0_0_1_0(), null); 
                    	          
                    	    }
                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5451); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getColonKeyword_0_0_1_1(), null); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3072:4: ( (lv_containedType_5_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3073:1: (lv_containedType_5_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3073:1: (lv_containedType_5_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3074:3: lv_containedType_5_0= rulearray_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulecase_stmt5475);
                    lv_containedType_5_0=rulearray_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCase_stmtRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_5_0, 
                      	        		"array_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,17,FollowSets000.FOLLOW_17_in_rulecase_stmt5485); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCase_stmtAccess().getSemicolonKeyword_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3101:6: ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3101:6: ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3101:7: ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3101:7: ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+
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
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3101:8: ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3101:8: ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3101:10: 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':'
                    	    {
                    	    match(input,43,FollowSets000.FOLLOW_43_in_rulecase_stmt5505); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getCaseKeyword_1_0_0_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3105:1: ( (lv_label_8_0= ruleconst_exp ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3106:1: (lv_label_8_0= ruleconst_exp )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3106:1: (lv_label_8_0= ruleconst_exp )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3107:3: lv_label_8_0= ruleconst_exp
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_1_0_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulecase_stmt5526);
                    	    lv_label_8_0=ruleconst_exp();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getCase_stmtRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"label",
                    	      	        		lv_label_8_0, 
                    	      	        		"const_exp", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5536); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getColonKeyword_1_0_0_2(), null); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3134:6: ( 'default' ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3134:6: ( 'default' ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3134:8: 'default' ':'
                    	    {
                    	    match(input,44,FollowSets000.FOLLOW_44_in_rulecase_stmt5554); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getDefaultKeyword_1_0_1_0(), null); 
                    	          
                    	    }
                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5564); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getColonKeyword_1_0_1_1(), null); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (backtracking>0) {failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3142:4: ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==48||(LA50_0>=51 && LA50_0<=57)||(LA50_0>=72 && LA50_0<=78)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_ID) ) {
                        alt50=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("3142:4: ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3142:5: ( (lv_containedType_12_0= rulesimple_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3142:5: ( (lv_containedType_12_0= rulesimple_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3143:1: (lv_containedType_12_0= rulesimple_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3143:1: (lv_containedType_12_0= rulesimple_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3144:3: lv_containedType_12_0= rulesimple_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeSimple_type_specParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulecase_stmt5589);
                            lv_containedType_12_0=rulesimple_type_spec();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCase_stmtRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"containedType",
                              	        		lv_containedType_12_0, 
                              	        		"simple_type_spec", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3167:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3167:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3168:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3168:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3169:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCase_stmtRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulecase_stmt5617); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCase_stmtAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3184:3: ( (lv_identifier_14_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3185:1: (lv_identifier_14_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3185:1: (lv_identifier_14_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3186:3: lv_identifier_14_0= RULE_ID
                    {
                    lv_identifier_14_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulecase_stmt5635); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getCase_stmtAccess().getIdentifierIDTerminalRuleCall_1_2_0(), "identifier"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCase_stmtRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"identifier",
                      	        		lv_identifier_14_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,17,FollowSets000.FOLLOW_17_in_rulecase_stmt5650); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCase_stmtAccess().getSemicolonKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulecase_stmt


    // $ANTLR start entryRuleenum_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3220:1: entryRuleenum_type returns [EObject current=null] : iv_ruleenum_type= ruleenum_type EOF ;
    public final EObject entryRuleenum_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3221:2: (iv_ruleenum_type= ruleenum_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3222:2: iv_ruleenum_type= ruleenum_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnum_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_entryRuleenum_type5687);
            iv_ruleenum_type=ruleenum_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleenum_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleenum_type5697); if (failed) return current;

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
    // $ANTLR end entryRuleenum_type


    // $ANTLR start ruleenum_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3229:1: ruleenum_type returns [EObject current=null] : ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' ) ;
    public final EObject ruleenum_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3234:6: ( ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3235:1: ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3235:1: ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3235:3: 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}'
            {
            match(input,45,FollowSets000.FOLLOW_45_in_ruleenum_type5732); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnum_typeAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3239:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3240:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3240:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3241:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleenum_type5749); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getEnum_typeAccess().getIdentifierIDTerminalRuleCall_1_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnum_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleenum_type5764); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnum_typeAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3267:1: ( (lv_members_3_0= ruleenum_member ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3268:1: (lv_members_3_0= ruleenum_member )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3268:1: (lv_members_3_0= ruleenum_member )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3269:3: lv_members_3_0= ruleenum_member
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnum_typeAccess().getMembersEnum_memberParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_ruleenum_type5785);
            lv_members_3_0=ruleenum_member();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnum_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"members",
              	        		lv_members_3_0, 
              	        		"enum_member", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3291:2: ( ',' ( (lv_members_5_0= ruleenum_member ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==25) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3291:4: ',' ( (lv_members_5_0= ruleenum_member ) )
            	    {
            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleenum_type5796); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getEnum_typeAccess().getCommaKeyword_4_0(), null); 
            	          
            	    }
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3295:1: ( (lv_members_5_0= ruleenum_member ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3296:1: (lv_members_5_0= ruleenum_member )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3296:1: (lv_members_5_0= ruleenum_member )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3297:3: lv_members_5_0= ruleenum_member
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnum_typeAccess().getMembersEnum_memberParserRuleCall_4_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_ruleenum_type5817);
            	    lv_members_5_0=ruleenum_member();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEnum_typeRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"members",
            	      	        		lv_members_5_0, 
            	      	        		"enum_member", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleenum_type5829); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnum_typeAccess().getRightCurlyBracketKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleenum_type


    // $ANTLR start entryRuleenum_member
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3331:1: entryRuleenum_member returns [EObject current=null] : iv_ruleenum_member= ruleenum_member EOF ;
    public final EObject entryRuleenum_member() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_member = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3332:2: (iv_ruleenum_member= ruleenum_member EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3333:2: iv_ruleenum_member= ruleenum_member EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnum_memberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_entryRuleenum_member5865);
            iv_ruleenum_member=ruleenum_member();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleenum_member; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleenum_member5875); if (failed) return current;

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
    // $ANTLR end entryRuleenum_member


    // $ANTLR start ruleenum_member
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3340:1: ruleenum_member returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleenum_member() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3345:6: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3346:1: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3346:1: ( (lv_identifier_0_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3347:1: (lv_identifier_0_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3347:1: (lv_identifier_0_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3348:3: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleenum_member5916); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getEnum_memberAccess().getIdentifierIDTerminalRuleCall_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEnum_memberRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleenum_member


    // $ANTLR start entryRuleconstr_forward_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3378:1: entryRuleconstr_forward_decl returns [String current=null] : iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF ;
    public final String entryRuleconstr_forward_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstr_forward_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3379:2: (iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3380:2: iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstr_forward_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconstr_forward_decl_in_entryRuleconstr_forward_decl5957);
            iv_ruleconstr_forward_decl=ruleconstr_forward_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconstr_forward_decl.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconstr_forward_decl5968); if (failed) return current;

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
    // $ANTLR end entryRuleconstr_forward_decl


    // $ANTLR start ruleconstr_forward_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3387:1: ruleconstr_forward_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleconstr_forward_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3392:6: ( ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3393:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3393:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==40) ) {
                alt53=1;
            }
            else if ( (LA53_0==41) ) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3393:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3393:2: (kw= 'struct' this_ID_1= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3393:2: (kw= 'struct' this_ID_1= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3394:2: kw= 'struct' this_ID_1= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleconstr_forward_decl6007); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getConstr_forward_declAccess().getStructKeyword_0_0(), null); 
                          
                    }
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstr_forward_decl6022); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstr_forward_declAccess().getIDTerminalRuleCall_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3407:6: (kw= 'union' this_ID_3= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3407:6: (kw= 'union' this_ID_3= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3408:2: kw= 'union' this_ID_3= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleconstr_forward_decl6048); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getConstr_forward_declAccess().getUnionKeyword_1_0(), null); 
                          
                    }
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstr_forward_decl6063); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstr_forward_declAccess().getIDTerminalRuleCall_1_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleconstr_forward_decl


    // $ANTLR start entryRuleconst_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3428:1: entryRuleconst_decl returns [EObject current=null] : iv_ruleconst_decl= ruleconst_decl EOF ;
    public final EObject entryRuleconst_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3429:2: (iv_ruleconst_decl= ruleconst_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3430:2: iv_ruleconst_decl= ruleconst_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConst_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_entryRuleconst_decl6109);
            iv_ruleconst_decl=ruleconst_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconst_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_decl6119); if (failed) return current;

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
    // $ANTLR end entryRuleconst_decl


    // $ANTLR start ruleconst_decl
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3437:1: ruleconst_decl returns [EObject current=null] : ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) ) ;
    public final EObject ruleconst_decl() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_constValue_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3442:6: ( ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3443:1: ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3443:1: ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3443:3: 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) )
            {
            match(input,46,FollowSets000.FOLLOW_46_in_ruleconst_decl6154); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConst_declAccess().getConstKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3447:1: ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=51 && LA54_0<=57)||(LA54_0>=72 && LA54_0<=77)) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3447:1: ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3447:2: ( (lv_containedType_1_0= ruleconst_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3447:2: ( (lv_containedType_1_0= ruleconst_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3448:1: (lv_containedType_1_0= ruleconst_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3448:1: (lv_containedType_1_0= ruleconst_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3449:3: lv_containedType_1_0= ruleconst_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConst_declAccess().getContainedTypeConst_typeParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_type_in_ruleconst_decl6176);
                    lv_containedType_1_0=ruleconst_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConst_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_1_0, 
                      	        		"const_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3472:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3472:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3473:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3473:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3474:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getConst_declRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconst_decl6204); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getConst_declAccess().getSharedTypeAliasDefCrossReference_1_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3489:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3490:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3490:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3491:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconst_decl6222); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getConst_declAccess().getIdentifierIDTerminalRuleCall_2_0(), "identifier"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConst_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"identifier",
              	        		lv_identifier_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,47,FollowSets000.FOLLOW_47_in_ruleconst_decl6237); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConst_declAccess().getEqualsSignKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3517:1: ( (lv_constValue_5_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3518:1: (lv_constValue_5_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3518:1: (lv_constValue_5_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3519:3: lv_constValue_5_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConst_declAccess().getConstValueConst_expParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_ruleconst_decl6258);
            lv_constValue_5_0=ruleconst_exp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConst_declRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"constValue",
              	        		lv_constValue_5_0, 
              	        		"const_exp", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleconst_decl


    // $ANTLR start entryRuleconst_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3549:1: entryRuleconst_type returns [EObject current=null] : iv_ruleconst_type= ruleconst_type EOF ;
    public final EObject entryRuleconst_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3550:2: (iv_ruleconst_type= ruleconst_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3551:2: iv_ruleconst_type= ruleconst_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConst_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_type_in_entryRuleconst_type6294);
            iv_ruleconst_type=ruleconst_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconst_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_type6304); if (failed) return current;

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
    // $ANTLR end entryRuleconst_type


    // $ANTLR start ruleconst_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3558:1: ruleconst_type returns [EObject current=null] : (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type ) ;
    public final EObject ruleconst_type() throws RecognitionException {
        EObject current = null;

        EObject this_primitive_def_0 = null;

        EObject this_stringdef_type_1 = null;

        EObject this_wide_stringdef_type_2 = null;

        EObject this_fixed_pt_const_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3563:6: ( (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3564:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3564:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )
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

                if ( (LA55_2==49) ) {
                    alt55=2;
                }
                else if ( (LA55_2==EOF||LA55_2==RULE_ID) ) {
                    alt55=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3564:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==49) ) {
                    alt55=3;
                }
                else if ( (LA55_3==EOF||LA55_3==RULE_ID) ) {
                    alt55=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3564:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )", 55, 3, input);

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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3564:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3565:2: this_primitive_def_0= ruleprimitive_def
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getPrimitive_defParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_ruleconst_type6354);
                    this_primitive_def_0=ruleprimitive_def();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_primitive_def_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3578:2: this_stringdef_type_1= rulestringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getStringdef_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_ruleconst_type6384);
                    this_stringdef_type_1=rulestringdef_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_stringdef_type_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3591:2: this_wide_stringdef_type_2= rulewide_stringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getWide_stringdef_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_ruleconst_type6414);
                    this_wide_stringdef_type_2=rulewide_stringdef_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_wide_stringdef_type_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3604:2: this_fixed_pt_const_type_3= rulefixed_pt_const_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getFixed_pt_const_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefixed_pt_const_type_in_ruleconst_type6444);
                    this_fixed_pt_const_type_3=rulefixed_pt_const_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_fixed_pt_const_type_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleconst_type


    // $ANTLR start entryRuleprimitive_def
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3623:1: entryRuleprimitive_def returns [EObject current=null] : iv_ruleprimitive_def= ruleprimitive_def EOF ;
    public final EObject entryRuleprimitive_def() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimitive_def = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3624:2: (iv_ruleprimitive_def= ruleprimitive_def EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3625:2: iv_ruleprimitive_def= ruleprimitive_def EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitive_defRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_entryRuleprimitive_def6479);
            iv_ruleprimitive_def=ruleprimitive_def();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleprimitive_def; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleprimitive_def6489); if (failed) return current;

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
    // $ANTLR end entryRuleprimitive_def


    // $ANTLR start ruleprimitive_def
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3632:1: ruleprimitive_def returns [EObject current=null] : (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type ) ;
    public final EObject ruleprimitive_def() throws RecognitionException {
        EObject current = null;

        EObject this_integer_type_0 = null;

        EObject this_floating_pt_type_1 = null;

        EObject this_charstr_type_2 = null;

        EObject this_other_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3637:6: ( (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3638:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3638:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )
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
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3638:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )", 56, 2, input);

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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3638:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3639:2: this_integer_type_0= ruleinteger_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getInteger_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_ruleprimitive_def6539);
                    this_integer_type_0=ruleinteger_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_integer_type_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3652:2: this_floating_pt_type_1= rulefloating_pt_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getFloating_pt_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefloating_pt_type_in_ruleprimitive_def6569);
                    this_floating_pt_type_1=rulefloating_pt_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_floating_pt_type_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3665:2: this_charstr_type_2= rulecharstr_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getCharstr_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulecharstr_type_in_ruleprimitive_def6599);
                    this_charstr_type_2=rulecharstr_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_charstr_type_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3678:2: this_other_type_3= ruleother_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getOther_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleother_type_in_ruleprimitive_def6629);
                    this_other_type_3=ruleother_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_other_type_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleprimitive_def


    // $ANTLR start entryRulesequence_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3697:1: entryRulesequence_type returns [EObject current=null] : iv_rulesequence_type= rulesequence_type EOF ;
    public final EObject entryRulesequence_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesequence_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3698:2: (iv_rulesequence_type= rulesequence_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3699:2: iv_rulesequence_type= rulesequence_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSequence_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesequence_type_in_entryRulesequence_type6664);
            iv_rulesequence_type=rulesequence_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesequence_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesequence_type6674); if (failed) return current;

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
    // $ANTLR end entryRulesequence_type


    // $ANTLR start rulesequence_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3706:1: rulesequence_type returns [EObject current=null] : ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' ) ;
    public final EObject rulesequence_type() throws RecognitionException {
        EObject current = null;

        EObject lv_containedType_2_0 = null;

        EObject lv_bound_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3711:6: ( ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3712:1: ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3712:1: ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3712:3: 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>'
            {
            match(input,48,FollowSets000.FOLLOW_48_in_rulesequence_type6709); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSequence_typeAccess().getSequenceKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulesequence_type6719); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSequence_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3720:1: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==48||(LA57_0>=51 && LA57_0<=57)||(LA57_0>=72 && LA57_0<=78)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_ID) ) {
                alt57=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3720:1: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3720:2: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3720:2: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3721:1: (lv_containedType_2_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3721:1: (lv_containedType_2_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3722:3: lv_containedType_2_0= rulesimple_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSequence_typeAccess().getContainedTypeSimple_type_specParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulesequence_type6741);
                    lv_containedType_2_0=rulesimple_type_spec();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSequence_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"containedType",
                      	        		lv_containedType_2_0, 
                      	        		"simple_type_spec", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3745:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3745:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3746:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3746:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3747:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getSequence_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulesequence_type6769); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSequence_typeAccess().getSharedTypeTypedefDefCrossReference_2_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3762:3: ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==25) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3762:5: ',' ( (lv_bound_5_0= ruleconst_exp ) )
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rulesequence_type6781); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequence_typeAccess().getCommaKeyword_3_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3766:1: ( (lv_bound_5_0= ruleconst_exp ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3767:1: (lv_bound_5_0= ruleconst_exp )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3767:1: (lv_bound_5_0= ruleconst_exp )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3768:3: lv_bound_5_0= ruleconst_exp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSequence_typeAccess().getBoundConst_expParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulesequence_type6802);
                    lv_bound_5_0=ruleconst_exp();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSequence_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"bound",
                      	        		lv_bound_5_0, 
                      	        		"const_exp", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,50,FollowSets000.FOLLOW_50_in_rulesequence_type6814); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSequence_typeAccess().getGreaterThanSignKeyword_4(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulesequence_type


    // $ANTLR start entryRulestringdef_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3802:1: entryRulestringdef_type returns [EObject current=null] : iv_rulestringdef_type= rulestringdef_type EOF ;
    public final EObject entryRulestringdef_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringdef_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3803:2: (iv_rulestringdef_type= rulestringdef_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3804:2: iv_rulestringdef_type= rulestringdef_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringdef_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_entryRulestringdef_type6850);
            iv_rulestringdef_type=rulestringdef_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestringdef_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulestringdef_type6860); if (failed) return current;

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
    // $ANTLR end entryRulestringdef_type


    // $ANTLR start rulestringdef_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3811:1: rulestringdef_type returns [EObject current=null] : ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) ;
    public final EObject rulestringdef_type() throws RecognitionException {
        EObject current = null;

        EObject lv_bound_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3816:6: ( ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3817:1: ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3817:1: ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3817:3: 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>'
            {
            match(input,51,FollowSets000.FOLLOW_51_in_rulestringdef_type6895); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringdef_typeAccess().getStringKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulestringdef_type6905); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringdef_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3825:1: ( (lv_bound_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3826:1: (lv_bound_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3826:1: (lv_bound_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3827:3: lv_bound_2_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStringdef_typeAccess().getBoundConst_expParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulestringdef_type6926);
            lv_bound_2_0=ruleconst_exp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringdef_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"bound",
              	        		lv_bound_2_0, 
              	        		"const_exp", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,50,FollowSets000.FOLLOW_50_in_rulestringdef_type6936); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringdef_typeAccess().getGreaterThanSignKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulestringdef_type


    // $ANTLR start entryRulewide_stringdef_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3861:1: entryRulewide_stringdef_type returns [EObject current=null] : iv_rulewide_stringdef_type= rulewide_stringdef_type EOF ;
    public final EObject entryRulewide_stringdef_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewide_stringdef_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3862:2: (iv_rulewide_stringdef_type= rulewide_stringdef_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3863:2: iv_rulewide_stringdef_type= rulewide_stringdef_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getWide_stringdef_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_entryRulewide_stringdef_type6972);
            iv_rulewide_stringdef_type=rulewide_stringdef_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulewide_stringdef_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulewide_stringdef_type6982); if (failed) return current;

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
    // $ANTLR end entryRulewide_stringdef_type


    // $ANTLR start rulewide_stringdef_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3870:1: rulewide_stringdef_type returns [EObject current=null] : ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) ;
    public final EObject rulewide_stringdef_type() throws RecognitionException {
        EObject current = null;

        EObject lv_bound_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3875:6: ( ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3876:1: ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3876:1: ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3876:3: 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>'
            {
            match(input,52,FollowSets000.FOLLOW_52_in_rulewide_stringdef_type7017); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWide_stringdef_typeAccess().getWstringKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulewide_stringdef_type7027); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWide_stringdef_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3884:1: ( (lv_bound_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3885:1: (lv_bound_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3885:1: (lv_bound_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3886:3: lv_bound_2_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWide_stringdef_typeAccess().getBoundConst_expParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulewide_stringdef_type7048);
            lv_bound_2_0=ruleconst_exp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getWide_stringdef_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"bound",
              	        		lv_bound_2_0, 
              	        		"const_exp", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,50,FollowSets000.FOLLOW_50_in_rulewide_stringdef_type7058); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWide_stringdef_typeAccess().getGreaterThanSignKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulewide_stringdef_type


    // $ANTLR start entryRulefixed_pt_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3920:1: entryRulefixed_pt_type returns [EObject current=null] : iv_rulefixed_pt_type= rulefixed_pt_type EOF ;
    public final EObject entryRulefixed_pt_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_pt_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3921:2: (iv_rulefixed_pt_type= rulefixed_pt_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3922:2: iv_rulefixed_pt_type= rulefixed_pt_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFixed_pt_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefixed_pt_type_in_entryRulefixed_pt_type7094);
            iv_rulefixed_pt_type=rulefixed_pt_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefixed_pt_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefixed_pt_type7104); if (failed) return current;

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
    // $ANTLR end entryRulefixed_pt_type


    // $ANTLR start rulefixed_pt_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3929:1: rulefixed_pt_type returns [EObject current=null] : ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' ) ;
    public final EObject rulefixed_pt_type() throws RecognitionException {
        EObject current = null;

        EObject lv_digits_2_0 = null;

        EObject lv_scale_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3934:6: ( ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3935:1: ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3935:1: ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3935:3: 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>'
            {
            match(input,53,FollowSets000.FOLLOW_53_in_rulefixed_pt_type7139); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_typeAccess().getFixedKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulefixed_pt_type7149); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3943:1: ( (lv_digits_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3944:1: (lv_digits_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3944:1: (lv_digits_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3945:3: lv_digits_2_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFixed_pt_typeAccess().getDigitsConst_expParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulefixed_pt_type7170);
            lv_digits_2_0=ruleconst_exp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFixed_pt_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"digits",
              	        		lv_digits_2_0, 
              	        		"const_exp", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,25,FollowSets000.FOLLOW_25_in_rulefixed_pt_type7180); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_typeAccess().getCommaKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3971:1: ( (lv_scale_4_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3972:1: (lv_scale_4_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3972:1: (lv_scale_4_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3973:3: lv_scale_4_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFixed_pt_typeAccess().getScaleConst_expParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulefixed_pt_type7201);
            lv_scale_4_0=ruleconst_exp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFixed_pt_typeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"scale",
              	        		lv_scale_4_0, 
              	        		"const_exp", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,50,FollowSets000.FOLLOW_50_in_rulefixed_pt_type7211); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_typeAccess().getGreaterThanSignKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulefixed_pt_type


    // $ANTLR start entryRulefloating_pt_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4007:1: entryRulefloating_pt_type returns [EObject current=null] : iv_rulefloating_pt_type= rulefloating_pt_type EOF ;
    public final EObject entryRulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloating_pt_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4008:2: (iv_rulefloating_pt_type= rulefloating_pt_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4009:2: iv_rulefloating_pt_type= rulefloating_pt_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloating_pt_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefloating_pt_type_in_entryRulefloating_pt_type7247);
            iv_rulefloating_pt_type=rulefloating_pt_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefloating_pt_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefloating_pt_type7257); if (failed) return current;

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
    // $ANTLR end entryRulefloating_pt_type


    // $ANTLR start rulefloating_pt_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4016:1: rulefloating_pt_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) ;
    public final EObject rulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4021:6: ( ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4022:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4022:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4022:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4022:2: ( (lv_kind_0_0= rulefloat_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4022:2: ( (lv_kind_0_0= rulefloat_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4023:1: (lv_kind_0_0= rulefloat_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4023:1: (lv_kind_0_0= rulefloat_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4024:3: lv_kind_0_0= rulefloat_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindFloat_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefloat_type_in_rulefloating_pt_type7303);
                    lv_kind_0_0=rulefloat_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFloating_pt_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_0_0, 
                      	        		"float_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4047:6: ( (lv_kind_1_0= ruledouble_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4047:6: ( (lv_kind_1_0= ruledouble_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4048:1: (lv_kind_1_0= ruledouble_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4048:1: (lv_kind_1_0= ruledouble_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4049:3: lv_kind_1_0= ruledouble_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindDouble_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruledouble_type_in_rulefloating_pt_type7330);
                    lv_kind_1_0=ruledouble_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFloating_pt_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_1_0, 
                      	        		"double_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4072:6: ( (lv_kind_2_0= rulelongdouble_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4072:6: ( (lv_kind_2_0= rulelongdouble_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4073:1: (lv_kind_2_0= rulelongdouble_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4073:1: (lv_kind_2_0= rulelongdouble_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4074:3: lv_kind_2_0= rulelongdouble_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindLongdouble_typeParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelongdouble_type_in_rulefloating_pt_type7357);
                    lv_kind_2_0=rulelongdouble_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFloating_pt_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_2_0, 
                      	        		"longdouble_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulefloating_pt_type


    // $ANTLR start entryRulelongdouble_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4104:1: entryRulelongdouble_type returns [String current=null] : iv_rulelongdouble_type= rulelongdouble_type EOF ;
    public final String entryRulelongdouble_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelongdouble_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4105:2: (iv_rulelongdouble_type= rulelongdouble_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4106:2: iv_rulelongdouble_type= rulelongdouble_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLongdouble_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulelongdouble_type_in_entryRulelongdouble_type7394);
            iv_rulelongdouble_type=rulelongdouble_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulelongdouble_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulelongdouble_type7405); if (failed) return current;

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
    // $ANTLR end entryRulelongdouble_type


    // $ANTLR start rulelongdouble_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4113:1: rulelongdouble_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'double' ) ;
    public final AntlrDatatypeRuleToken rulelongdouble_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4118:6: ( (kw= 'long' kw= 'double' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4119:1: (kw= 'long' kw= 'double' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4119:1: (kw= 'long' kw= 'double' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4120:2: kw= 'long' kw= 'double'
            {
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_rulelongdouble_type7443); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getLongdouble_typeAccess().getLongKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,55,FollowSets000.FOLLOW_55_in_rulelongdouble_type7456); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getLongdouble_typeAccess().getDoubleKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulelongdouble_type


    // $ANTLR start entryRuleinteger_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4139:1: entryRuleinteger_type returns [EObject current=null] : iv_ruleinteger_type= ruleinteger_type EOF ;
    public final EObject entryRuleinteger_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteger_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4140:2: (iv_ruleinteger_type= ruleinteger_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4141:2: iv_ruleinteger_type= ruleinteger_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInteger_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_entryRuleinteger_type7496);
            iv_ruleinteger_type=ruleinteger_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleinteger_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinteger_type7506); if (failed) return current;

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
    // $ANTLR end entryRuleinteger_type


    // $ANTLR start ruleinteger_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4148:1: ruleinteger_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) ;
    public final EObject ruleinteger_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;

        AntlrDatatypeRuleToken lv_kind_3_0 = null;

        AntlrDatatypeRuleToken lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_kind_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4153:6: ( ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4154:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4154:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt60=1;
                }
                break;
            case 54:
                {
                int LA60_2 = input.LA(2);

                if ( (LA60_2==54) ) {
                    alt60=3;
                }
                else if ( (LA60_2==EOF||LA60_2==RULE_ID||LA60_2==25||LA60_2==28||LA60_2==50) ) {
                    alt60=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4154:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 2, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA60_3 = input.LA(2);

                if ( (LA60_3==54) ) {
                    int LA60_6 = input.LA(3);

                    if ( (LA60_6==54) ) {
                        alt60=6;
                    }
                    else if ( (LA60_6==EOF||LA60_6==RULE_ID||LA60_6==25||LA60_6==28||LA60_6==50) ) {
                        alt60=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4154:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA60_3==57) ) {
                    alt60=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4154:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4154:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4154:2: ( (lv_kind_0_0= ruleshort_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4154:2: ( (lv_kind_0_0= ruleshort_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4155:1: (lv_kind_0_0= ruleshort_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4155:1: (lv_kind_0_0= ruleshort_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4156:3: lv_kind_0_0= ruleshort_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindShort_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleshort_type_in_ruleinteger_type7552);
                    lv_kind_0_0=ruleshort_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInteger_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_0_0, 
                      	        		"short_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4179:6: ( (lv_kind_1_0= rulelong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4179:6: ( (lv_kind_1_0= rulelong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4180:1: (lv_kind_1_0= rulelong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4180:1: (lv_kind_1_0= rulelong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4181:3: lv_kind_1_0= rulelong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindLong_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelong_type_in_ruleinteger_type7579);
                    lv_kind_1_0=rulelong_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInteger_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_1_0, 
                      	        		"long_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4204:6: ( (lv_kind_2_0= rulelonglong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4204:6: ( (lv_kind_2_0= rulelonglong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4205:1: (lv_kind_2_0= rulelonglong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4205:1: (lv_kind_2_0= rulelonglong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4206:3: lv_kind_2_0= rulelonglong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindLonglong_typeParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelonglong_type_in_ruleinteger_type7606);
                    lv_kind_2_0=rulelonglong_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInteger_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_2_0, 
                      	        		"longlong_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4229:6: ( (lv_kind_3_0= ruleushort_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4229:6: ( (lv_kind_3_0= ruleushort_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4230:1: (lv_kind_3_0= ruleushort_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4230:1: (lv_kind_3_0= ruleushort_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4231:3: lv_kind_3_0= ruleushort_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindUshort_typeParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleushort_type_in_ruleinteger_type7633);
                    lv_kind_3_0=ruleushort_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInteger_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_3_0, 
                      	        		"ushort_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4254:6: ( (lv_kind_4_0= ruleulong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4254:6: ( (lv_kind_4_0= ruleulong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4255:1: (lv_kind_4_0= ruleulong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4255:1: (lv_kind_4_0= ruleulong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4256:3: lv_kind_4_0= ruleulong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlong_typeParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleulong_type_in_ruleinteger_type7660);
                    lv_kind_4_0=ruleulong_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInteger_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_4_0, 
                      	        		"ulong_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4279:6: ( (lv_kind_5_0= ruleulonglong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4279:6: ( (lv_kind_5_0= ruleulonglong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4280:1: (lv_kind_5_0= ruleulonglong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4280:1: (lv_kind_5_0= ruleulonglong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4281:3: lv_kind_5_0= ruleulonglong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlonglong_typeParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleulonglong_type_in_ruleinteger_type7687);
                    lv_kind_5_0=ruleulonglong_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInteger_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_5_0, 
                      	        		"ulonglong_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleinteger_type


    // $ANTLR start entryRulelonglong_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4311:1: entryRulelonglong_type returns [String current=null] : iv_rulelonglong_type= rulelonglong_type EOF ;
    public final String entryRulelonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelonglong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4312:2: (iv_rulelonglong_type= rulelonglong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4313:2: iv_rulelonglong_type= rulelonglong_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLonglong_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulelonglong_type_in_entryRulelonglong_type7724);
            iv_rulelonglong_type=rulelonglong_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulelonglong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulelonglong_type7735); if (failed) return current;

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
    // $ANTLR end entryRulelonglong_type


    // $ANTLR start rulelonglong_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4320:1: rulelonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken rulelonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4325:6: ( (kw= 'long' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4326:1: (kw= 'long' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4326:1: (kw= 'long' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4327:2: kw= 'long' kw= 'long'
            {
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_rulelonglong_type7773); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getLonglong_typeAccess().getLongKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_rulelonglong_type7786); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getLonglong_typeAccess().getLongKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulelonglong_type


    // $ANTLR start entryRuleushort_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4346:1: entryRuleushort_type returns [String current=null] : iv_ruleushort_type= ruleushort_type EOF ;
    public final String entryRuleushort_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleushort_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4347:2: (iv_ruleushort_type= ruleushort_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4348:2: iv_ruleushort_type= ruleushort_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUshort_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleushort_type_in_entryRuleushort_type7827);
            iv_ruleushort_type=ruleushort_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleushort_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleushort_type7838); if (failed) return current;

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
    // $ANTLR end entryRuleushort_type


    // $ANTLR start ruleushort_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4355:1: ruleushort_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'short' ) ;
    public final AntlrDatatypeRuleToken ruleushort_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4360:6: ( (kw= 'unsigned' kw= 'short' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4361:1: (kw= 'unsigned' kw= 'short' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4361:1: (kw= 'unsigned' kw= 'short' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4362:2: kw= 'unsigned' kw= 'short'
            {
            kw=(Token)input.LT(1);
            match(input,56,FollowSets000.FOLLOW_56_in_ruleushort_type7876); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUshort_typeAccess().getUnsignedKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,57,FollowSets000.FOLLOW_57_in_ruleushort_type7889); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUshort_typeAccess().getShortKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleushort_type


    // $ANTLR start entryRuleulong_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4381:1: entryRuleulong_type returns [String current=null] : iv_ruleulong_type= ruleulong_type EOF ;
    public final String entryRuleulong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4382:2: (iv_ruleulong_type= ruleulong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4383:2: iv_ruleulong_type= ruleulong_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUlong_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleulong_type_in_entryRuleulong_type7930);
            iv_ruleulong_type=ruleulong_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleulong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleulong_type7941); if (failed) return current;

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
    // $ANTLR end entryRuleulong_type


    // $ANTLR start ruleulong_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4390:1: ruleulong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4395:6: ( (kw= 'unsigned' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4396:1: (kw= 'unsigned' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4396:1: (kw= 'unsigned' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4397:2: kw= 'unsigned' kw= 'long'
            {
            kw=(Token)input.LT(1);
            match(input,56,FollowSets000.FOLLOW_56_in_ruleulong_type7979); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlong_typeAccess().getUnsignedKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_ruleulong_type7992); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlong_typeAccess().getLongKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleulong_type


    // $ANTLR start entryRuleulonglong_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4416:1: entryRuleulonglong_type returns [String current=null] : iv_ruleulonglong_type= ruleulonglong_type EOF ;
    public final String entryRuleulonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulonglong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4417:2: (iv_ruleulonglong_type= ruleulonglong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4418:2: iv_ruleulonglong_type= ruleulonglong_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUlonglong_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleulonglong_type_in_entryRuleulonglong_type8033);
            iv_ruleulonglong_type=ruleulonglong_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleulonglong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleulonglong_type8044); if (failed) return current;

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
    // $ANTLR end entryRuleulonglong_type


    // $ANTLR start ruleulonglong_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4425:1: ruleulonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4430:6: ( (kw= 'unsigned' kw= 'long' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4431:1: (kw= 'unsigned' kw= 'long' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4431:1: (kw= 'unsigned' kw= 'long' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4432:2: kw= 'unsigned' kw= 'long' kw= 'long'
            {
            kw=(Token)input.LT(1);
            match(input,56,FollowSets000.FOLLOW_56_in_ruleulonglong_type8082); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlonglong_typeAccess().getUnsignedKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_ruleulonglong_type8095); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlonglong_typeAccess().getLongKeyword_1(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_ruleulonglong_type8108); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlonglong_typeAccess().getLongKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleulonglong_type


    // $ANTLR start entryRulecharstr_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4457:1: entryRulecharstr_type returns [EObject current=null] : iv_rulecharstr_type= rulecharstr_type EOF ;
    public final EObject entryRulecharstr_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharstr_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4458:2: (iv_rulecharstr_type= rulecharstr_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4459:2: iv_rulecharstr_type= rulecharstr_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCharstr_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulecharstr_type_in_entryRulecharstr_type8148);
            iv_rulecharstr_type=rulecharstr_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulecharstr_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecharstr_type8158); if (failed) return current;

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
    // $ANTLR end entryRulecharstr_type


    // $ANTLR start rulecharstr_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4466:1: rulecharstr_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) ;
    public final EObject rulecharstr_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        Enumerator lv_kind_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4471:6: ( ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4472:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4472:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4472:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4472:2: ( (lv_kind_0_0= rulechar_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4472:2: ( (lv_kind_0_0= rulechar_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4473:1: (lv_kind_0_0= rulechar_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4473:1: (lv_kind_0_0= rulechar_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4474:3: lv_kind_0_0= rulechar_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindChar_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulechar_type_in_rulecharstr_type8204);
                    lv_kind_0_0=rulechar_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCharstr_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_0_0, 
                      	        		"char_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4497:6: ( (lv_kind_1_0= rulewide_char_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4497:6: ( (lv_kind_1_0= rulewide_char_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4498:1: (lv_kind_1_0= rulewide_char_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4498:1: (lv_kind_1_0= rulewide_char_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4499:3: lv_kind_1_0= rulewide_char_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_char_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_char_type_in_rulecharstr_type8231);
                    lv_kind_1_0=rulewide_char_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCharstr_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_1_0, 
                      	        		"wide_char_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4522:6: ( (lv_kind_2_0= rulestring_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4522:6: ( (lv_kind_2_0= rulestring_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4523:1: (lv_kind_2_0= rulestring_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4523:1: (lv_kind_2_0= rulestring_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4524:3: lv_kind_2_0= rulestring_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindString_typeEnumRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestring_type_in_rulecharstr_type8258);
                    lv_kind_2_0=rulestring_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCharstr_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_2_0, 
                      	        		"string_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4547:6: ( (lv_kind_3_0= rulewide_string_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4547:6: ( (lv_kind_3_0= rulewide_string_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4548:1: (lv_kind_3_0= rulewide_string_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4548:1: (lv_kind_3_0= rulewide_string_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4549:3: lv_kind_3_0= rulewide_string_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_string_typeEnumRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_string_type_in_rulecharstr_type8285);
                    lv_kind_3_0=rulewide_string_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCharstr_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_3_0, 
                      	        		"wide_string_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulecharstr_type


    // $ANTLR start entryRuleother_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4579:1: entryRuleother_type returns [EObject current=null] : iv_ruleother_type= ruleother_type EOF ;
    public final EObject entryRuleother_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleother_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4580:2: (iv_ruleother_type= ruleother_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4581:2: iv_ruleother_type= ruleother_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOther_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleother_type_in_entryRuleother_type8321);
            iv_ruleother_type=ruleother_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleother_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleother_type8331); if (failed) return current;

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
    // $ANTLR end entryRuleother_type


    // $ANTLR start ruleother_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4588:1: ruleother_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) ;
    public final EObject ruleother_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4593:6: ( ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4594:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4594:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4594:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4594:2: ( (lv_kind_0_0= ruleboolean_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4594:2: ( (lv_kind_0_0= ruleboolean_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4595:1: (lv_kind_0_0= ruleboolean_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4595:1: (lv_kind_0_0= ruleboolean_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4596:3: lv_kind_0_0= ruleboolean_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOther_typeAccess().getKindBoolean_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolean_type_in_ruleother_type8377);
                    lv_kind_0_0=ruleboolean_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOther_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_0_0, 
                      	        		"boolean_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4619:6: ( (lv_kind_1_0= ruleoctet_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4619:6: ( (lv_kind_1_0= ruleoctet_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:1: (lv_kind_1_0= ruleoctet_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4620:1: (lv_kind_1_0= ruleoctet_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4621:3: lv_kind_1_0= ruleoctet_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOther_typeAccess().getKindOctet_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleoctet_type_in_ruleother_type8404);
                    lv_kind_1_0=ruleoctet_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOther_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_1_0, 
                      	        		"octet_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4644:6: ( (lv_kind_2_0= ruleany_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4644:6: ( (lv_kind_2_0= ruleany_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4645:1: (lv_kind_2_0= ruleany_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4645:1: (lv_kind_2_0= ruleany_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4646:3: lv_kind_2_0= ruleany_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOther_typeAccess().getKindAny_typeEnumRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleany_type_in_ruleother_type8431);
                    lv_kind_2_0=ruleany_type();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOther_typeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"kind",
                      	        		lv_kind_2_0, 
                      	        		"any_type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleother_type


    // $ANTLR start entryRulefixed_pt_const_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4676:1: entryRulefixed_pt_const_type returns [EObject current=null] : iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF ;
    public final EObject entryRulefixed_pt_const_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_pt_const_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4677:2: (iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4678:2: iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFixed_pt_const_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefixed_pt_const_type_in_entryRulefixed_pt_const_type8467);
            iv_rulefixed_pt_const_type=rulefixed_pt_const_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefixed_pt_const_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefixed_pt_const_type8477); if (failed) return current;

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
    // $ANTLR end entryRulefixed_pt_const_type


    // $ANTLR start rulefixed_pt_const_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4685:1: rulefixed_pt_const_type returns [EObject current=null] : ( () 'fixed' ) ;
    public final EObject rulefixed_pt_const_type() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4690:6: ( ( () 'fixed' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4691:1: ( () 'fixed' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4691:1: ( () 'fixed' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4691:2: () 'fixed'
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4691:2: ()
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4692:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getFixed_pt_const_typeAccess().getFixedDefAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getFixed_pt_const_typeAccess().getFixedDefAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,53,FollowSets000.FOLLOW_53_in_rulefixed_pt_const_type8524); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_const_typeAccess().getFixedKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulefixed_pt_const_type


    // $ANTLR start entryRuleconst_exp
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4717:1: entryRuleconst_exp returns [EObject current=null] : iv_ruleconst_exp= ruleconst_exp EOF ;
    public final EObject entryRuleconst_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_exp = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4718:2: (iv_ruleconst_exp= ruleconst_exp EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4719:2: iv_ruleconst_exp= ruleconst_exp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConst_expRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_entryRuleconst_exp8560);
            iv_ruleconst_exp=ruleconst_exp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconst_exp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_exp8570); if (failed) return current;

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
    // $ANTLR end entryRuleconst_exp


    // $ANTLR start ruleconst_exp
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4726:1: ruleconst_exp returns [EObject current=null] : this_or_expr_0= ruleor_expr ;
    public final EObject ruleconst_exp() throws RecognitionException {
        EObject current = null;

        EObject this_or_expr_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4731:6: (this_or_expr_0= ruleor_expr )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4733:2: this_or_expr_0= ruleor_expr
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getConst_expAccess().getOr_exprParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleor_expr_in_ruleconst_exp8619);
            this_or_expr_0=ruleor_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_or_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleconst_exp


    // $ANTLR start entryRuleor_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4752:1: entryRuleor_expr returns [EObject current=null] : iv_ruleor_expr= ruleor_expr EOF ;
    public final EObject entryRuleor_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleor_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4753:2: (iv_ruleor_expr= ruleor_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4754:2: iv_ruleor_expr= ruleor_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOr_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleor_expr_in_entryRuleor_expr8653);
            iv_ruleor_expr=ruleor_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleor_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleor_expr8663); if (failed) return current;

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
    // $ANTLR end entryRuleor_expr


    // $ANTLR start ruleor_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4761:1: ruleor_expr returns [EObject current=null] : (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* ) ;
    public final EObject ruleor_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_xor_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4766:6: ( (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4767:1: (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4767:1: (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4768:2: this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOr_exprAccess().getXor_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_ruleor_expr8713);
            this_xor_expr_0=rulexor_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_xor_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4779:1: ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==58) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4779:2: () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4779:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4780:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOr_exprAccess().getBinaryExpressionLeftAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOr_exprAccess().getBinaryExpressionLeftAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4798:2: ( (lv_operator_2_0= '|' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4799:1: (lv_operator_2_0= '|' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4799:1: (lv_operator_2_0= '|' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4800:3: lv_operator_2_0= '|'
            	    {
            	    lv_operator_2_0=(Token)input.LT(1);
            	    match(input,58,FollowSets000.FOLLOW_58_in_ruleor_expr8743); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getOr_exprAccess().getOperatorVerticalLineKeyword_1_1_0(), "operator"); 
            	          
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOr_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "operator", lv_operator_2_0, "|", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4819:2: ( (lv_right_3_0= rulexor_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4820:1: (lv_right_3_0= rulexor_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4820:1: (lv_right_3_0= rulexor_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4821:3: lv_right_3_0= rulexor_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOr_exprAccess().getRightXor_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_ruleor_expr8777);
            	    lv_right_3_0=rulexor_expr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOr_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_3_0, 
            	      	        		"xor_expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleor_expr


    // $ANTLR start entryRulexor_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4851:1: entryRulexor_expr returns [EObject current=null] : iv_rulexor_expr= rulexor_expr EOF ;
    public final EObject entryRulexor_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulexor_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4852:2: (iv_rulexor_expr= rulexor_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4853:2: iv_rulexor_expr= rulexor_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getXor_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_entryRulexor_expr8815);
            iv_rulexor_expr=rulexor_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulexor_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulexor_expr8825); if (failed) return current;

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
    // $ANTLR end entryRulexor_expr


    // $ANTLR start rulexor_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4860:1: rulexor_expr returns [EObject current=null] : (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* ) ;
    public final EObject rulexor_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_and_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4865:6: ( (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4866:1: (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4866:1: (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4867:2: this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getXor_exprAccess().getAnd_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_rulexor_expr8875);
            this_and_expr_0=ruleand_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_and_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4878:1: ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==59) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4878:2: () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4878:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4879:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getXor_exprAccess().getBinaryExpressionLeftAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getXor_exprAccess().getBinaryExpressionLeftAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4897:2: ( (lv_operator_2_0= '^' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4898:1: (lv_operator_2_0= '^' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4898:1: (lv_operator_2_0= '^' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4899:3: lv_operator_2_0= '^'
            	    {
            	    lv_operator_2_0=(Token)input.LT(1);
            	    match(input,59,FollowSets000.FOLLOW_59_in_rulexor_expr8905); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getXor_exprAccess().getOperatorCircumflexAccentKeyword_1_1_0(), "operator"); 
            	          
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getXor_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "operator", lv_operator_2_0, "^", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4918:2: ( (lv_right_3_0= ruleand_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4919:1: (lv_right_3_0= ruleand_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4919:1: (lv_right_3_0= ruleand_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4920:3: lv_right_3_0= ruleand_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getXor_exprAccess().getRightAnd_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_rulexor_expr8939);
            	    lv_right_3_0=ruleand_expr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getXor_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_3_0, 
            	      	        		"and_expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulexor_expr


    // $ANTLR start entryRuleand_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4950:1: entryRuleand_expr returns [EObject current=null] : iv_ruleand_expr= ruleand_expr EOF ;
    public final EObject entryRuleand_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4951:2: (iv_ruleand_expr= ruleand_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4952:2: iv_ruleand_expr= ruleand_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnd_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_entryRuleand_expr8977);
            iv_ruleand_expr=ruleand_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleand_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleand_expr8987); if (failed) return current;

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
    // $ANTLR end entryRuleand_expr


    // $ANTLR start ruleand_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4959:1: ruleand_expr returns [EObject current=null] : (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* ) ;
    public final EObject ruleand_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_shift_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4964:6: ( (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4965:1: (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4965:1: (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4966:2: this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAnd_exprAccess().getShift_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_ruleand_expr9037);
            this_shift_expr_0=ruleshift_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_shift_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4977:1: ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==60) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4977:2: () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4977:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4978:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAnd_exprAccess().getBinaryExpressionLeftAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAnd_exprAccess().getBinaryExpressionLeftAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4996:2: ( (lv_operator_2_0= '&' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4997:1: (lv_operator_2_0= '&' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4997:1: (lv_operator_2_0= '&' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4998:3: lv_operator_2_0= '&'
            	    {
            	    lv_operator_2_0=(Token)input.LT(1);
            	    match(input,60,FollowSets000.FOLLOW_60_in_ruleand_expr9067); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAnd_exprAccess().getOperatorAmpersandKeyword_1_1_0(), "operator"); 
            	          
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnd_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        
            	      	        try {
            	      	       		set(current, "operator", lv_operator_2_0, "&", lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5017:2: ( (lv_right_3_0= ruleshift_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5018:1: (lv_right_3_0= ruleshift_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5018:1: (lv_right_3_0= ruleshift_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5019:3: lv_right_3_0= ruleshift_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnd_exprAccess().getRightShift_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_ruleand_expr9101);
            	    lv_right_3_0=ruleshift_expr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAnd_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_3_0, 
            	      	        		"shift_expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleand_expr


    // $ANTLR start entryRuleshift_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5049:1: entryRuleshift_expr returns [EObject current=null] : iv_ruleshift_expr= ruleshift_expr EOF ;
    public final EObject entryRuleshift_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleshift_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5050:2: (iv_ruleshift_expr= ruleshift_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5051:2: iv_ruleshift_expr= ruleshift_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getShift_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_entryRuleshift_expr9139);
            iv_ruleshift_expr=ruleshift_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleshift_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleshift_expr9149); if (failed) return current;

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
    // $ANTLR end entryRuleshift_expr


    // $ANTLR start ruleshift_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5058:1: ruleshift_expr returns [EObject current=null] : (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* ) ;
    public final EObject ruleshift_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_add_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5063:6: ( (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5064:1: (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5064:1: (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5065:2: this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getShift_exprAccess().getAdd_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_ruleshift_expr9199);
            this_add_expr_0=ruleadd_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_add_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5076:1: ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=61 && LA67_0<=62)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5076:2: () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5076:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5077:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getShift_exprAccess().getBinaryExpressionLeftAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getShift_exprAccess().getBinaryExpressionLeftAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5095:2: ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5096:1: ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5096:1: ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5097:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5097:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==61) ) {
            	        alt66=1;
            	    }
            	    else if ( (LA66_0==62) ) {
            	        alt66=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("5097:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5098:3: lv_operator_2_1= '>>'
            	            {
            	            lv_operator_2_1=(Token)input.LT(1);
            	            match(input,61,FollowSets000.FOLLOW_61_in_ruleshift_expr9231); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getShift_exprAccess().getOperatorGreaterThanSignGreaterThanSignKeyword_1_1_0_0(), "operator"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getShift_exprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "operator", lv_operator_2_1, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5116:8: lv_operator_2_2= '<<'
            	            {
            	            lv_operator_2_2=(Token)input.LT(1);
            	            match(input,62,FollowSets000.FOLLOW_62_in_ruleshift_expr9260); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getShift_exprAccess().getOperatorLessThanSignLessThanSignKeyword_1_1_0_1(), "operator"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getShift_exprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "operator", lv_operator_2_2, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5137:2: ( (lv_right_3_0= ruleadd_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5138:1: (lv_right_3_0= ruleadd_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5138:1: (lv_right_3_0= ruleadd_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5139:3: lv_right_3_0= ruleadd_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getShift_exprAccess().getRightAdd_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_ruleshift_expr9297);
            	    lv_right_3_0=ruleadd_expr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getShift_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_3_0, 
            	      	        		"add_expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleshift_expr


    // $ANTLR start entryRuleadd_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5169:1: entryRuleadd_expr returns [EObject current=null] : iv_ruleadd_expr= ruleadd_expr EOF ;
    public final EObject entryRuleadd_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadd_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5170:2: (iv_ruleadd_expr= ruleadd_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5171:2: iv_ruleadd_expr= ruleadd_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdd_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_entryRuleadd_expr9335);
            iv_ruleadd_expr=ruleadd_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleadd_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleadd_expr9345); if (failed) return current;

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
    // $ANTLR end entryRuleadd_expr


    // $ANTLR start ruleadd_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5178:1: ruleadd_expr returns [EObject current=null] : (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* ) ;
    public final EObject ruleadd_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_mult_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5183:6: ( (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5184:1: (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5184:1: (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5185:2: this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAdd_exprAccess().getMult_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_ruleadd_expr9395);
            this_mult_expr_0=rulemult_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_mult_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5196:1: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=63 && LA69_0<=64)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5196:2: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5196:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5197:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAdd_exprAccess().getBinaryExpressionLeftAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAdd_exprAccess().getBinaryExpressionLeftAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5215:2: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5216:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5216:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5217:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5217:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==63) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==64) ) {
            	        alt68=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("5217:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5218:3: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)input.LT(1);
            	            match(input,63,FollowSets000.FOLLOW_63_in_ruleadd_expr9427); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdd_exprAccess().getOperatorPlusSignKeyword_1_1_0_0(), "operator"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getAdd_exprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "operator", lv_operator_2_1, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5236:8: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)input.LT(1);
            	            match(input,64,FollowSets000.FOLLOW_64_in_ruleadd_expr9456); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdd_exprAccess().getOperatorHyphenMinusKeyword_1_1_0_1(), "operator"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getAdd_exprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "operator", lv_operator_2_2, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5257:2: ( (lv_right_3_0= rulemult_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5258:1: (lv_right_3_0= rulemult_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5258:1: (lv_right_3_0= rulemult_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5259:3: lv_right_3_0= rulemult_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdd_exprAccess().getRightMult_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_ruleadd_expr9493);
            	    lv_right_3_0=rulemult_expr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAdd_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_3_0, 
            	      	        		"mult_expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleadd_expr


    // $ANTLR start entryRulemult_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5289:1: entryRulemult_expr returns [EObject current=null] : iv_rulemult_expr= rulemult_expr EOF ;
    public final EObject entryRulemult_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemult_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5290:2: (iv_rulemult_expr= rulemult_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5291:2: iv_rulemult_expr= rulemult_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMult_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_entryRulemult_expr9531);
            iv_rulemult_expr=rulemult_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemult_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemult_expr9541); if (failed) return current;

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
    // $ANTLR end entryRulemult_expr


    // $ANTLR start rulemult_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5298:1: rulemult_expr returns [EObject current=null] : (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* ) ;
    public final EObject rulemult_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_unary_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5303:6: ( (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5304:1: (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5304:1: (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5305:2: this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMult_exprAccess().getUnary_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_rulemult_expr9591);
            this_unary_expr_0=ruleunary_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_unary_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5316:1: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=65 && LA71_0<=67)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5316:2: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5316:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5317:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMult_exprAccess().getBinaryExpressionLeftAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMult_exprAccess().getBinaryExpressionLeftAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5335:2: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5336:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5336:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5337:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5337:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
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
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("5337:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )", 70, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt70) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5338:3: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)input.LT(1);
            	            match(input,65,FollowSets000.FOLLOW_65_in_rulemult_expr9623); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMult_exprAccess().getOperatorAsteriskKeyword_1_1_0_0(), "operator"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getMult_exprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "operator", lv_operator_2_1, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5356:8: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)input.LT(1);
            	            match(input,66,FollowSets000.FOLLOW_66_in_rulemult_expr9652); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMult_exprAccess().getOperatorSolidusKeyword_1_1_0_1(), "operator"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getMult_exprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "operator", lv_operator_2_2, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5374:8: lv_operator_2_3= '%'
            	            {
            	            lv_operator_2_3=(Token)input.LT(1);
            	            match(input,67,FollowSets000.FOLLOW_67_in_rulemult_expr9681); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMult_exprAccess().getOperatorPercentSignKeyword_1_1_0_2(), "operator"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getMult_exprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "operator", lv_operator_2_3, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5395:2: ( (lv_right_3_0= ruleunary_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5396:1: (lv_right_3_0= ruleunary_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5396:1: (lv_right_3_0= ruleunary_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5397:3: lv_right_3_0= ruleunary_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMult_exprAccess().getRightUnary_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_rulemult_expr9718);
            	    lv_right_3_0=ruleunary_expr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMult_exprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_3_0, 
            	      	        		"unary_expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulemult_expr


    // $ANTLR start entryRuleunary_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5427:1: entryRuleunary_expr returns [EObject current=null] : iv_ruleunary_expr= ruleunary_expr EOF ;
    public final EObject entryRuleunary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5428:2: (iv_ruleunary_expr= ruleunary_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5429:2: iv_ruleunary_expr= ruleunary_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnary_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_entryRuleunary_expr9756);
            iv_ruleunary_expr=ruleunary_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunary_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunary_expr9766); if (failed) return current;

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
    // $ANTLR end entryRuleunary_expr


    // $ANTLR start ruleunary_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5436:1: ruleunary_expr returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr ) ;
    public final EObject ruleunary_expr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject this_primary_expr_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5441:6: ( ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5442:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5442:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=63 && LA72_0<=64)||LA72_0==68) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_BOOLEAN_LITERAL)||LA72_0==27) ) {
                alt72=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5442:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5442:2: ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5442:2: ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5442:3: () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5442:3: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5443:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getUnary_exprAccess().getUnaryExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getUnary_exprAccess().getUnaryExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5456:2: ( (lv_operator_1_0= ruleunary_operator ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5457:1: (lv_operator_1_0= ruleunary_operator )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5457:1: (lv_operator_1_0= ruleunary_operator )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5458:3: lv_operator_1_0= ruleunary_operator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnary_exprAccess().getOperatorUnary_operatorParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunary_operator_in_ruleunary_expr9825);
                    lv_operator_1_0=ruleunary_operator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnary_exprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_1_0, 
                      	        		"unary_operator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5480:2: ( (lv_expression_2_0= ruleprimary_expr ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5481:1: (lv_expression_2_0= ruleprimary_expr )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5481:1: (lv_expression_2_0= ruleprimary_expr )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5482:3: lv_expression_2_0= ruleprimary_expr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnary_exprAccess().getExpressionPrimary_exprParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_ruleunary_expr9846);
                    lv_expression_2_0=ruleprimary_expr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnary_exprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_2_0, 
                      	        		"primary_expr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5506:2: this_primary_expr_3= ruleprimary_expr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_ruleunary_expr9878);
                    this_primary_expr_3=ruleprimary_expr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_primary_expr_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleunary_expr


    // $ANTLR start entryRuleunary_operator
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5525:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5526:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5527:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnary_operatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_operator_in_entryRuleunary_operator9914);
            iv_ruleunary_operator=ruleunary_operator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunary_operator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunary_operator9925); if (failed) return current;

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
    // $ANTLR end entryRuleunary_operator


    // $ANTLR start ruleunary_operator
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5534:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5539:6: ( (kw= '-' | kw= '+' | kw= '~' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5540:1: (kw= '-' | kw= '+' | kw= '~' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5540:1: (kw= '-' | kw= '+' | kw= '~' )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5540:1: (kw= '-' | kw= '+' | kw= '~' )", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5541:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleunary_operator9963); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5548:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,63,FollowSets000.FOLLOW_63_in_ruleunary_operator9982); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5555:2: kw= '~'
                    {
                    kw=(Token)input.LT(1);
                    match(input,68,FollowSets000.FOLLOW_68_in_ruleunary_operator10001); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnary_operatorAccess().getTildeKeyword_2(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleunary_operator


    // $ANTLR start entryRuleprimary_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5568:1: entryRuleprimary_expr returns [EObject current=null] : iv_ruleprimary_expr= ruleprimary_expr EOF ;
    public final EObject entryRuleprimary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimary_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5569:2: (iv_ruleprimary_expr= ruleprimary_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5570:2: iv_ruleprimary_expr= ruleprimary_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimary_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_entryRuleprimary_expr10041);
            iv_ruleprimary_expr=ruleprimary_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleprimary_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleprimary_expr10051); if (failed) return current;

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
    // $ANTLR end entryRuleprimary_expr


    // $ANTLR start ruleprimary_expr
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5577:1: ruleprimary_expr returns [EObject current=null] : (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) ) ;
    public final EObject ruleprimary_expr() throws RecognitionException {
        EObject current = null;

        EObject this_constantDefRef_0 = null;

        EObject this_valueExpression_1 = null;

        EObject this_const_exp_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5582:6: ( (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5583:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5583:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5583:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) )", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5584:2: this_constantDefRef_0= ruleconstantDefRef
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimary_exprAccess().getConstantDefRefParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconstantDefRef_in_ruleprimary_expr10101);
                    this_constantDefRef_0=ruleconstantDefRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_constantDefRef_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5597:2: this_valueExpression_1= rulevalueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimary_exprAccess().getValueExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulevalueExpression_in_ruleprimary_expr10131);
                    this_valueExpression_1=rulevalueExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_valueExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5609:6: ( '(' this_const_exp_3= ruleconst_exp ')' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5609:6: ( '(' this_const_exp_3= ruleconst_exp ')' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5609:8: '(' this_const_exp_3= ruleconst_exp ')'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleprimary_expr10147); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimary_exprAccess().getConst_expParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_ruleprimary_expr10172);
                    this_const_exp_3=ruleconst_exp();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_const_exp_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleprimary_expr10181); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleprimary_expr


    // $ANTLR start entryRuleconstantDefRef
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5637:1: entryRuleconstantDefRef returns [EObject current=null] : iv_ruleconstantDefRef= ruleconstantDefRef EOF ;
    public final EObject entryRuleconstantDefRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefRef = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5638:2: (iv_ruleconstantDefRef= ruleconstantDefRef EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5639:2: iv_ruleconstantDefRef= ruleconstantDefRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefRefRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconstantDefRef_in_entryRuleconstantDefRef10218);
            iv_ruleconstantDefRef=ruleconstantDefRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconstantDefRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconstantDefRef10228); if (failed) return current;

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
    // $ANTLR end entryRuleconstantDefRef


    // $ANTLR start ruleconstantDefRef
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5646:1: ruleconstantDefRef returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleconstantDefRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5651:6: ( ( ( RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5652:1: ( ( RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5652:1: ( ( RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5653:1: ( RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5653:1: ( RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5654:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getConstantDefRefRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstantDefRef10274); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getConstantDefRefAccess().getConstantConstantCrossReference_0(), "constant"); 
              	
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleconstantDefRef


    // $ANTLR start entryRulevalueExpression
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5677:1: entryRulevalueExpression returns [EObject current=null] : iv_rulevalueExpression= rulevalueExpression EOF ;
    public final EObject entryRulevalueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalueExpression = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5678:2: (iv_rulevalueExpression= rulevalueExpression EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5679:2: iv_rulevalueExpression= rulevalueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulevalueExpression_in_entryRulevalueExpression10309);
            iv_rulevalueExpression=rulevalueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulevalueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalueExpression10319); if (failed) return current;

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
    // $ANTLR end entryRulevalueExpression


    // $ANTLR start rulevalueExpression
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5686:1: rulevalueExpression returns [EObject current=null] : ( (lv_value_0_0= ruleliteral ) ) ;
    public final EObject rulevalueExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5691:6: ( ( (lv_value_0_0= ruleliteral ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5692:1: ( (lv_value_0_0= ruleliteral ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5692:1: ( (lv_value_0_0= ruleliteral ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5693:1: (lv_value_0_0= ruleliteral )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5693:1: (lv_value_0_0= ruleliteral )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5694:3: lv_value_0_0= ruleliteral
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getValueLiteralParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleliteral_in_rulevalueExpression10364);
            lv_value_0_0=ruleliteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getValueExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"literal", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulevalueExpression


    // $ANTLR start entryRuleliteral
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5724:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5725:2: (iv_ruleliteral= ruleliteral EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5726:2: iv_ruleliteral= ruleliteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleliteral_in_entryRuleliteral10400);
            iv_ruleliteral=ruleliteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleliteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleliteral10411); if (failed) return current;

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
    // $ANTLR end entryRuleliteral


    // $ANTLR start ruleliteral
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5733:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleliteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_HEX_LITERAL_2=null;
        Token this_WIDE_STRING_LITERAL_3=null;
        Token this_FIXED_PT_LITERAL_4=null;
        Token this_FLOATING_PT_LITERAL_5=null;
        Token this_BOOLEAN_LITERAL_6=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5738:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5739:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5739:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5739:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5739:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleliteral10451); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5747:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleliteral10477); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5755:10: this_HEX_LITERAL_2= RULE_HEX_LITERAL
                    {
                    this_HEX_LITERAL_2=(Token)input.LT(1);
                    match(input,RULE_HEX_LITERAL,FollowSets000.FOLLOW_RULE_HEX_LITERAL_in_ruleliteral10503); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_HEX_LITERAL_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getHEX_LITERALTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5763:10: this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL
                    {
                    this_WIDE_STRING_LITERAL_3=(Token)input.LT(1);
                    match(input,RULE_WIDE_STRING_LITERAL,FollowSets000.FOLLOW_RULE_WIDE_STRING_LITERAL_in_ruleliteral10529); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_WIDE_STRING_LITERAL_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getWIDE_STRING_LITERALTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5771:10: this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL
                    {
                    this_FIXED_PT_LITERAL_4=(Token)input.LT(1);
                    match(input,RULE_FIXED_PT_LITERAL,FollowSets000.FOLLOW_RULE_FIXED_PT_LITERAL_in_ruleliteral10555); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_FIXED_PT_LITERAL_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getFIXED_PT_LITERALTerminalRuleCall_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5779:10: this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL
                    {
                    this_FLOATING_PT_LITERAL_5=(Token)input.LT(1);
                    match(input,RULE_FLOATING_PT_LITERAL,FollowSets000.FOLLOW_RULE_FLOATING_PT_LITERAL_in_ruleliteral10581); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_FLOATING_PT_LITERAL_5);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getFLOATING_PT_LITERALTerminalRuleCall_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5787:10: this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL
                    {
                    this_BOOLEAN_LITERAL_6=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN_LITERAL,FollowSets000.FOLLOW_RULE_BOOLEAN_LITERAL_in_ruleliteral10607); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_BOOLEAN_LITERAL_6);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getBOOLEAN_LITERALTerminalRuleCall_6(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleliteral


    // $ANTLR start ruleparam_attribute
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5802:1: ruleparam_attribute returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) | ( 'inout' ) ) ;
    public final Enumerator ruleparam_attribute() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5806:6: ( ( ( 'in' ) | ( 'out' ) | ( 'inout' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5807:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5807:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )
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
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5807:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5807:2: ( 'in' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5807:2: ( 'in' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5807:4: 'in'
                    {
                    match(input,69,FollowSets000.FOLLOW_69_in_ruleparam_attribute10664); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5813:6: ( 'out' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5813:6: ( 'out' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5813:8: 'out'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleparam_attribute10679); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5819:6: ( 'inout' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5819:6: ( 'inout' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5819:8: 'inout'
                    {
                    match(input,71,FollowSets000.FOLLOW_71_in_ruleparam_attribute10694); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_INOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParam_attributeAccess().getPARAM_INOUTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleparam_attribute


    // $ANTLR start rulefloat_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5829:1: rulefloat_type returns [Enumerator current=null] : ( 'float' ) ;
    public final Enumerator rulefloat_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5833:6: ( ( 'float' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5834:1: ( 'float' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5834:1: ( 'float' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5834:3: 'float'
            {
            match(input,72,FollowSets000.FOLLOW_72_in_rulefloat_type10736); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getFloat_typeAccess().getPK_FLOATEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getFloat_typeAccess().getPK_FLOATEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulefloat_type


    // $ANTLR start ruledouble_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5844:1: ruledouble_type returns [Enumerator current=null] : ( 'double' ) ;
    public final Enumerator ruledouble_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5848:6: ( ( 'double' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5849:1: ( 'double' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5849:1: ( 'double' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5849:3: 'double'
            {
            match(input,55,FollowSets000.FOLLOW_55_in_ruledouble_type10777); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getDouble_typeAccess().getPK_DOUBLEEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getDouble_typeAccess().getPK_DOUBLEEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruledouble_type


    // $ANTLR start ruleshort_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5859:1: ruleshort_type returns [Enumerator current=null] : ( 'short' ) ;
    public final Enumerator ruleshort_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5863:6: ( ( 'short' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5864:1: ( 'short' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5864:1: ( 'short' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5864:3: 'short'
            {
            match(input,57,FollowSets000.FOLLOW_57_in_ruleshort_type10818); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getShort_typeAccess().getPK_SHORTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getShort_typeAccess().getPK_SHORTEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleshort_type


    // $ANTLR start rulelong_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5874:1: rulelong_type returns [Enumerator current=null] : ( 'long' ) ;
    public final Enumerator rulelong_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5878:6: ( ( 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5879:1: ( 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5879:1: ( 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5879:3: 'long'
            {
            match(input,54,FollowSets000.FOLLOW_54_in_rulelong_type10859); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getLong_typeAccess().getPK_LONGEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getLong_typeAccess().getPK_LONGEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulelong_type


    // $ANTLR start rulechar_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5889:1: rulechar_type returns [Enumerator current=null] : ( 'char' ) ;
    public final Enumerator rulechar_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5893:6: ( ( 'char' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5894:1: ( 'char' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5894:1: ( 'char' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5894:3: 'char'
            {
            match(input,73,FollowSets000.FOLLOW_73_in_rulechar_type10900); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getChar_typeAccess().getPK_CHAREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getChar_typeAccess().getPK_CHAREnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulechar_type


    // $ANTLR start rulewide_char_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5904:1: rulewide_char_type returns [Enumerator current=null] : ( 'wchar' ) ;
    public final Enumerator rulewide_char_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5908:6: ( ( 'wchar' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5909:1: ( 'wchar' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5909:1: ( 'wchar' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5909:3: 'wchar'
            {
            match(input,74,FollowSets000.FOLLOW_74_in_rulewide_char_type10941); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getWide_char_typeAccess().getPK_WCHAREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getWide_char_typeAccess().getPK_WCHAREnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulewide_char_type


    // $ANTLR start rulestring_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5919:1: rulestring_type returns [Enumerator current=null] : ( 'string' ) ;
    public final Enumerator rulestring_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5923:6: ( ( 'string' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5924:1: ( 'string' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5924:1: ( 'string' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5924:3: 'string'
            {
            match(input,51,FollowSets000.FOLLOW_51_in_rulestring_type10982); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getString_typeAccess().getPK_STRINGEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getString_typeAccess().getPK_STRINGEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulestring_type


    // $ANTLR start rulewide_string_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5934:1: rulewide_string_type returns [Enumerator current=null] : ( 'wstring' ) ;
    public final Enumerator rulewide_string_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5938:6: ( ( 'wstring' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5939:1: ( 'wstring' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5939:1: ( 'wstring' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5939:3: 'wstring'
            {
            match(input,52,FollowSets000.FOLLOW_52_in_rulewide_string_type11023); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getWide_string_typeAccess().getPK_WSTRINGEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getWide_string_typeAccess().getPK_WSTRINGEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulewide_string_type


    // $ANTLR start ruleboolean_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5949:1: ruleboolean_type returns [Enumerator current=null] : ( 'boolean' ) ;
    public final Enumerator ruleboolean_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5953:6: ( ( 'boolean' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5954:1: ( 'boolean' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5954:1: ( 'boolean' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5954:3: 'boolean'
            {
            match(input,75,FollowSets000.FOLLOW_75_in_ruleboolean_type11064); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getBoolean_typeAccess().getPK_BOOLEANEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getBoolean_typeAccess().getPK_BOOLEANEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleboolean_type


    // $ANTLR start ruleoctet_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5964:1: ruleoctet_type returns [Enumerator current=null] : ( 'octet' ) ;
    public final Enumerator ruleoctet_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5968:6: ( ( 'octet' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5969:1: ( 'octet' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5969:1: ( 'octet' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5969:3: 'octet'
            {
            match(input,76,FollowSets000.FOLLOW_76_in_ruleoctet_type11105); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOctet_typeAccess().getPK_OCTETEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOctet_typeAccess().getPK_OCTETEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleoctet_type


    // $ANTLR start ruleany_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5979:1: ruleany_type returns [Enumerator current=null] : ( 'any' ) ;
    public final Enumerator ruleany_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5983:6: ( ( 'any' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5984:1: ( 'any' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5984:1: ( 'any' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5984:3: 'any'
            {
            match(input,77,FollowSets000.FOLLOW_77_in_ruleany_type11146); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getAny_typeAccess().getPK_ANYEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getAny_typeAccess().getPK_ANYEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleany_type


    // $ANTLR start ruleobject_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5994:1: ruleobject_type returns [Enumerator current=null] : ( 'Object' ) ;
    public final Enumerator ruleobject_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5998:6: ( ( 'Object' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5999:1: ( 'Object' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5999:1: ( 'Object' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5999:3: 'Object'
            {
            match(input,78,FollowSets000.FOLLOW_78_in_ruleobject_type11187); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getObject_typeAccess().getPK_OBJREFEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getObject_typeAccess().getPK_OBJREFEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleobject_type


    // $ANTLR start rulevoid_type
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6009:1: rulevoid_type returns [Enumerator current=null] : ( 'void' ) ;
    public final Enumerator rulevoid_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6013:6: ( ( 'void' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6014:1: ( 'void' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6014:1: ( 'void' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6014:3: 'void'
            {
            match(input,79,FollowSets000.FOLLOW_79_in_rulevoid_type11228); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getVoid_typeAccess().getPK_VOIDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getVoid_typeAccess().getPK_VOIDEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulevoid_type

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:2: ( ( 'typedef' ( ( rulearray_type_spec ) ) ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:2: ( 'typedef' ( ( rulearray_type_spec ) ) )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:2: ( 'typedef' ( ( rulearray_type_spec ) ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2055:4: 'typedef' ( ( rulearray_type_spec ) )
        {
        match(input,37,FollowSets000.FOLLOW_37_in_synpred513707); if (failed) return ;
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2059:1: ( ( rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2060:1: ( rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2060:1: ( rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2061:3: rulearray_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred513728);
        rulearray_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred61
    public final void synpred61_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:2: ( ( ( ( rulearray_type_spec ) ) ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:2: ( ( ( rulearray_type_spec ) ) ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:2: ( ( ( rulearray_type_spec ) ) ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:3: ( ( rulearray_type_spec ) ) ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2565:3: ( ( rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2566:1: ( rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2566:1: ( rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2567:3: rulearray_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeArray_type_specParserRuleCall_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred614680);
        rulearray_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,17,FollowSets000.FOLLOW_17_in_synpred614690); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred61

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:6: ( ( ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:6: ( ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:6: ( ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:7: ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2594:7: ( ( rulesimple_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2595:1: ( rulesimple_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2595:1: ( rulesimple_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2596:3: rulesimple_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeSimple_type_specParserRuleCall_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_synpred624719);
        rulesimple_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2618:2: ( ( RULE_ID ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2619:1: ( RULE_ID )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2619:1: ( RULE_ID )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2620:3: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred624736); if (failed) return ;

        }


        }

        match(input,17,FollowSets000.FOLLOW_17_in_synpred624751); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred71
    public final void synpred71_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:2: ( ( ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:2: ( ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:2: ( ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:3: ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:3: ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+
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
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:4: ( 'case' ( ( ruleconst_exp ) ) ':' )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:4: ( 'case' ( ( ruleconst_exp ) ) ':' )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3031:6: 'case' ( ( ruleconst_exp ) ) ':'
        	    {
        	    match(input,43,FollowSets000.FOLLOW_43_in_synpred715392); if (failed) return ;
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3035:1: ( ( ruleconst_exp ) )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3036:1: ( ruleconst_exp )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3036:1: ( ruleconst_exp )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3037:3: ruleconst_exp
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_0_0_0_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_synpred715413);
        	    ruleconst_exp();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    match(input,24,FollowSets000.FOLLOW_24_in_synpred715423); if (failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:6: ( 'default' ':' )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:6: ( 'default' ':' )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:8: 'default' ':'
        	    {
        	    match(input,44,FollowSets000.FOLLOW_44_in_synpred715441); if (failed) return ;
        	    match(input,24,FollowSets000.FOLLOW_24_in_synpred715451); if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt93 >= 1 ) break loop93;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(93, input);
                    throw eee;
            }
            cnt93++;
        } while (true);

        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3072:4: ( ( rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3073:1: ( rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3073:1: ( rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3074:3: rulearray_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred715475);
        rulearray_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,17,FollowSets000.FOLLOW_17_in_synpred715485); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred71

    public final boolean synpred71() {
        backtracking++;
        int start = input.mark();
        try {
            synpred71_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred62() {
        backtracking++;
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred61() {
        backtracking++;
        int start = input.mark();
        try {
            synpred61_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulespecification_in_entryRulespecification81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulespecification91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinclude_decl_in_rulespecification149 = new BitSet(new long[]{0x0000633800E50002L});
        public static final BitSet FOLLOW_ruledefinition_in_rulespecification171 = new BitSet(new long[]{0x0000633800E40002L});
        public static final BitSet FOLLOW_ruleinclude_decl_in_entryRuleinclude_decl208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinclude_decl218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleinclude_decl253 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleinclude_decl270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledefinition_in_entryRuledefinition311 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuledefinition321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_ruledefinition372 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_ruledefinition414 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_ruledefinition456 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_decl_in_ruledefinition498 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_fwd_in_ruledefinition540 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemodule_in_ruledefinition582 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruledefinition591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemodule_in_entryRulemodule628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemodule638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rulemodule673 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemodule690 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulemodule705 = new BitSet(new long[]{0x0000633800F60000L});
        public static final BitSet FOLLOW_ruledefinition_in_rulemodule727 = new BitSet(new long[]{0x0000633800F60000L});
        public static final BitSet FOLLOW_17_in_rulemodule743 = new BitSet(new long[]{0x0000633800F60000L});
        public static final BitSet FOLLOW_20_in_rulemodule755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_decl_in_entryRuleinterface_decl791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinterface_decl801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleinterface_decl845 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleinterface_decl882 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleinterface_decl907 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl924 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_24_in_ruleinterface_decl940 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl962 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_25_in_ruleinterface_decl973 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl995 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_19_in_ruleinterface_decl1009 = new BitSet(new long[]{0x03D8633984120020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_ruleexport_in_ruleinterface_decl1031 = new BitSet(new long[]{0x03D8633984120020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_17_in_ruleinterface_decl1047 = new BitSet(new long[]{0x03D8633984120020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_20_in_ruleinterface_decl1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_fwd_in_entryRuleinterface_fwd1095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinterface_fwd1105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleinterface_fwd1141 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleinterface_fwd1157 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleinterface_fwd1169 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_fwd1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexport_in_entryRuleexport1227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleexport1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_ruleexport1288 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_ruleexport1330 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_ruleexport1372 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_decl_in_ruleexport1414 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_decl_in_ruleexport1456 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_decl_in_entryRuleop_decl1502 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleop_decl1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleop_decl1555 = new BitSet(new long[]{0x03D8000000000020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_ruleop_type_spec_in_ruleop_decl1591 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1619 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1637 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1652 = new BitSet(new long[]{0x0000000010000000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleparam_decl_in_ruleop_decl1674 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1685 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleparam_decl_in_ruleop_decl1706 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1720 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_29_in_ruleop_decl1731 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1741 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1763 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1774 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1796 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1808 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleop_decl1821 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1831 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleop_decl1848 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1864 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleop_decl1881 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_type_spec_in_entryRuleop_type_spec1936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleop_type_spec1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleop_type_spec1996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevoid_type_in_ruleop_type_spec2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleparam_decl_in_entryRuleparam_decl2072 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleparam_decl2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleparam_attribute_in_ruleparam_decl2128 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleparam_decl2150 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleparam_decl2178 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleparam_decl2196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_decl_in_entryRuleattr_decl2237 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleattr_decl2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereadonly_attr_spec_in_ruleattr_decl2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_spec_in_ruleattr_decl2327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereadonly_attr_spec_in_entryRulereadonly_attr_spec2362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulereadonly_attr_spec2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulereadonly_attr_spec2416 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulereadonly_attr_spec2439 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2461 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2489 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2507 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulereadonly_attr_spec2522 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulereadonly_attr_spec2532 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2554 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_rulereadonly_attr_spec2565 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2587 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_rulereadonly_attr_spec2599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulereadonly_attr_spec2625 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulereadonly_attr_spec2648 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2670 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2698 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_spec_in_entryRuleattr_spec2758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleattr_spec2768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleattr_spec2804 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleattr_spec2826 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2854 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2872 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleattr_spec2889 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec2899 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2921 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec2932 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2954 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec2966 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleattr_spec2977 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec2987 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3009 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec3020 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3042 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec3054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleattr_spec3074 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec3084 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3106 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec3117 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3139 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec3151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleattr_spec3171 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleattr_spec3193 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3221 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_entryRuleexcept_decl3281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleexcept_decl3291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleexcept_decl3326 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleexcept_decl3343 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleexcept_decl3358 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulemember_in_ruleexcept_decl3379 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_20_in_ruleexcept_decl3390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_entryRuletype_decl3426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletype_decl3436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulealias_type_in_ruletype_decl3486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_ruletype_decl3516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunion_type_in_ruletype_decl3546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_ruletype_decl3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruletype_decl3592 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruletype_decl3601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstr_forward_decl_in_ruletype_decl3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulealias_type_in_entryRulealias_type3661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulealias_type3671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulealias_type3707 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulealias_type3728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulealias_type3746 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulealias_type3768 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulealias_type3796 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulealias_type3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_entryRulearray_type_spec3856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulearray_type_spec3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulearray_type_spec3913 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulearray_type_spec3941 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulearray_type_spec3959 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_rulearray_type_spec3975 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulearray_type_spec3996 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulearray_type_spec4006 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_entryRulesimple_type_spec4044 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesimple_type_spec4054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulesimple_type_spec4104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletemplate_type_spec_in_rulesimple_type_spec4134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_entryRulebase_type_spec4169 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebase_type_spec4179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_rulebase_type_spec4229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleobject_type_in_rulebase_type_spec4255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletemplate_type_spec_in_entryRuletemplate_type_spec4291 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletemplate_type_spec4301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesequence_type_in_ruletemplate_type_spec4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_ruletemplate_type_spec4381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_ruletemplate_type_spec4411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_type_in_ruletemplate_type_spec4441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_entryRulestruct_type4478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulestruct_type4488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulestruct_type4523 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulestruct_type4540 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulestruct_type4555 = new BitSet(new long[]{0x03F9010000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulemember_in_rulestruct_type4576 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_20_in_rulestruct_type4587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemember_in_entryRulemember4623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemember4633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulemember4680 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulemember4719 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4736 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_rulemember4780 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4797 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4842 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4859 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunion_type_in_entryRuleunion_type4911 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunion_type4921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleunion_type4956 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleunion_type4973 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleunion_type4988 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleunion_type4998 = new BitSet(new long[]{0x0340200000000020L,0x0000000000000A00L});
        public static final BitSet FOLLOW_ruleswitch_type_spec_cont_in_ruleunion_type5020 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleunion_type5048 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleunion_type5059 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleunion_type5069 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_rulecase_stmt_in_ruleunion_type5090 = new BitSet(new long[]{0x0000180000100000L});
        public static final BitSet FOLLOW_20_in_ruleunion_type5101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleswitch_type_spec_cont_in_entryRuleswitch_type_spec_cont5137 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleswitch_type_spec_cont5147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_ruleswitch_type_spec_cont5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulechar_type_in_ruleswitch_type_spec_cont5236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolean_type_in_ruleswitch_type_spec_cont5277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_ruleswitch_type_spec_cont5309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecase_stmt_in_entryRulecase_stmt5344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecase_stmt5354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulecase_stmt5392 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulecase_stmt5413 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5423 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_rulecase_stmt5441 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5451 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulecase_stmt5475 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulecase_stmt5485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulecase_stmt5505 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulecase_stmt5526 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5536 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_rulecase_stmt5554 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5564 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulecase_stmt5589 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulecase_stmt5617 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulecase_stmt5635 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulecase_stmt5650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_entryRuleenum_type5687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleenum_type5697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleenum_type5732 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleenum_type5749 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleenum_type5764 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleenum_member_in_ruleenum_type5785 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_25_in_ruleenum_type5796 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleenum_member_in_ruleenum_type5817 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_20_in_ruleenum_type5829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_member_in_entryRuleenum_member5865 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleenum_member5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleenum_member5916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstr_forward_decl_in_entryRuleconstr_forward_decl5957 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconstr_forward_decl5968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleconstr_forward_decl6007 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstr_forward_decl6022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleconstr_forward_decl6048 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstr_forward_decl6063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_entryRuleconst_decl6109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_decl6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleconst_decl6154 = new BitSet(new long[]{0x03F8000000000020L,0x0000000000003F00L});
        public static final BitSet FOLLOW_ruleconst_type_in_ruleconst_decl6176 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconst_decl6204 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconst_decl6222 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleconst_decl6237 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_ruleconst_decl6258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_type_in_entryRuleconst_type6294 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_type6304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_ruleconst_type6354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_ruleconst_type6384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_ruleconst_type6414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_const_type_in_ruleconst_type6444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_entryRuleprimitive_def6479 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleprimitive_def6489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_ruleprimitive_def6539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloating_pt_type_in_ruleprimitive_def6569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecharstr_type_in_ruleprimitive_def6599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleother_type_in_ruleprimitive_def6629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesequence_type_in_entryRulesequence_type6664 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesequence_type6674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulesequence_type6709 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulesequence_type6719 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulesequence_type6741 = new BitSet(new long[]{0x0004000002000000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulesequence_type6769 = new BitSet(new long[]{0x0004000002000000L});
        public static final BitSet FOLLOW_25_in_rulesequence_type6781 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulesequence_type6802 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulesequence_type6814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_entryRulestringdef_type6850 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulestringdef_type6860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulestringdef_type6895 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulestringdef_type6905 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulestringdef_type6926 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulestringdef_type6936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_entryRulewide_stringdef_type6972 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulewide_stringdef_type6982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulewide_stringdef_type7017 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulewide_stringdef_type7027 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulewide_stringdef_type7048 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulewide_stringdef_type7058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_type_in_entryRulefixed_pt_type7094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefixed_pt_type7104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulefixed_pt_type7139 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulefixed_pt_type7149 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulefixed_pt_type7170 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulefixed_pt_type7180 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulefixed_pt_type7201 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulefixed_pt_type7211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloating_pt_type_in_entryRulefloating_pt_type7247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefloating_pt_type7257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloat_type_in_rulefloating_pt_type7303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledouble_type_in_rulefloating_pt_type7330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelongdouble_type_in_rulefloating_pt_type7357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelongdouble_type_in_entryRulelongdouble_type7394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulelongdouble_type7405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelongdouble_type7443 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_rulelongdouble_type7456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_entryRuleinteger_type7496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinteger_type7506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleshort_type_in_ruleinteger_type7552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelong_type_in_ruleinteger_type7579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelonglong_type_in_ruleinteger_type7606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleushort_type_in_ruleinteger_type7633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulong_type_in_ruleinteger_type7660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulonglong_type_in_ruleinteger_type7687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelonglong_type_in_entryRulelonglong_type7724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulelonglong_type7735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelonglong_type7773 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_rulelonglong_type7786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleushort_type_in_entryRuleushort_type7827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleushort_type7838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleushort_type7876 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleushort_type7889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulong_type_in_entryRuleulong_type7930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleulong_type7941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleulong_type7979 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulong_type7992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulonglong_type_in_entryRuleulonglong_type8033 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleulonglong_type8044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleulonglong_type8082 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulonglong_type8095 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulonglong_type8108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecharstr_type_in_entryRulecharstr_type8148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecharstr_type8158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulechar_type_in_rulecharstr_type8204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_char_type_in_rulecharstr_type8231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestring_type_in_rulecharstr_type8258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_string_type_in_rulecharstr_type8285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleother_type_in_entryRuleother_type8321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleother_type8331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolean_type_in_ruleother_type8377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoctet_type_in_ruleother_type8404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleany_type_in_ruleother_type8431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_const_type_in_entryRulefixed_pt_const_type8467 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefixed_pt_const_type8477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulefixed_pt_const_type8524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_exp_in_entryRuleconst_exp8560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_exp8570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleor_expr_in_ruleconst_exp8619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleor_expr_in_entryRuleor_expr8653 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleor_expr8663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulexor_expr_in_ruleor_expr8713 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleor_expr8743 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_rulexor_expr_in_ruleor_expr8777 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_rulexor_expr_in_entryRulexor_expr8815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulexor_expr8825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleand_expr_in_rulexor_expr8875 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_rulexor_expr8905 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleand_expr_in_rulexor_expr8939 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_ruleand_expr_in_entryRuleand_expr8977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleand_expr8987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleshift_expr_in_ruleand_expr9037 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleand_expr9067 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleshift_expr_in_ruleand_expr9101 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleshift_expr_in_entryRuleshift_expr9139 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleshift_expr9149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleadd_expr_in_ruleshift_expr9199 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleshift_expr9231 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_62_in_ruleshift_expr9260 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleadd_expr_in_ruleshift_expr9297 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_ruleadd_expr_in_entryRuleadd_expr9335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleadd_expr9345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemult_expr_in_ruleadd_expr9395 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_63_in_ruleadd_expr9427 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_64_in_ruleadd_expr9456 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_rulemult_expr_in_ruleadd_expr9493 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_rulemult_expr_in_entryRulemult_expr9531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemult_expr9541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_expr_in_rulemult_expr9591 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
        public static final BitSet FOLLOW_65_in_rulemult_expr9623 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_66_in_rulemult_expr9652 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_67_in_rulemult_expr9681 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleunary_expr_in_rulemult_expr9718 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
        public static final BitSet FOLLOW_ruleunary_expr_in_entryRuleunary_expr9756 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunary_expr9766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_operator_in_ruleunary_expr9825 = new BitSet(new long[]{0x0000000008000FF0L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_ruleunary_expr9846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_ruleunary_expr9878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator9914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator9925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleunary_operator9963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleunary_operator9982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleunary_operator10001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_entryRuleprimary_expr10041 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleprimary_expr10051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstantDefRef_in_ruleprimary_expr10101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalueExpression_in_ruleprimary_expr10131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleprimary_expr10147 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_ruleprimary_expr10172 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleprimary_expr10181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstantDefRef_in_entryRuleconstantDefRef10218 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconstantDefRef10228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstantDefRef10274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalueExpression_in_entryRulevalueExpression10309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalueExpression10319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleliteral_in_rulevalueExpression10364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral10400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleliteral10411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleliteral10451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral10477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HEX_LITERAL_in_ruleliteral10503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WIDE_STRING_LITERAL_in_ruleliteral10529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FIXED_PT_LITERAL_in_ruleliteral10555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOATING_PT_LITERAL_in_ruleliteral10581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_LITERAL_in_ruleliteral10607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleparam_attribute10664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleparam_attribute10679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleparam_attribute10694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rulefloat_type10736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruledouble_type10777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleshort_type10818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelong_type10859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rulechar_type10900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulewide_char_type10941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulestring_type10982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulewide_string_type11023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleboolean_type11064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleoctet_type11105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleany_type11146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleobject_type11187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulevoid_type11228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_synpred513707 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred513728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred614680 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred614690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_synpred624719 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred624736 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred624751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_synpred715392 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_synpred715413 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred715423 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_synpred715441 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred715451 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred715475 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred715485 = new BitSet(new long[]{0x0000000000000002L});
    }


}