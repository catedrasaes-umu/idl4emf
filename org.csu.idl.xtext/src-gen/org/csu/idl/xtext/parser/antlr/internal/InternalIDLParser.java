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
            ruleMemo = new HashMap[248+1];
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

                        if ( (LA3_8==19||LA3_8==24) ) {
                            alt3=4;
                        }
                        else if ( (LA3_8==17) ) {
                            alt3=5;
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

                        if ( (LA3_8==19||LA3_8==24) ) {
                            alt3=4;
                        }
                        else if ( (LA3_8==17) ) {
                            alt3=5;
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

                    if ( (LA3_8==19||LA3_8==24) ) {
                        alt3=4;
                    }
                    else if ( (LA3_8==17) ) {
                        alt3=5;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:353:1: rulemodule returns [EObject current=null] : ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_contains_3_0= ruledefinition ) )+ '}' ) ;
    public final EObject rulemodule() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_contains_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:358:6: ( ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_contains_3_0= ruledefinition ) )+ '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:359:1: ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_contains_3_0= ruledefinition ) )+ '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:359:1: ( 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_contains_3_0= ruledefinition ) )+ '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:359:3: 'module' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_contains_3_0= ruledefinition ) )+ '}'
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
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:391:1: ( (lv_contains_3_0= ruledefinition ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||(LA4_0>=21 && LA4_0<=23)||(LA4_0>=35 && LA4_0<=37)||(LA4_0>=40 && LA4_0<=41)||(LA4_0>=45 && LA4_0<=46)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:1: (lv_contains_3_0= ruledefinition )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:392:1: (lv_contains_3_0= ruledefinition )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:393:3: lv_contains_3_0= ruledefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getContainsDefinitionParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruledefinition_in_rulemodule726);
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
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_rulemodule737); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:427:1: entryRuleinterface_decl returns [EObject current=null] : iv_ruleinterface_decl= ruleinterface_decl EOF ;
    public final EObject entryRuleinterface_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:428:2: (iv_ruleinterface_decl= ruleinterface_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:429:2: iv_ruleinterface_decl= ruleinterface_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterface_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinterface_decl_in_entryRuleinterface_decl773);
            iv_ruleinterface_decl=ruleinterface_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleinterface_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinterface_decl783); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:436:1: ruleinterface_decl returns [EObject current=null] : ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_contains_9_0= ruleexport ) )* '}' ) ;
    public final EObject ruleinterface_decl() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token lv_isCustom_1_0=null;
        Token lv_identifier_3_0=null;
        EObject lv_contains_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:441:6: ( ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_contains_9_0= ruleexport ) )* '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:442:1: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_contains_9_0= ruleexport ) )* '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:442:1: ( ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_contains_9_0= ruleexport ) )* '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:442:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )? '{' ( (lv_contains_9_0= ruleexport ) )* '}'
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:442:2: ( ( (lv_isAbstract_0_0= 'abstract' ) ) | ( (lv_isCustom_1_0= 'local' ) ) )?
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:442:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:442:3: ( (lv_isAbstract_0_0= 'abstract' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:443:1: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:443:1: (lv_isAbstract_0_0= 'abstract' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:444:3: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleinterface_decl827); if (failed) return current;
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:464:6: ( (lv_isCustom_1_0= 'local' ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:464:6: ( (lv_isCustom_1_0= 'local' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:465:1: (lv_isCustom_1_0= 'local' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:465:1: (lv_isCustom_1_0= 'local' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:466:3: lv_isCustom_1_0= 'local'
                    {
                    lv_isCustom_1_0=(Token)input.LT(1);
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleinterface_decl864); if (failed) return current;
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

            match(input,23,FollowSets000.FOLLOW_23_in_ruleinterface_decl889); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterface_declAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:489:1: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:490:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:490:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:491:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl906); if (failed) return current;
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

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:513:2: ( ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:513:4: ':' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )*
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleinterface_decl922); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_declAccess().getColonKeyword_3_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:517:1: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:518:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:518:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:519:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl944); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getInterface_declAccess().getDerivesFromInterfaceDefCrossReference_3_1_0(), "derivesFrom"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:534:2: ( ',' ( ( RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:534:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleinterface_decl955); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterface_declAccess().getCommaKeyword_3_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:538:1: ( ( RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:539:1: ( RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:539:1: ( RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:540:3: RULE_ID
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
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_decl977); if (failed) return current;
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

            match(input,19,FollowSets000.FOLLOW_19_in_ruleinterface_decl991); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterface_declAccess().getLeftCurlyBracketKeyword_4(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:559:1: ( (lv_contains_9_0= ruleexport ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==26||(LA8_0>=31 && LA8_0<=32)||(LA8_0>=35 && LA8_0<=37)||(LA8_0>=40 && LA8_0<=41)||(LA8_0>=45 && LA8_0<=46)||(LA8_0>=51 && LA8_0<=52)||(LA8_0>=54 && LA8_0<=57)||(LA8_0>=72 && LA8_0<=79)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:560:1: (lv_contains_9_0= ruleexport )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:560:1: (lv_contains_9_0= ruleexport )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:561:3: lv_contains_9_0= ruleexport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterface_declAccess().getContainsExportParserRuleCall_5_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleexport_in_ruleinterface_decl1012);
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
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,20,FollowSets000.FOLLOW_20_in_ruleinterface_decl1023); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:595:1: entryRuleinterface_fwd returns [EObject current=null] : iv_ruleinterface_fwd= ruleinterface_fwd EOF ;
    public final EObject entryRuleinterface_fwd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinterface_fwd = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:596:2: (iv_ruleinterface_fwd= ruleinterface_fwd EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:597:2: iv_ruleinterface_fwd= ruleinterface_fwd EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterface_fwdRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinterface_fwd_in_entryRuleinterface_fwd1059);
            iv_ruleinterface_fwd=ruleinterface_fwd();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleinterface_fwd; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinterface_fwd1069); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:604:1: ruleinterface_fwd returns [EObject current=null] : ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ) ;
    public final EObject ruleinterface_fwd() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:609:6: ( ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:610:1: ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:610:1: ( ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:610:2: ( 'abstract' | 'local' )? 'interface' ( (lv_identifier_3_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:610:2: ( 'abstract' | 'local' )?
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:610:4: 'abstract'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleinterface_fwd1105); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_fwdAccess().getAbstractKeyword_0_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:615:7: 'local'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleinterface_fwd1121); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterface_fwdAccess().getLocalKeyword_0_1(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,23,FollowSets000.FOLLOW_23_in_ruleinterface_fwd1133); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterface_fwdAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:623:1: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:624:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:624:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:625:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleinterface_fwd1150); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:655:1: entryRuleexport returns [EObject current=null] : iv_ruleexport= ruleexport EOF ;
    public final EObject entryRuleexport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexport = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:656:2: (iv_ruleexport= ruleexport EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:657:2: iv_ruleexport= ruleexport EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExportRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleexport_in_entryRuleexport1191);
            iv_ruleexport=ruleexport();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleexport1201); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:664:1: ruleexport returns [EObject current=null] : ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) ) ;
    public final EObject ruleexport() throws RecognitionException {
        EObject current = null;

        EObject this_type_decl_0 = null;

        EObject this_const_decl_2 = null;

        EObject this_except_decl_4 = null;

        EObject this_attr_decl_6 = null;

        EObject this_op_decl_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:669:6: ( ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:670:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:670:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) )
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
                    new NoViableAltException("670:1: ( (this_type_decl_0= ruletype_decl ';' ) | (this_const_decl_2= ruleconst_decl ';' ) | (this_except_decl_4= ruleexcept_decl ';' ) | (this_attr_decl_6= ruleattr_decl ';' ) | (this_op_decl_8= ruleop_decl ';' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:670:2: (this_type_decl_0= ruletype_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:670:2: (this_type_decl_0= ruletype_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:671:2: this_type_decl_0= ruletype_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getType_declParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_ruleexport1252);
                    this_type_decl_0=ruletype_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_type_decl_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1261); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:687:6: (this_const_decl_2= ruleconst_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:687:6: (this_const_decl_2= ruleconst_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:688:2: this_const_decl_2= ruleconst_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getConst_declParserRuleCall_1_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_ruleexport1294);
                    this_const_decl_2=ruleconst_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_const_decl_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1303); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:704:6: (this_except_decl_4= ruleexcept_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:704:6: (this_except_decl_4= ruleexcept_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:705:2: this_except_decl_4= ruleexcept_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getExcept_declParserRuleCall_2_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_ruleexport1336);
                    this_except_decl_4=ruleexcept_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_except_decl_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1345); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_2_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:721:6: (this_attr_decl_6= ruleattr_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:721:6: (this_attr_decl_6= ruleattr_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:722:2: this_attr_decl_6= ruleattr_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getAttr_declParserRuleCall_3_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleattr_decl_in_ruleexport1378);
                    this_attr_decl_6=ruleattr_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_attr_decl_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1387); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExportAccess().getSemicolonKeyword_3_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:738:6: (this_op_decl_8= ruleop_decl ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:738:6: (this_op_decl_8= ruleop_decl ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:739:2: this_op_decl_8= ruleop_decl ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExportAccess().getOp_declParserRuleCall_4_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleop_decl_in_ruleexport1420);
                    this_op_decl_8=ruleop_decl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_op_decl_8; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleexport1429); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:762:1: entryRuleop_decl returns [EObject current=null] : iv_ruleop_decl= ruleop_decl EOF ;
    public final EObject entryRuleop_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleop_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:763:2: (iv_ruleop_decl= ruleop_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:764:2: iv_ruleop_decl= ruleop_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOp_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleop_decl_in_entryRuleop_decl1466);
            iv_ruleop_decl=ruleop_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleop_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleop_decl1476); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:771:1: ruleop_decl returns [EObject current=null] : ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? ) ;
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
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:776:6: ( ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:777:1: ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:777:1: ( ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )? )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:777:2: ( (lv_isOneway_0_0= 'oneway' ) )? ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '(' ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )? ')' ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )?
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:777:2: ( (lv_isOneway_0_0= 'oneway' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:778:1: (lv_isOneway_0_0= 'oneway' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:778:1: (lv_isOneway_0_0= 'oneway' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:779:3: lv_isOneway_0_0= 'oneway'
                    {
                    lv_isOneway_0_0=(Token)input.LT(1);
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleop_decl1519); if (failed) return current;
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

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:798:3: ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) )
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
                    new NoViableAltException("798:3: ( ( (lv_containedType_1_0= ruleop_type_spec ) ) | ( ( RULE_ID ) ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:798:4: ( (lv_containedType_1_0= ruleop_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:798:4: ( (lv_containedType_1_0= ruleop_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:799:1: (lv_containedType_1_0= ruleop_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:799:1: (lv_containedType_1_0= ruleop_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:800:3: lv_containedType_1_0= ruleop_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOp_declAccess().getContainedTypeOp_type_specParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleop_type_spec_in_ruleop_decl1555);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:823:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:823:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:824:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:824:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:825:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1583); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getOp_declAccess().getSharedTypeTypedefDefCrossReference_1_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:840:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:841:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:841:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:842:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1601); if (failed) return current;
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

            match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1616); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:868:1: ( ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=69 && LA14_0<=71)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:868:2: ( (lv_parameters_5_0= ruleparam_decl ) ) ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )*
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:868:2: ( (lv_parameters_5_0= ruleparam_decl ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:869:1: (lv_parameters_5_0= ruleparam_decl )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:869:1: (lv_parameters_5_0= ruleparam_decl )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:870:3: lv_parameters_5_0= ruleparam_decl
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOp_declAccess().getParametersParam_declParserRuleCall_4_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_ruleop_decl1638);
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:892:2: ( ',' ( (lv_parameters_7_0= ruleparam_decl ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:892:4: ',' ( (lv_parameters_7_0= ruleparam_decl ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1649); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOp_declAccess().getCommaKeyword_4_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:896:1: ( (lv_parameters_7_0= ruleparam_decl ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:897:1: (lv_parameters_7_0= ruleparam_decl )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:897:1: (lv_parameters_7_0= ruleparam_decl )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:898:3: lv_parameters_7_0= ruleparam_decl
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOp_declAccess().getParametersParam_declParserRuleCall_4_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_ruleop_decl1670);
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

            match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1684); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOp_declAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:924:1: ( 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:924:3: 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleop_decl1695); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getRaisesKeyword_6_0(), null); 
                          
                    }
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1705); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_6_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:932:1: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:933:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:933:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:934:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1727); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getOp_declAccess().getCanRaiseExceptionDefCrossReference_6_2_0(), "canRaise"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:949:2: ( ',' ( ( RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==25) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:949:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1738); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOp_declAccess().getCommaKeyword_6_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:953:1: ( ( RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:954:1: ( RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:954:1: ( RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:955:3: RULE_ID
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
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleop_decl1760); if (failed) return current;
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

                    match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1772); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getRightParenthesisKeyword_6_4(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:974:3: ( 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:974:5: 'context' '(' ( (lv_contexts_17_0= RULE_STRING ) ) ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )* ')'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleop_decl1785); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getContextKeyword_7_0(), null); 
                          
                    }
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleop_decl1795); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOp_declAccess().getLeftParenthesisKeyword_7_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:982:1: ( (lv_contexts_17_0= RULE_STRING ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:983:1: (lv_contexts_17_0= RULE_STRING )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:983:1: (lv_contexts_17_0= RULE_STRING )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:984:3: lv_contexts_17_0= RULE_STRING
                    {
                    lv_contexts_17_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleop_decl1812); if (failed) return current;
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1006:2: ( ',' ( (lv_contexts_19_0= RULE_STRING ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1006:4: ',' ( (lv_contexts_19_0= RULE_STRING ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleop_decl1828); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOp_declAccess().getCommaKeyword_7_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1010:1: ( (lv_contexts_19_0= RULE_STRING ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1011:1: (lv_contexts_19_0= RULE_STRING )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1011:1: (lv_contexts_19_0= RULE_STRING )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1012:3: lv_contexts_19_0= RULE_STRING
                    	    {
                    	    lv_contexts_19_0=(Token)input.LT(1);
                    	    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleop_decl1845); if (failed) return current;
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

                    match(input,28,FollowSets000.FOLLOW_28_in_ruleop_decl1862); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1046:1: entryRuleop_type_spec returns [EObject current=null] : iv_ruleop_type_spec= ruleop_type_spec EOF ;
    public final EObject entryRuleop_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleop_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1047:2: (iv_ruleop_type_spec= ruleop_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1048:2: iv_ruleop_type_spec= ruleop_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOp_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleop_type_spec_in_entryRuleop_type_spec1900);
            iv_ruleop_type_spec=ruleop_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleop_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleop_type_spec1910); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1055:1: ruleop_type_spec returns [EObject current=null] : (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) ) ;
    public final EObject ruleop_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_base_type_spec_0 = null;

        Enumerator lv_kind_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1060:6: ( (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1061:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1061:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )
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
                    new NoViableAltException("1061:1: (this_base_type_spec_0= rulebase_type_spec | ( () ( (lv_kind_2_0= rulevoid_type ) ) ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1062:2: this_base_type_spec_0= rulebase_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOp_type_specAccess().getBase_type_specParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleop_type_spec1960);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1074:6: ( () ( (lv_kind_2_0= rulevoid_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1074:6: ( () ( (lv_kind_2_0= rulevoid_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1074:7: () ( (lv_kind_2_0= rulevoid_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1074:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1075:2: 
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1088:2: ( (lv_kind_2_0= rulevoid_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1089:1: (lv_kind_2_0= rulevoid_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1089:1: (lv_kind_2_0= rulevoid_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1090:3: lv_kind_2_0= rulevoid_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOp_type_specAccess().getKindVoid_typeEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulevoid_type_in_ruleop_type_spec1999);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1120:1: entryRuleparam_decl returns [EObject current=null] : iv_ruleparam_decl= ruleparam_decl EOF ;
    public final EObject entryRuleparam_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparam_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1121:2: (iv_ruleparam_decl= ruleparam_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1122:2: iv_ruleparam_decl= ruleparam_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParam_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleparam_decl_in_entryRuleparam_decl2036);
            iv_ruleparam_decl=ruleparam_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleparam_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleparam_decl2046); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1129:1: ruleparam_decl returns [EObject current=null] : ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ) ;
    public final EObject ruleparam_decl() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;
        Enumerator lv_direction_0_0 = null;

        EObject lv_containedType_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1134:6: ( ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1135:1: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1135:1: ( ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1135:2: ( (lv_direction_0_0= ruleparam_attribute ) ) ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1135:2: ( (lv_direction_0_0= ruleparam_attribute ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1136:1: (lv_direction_0_0= ruleparam_attribute )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1136:1: (lv_direction_0_0= ruleparam_attribute )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1137:3: lv_direction_0_0= ruleparam_attribute
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getParam_declAccess().getDirectionParam_attributeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleparam_attribute_in_ruleparam_decl2092);
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

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1159:2: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
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
                    new NoViableAltException("1159:2: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1159:3: ( (lv_containedType_1_0= rulebase_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1159:3: ( (lv_containedType_1_0= rulebase_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1160:1: (lv_containedType_1_0= rulebase_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1160:1: (lv_containedType_1_0= rulebase_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1161:3: lv_containedType_1_0= rulebase_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getParam_declAccess().getContainedTypeBase_type_specParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleparam_decl2114);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1184:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1184:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1185:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1185:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1186:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleparam_decl2142); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getParam_declAccess().getSharedTypeTypedefDefCrossReference_1_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1201:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1202:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1202:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1203:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleparam_decl2160); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1233:1: entryRuleattr_decl returns [EObject current=null] : iv_ruleattr_decl= ruleattr_decl EOF ;
    public final EObject entryRuleattr_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1234:2: (iv_ruleattr_decl= ruleattr_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1235:2: iv_ruleattr_decl= ruleattr_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttr_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleattr_decl_in_entryRuleattr_decl2201);
            iv_ruleattr_decl=ruleattr_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleattr_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleattr_decl2211); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1242:1: ruleattr_decl returns [EObject current=null] : (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec ) ;
    public final EObject ruleattr_decl() throws RecognitionException {
        EObject current = null;

        EObject this_readonly_attr_spec_0 = null;

        EObject this_attr_spec_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1247:6: ( (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1248:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1248:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )
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
                    new NoViableAltException("1248:1: (this_readonly_attr_spec_0= rulereadonly_attr_spec | this_attr_spec_1= ruleattr_spec )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1249:2: this_readonly_attr_spec_0= rulereadonly_attr_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttr_declAccess().getReadonly_attr_specParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulereadonly_attr_spec_in_ruleattr_decl2261);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1262:2: this_attr_spec_1= ruleattr_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttr_declAccess().getAttr_specParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleattr_spec_in_ruleattr_decl2291);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1281:1: entryRulereadonly_attr_spec returns [EObject current=null] : iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF ;
    public final EObject entryRulereadonly_attr_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereadonly_attr_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1282:2: (iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1283:2: iv_rulereadonly_attr_spec= rulereadonly_attr_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReadonly_attr_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulereadonly_attr_spec_in_entryRulereadonly_attr_spec2326);
            iv_rulereadonly_attr_spec=rulereadonly_attr_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulereadonly_attr_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulereadonly_attr_spec2336); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1290:1: rulereadonly_attr_spec returns [EObject current=null] : ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) ) ;
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
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1295:6: ( ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )
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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 3, input);

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
                                        new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 18, input);

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
                                        new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 19, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 56:
                        {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==54) ) {
                            int LA25_20 = input.LA(5);

                            if ( (LA25_20==54) ) {
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
                                            new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 24, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA25_20==RULE_ID) ) {
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
                                        new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 20, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA25_5==57) ) {
                            int LA25_21 = input.LA(5);

                            if ( (LA25_21==RULE_ID) ) {
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
                                        new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 21, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 5, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 6, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 7, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 8, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 9, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 10, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 11, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 12, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 13, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 14, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 15, input);

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
                                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 17, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1296:1: ( ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) | ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1296:2: ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1296:2: ( ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1296:3: ( (lv_isReadonly_0_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_4_0= RULE_ID ) ) 'raises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1296:3: ( (lv_isReadonly_0_0= 'readonly' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1297:1: (lv_isReadonly_0_0= 'readonly' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1297:1: (lv_isReadonly_0_0= 'readonly' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1298:3: lv_isReadonly_0_0= 'readonly'
                    {
                    lv_isReadonly_0_0=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_rulereadonly_attr_spec2380); if (failed) return current;
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

                    match(input,32,FollowSets000.FOLLOW_32_in_rulereadonly_attr_spec2403); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getAttributeKeyword_0_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1321:1: ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
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
                            new NoViableAltException("1321:1: ( ( (lv_containedType_2_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1321:2: ( (lv_containedType_2_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1321:2: ( (lv_containedType_2_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1322:1: (lv_containedType_2_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1322:1: (lv_containedType_2_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1323:3: lv_containedType_2_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getReadonly_attr_specAccess().getContainedTypeBase_type_specParserRuleCall_0_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2425);
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
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1346:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1346:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1347:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1347:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1348:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2453); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getReadonly_attr_specAccess().getSharedTypeTypedefDefCrossReference_0_2_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1363:3: ( (lv_identifier_4_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1364:1: (lv_identifier_4_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1364:1: (lv_identifier_4_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1365:3: lv_identifier_4_0= RULE_ID
                    {
                    lv_identifier_4_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2471); if (failed) return current;
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

                    match(input,29,FollowSets000.FOLLOW_29_in_rulereadonly_attr_spec2486); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getRaisesKeyword_0_4(), null); 
                          
                    }
                    match(input,27,FollowSets000.FOLLOW_27_in_rulereadonly_attr_spec2496); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getLeftParenthesisKeyword_0_5(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1395:1: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1396:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1396:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1397:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2518); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getReadonly_attr_specAccess().getGetRaisesExceptionDefCrossReference_0_6_0(), "getRaises"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1412:2: ( ',' ( ( RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1412:4: ',' ( ( RULE_ID ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_rulereadonly_attr_spec2529); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getCommaKeyword_0_7_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1416:1: ( ( RULE_ID ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1417:1: ( RULE_ID )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1417:1: ( RULE_ID )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1418:3: RULE_ID
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
                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2551); if (failed) return current;
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

                    match(input,28,FollowSets000.FOLLOW_28_in_rulereadonly_attr_spec2563); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getRightParenthesisKeyword_0_8(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1438:6: ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1438:6: ( ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1438:7: ( (lv_isReadonly_11_0= 'readonly' ) ) 'attribute' ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_15_0= RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1438:7: ( (lv_isReadonly_11_0= 'readonly' ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1439:1: (lv_isReadonly_11_0= 'readonly' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1439:1: (lv_isReadonly_11_0= 'readonly' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1440:3: lv_isReadonly_11_0= 'readonly'
                    {
                    lv_isReadonly_11_0=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_rulereadonly_attr_spec2589); if (failed) return current;
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

                    match(input,32,FollowSets000.FOLLOW_32_in_rulereadonly_attr_spec2612); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getReadonly_attr_specAccess().getAttributeKeyword_1_1(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1463:1: ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
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
                            new NoViableAltException("1463:1: ( ( (lv_containedType_13_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1463:2: ( (lv_containedType_13_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1463:2: ( (lv_containedType_13_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1464:1: (lv_containedType_13_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1464:1: (lv_containedType_13_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1465:3: lv_containedType_13_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getReadonly_attr_specAccess().getContainedTypeBase_type_specParserRuleCall_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2634);
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
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1488:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1488:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1489:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1489:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1490:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2662); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getReadonly_attr_specAccess().getSharedTypeTypedefDefCrossReference_1_2_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1505:3: ( (lv_identifier_15_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1506:1: (lv_identifier_15_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1506:1: (lv_identifier_15_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1507:3: lv_identifier_15_0= RULE_ID
                    {
                    lv_identifier_15_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulereadonly_attr_spec2680); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1537:1: entryRuleattr_spec returns [EObject current=null] : iv_ruleattr_spec= ruleattr_spec EOF ;
    public final EObject entryRuleattr_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleattr_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1538:2: (iv_ruleattr_spec= ruleattr_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1539:2: iv_ruleattr_spec= ruleattr_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttr_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleattr_spec_in_entryRuleattr_spec2722);
            iv_ruleattr_spec=ruleattr_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleattr_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleattr_spec2732); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1546:1: ruleattr_spec returns [EObject current=null] : ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) ) ;
    public final EObject ruleattr_spec() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;
        Token lv_identifier_25_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_containedType_23_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1551:6: ( ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )
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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 2, input);

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
                                    new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 17, input);

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
                                    new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 18, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 3, input);

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
                                    new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 19, input);

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
                                        new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 23, input);

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
                                    new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 20, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 4, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 5, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 6, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 7, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 8, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 9, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 10, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 11, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 12, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 13, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 14, input);

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
                                new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 16, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1552:1: ( ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) ) | ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) ) )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1552:2: ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1552:2: ( 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1552:4: 'attribute' ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) )
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleattr_spec2768); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttr_specAccess().getAttributeKeyword_0_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1556:1: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
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
                            new NoViableAltException("1556:1: ( ( (lv_containedType_1_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1556:2: ( (lv_containedType_1_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1556:2: ( (lv_containedType_1_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1557:1: (lv_containedType_1_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1557:1: (lv_containedType_1_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1558:3: lv_containedType_1_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAttr_specAccess().getContainedTypeBase_type_specParserRuleCall_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleattr_spec2790);
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
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1581:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1581:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1582:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1582:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1583:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2818); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getSharedTypeTypedefDefCrossReference_0_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1598:3: ( (lv_identifier_3_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1599:1: (lv_identifier_3_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1599:1: (lv_identifier_3_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1600:3: lv_identifier_3_0= RULE_ID
                    {
                    lv_identifier_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2836); if (failed) return current;
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1622:2: ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) )
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
                            new NoViableAltException("1622:2: ( ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? ) | ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ) )", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1622:3: ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1622:3: ( 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )? )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1622:5: 'getraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                            {
                            match(input,33,FollowSets000.FOLLOW_33_in_ruleattr_spec2853); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getGetraisesKeyword_0_3_0_0(), null); 
                                  
                            }
                            match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec2863); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_0_1(), null); 
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1630:1: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1631:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1631:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1632:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2885); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getGetRaisesExceptionDefCrossReference_0_3_0_2_0(), "getRaises"); 
                              	
                            }

                            }


                            }

                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1647:2: ( ',' ( ( RULE_ID ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==25) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1647:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec2896); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_0_3_0(), null); 
                            	          
                            	    }
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1651:1: ( ( RULE_ID ) )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1652:1: ( RULE_ID )
                            	    {
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1652:1: ( RULE_ID )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1653:3: RULE_ID
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
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2918); if (failed) return current;
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

                            match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec2930); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getRightParenthesisKeyword_0_3_0_4(), null); 
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1672:1: ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==34) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1672:3: 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                                    {
                                    match(input,34,FollowSets000.FOLLOW_34_in_ruleattr_spec2941); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getAttr_specAccess().getSetraisesKeyword_0_3_0_5_0(), null); 
                                          
                                    }
                                    match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec2951); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_0_5_1(), null); 
                                          
                                    }
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1680:1: ( ( RULE_ID ) )
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1681:1: ( RULE_ID )
                                    {
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1681:1: ( RULE_ID )
                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1682:3: RULE_ID
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
                                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec2973); if (failed) return current;
                                    if ( backtracking==0 ) {

                                      		createLeafNode(grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_0_5_2_0(), "setRaises"); 
                                      	
                                    }

                                    }


                                    }

                                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1697:2: ( ',' ( ( RULE_ID ) ) )*
                                    loop28:
                                    do {
                                        int alt28=2;
                                        int LA28_0 = input.LA(1);

                                        if ( (LA28_0==25) ) {
                                            alt28=1;
                                        }


                                        switch (alt28) {
                                    	case 1 :
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1697:4: ',' ( ( RULE_ID ) )
                                    	    {
                                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec2984); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	              createLeafNode(grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_0_5_3_0(), null); 
                                    	          
                                    	    }
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1701:1: ( ( RULE_ID ) )
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1702:1: ( RULE_ID )
                                    	    {
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1702:1: ( RULE_ID )
                                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1703:3: RULE_ID
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
                                    	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3006); if (failed) return current;
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

                                    match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec3018); if (failed) return current;
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
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1723:6: ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1723:6: ( 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')' )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1723:8: 'setraises' '(' ( ( RULE_ID ) ) ( ',' ( ( RULE_ID ) ) )* ')'
                            {
                            match(input,34,FollowSets000.FOLLOW_34_in_ruleattr_spec3038); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getSetraisesKeyword_0_3_1_0(), null); 
                                  
                            }
                            match(input,27,FollowSets000.FOLLOW_27_in_ruleattr_spec3048); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getAttr_specAccess().getLeftParenthesisKeyword_0_3_1_1(), null); 
                                  
                            }
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1731:1: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1732:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1732:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1733:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3070); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getSetRaisesExceptionDefCrossReference_0_3_1_2_0(), "setRaises"); 
                              	
                            }

                            }


                            }

                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1748:2: ( ',' ( ( RULE_ID ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==25) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1748:4: ',' ( ( RULE_ID ) )
                            	    {
                            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleattr_spec3081); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getAttr_specAccess().getCommaKeyword_0_3_1_3_0(), null); 
                            	          
                            	    }
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1752:1: ( ( RULE_ID ) )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1753:1: ( RULE_ID )
                            	    {
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1753:1: ( RULE_ID )
                            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1754:3: RULE_ID
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
                            	    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3103); if (failed) return current;
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

                            match(input,28,FollowSets000.FOLLOW_28_in_ruleattr_spec3115); if (failed) return current;
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1774:6: ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1774:6: ( 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1774:8: 'attribute' ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_25_0= RULE_ID ) )
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleattr_spec3135); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttr_specAccess().getAttributeKeyword_1_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1778:1: ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )
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
                            new NoViableAltException("1778:1: ( ( (lv_containedType_23_0= rulebase_type_spec ) ) | ( ( RULE_ID ) ) )", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1778:2: ( (lv_containedType_23_0= rulebase_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1778:2: ( (lv_containedType_23_0= rulebase_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1779:1: (lv_containedType_23_0= rulebase_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1779:1: (lv_containedType_23_0= rulebase_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1780:3: lv_containedType_23_0= rulebase_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAttr_specAccess().getContainedTypeBase_type_specParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_ruleattr_spec3157);
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
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1803:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1803:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1804:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1804:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1805:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3185); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAttr_specAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1820:3: ( (lv_identifier_25_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1821:1: (lv_identifier_25_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1821:1: (lv_identifier_25_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1822:3: lv_identifier_25_0= RULE_ID
                    {
                    lv_identifier_25_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleattr_spec3203); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1852:1: entryRuleexcept_decl returns [EObject current=null] : iv_ruleexcept_decl= ruleexcept_decl EOF ;
    public final EObject entryRuleexcept_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexcept_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1853:2: (iv_ruleexcept_decl= ruleexcept_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1854:2: iv_ruleexcept_decl= ruleexcept_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExcept_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleexcept_decl_in_entryRuleexcept_decl3245);
            iv_ruleexcept_decl=ruleexcept_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexcept_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleexcept_decl3255); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1861:1: ruleexcept_decl returns [EObject current=null] : ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' ) ;
    public final EObject ruleexcept_decl() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_members_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1866:6: ( ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1867:1: ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1867:1: ( 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1867:3: 'exception' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )* '}'
            {
            match(input,35,FollowSets000.FOLLOW_35_in_ruleexcept_decl3290); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExcept_declAccess().getExceptionKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1871:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1872:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1872:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1873:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleexcept_decl3307); if (failed) return current;
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

            match(input,19,FollowSets000.FOLLOW_19_in_ruleexcept_decl3322); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExcept_declAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1899:1: ( (lv_members_3_0= rulemember ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==40||LA34_0==48||(LA34_0>=51 && LA34_0<=57)||(LA34_0>=72 && LA34_0<=78)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1900:1: (lv_members_3_0= rulemember )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1900:1: (lv_members_3_0= rulemember )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1901:3: lv_members_3_0= rulemember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExcept_declAccess().getMembersMemberParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemember_in_ruleexcept_decl3343);
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

            match(input,20,FollowSets000.FOLLOW_20_in_ruleexcept_decl3354); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1935:1: entryRuletype_decl returns [EObject current=null] : iv_ruletype_decl= ruletype_decl EOF ;
    public final EObject entryRuletype_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1936:2: (iv_ruletype_decl= ruletype_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1937:2: iv_ruletype_decl= ruletype_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getType_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletype_decl_in_entryRuletype_decl3390);
            iv_ruletype_decl=ruletype_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletype_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletype_decl3400); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1944:1: ruletype_decl returns [EObject current=null] : (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl ) ;
    public final EObject ruletype_decl() throws RecognitionException {
        EObject current = null;

        EObject this_alias_type_0 = null;

        EObject this_struct_type_1 = null;

        EObject this_union_type_2 = null;

        EObject this_enum_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1949:6: ( (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1950:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1950:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )
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
                            new NoViableAltException("1950:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1950:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 2, input);

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
                            new NoViableAltException("1950:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1950:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 3, input);

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
                    new NoViableAltException("1950:1: (this_alias_type_0= rulealias_type | this_struct_type_1= rulestruct_type | this_union_type_2= ruleunion_type | this_enum_type_3= ruleenum_type | ( 'native' RULE_ID ) | ruleconstr_forward_decl )", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1951:2: this_alias_type_0= rulealias_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getAlias_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulealias_type_in_ruletype_decl3450);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1964:2: this_struct_type_1= rulestruct_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getStruct_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_ruletype_decl3480);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1977:2: this_union_type_2= ruleunion_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getUnion_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunion_type_in_ruletype_decl3510);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:1990:2: this_enum_type_3= ruleenum_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getEnum_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_ruletype_decl3540);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2002:6: ( 'native' RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2002:6: ( 'native' RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2002:8: 'native' RULE_ID
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruletype_decl3556); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getType_declAccess().getNativeKeyword_4_0(), null); 
                          
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruletype_decl3565); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getType_declAccess().getIDTerminalRuleCall_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2012:2: ruleconstr_forward_decl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getType_declAccess().getConstr_forward_declParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconstr_forward_decl_in_ruletype_decl3590);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2030:1: entryRulealias_type returns [EObject current=null] : iv_rulealias_type= rulealias_type EOF ;
    public final EObject entryRulealias_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealias_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2031:2: (iv_rulealias_type= rulealias_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2032:2: iv_rulealias_type= rulealias_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAlias_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulealias_type_in_entryRulealias_type3625);
            iv_rulealias_type=rulealias_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulealias_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulealias_type3635); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2039:1: rulealias_type returns [EObject current=null] : ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) ) ;
    public final EObject rulealias_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_5_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_containedType_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2044:6: ( ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred49()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2045:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2045:1: ( ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) ) | ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:2: ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:2: ( 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:4: 'typedef' ( (lv_containedType_1_0= rulearray_type_spec ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rulealias_type3671); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAlias_typeAccess().getTypedefKeyword_0_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2049:1: ( (lv_containedType_1_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2050:1: (lv_containedType_1_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2050:1: (lv_containedType_1_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2051:3: lv_containedType_1_0= rulearray_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulealias_type3692);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2074:6: ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2074:6: ( 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2074:8: 'typedef' ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_5_0= RULE_ID ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_rulealias_type3710); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAlias_typeAccess().getTypedefKeyword_1_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2078:1: ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
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
                            new NoViableAltException("2078:1: ( ( (lv_containedType_3_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2078:2: ( (lv_containedType_3_0= rulesimple_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2078:2: ( (lv_containedType_3_0= rulesimple_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2079:1: (lv_containedType_3_0= rulesimple_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2079:1: (lv_containedType_3_0= rulesimple_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2080:3: lv_containedType_3_0= rulesimple_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeSimple_type_specParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulealias_type3732);
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
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2103:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2103:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2104:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2104:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2105:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulealias_type3760); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getAlias_typeAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2120:3: ( (lv_identifier_5_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2121:1: (lv_identifier_5_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2121:1: (lv_identifier_5_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2122:3: lv_identifier_5_0= RULE_ID
                    {
                    lv_identifier_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulealias_type3778); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2152:1: entryRulearray_type_spec returns [EObject current=null] : iv_rulearray_type_spec= rulearray_type_spec EOF ;
    public final EObject entryRulearray_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2153:2: (iv_rulearray_type_spec= rulearray_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2154:2: iv_rulearray_type_spec= rulearray_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArray_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_entryRulearray_type_spec3820);
            iv_rulearray_type_spec=rulearray_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulearray_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulearray_type_spec3830); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2161:1: rulearray_type_spec returns [EObject current=null] : ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ ) ;
    public final EObject rulearray_type_spec() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_containedType_0_0 = null;

        EObject lv_bounds_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2166:6: ( ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2167:1: ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2167:1: ( ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+ )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2167:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_name_2_0= RULE_ID ) ) ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2167:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
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
                    new NoViableAltException("2167:2: ( ( (lv_containedType_0_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2167:3: ( (lv_containedType_0_0= rulesimple_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2167:3: ( (lv_containedType_0_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2168:1: (lv_containedType_0_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2168:1: (lv_containedType_0_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2169:3: lv_containedType_0_0= rulesimple_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArray_type_specAccess().getContainedTypeSimple_type_specParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulearray_type_spec3877);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2192:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2192:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2193:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2193:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2194:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulearray_type_spec3905); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getArray_type_specAccess().getSharedTypeTypedefDefCrossReference_0_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2209:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2210:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2210:1: (lv_name_2_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2211:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulearray_type_spec3923); if (failed) return current;
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

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2233:2: ( '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']' )+
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2233:4: '[' ( (lv_bounds_4_0= ruleconst_exp ) ) ']'
            	    {
            	    match(input,38,FollowSets000.FOLLOW_38_in_rulearray_type_spec3939); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getArray_type_specAccess().getLeftSquareBracketKeyword_2_0(), null); 
            	          
            	    }
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2237:1: ( (lv_bounds_4_0= ruleconst_exp ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2238:1: (lv_bounds_4_0= ruleconst_exp )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2238:1: (lv_bounds_4_0= ruleconst_exp )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2239:3: lv_bounds_4_0= ruleconst_exp
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getArray_type_specAccess().getBoundsConst_expParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulearray_type_spec3960);
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

            	    match(input,39,FollowSets000.FOLLOW_39_in_rulearray_type_spec3970); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2273:1: entryRulesimple_type_spec returns [EObject current=null] : iv_rulesimple_type_spec= rulesimple_type_spec EOF ;
    public final EObject entryRulesimple_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2274:2: (iv_rulesimple_type_spec= rulesimple_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2275:2: iv_rulesimple_type_spec= rulesimple_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSimple_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_entryRulesimple_type_spec4008);
            iv_rulesimple_type_spec=rulesimple_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesimple_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesimple_type_spec4018); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2282:1: rulesimple_type_spec returns [EObject current=null] : (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec ) ;
    public final EObject rulesimple_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_base_type_spec_0 = null;

        EObject this_template_type_spec_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2287:6: ( (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2288:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2288:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )
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
                        new NoViableAltException("2288:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )", 40, 2, input);

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
                        new NoViableAltException("2288:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )", 40, 3, input);

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
                    new NoViableAltException("2288:1: (this_base_type_spec_0= rulebase_type_spec | this_template_type_spec_1= ruletemplate_type_spec )", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2289:2: this_base_type_spec_0= rulebase_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSimple_type_specAccess().getBase_type_specParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_rulesimple_type_spec4068);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2302:2: this_template_type_spec_1= ruletemplate_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSimple_type_specAccess().getTemplate_type_specParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruletemplate_type_spec_in_rulesimple_type_spec4098);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2321:1: entryRulebase_type_spec returns [EObject current=null] : iv_rulebase_type_spec= rulebase_type_spec EOF ;
    public final EObject entryRulebase_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebase_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2322:2: (iv_rulebase_type_spec= rulebase_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2323:2: iv_rulebase_type_spec= rulebase_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBase_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulebase_type_spec_in_entryRulebase_type_spec4133);
            iv_rulebase_type_spec=rulebase_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulebase_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulebase_type_spec4143); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2330:1: rulebase_type_spec returns [EObject current=null] : (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) ) ;
    public final EObject rulebase_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_primitive_def_0 = null;

        Enumerator lv_kind_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2335:6: ( (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2336:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2336:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )
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
                    new NoViableAltException("2336:1: (this_primitive_def_0= ruleprimitive_def | ( (lv_kind_1_0= ruleobject_type ) ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2337:2: this_primitive_def_0= ruleprimitive_def
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getBase_type_specAccess().getPrimitive_defParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_rulebase_type_spec4193);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2349:6: ( (lv_kind_1_0= ruleobject_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2349:6: ( (lv_kind_1_0= ruleobject_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2350:1: (lv_kind_1_0= ruleobject_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2350:1: (lv_kind_1_0= ruleobject_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2351:3: lv_kind_1_0= ruleobject_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getBase_type_specAccess().getKindObject_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleobject_type_in_rulebase_type_spec4219);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2381:1: entryRuletemplate_type_spec returns [EObject current=null] : iv_ruletemplate_type_spec= ruletemplate_type_spec EOF ;
    public final EObject entryRuletemplate_type_spec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletemplate_type_spec = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2382:2: (iv_ruletemplate_type_spec= ruletemplate_type_spec EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2383:2: iv_ruletemplate_type_spec= ruletemplate_type_spec EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTemplate_type_specRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruletemplate_type_spec_in_entryRuletemplate_type_spec4255);
            iv_ruletemplate_type_spec=ruletemplate_type_spec();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletemplate_type_spec; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletemplate_type_spec4265); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2390:1: ruletemplate_type_spec returns [EObject current=null] : (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type ) ;
    public final EObject ruletemplate_type_spec() throws RecognitionException {
        EObject current = null;

        EObject this_sequence_type_0 = null;

        EObject this_stringdef_type_1 = null;

        EObject this_wide_stringdef_type_2 = null;

        EObject this_fixed_pt_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2395:6: ( (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2396:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2396:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )
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
                    new NoViableAltException("2396:1: (this_sequence_type_0= rulesequence_type | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_type_3= rulefixed_pt_type )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2397:2: this_sequence_type_0= rulesequence_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getSequence_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesequence_type_in_ruletemplate_type_spec4315);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2410:2: this_stringdef_type_1= rulestringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getStringdef_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_ruletemplate_type_spec4345);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2423:2: this_wide_stringdef_type_2= rulewide_stringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getWide_stringdef_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_ruletemplate_type_spec4375);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2436:2: this_fixed_pt_type_3= rulefixed_pt_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTemplate_type_specAccess().getFixed_pt_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefixed_pt_type_in_ruletemplate_type_spec4405);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2457:1: entryRulestruct_type returns [EObject current=null] : iv_rulestruct_type= rulestruct_type EOF ;
    public final EObject entryRulestruct_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestruct_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2458:2: (iv_rulestruct_type= rulestruct_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2459:2: iv_rulestruct_type= rulestruct_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStruct_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_entryRulestruct_type4442);
            iv_rulestruct_type=rulestruct_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestruct_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulestruct_type4452); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2466:1: rulestruct_type returns [EObject current=null] : ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' ) ;
    public final EObject rulestruct_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_members_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2471:6: ( ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2472:1: ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2472:1: ( 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2472:3: 'struct' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= rulemember ) )+ '}'
            {
            match(input,40,FollowSets000.FOLLOW_40_in_rulestruct_type4487); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStruct_typeAccess().getStructKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2476:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2477:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2477:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2478:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulestruct_type4504); if (failed) return current;
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

            match(input,19,FollowSets000.FOLLOW_19_in_rulestruct_type4519); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStruct_typeAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2504:1: ( (lv_members_3_0= rulemember ) )+
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2505:1: (lv_members_3_0= rulemember )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2505:1: (lv_members_3_0= rulemember )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2506:3: lv_members_3_0= rulemember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStruct_typeAccess().getMembersMemberParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemember_in_rulestruct_type4540);
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

            match(input,20,FollowSets000.FOLLOW_20_in_rulestruct_type4551); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2540:1: entryRulemember returns [EObject current=null] : iv_rulemember= rulemember EOF ;
    public final EObject entryRulemember() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemember = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2541:2: (iv_rulemember= rulemember EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2542:2: iv_rulemember= rulemember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMemberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemember_in_entryRulemember4587);
            iv_rulemember=rulemember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemember4597); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2549:1: rulemember returns [EObject current=null] : ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) ) ;
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
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2554:6: ( ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                int LA44_1 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case 54:
                {
                int LA44_2 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA44_3 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 3, input);

                    throw nvae;
                }
                }
                break;
            case 72:
                {
                int LA44_4 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 4, input);

                    throw nvae;
                }
                }
                break;
            case 55:
                {
                int LA44_5 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case 73:
                {
                int LA44_6 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 6, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                int LA44_7 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 7, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                int LA44_8 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 8, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                int LA44_9 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 9, input);

                    throw nvae;
                }
                }
                break;
            case 75:
                {
                int LA44_10 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 10, input);

                    throw nvae;
                }
                }
                break;
            case 76:
                {
                int LA44_11 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 11, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                int LA44_12 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 12, input);

                    throw nvae;
                }
                }
                break;
            case 78:
                {
                int LA44_13 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 13, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA44_14 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 14, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                int LA44_15 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (synpred60()) ) {
                    alt44=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 15, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA44_16 = input.LA(2);

                if ( (synpred59()) ) {
                    alt44=1;
                }
                else if ( (true) ) {
                    alt44=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 16, input);

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
                    new NoViableAltException("2555:1: ( ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' ) | ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' ) | ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' ) | ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' ) )", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:2: ( ( (lv_containedType_0_0= rulearray_type_spec ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:3: ( (lv_containedType_0_0= rulearray_type_spec ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:3: ( (lv_containedType_0_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2556:1: (lv_containedType_0_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2556:1: (lv_containedType_0_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2557:3: lv_containedType_0_0= rulearray_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeArray_type_specParserRuleCall_0_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulemember4644);
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

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4654); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMemberAccess().getSemicolonKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:6: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:7: ( (lv_containedType_2_0= rulesimple_type_spec ) ) ( (lv_identifier_3_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:7: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2585:1: (lv_containedType_2_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2585:1: (lv_containedType_2_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2586:3: lv_containedType_2_0= rulesimple_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeSimple_type_specParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulemember4683);
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2608:2: ( (lv_identifier_3_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2609:1: (lv_identifier_3_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2609:1: (lv_identifier_3_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2610:3: lv_identifier_3_0= RULE_ID
                    {
                    lv_identifier_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4700); if (failed) return current;
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

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4715); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMemberAccess().getSemicolonKeyword_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2637:6: ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2637:6: ( ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2637:7: ( (lv_containedType_5_0= rulestruct_type ) ) ( (lv_identifier_6_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2637:7: ( (lv_containedType_5_0= rulestruct_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:1: (lv_containedType_5_0= rulestruct_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2638:1: (lv_containedType_5_0= rulestruct_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2639:3: lv_containedType_5_0= rulestruct_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeStruct_typeParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestruct_type_in_rulemember4744);
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2661:2: ( (lv_identifier_6_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2662:1: (lv_identifier_6_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2662:1: (lv_identifier_6_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2663:3: lv_identifier_6_0= RULE_ID
                    {
                    lv_identifier_6_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4761); if (failed) return current;
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

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4776); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getMemberAccess().getSemicolonKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2690:6: ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2690:6: ( ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2690:7: ( ( RULE_ID ) ) ( (lv_identifier_9_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2690:7: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2691:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2691:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2692:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4806); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getMemberAccess().getSharedTypeTypedefDefCrossReference_3_0_0(), "sharedType"); 
                      	
                    }

                    }


                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2707:2: ( (lv_identifier_9_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2708:1: (lv_identifier_9_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2708:1: (lv_identifier_9_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2709:3: lv_identifier_9_0= RULE_ID
                    {
                    lv_identifier_9_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulemember4823); if (failed) return current;
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

                    match(input,17,FollowSets000.FOLLOW_17_in_rulemember4838); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2743:1: entryRuleunion_type returns [EObject current=null] : iv_ruleunion_type= ruleunion_type EOF ;
    public final EObject entryRuleunion_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunion_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2744:2: (iv_ruleunion_type= ruleunion_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2745:2: iv_ruleunion_type= ruleunion_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnion_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunion_type_in_entryRuleunion_type4875);
            iv_ruleunion_type=ruleunion_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunion_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunion_type4885); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2752:1: ruleunion_type returns [EObject current=null] : ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' ) ;
    public final EObject ruleunion_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_containedDiscrim_4_0 = null;

        EObject lv_unionMembers_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2757:6: ( ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2758:1: ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2758:1: ( 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2758:3: 'union' ( (lv_identifier_1_0= RULE_ID ) ) 'switch' '(' ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) ) ')' '{' ( (lv_unionMembers_8_0= rulecase_stmt ) )+ '}'
            {
            match(input,41,FollowSets000.FOLLOW_41_in_ruleunion_type4920); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getUnionKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2762:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2763:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2763:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2764:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleunion_type4937); if (failed) return current;
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

            match(input,42,FollowSets000.FOLLOW_42_in_ruleunion_type4952); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getSwitchKeyword_2(), null); 
                  
            }
            match(input,27,FollowSets000.FOLLOW_27_in_ruleunion_type4962); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getLeftParenthesisKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2794:1: ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) )
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
                    new NoViableAltException("2794:1: ( ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) ) | ( ( RULE_ID ) ) )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2794:2: ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2794:2: ( (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2795:1: (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2795:1: (lv_containedDiscrim_4_0= ruleswitch_type_spec_cont )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2796:3: lv_containedDiscrim_4_0= ruleswitch_type_spec_cont
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnion_typeAccess().getContainedDiscrimSwitch_type_spec_contParserRuleCall_4_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleswitch_type_spec_cont_in_ruleunion_type4984);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2819:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2819:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2820:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2820:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2821:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleunion_type5012); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getUnion_typeAccess().getSharedDiscrimEnumDefCrossReference_4_1_0(), "sharedDiscrim"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleunion_type5023); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getRightParenthesisKeyword_5(), null); 
                  
            }
            match(input,19,FollowSets000.FOLLOW_19_in_ruleunion_type5033); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getUnion_typeAccess().getLeftCurlyBracketKeyword_6(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2844:1: ( (lv_unionMembers_8_0= rulecase_stmt ) )+
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
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2845:1: (lv_unionMembers_8_0= rulecase_stmt )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2845:1: (lv_unionMembers_8_0= rulecase_stmt )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2846:3: lv_unionMembers_8_0= rulecase_stmt
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getUnion_typeAccess().getUnionMembersCase_stmtParserRuleCall_7_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulecase_stmt_in_ruleunion_type5054);
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

            match(input,20,FollowSets000.FOLLOW_20_in_ruleunion_type5065); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2880:1: entryRuleswitch_type_spec_cont returns [EObject current=null] : iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF ;
    public final EObject entryRuleswitch_type_spec_cont() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleswitch_type_spec_cont = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2881:2: (iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2882:2: iv_ruleswitch_type_spec_cont= ruleswitch_type_spec_cont EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSwitch_type_spec_contRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleswitch_type_spec_cont_in_entryRuleswitch_type_spec_cont5101);
            iv_ruleswitch_type_spec_cont=ruleswitch_type_spec_cont();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleswitch_type_spec_cont; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleswitch_type_spec_cont5111); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2889:1: ruleswitch_type_spec_cont returns [EObject current=null] : (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type ) ;
    public final EObject ruleswitch_type_spec_cont() throws RecognitionException {
        EObject current = null;

        EObject this_integer_type_0 = null;

        Enumerator lv_kind_2_0 = null;

        Enumerator lv_kind_4_0 = null;

        EObject this_enum_type_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2894:6: ( (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2895:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2895:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )
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
                    new NoViableAltException("2895:1: (this_integer_type_0= ruleinteger_type | ( () ( (lv_kind_2_0= rulechar_type ) ) ) | ( () ( (lv_kind_4_0= ruleboolean_type ) ) ) | this_enum_type_5= ruleenum_type )", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2896:2: this_integer_type_0= ruleinteger_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getInteger_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_ruleswitch_type_spec_cont5161);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2908:6: ( () ( (lv_kind_2_0= rulechar_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2908:6: ( () ( (lv_kind_2_0= rulechar_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2908:7: () ( (lv_kind_2_0= rulechar_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2908:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2909:2: 
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2922:2: ( (lv_kind_2_0= rulechar_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2923:1: (lv_kind_2_0= rulechar_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2923:1: (lv_kind_2_0= rulechar_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2924:3: lv_kind_2_0= rulechar_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getKindChar_typeEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulechar_type_in_ruleswitch_type_spec_cont5200);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2947:6: ( () ( (lv_kind_4_0= ruleboolean_type ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2947:6: ( () ( (lv_kind_4_0= ruleboolean_type ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2947:7: () ( (lv_kind_4_0= ruleboolean_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2947:7: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2948:2: 
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2961:2: ( (lv_kind_4_0= ruleboolean_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2962:1: (lv_kind_4_0= ruleboolean_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2962:1: (lv_kind_4_0= ruleboolean_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2963:3: lv_kind_4_0= ruleboolean_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getKindBoolean_typeEnumRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolean_type_in_ruleswitch_type_spec_cont5241);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2987:2: this_enum_type_5= ruleenum_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSwitch_type_spec_contAccess().getEnum_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_ruleswitch_type_spec_cont5273);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3006:1: entryRulecase_stmt returns [EObject current=null] : iv_rulecase_stmt= rulecase_stmt EOF ;
    public final EObject entryRulecase_stmt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_stmt = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3007:2: (iv_rulecase_stmt= rulecase_stmt EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3008:2: iv_rulecase_stmt= rulecase_stmt EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCase_stmtRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulecase_stmt_in_entryRulecase_stmt5308);
            iv_rulecase_stmt=rulecase_stmt();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulecase_stmt; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecase_stmt5318); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3015:1: rulecase_stmt returns [EObject current=null] : ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) ) ;
    public final EObject rulecase_stmt() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_14_0=null;
        EObject lv_label_1_0 = null;

        EObject lv_containedType_5_0 = null;

        EObject lv_label_8_0 = null;

        EObject lv_containedType_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3020:6: ( ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred69()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3021:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==44) ) {
                int LA51_2 = input.LA(2);

                if ( (synpred69()) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3021:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )", 51, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3021:1: ( ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' ) | ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' ) )", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:2: ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:2: ( ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:3: ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( (lv_containedType_5_0= rulearray_type_spec ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:3: ( ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+
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
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:4: ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:4: ( 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:6: 'case' ( (lv_label_1_0= ruleconst_exp ) ) ':'
                    	    {
                    	    match(input,43,FollowSets000.FOLLOW_43_in_rulecase_stmt5356); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getCaseKeyword_0_0_0_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3025:1: ( (lv_label_1_0= ruleconst_exp ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3026:1: (lv_label_1_0= ruleconst_exp )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3026:1: (lv_label_1_0= ruleconst_exp )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3027:3: lv_label_1_0= ruleconst_exp
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_0_0_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulecase_stmt5377);
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

                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5387); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getColonKeyword_0_0_0_2(), null); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3054:6: ( 'default' ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3054:6: ( 'default' ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3054:8: 'default' ':'
                    	    {
                    	    match(input,44,FollowSets000.FOLLOW_44_in_rulecase_stmt5405); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getDefaultKeyword_0_0_1_0(), null); 
                    	          
                    	    }
                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5415); if (failed) return current;
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3062:4: ( (lv_containedType_5_0= rulearray_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3063:1: (lv_containedType_5_0= rulearray_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3063:1: (lv_containedType_5_0= rulearray_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:3: lv_containedType_5_0= rulearray_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_rulecase_stmt5439);
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

                    match(input,17,FollowSets000.FOLLOW_17_in_rulecase_stmt5449); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCase_stmtAccess().getSemicolonKeyword_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3091:6: ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3091:6: ( ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3091:7: ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_14_0= RULE_ID ) ) ';'
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3091:7: ( ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+
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
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3091:8: ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3091:8: ( 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3091:10: 'case' ( (lv_label_8_0= ruleconst_exp ) ) ':'
                    	    {
                    	    match(input,43,FollowSets000.FOLLOW_43_in_rulecase_stmt5469); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getCaseKeyword_1_0_0_0(), null); 
                    	          
                    	    }
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3095:1: ( (lv_label_8_0= ruleconst_exp ) )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3096:1: (lv_label_8_0= ruleconst_exp )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3096:1: (lv_label_8_0= ruleconst_exp )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3097:3: lv_label_8_0= ruleconst_exp
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_1_0_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulecase_stmt5490);
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

                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5500); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getColonKeyword_1_0_0_2(), null); 
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3124:6: ( 'default' ':' )
                    	    {
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3124:6: ( 'default' ':' )
                    	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3124:8: 'default' ':'
                    	    {
                    	    match(input,44,FollowSets000.FOLLOW_44_in_rulecase_stmt5518); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getCase_stmtAccess().getDefaultKeyword_1_0_1_0(), null); 
                    	          
                    	    }
                    	    match(input,24,FollowSets000.FOLLOW_24_in_rulecase_stmt5528); if (failed) return current;
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3132:4: ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
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
                            new NoViableAltException("3132:4: ( ( (lv_containedType_12_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3132:5: ( (lv_containedType_12_0= rulesimple_type_spec ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3132:5: ( (lv_containedType_12_0= rulesimple_type_spec ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3133:1: (lv_containedType_12_0= rulesimple_type_spec )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3133:1: (lv_containedType_12_0= rulesimple_type_spec )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3134:3: lv_containedType_12_0= rulesimple_type_spec
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeSimple_type_specParserRuleCall_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulecase_stmt5553);
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
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3157:6: ( ( RULE_ID ) )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3157:6: ( ( RULE_ID ) )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3158:1: ( RULE_ID )
                            {
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3158:1: ( RULE_ID )
                            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3159:3: RULE_ID
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
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulecase_stmt5581); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCase_stmtAccess().getSharedTypeTypedefDefCrossReference_1_1_1_0(), "sharedType"); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3174:3: ( (lv_identifier_14_0= RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3175:1: (lv_identifier_14_0= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3175:1: (lv_identifier_14_0= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3176:3: lv_identifier_14_0= RULE_ID
                    {
                    lv_identifier_14_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulecase_stmt5599); if (failed) return current;
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

                    match(input,17,FollowSets000.FOLLOW_17_in_rulecase_stmt5614); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3210:1: entryRuleenum_type returns [EObject current=null] : iv_ruleenum_type= ruleenum_type EOF ;
    public final EObject entryRuleenum_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3211:2: (iv_ruleenum_type= ruleenum_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3212:2: iv_ruleenum_type= ruleenum_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnum_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_type_in_entryRuleenum_type5651);
            iv_ruleenum_type=ruleenum_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleenum_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleenum_type5661); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3219:1: ruleenum_type returns [EObject current=null] : ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' ) ;
    public final EObject ruleenum_type() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        EObject lv_members_3_0 = null;

        EObject lv_members_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3224:6: ( ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3225:1: ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3225:1: ( 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3225:3: 'enum' ( (lv_identifier_1_0= RULE_ID ) ) '{' ( (lv_members_3_0= ruleenum_member ) ) ( ',' ( (lv_members_5_0= ruleenum_member ) ) )* '}'
            {
            match(input,45,FollowSets000.FOLLOW_45_in_ruleenum_type5696); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnum_typeAccess().getEnumKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3229:1: ( (lv_identifier_1_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3230:1: (lv_identifier_1_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3230:1: (lv_identifier_1_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3231:3: lv_identifier_1_0= RULE_ID
            {
            lv_identifier_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleenum_type5713); if (failed) return current;
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

            match(input,19,FollowSets000.FOLLOW_19_in_ruleenum_type5728); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEnum_typeAccess().getLeftCurlyBracketKeyword_2(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3257:1: ( (lv_members_3_0= ruleenum_member ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3258:1: (lv_members_3_0= ruleenum_member )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3258:1: (lv_members_3_0= ruleenum_member )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3259:3: lv_members_3_0= ruleenum_member
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getEnum_typeAccess().getMembersEnum_memberParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_ruleenum_type5749);
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

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3281:2: ( ',' ( (lv_members_5_0= ruleenum_member ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==25) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3281:4: ',' ( (lv_members_5_0= ruleenum_member ) )
            	    {
            	    match(input,25,FollowSets000.FOLLOW_25_in_ruleenum_type5760); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getEnum_typeAccess().getCommaKeyword_4_0(), null); 
            	          
            	    }
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3285:1: ( (lv_members_5_0= ruleenum_member ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3286:1: (lv_members_5_0= ruleenum_member )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3286:1: (lv_members_5_0= ruleenum_member )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3287:3: lv_members_5_0= ruleenum_member
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEnum_typeAccess().getMembersEnum_memberParserRuleCall_4_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_ruleenum_type5781);
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

            match(input,20,FollowSets000.FOLLOW_20_in_ruleenum_type5793); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3321:1: entryRuleenum_member returns [EObject current=null] : iv_ruleenum_member= ruleenum_member EOF ;
    public final EObject entryRuleenum_member() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenum_member = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3322:2: (iv_ruleenum_member= ruleenum_member EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3323:2: iv_ruleenum_member= ruleenum_member EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEnum_memberRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleenum_member_in_entryRuleenum_member5829);
            iv_ruleenum_member=ruleenum_member();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleenum_member; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleenum_member5839); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3330:1: ruleenum_member returns [EObject current=null] : ( (lv_identifier_0_0= RULE_ID ) ) ;
    public final EObject ruleenum_member() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3335:6: ( ( (lv_identifier_0_0= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3336:1: ( (lv_identifier_0_0= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3336:1: ( (lv_identifier_0_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3337:1: (lv_identifier_0_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3337:1: (lv_identifier_0_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3338:3: lv_identifier_0_0= RULE_ID
            {
            lv_identifier_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleenum_member5880); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3368:1: entryRuleconstr_forward_decl returns [String current=null] : iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF ;
    public final String entryRuleconstr_forward_decl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstr_forward_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3369:2: (iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3370:2: iv_ruleconstr_forward_decl= ruleconstr_forward_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstr_forward_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconstr_forward_decl_in_entryRuleconstr_forward_decl5921);
            iv_ruleconstr_forward_decl=ruleconstr_forward_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconstr_forward_decl.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconstr_forward_decl5932); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3377:1: ruleconstr_forward_decl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleconstr_forward_decl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3382:6: ( ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3383:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3383:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )
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
                    new NoViableAltException("3383:1: ( (kw= 'struct' this_ID_1= RULE_ID ) | (kw= 'union' this_ID_3= RULE_ID ) )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3383:2: (kw= 'struct' this_ID_1= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3383:2: (kw= 'struct' this_ID_1= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3384:2: kw= 'struct' this_ID_1= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleconstr_forward_decl5971); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getConstr_forward_declAccess().getStructKeyword_0_0(), null); 
                          
                    }
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstr_forward_decl5986); if (failed) return current;
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3397:6: (kw= 'union' this_ID_3= RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3397:6: (kw= 'union' this_ID_3= RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3398:2: kw= 'union' this_ID_3= RULE_ID
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleconstr_forward_decl6012); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getConstr_forward_declAccess().getUnionKeyword_1_0(), null); 
                          
                    }
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstr_forward_decl6027); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3418:1: entryRuleconst_decl returns [EObject current=null] : iv_ruleconst_decl= ruleconst_decl EOF ;
    public final EObject entryRuleconst_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_decl = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3419:2: (iv_ruleconst_decl= ruleconst_decl EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3420:2: iv_ruleconst_decl= ruleconst_decl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConst_declRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_decl_in_entryRuleconst_decl6073);
            iv_ruleconst_decl=ruleconst_decl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconst_decl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_decl6083); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3427:1: ruleconst_decl returns [EObject current=null] : ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) ) ;
    public final EObject ruleconst_decl() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_3_0=null;
        EObject lv_containedType_1_0 = null;

        EObject lv_constValue_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3432:6: ( ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3433:1: ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3433:1: ( 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3433:3: 'const' ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) ) ( (lv_identifier_3_0= RULE_ID ) ) '=' ( (lv_constValue_5_0= ruleconst_exp ) )
            {
            match(input,46,FollowSets000.FOLLOW_46_in_ruleconst_decl6118); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConst_declAccess().getConstKeyword_0(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3437:1: ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) )
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
                    new NoViableAltException("3437:1: ( ( (lv_containedType_1_0= ruleconst_type ) ) | ( ( RULE_ID ) ) )", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3437:2: ( (lv_containedType_1_0= ruleconst_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3437:2: ( (lv_containedType_1_0= ruleconst_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3438:1: (lv_containedType_1_0= ruleconst_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3438:1: (lv_containedType_1_0= ruleconst_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3439:3: lv_containedType_1_0= ruleconst_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConst_declAccess().getContainedTypeConst_typeParserRuleCall_1_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_type_in_ruleconst_decl6140);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3462:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3462:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3463:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3463:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3464:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconst_decl6168); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getConst_declAccess().getSharedTypeAliasDefCrossReference_1_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3479:3: ( (lv_identifier_3_0= RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3480:1: (lv_identifier_3_0= RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3480:1: (lv_identifier_3_0= RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3481:3: lv_identifier_3_0= RULE_ID
            {
            lv_identifier_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconst_decl6186); if (failed) return current;
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

            match(input,47,FollowSets000.FOLLOW_47_in_ruleconst_decl6201); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConst_declAccess().getEqualsSignKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3507:1: ( (lv_constValue_5_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3508:1: (lv_constValue_5_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3508:1: (lv_constValue_5_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3509:3: lv_constValue_5_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConst_declAccess().getConstValueConst_expParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_ruleconst_decl6222);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3539:1: entryRuleconst_type returns [EObject current=null] : iv_ruleconst_type= ruleconst_type EOF ;
    public final EObject entryRuleconst_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3540:2: (iv_ruleconst_type= ruleconst_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3541:2: iv_ruleconst_type= ruleconst_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConst_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_type_in_entryRuleconst_type6258);
            iv_ruleconst_type=ruleconst_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconst_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_type6268); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3548:1: ruleconst_type returns [EObject current=null] : (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type ) ;
    public final EObject ruleconst_type() throws RecognitionException {
        EObject current = null;

        EObject this_primitive_def_0 = null;

        EObject this_stringdef_type_1 = null;

        EObject this_wide_stringdef_type_2 = null;

        EObject this_fixed_pt_const_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3553:6: ( (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3554:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3554:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )
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
                        new NoViableAltException("3554:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )", 55, 2, input);

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
                        new NoViableAltException("3554:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )", 55, 3, input);

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
                    new NoViableAltException("3554:1: (this_primitive_def_0= ruleprimitive_def | this_stringdef_type_1= rulestringdef_type | this_wide_stringdef_type_2= rulewide_stringdef_type | this_fixed_pt_const_type_3= rulefixed_pt_const_type )", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3555:2: this_primitive_def_0= ruleprimitive_def
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getPrimitive_defParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_ruleconst_type6318);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3568:2: this_stringdef_type_1= rulestringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getStringdef_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_ruleconst_type6348);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3581:2: this_wide_stringdef_type_2= rulewide_stringdef_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getWide_stringdef_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_ruleconst_type6378);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3594:2: this_fixed_pt_const_type_3= rulefixed_pt_const_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getConst_typeAccess().getFixed_pt_const_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefixed_pt_const_type_in_ruleconst_type6408);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3613:1: entryRuleprimitive_def returns [EObject current=null] : iv_ruleprimitive_def= ruleprimitive_def EOF ;
    public final EObject entryRuleprimitive_def() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimitive_def = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3614:2: (iv_ruleprimitive_def= ruleprimitive_def EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3615:2: iv_ruleprimitive_def= ruleprimitive_def EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitive_defRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleprimitive_def_in_entryRuleprimitive_def6443);
            iv_ruleprimitive_def=ruleprimitive_def();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleprimitive_def; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleprimitive_def6453); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3622:1: ruleprimitive_def returns [EObject current=null] : (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type ) ;
    public final EObject ruleprimitive_def() throws RecognitionException {
        EObject current = null;

        EObject this_integer_type_0 = null;

        EObject this_floating_pt_type_1 = null;

        EObject this_charstr_type_2 = null;

        EObject this_other_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3627:6: ( (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3628:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3628:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )
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
                        new NoViableAltException("3628:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )", 56, 2, input);

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
                    new NoViableAltException("3628:1: (this_integer_type_0= ruleinteger_type | this_floating_pt_type_1= rulefloating_pt_type | this_charstr_type_2= rulecharstr_type | this_other_type_3= ruleother_type )", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3629:2: this_integer_type_0= ruleinteger_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getInteger_typeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_ruleprimitive_def6503);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3642:2: this_floating_pt_type_1= rulefloating_pt_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getFloating_pt_typeParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefloating_pt_type_in_ruleprimitive_def6533);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3655:2: this_charstr_type_2= rulecharstr_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getCharstr_typeParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulecharstr_type_in_ruleprimitive_def6563);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3668:2: this_other_type_3= ruleother_type
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimitive_defAccess().getOther_typeParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleother_type_in_ruleprimitive_def6593);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3687:1: entryRulesequence_type returns [EObject current=null] : iv_rulesequence_type= rulesequence_type EOF ;
    public final EObject entryRulesequence_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesequence_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3688:2: (iv_rulesequence_type= rulesequence_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3689:2: iv_rulesequence_type= rulesequence_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSequence_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesequence_type_in_entryRulesequence_type6628);
            iv_rulesequence_type=rulesequence_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulesequence_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesequence_type6638); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3696:1: rulesequence_type returns [EObject current=null] : ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' ) ;
    public final EObject rulesequence_type() throws RecognitionException {
        EObject current = null;

        EObject lv_containedType_2_0 = null;

        EObject lv_bound_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3701:6: ( ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3702:1: ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3702:1: ( 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3702:3: 'sequence' '<' ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) ) ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )? '>'
            {
            match(input,48,FollowSets000.FOLLOW_48_in_rulesequence_type6673); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSequence_typeAccess().getSequenceKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulesequence_type6683); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSequence_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3710:1: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )
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
                    new NoViableAltException("3710:1: ( ( (lv_containedType_2_0= rulesimple_type_spec ) ) | ( ( RULE_ID ) ) )", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3710:2: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3710:2: ( (lv_containedType_2_0= rulesimple_type_spec ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3711:1: (lv_containedType_2_0= rulesimple_type_spec )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3711:1: (lv_containedType_2_0= rulesimple_type_spec )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3712:3: lv_containedType_2_0= rulesimple_type_spec
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSequence_typeAccess().getContainedTypeSimple_type_specParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_rulesequence_type6705);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3735:6: ( ( RULE_ID ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3735:6: ( ( RULE_ID ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3736:1: ( RULE_ID )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3736:1: ( RULE_ID )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3737:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulesequence_type6733); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getSequence_typeAccess().getSharedTypeTypedefDefCrossReference_2_1_0(), "sharedType"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3752:3: ( ',' ( (lv_bound_5_0= ruleconst_exp ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==25) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3752:5: ',' ( (lv_bound_5_0= ruleconst_exp ) )
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rulesequence_type6745); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequence_typeAccess().getCommaKeyword_3_0(), null); 
                          
                    }
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3756:1: ( (lv_bound_5_0= ruleconst_exp ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3757:1: (lv_bound_5_0= ruleconst_exp )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3757:1: (lv_bound_5_0= ruleconst_exp )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3758:3: lv_bound_5_0= ruleconst_exp
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSequence_typeAccess().getBoundConst_expParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulesequence_type6766);
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

            match(input,50,FollowSets000.FOLLOW_50_in_rulesequence_type6778); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3792:1: entryRulestringdef_type returns [EObject current=null] : iv_rulestringdef_type= rulestringdef_type EOF ;
    public final EObject entryRulestringdef_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestringdef_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3793:2: (iv_rulestringdef_type= rulestringdef_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3794:2: iv_rulestringdef_type= rulestringdef_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringdef_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulestringdef_type_in_entryRulestringdef_type6814);
            iv_rulestringdef_type=rulestringdef_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestringdef_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulestringdef_type6824); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3801:1: rulestringdef_type returns [EObject current=null] : ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) ;
    public final EObject rulestringdef_type() throws RecognitionException {
        EObject current = null;

        EObject lv_bound_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3806:6: ( ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3807:1: ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3807:1: ( 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3807:3: 'string' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>'
            {
            match(input,51,FollowSets000.FOLLOW_51_in_rulestringdef_type6859); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringdef_typeAccess().getStringKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulestringdef_type6869); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStringdef_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3815:1: ( (lv_bound_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3816:1: (lv_bound_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3816:1: (lv_bound_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3817:3: lv_bound_2_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getStringdef_typeAccess().getBoundConst_expParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulestringdef_type6890);
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

            match(input,50,FollowSets000.FOLLOW_50_in_rulestringdef_type6900); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3851:1: entryRulewide_stringdef_type returns [EObject current=null] : iv_rulewide_stringdef_type= rulewide_stringdef_type EOF ;
    public final EObject entryRulewide_stringdef_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewide_stringdef_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3852:2: (iv_rulewide_stringdef_type= rulewide_stringdef_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3853:2: iv_rulewide_stringdef_type= rulewide_stringdef_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getWide_stringdef_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulewide_stringdef_type_in_entryRulewide_stringdef_type6936);
            iv_rulewide_stringdef_type=rulewide_stringdef_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulewide_stringdef_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulewide_stringdef_type6946); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3860:1: rulewide_stringdef_type returns [EObject current=null] : ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) ;
    public final EObject rulewide_stringdef_type() throws RecognitionException {
        EObject current = null;

        EObject lv_bound_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3865:6: ( ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3866:1: ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3866:1: ( 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3866:3: 'wstring' '<' ( (lv_bound_2_0= ruleconst_exp ) ) '>'
            {
            match(input,52,FollowSets000.FOLLOW_52_in_rulewide_stringdef_type6981); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWide_stringdef_typeAccess().getWstringKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulewide_stringdef_type6991); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getWide_stringdef_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3874:1: ( (lv_bound_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3875:1: (lv_bound_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3875:1: (lv_bound_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3876:3: lv_bound_2_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getWide_stringdef_typeAccess().getBoundConst_expParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulewide_stringdef_type7012);
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

            match(input,50,FollowSets000.FOLLOW_50_in_rulewide_stringdef_type7022); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3910:1: entryRulefixed_pt_type returns [EObject current=null] : iv_rulefixed_pt_type= rulefixed_pt_type EOF ;
    public final EObject entryRulefixed_pt_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_pt_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3911:2: (iv_rulefixed_pt_type= rulefixed_pt_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3912:2: iv_rulefixed_pt_type= rulefixed_pt_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFixed_pt_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefixed_pt_type_in_entryRulefixed_pt_type7058);
            iv_rulefixed_pt_type=rulefixed_pt_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefixed_pt_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefixed_pt_type7068); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3919:1: rulefixed_pt_type returns [EObject current=null] : ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' ) ;
    public final EObject rulefixed_pt_type() throws RecognitionException {
        EObject current = null;

        EObject lv_digits_2_0 = null;

        EObject lv_scale_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3924:6: ( ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3925:1: ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3925:1: ( 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3925:3: 'fixed' '<' ( (lv_digits_2_0= ruleconst_exp ) ) ',' ( (lv_scale_4_0= ruleconst_exp ) ) '>'
            {
            match(input,53,FollowSets000.FOLLOW_53_in_rulefixed_pt_type7103); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_typeAccess().getFixedKeyword_0(), null); 
                  
            }
            match(input,49,FollowSets000.FOLLOW_49_in_rulefixed_pt_type7113); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_typeAccess().getLessThanSignKeyword_1(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3933:1: ( (lv_digits_2_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3934:1: (lv_digits_2_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3934:1: (lv_digits_2_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3935:3: lv_digits_2_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFixed_pt_typeAccess().getDigitsConst_expParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulefixed_pt_type7134);
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

            match(input,25,FollowSets000.FOLLOW_25_in_rulefixed_pt_type7144); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFixed_pt_typeAccess().getCommaKeyword_3(), null); 
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3961:1: ( (lv_scale_4_0= ruleconst_exp ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3962:1: (lv_scale_4_0= ruleconst_exp )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3962:1: (lv_scale_4_0= ruleconst_exp )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3963:3: lv_scale_4_0= ruleconst_exp
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFixed_pt_typeAccess().getScaleConst_expParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_rulefixed_pt_type7165);
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

            match(input,50,FollowSets000.FOLLOW_50_in_rulefixed_pt_type7175); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3997:1: entryRulefloating_pt_type returns [EObject current=null] : iv_rulefloating_pt_type= rulefloating_pt_type EOF ;
    public final EObject entryRulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloating_pt_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3998:2: (iv_rulefloating_pt_type= rulefloating_pt_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3999:2: iv_rulefloating_pt_type= rulefloating_pt_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloating_pt_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefloating_pt_type_in_entryRulefloating_pt_type7211);
            iv_rulefloating_pt_type=rulefloating_pt_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefloating_pt_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefloating_pt_type7221); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4006:1: rulefloating_pt_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) ;
    public final EObject rulefloating_pt_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4011:6: ( ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4012:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4012:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )
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
                    new NoViableAltException("4012:1: ( ( (lv_kind_0_0= rulefloat_type ) ) | ( (lv_kind_1_0= ruledouble_type ) ) | ( (lv_kind_2_0= rulelongdouble_type ) ) )", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4012:2: ( (lv_kind_0_0= rulefloat_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4012:2: ( (lv_kind_0_0= rulefloat_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4013:1: (lv_kind_0_0= rulefloat_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4013:1: (lv_kind_0_0= rulefloat_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4014:3: lv_kind_0_0= rulefloat_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindFloat_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulefloat_type_in_rulefloating_pt_type7267);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4037:6: ( (lv_kind_1_0= ruledouble_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4037:6: ( (lv_kind_1_0= ruledouble_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4038:1: (lv_kind_1_0= ruledouble_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4038:1: (lv_kind_1_0= ruledouble_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4039:3: lv_kind_1_0= ruledouble_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindDouble_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruledouble_type_in_rulefloating_pt_type7294);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4062:6: ( (lv_kind_2_0= rulelongdouble_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4062:6: ( (lv_kind_2_0= rulelongdouble_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4063:1: (lv_kind_2_0= rulelongdouble_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4063:1: (lv_kind_2_0= rulelongdouble_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4064:3: lv_kind_2_0= rulelongdouble_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFloating_pt_typeAccess().getKindLongdouble_typeParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelongdouble_type_in_rulefloating_pt_type7321);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4094:1: entryRulelongdouble_type returns [String current=null] : iv_rulelongdouble_type= rulelongdouble_type EOF ;
    public final String entryRulelongdouble_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelongdouble_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4095:2: (iv_rulelongdouble_type= rulelongdouble_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4096:2: iv_rulelongdouble_type= rulelongdouble_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLongdouble_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulelongdouble_type_in_entryRulelongdouble_type7358);
            iv_rulelongdouble_type=rulelongdouble_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulelongdouble_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulelongdouble_type7369); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4103:1: rulelongdouble_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'double' ) ;
    public final AntlrDatatypeRuleToken rulelongdouble_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4108:6: ( (kw= 'long' kw= 'double' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4109:1: (kw= 'long' kw= 'double' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4109:1: (kw= 'long' kw= 'double' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4110:2: kw= 'long' kw= 'double'
            {
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_rulelongdouble_type7407); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getLongdouble_typeAccess().getLongKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,55,FollowSets000.FOLLOW_55_in_rulelongdouble_type7420); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4129:1: entryRuleinteger_type returns [EObject current=null] : iv_ruleinteger_type= ruleinteger_type EOF ;
    public final EObject entryRuleinteger_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinteger_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4130:2: (iv_ruleinteger_type= ruleinteger_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4131:2: iv_ruleinteger_type= ruleinteger_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInteger_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleinteger_type_in_entryRuleinteger_type7460);
            iv_ruleinteger_type=ruleinteger_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleinteger_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleinteger_type7470); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4138:1: ruleinteger_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) ;
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
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4143:6: ( ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4144:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4144:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )
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
                        new NoViableAltException("4144:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 2, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA60_3 = input.LA(2);

                if ( (LA60_3==57) ) {
                    alt60=4;
                }
                else if ( (LA60_3==54) ) {
                    int LA60_7 = input.LA(3);

                    if ( (LA60_7==54) ) {
                        alt60=6;
                    }
                    else if ( (LA60_7==EOF||LA60_7==RULE_ID||LA60_7==25||LA60_7==28||LA60_7==50) ) {
                        alt60=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("4144:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("4144:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4144:1: ( ( (lv_kind_0_0= ruleshort_type ) ) | ( (lv_kind_1_0= rulelong_type ) ) | ( (lv_kind_2_0= rulelonglong_type ) ) | ( (lv_kind_3_0= ruleushort_type ) ) | ( (lv_kind_4_0= ruleulong_type ) ) | ( (lv_kind_5_0= ruleulonglong_type ) ) )", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4144:2: ( (lv_kind_0_0= ruleshort_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4144:2: ( (lv_kind_0_0= ruleshort_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4145:1: (lv_kind_0_0= ruleshort_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4145:1: (lv_kind_0_0= ruleshort_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4146:3: lv_kind_0_0= ruleshort_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindShort_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleshort_type_in_ruleinteger_type7516);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4169:6: ( (lv_kind_1_0= rulelong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4169:6: ( (lv_kind_1_0= rulelong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4170:1: (lv_kind_1_0= rulelong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4170:1: (lv_kind_1_0= rulelong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4171:3: lv_kind_1_0= rulelong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindLong_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelong_type_in_ruleinteger_type7543);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4194:6: ( (lv_kind_2_0= rulelonglong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4194:6: ( (lv_kind_2_0= rulelonglong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4195:1: (lv_kind_2_0= rulelonglong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4195:1: (lv_kind_2_0= rulelonglong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4196:3: lv_kind_2_0= rulelonglong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindLonglong_typeParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulelonglong_type_in_ruleinteger_type7570);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4219:6: ( (lv_kind_3_0= ruleushort_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4219:6: ( (lv_kind_3_0= ruleushort_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4220:1: (lv_kind_3_0= ruleushort_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4220:1: (lv_kind_3_0= ruleushort_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4221:3: lv_kind_3_0= ruleushort_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindUshort_typeParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleushort_type_in_ruleinteger_type7597);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4244:6: ( (lv_kind_4_0= ruleulong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4244:6: ( (lv_kind_4_0= ruleulong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4245:1: (lv_kind_4_0= ruleulong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4245:1: (lv_kind_4_0= ruleulong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4246:3: lv_kind_4_0= ruleulong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlong_typeParserRuleCall_4_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleulong_type_in_ruleinteger_type7624);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4269:6: ( (lv_kind_5_0= ruleulonglong_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4269:6: ( (lv_kind_5_0= ruleulonglong_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4270:1: (lv_kind_5_0= ruleulonglong_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4270:1: (lv_kind_5_0= ruleulonglong_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4271:3: lv_kind_5_0= ruleulonglong_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInteger_typeAccess().getKindUlonglong_typeParserRuleCall_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleulonglong_type_in_ruleinteger_type7651);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4301:1: entryRulelonglong_type returns [String current=null] : iv_rulelonglong_type= rulelonglong_type EOF ;
    public final String entryRulelonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelonglong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4302:2: (iv_rulelonglong_type= rulelonglong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4303:2: iv_rulelonglong_type= rulelonglong_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLonglong_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulelonglong_type_in_entryRulelonglong_type7688);
            iv_rulelonglong_type=rulelonglong_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulelonglong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulelonglong_type7699); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4310:1: rulelonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken rulelonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4315:6: ( (kw= 'long' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4316:1: (kw= 'long' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4316:1: (kw= 'long' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4317:2: kw= 'long' kw= 'long'
            {
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_rulelonglong_type7737); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getLonglong_typeAccess().getLongKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_rulelonglong_type7750); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4336:1: entryRuleushort_type returns [String current=null] : iv_ruleushort_type= ruleushort_type EOF ;
    public final String entryRuleushort_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleushort_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4337:2: (iv_ruleushort_type= ruleushort_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4338:2: iv_ruleushort_type= ruleushort_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUshort_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleushort_type_in_entryRuleushort_type7791);
            iv_ruleushort_type=ruleushort_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleushort_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleushort_type7802); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4345:1: ruleushort_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'short' ) ;
    public final AntlrDatatypeRuleToken ruleushort_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4350:6: ( (kw= 'unsigned' kw= 'short' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4351:1: (kw= 'unsigned' kw= 'short' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4351:1: (kw= 'unsigned' kw= 'short' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4352:2: kw= 'unsigned' kw= 'short'
            {
            kw=(Token)input.LT(1);
            match(input,56,FollowSets000.FOLLOW_56_in_ruleushort_type7840); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUshort_typeAccess().getUnsignedKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,57,FollowSets000.FOLLOW_57_in_ruleushort_type7853); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4371:1: entryRuleulong_type returns [String current=null] : iv_ruleulong_type= ruleulong_type EOF ;
    public final String entryRuleulong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4372:2: (iv_ruleulong_type= ruleulong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4373:2: iv_ruleulong_type= ruleulong_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUlong_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleulong_type_in_entryRuleulong_type7894);
            iv_ruleulong_type=ruleulong_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleulong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleulong_type7905); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4380:1: ruleulong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4385:6: ( (kw= 'unsigned' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4386:1: (kw= 'unsigned' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4386:1: (kw= 'unsigned' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4387:2: kw= 'unsigned' kw= 'long'
            {
            kw=(Token)input.LT(1);
            match(input,56,FollowSets000.FOLLOW_56_in_ruleulong_type7943); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlong_typeAccess().getUnsignedKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_ruleulong_type7956); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4406:1: entryRuleulonglong_type returns [String current=null] : iv_ruleulonglong_type= ruleulonglong_type EOF ;
    public final String entryRuleulonglong_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleulonglong_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4407:2: (iv_ruleulonglong_type= ruleulonglong_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4408:2: iv_ruleulonglong_type= ruleulonglong_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUlonglong_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleulonglong_type_in_entryRuleulonglong_type7997);
            iv_ruleulonglong_type=ruleulonglong_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleulonglong_type.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleulonglong_type8008); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4415:1: ruleulonglong_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unsigned' kw= 'long' kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleulonglong_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4420:6: ( (kw= 'unsigned' kw= 'long' kw= 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4421:1: (kw= 'unsigned' kw= 'long' kw= 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4421:1: (kw= 'unsigned' kw= 'long' kw= 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4422:2: kw= 'unsigned' kw= 'long' kw= 'long'
            {
            kw=(Token)input.LT(1);
            match(input,56,FollowSets000.FOLLOW_56_in_ruleulonglong_type8046); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlonglong_typeAccess().getUnsignedKeyword_0(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_ruleulonglong_type8059); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getUlonglong_typeAccess().getLongKeyword_1(), null); 
                  
            }
            kw=(Token)input.LT(1);
            match(input,54,FollowSets000.FOLLOW_54_in_ruleulonglong_type8072); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4447:1: entryRulecharstr_type returns [EObject current=null] : iv_rulecharstr_type= rulecharstr_type EOF ;
    public final EObject entryRulecharstr_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharstr_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4448:2: (iv_rulecharstr_type= rulecharstr_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4449:2: iv_rulecharstr_type= rulecharstr_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCharstr_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulecharstr_type_in_entryRulecharstr_type8112);
            iv_rulecharstr_type=rulecharstr_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulecharstr_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulecharstr_type8122); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4456:1: rulecharstr_type returns [EObject current=null] : ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) ;
    public final EObject rulecharstr_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;

        Enumerator lv_kind_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4461:6: ( ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4462:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4462:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )
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
                    new NoViableAltException("4462:1: ( ( (lv_kind_0_0= rulechar_type ) ) | ( (lv_kind_1_0= rulewide_char_type ) ) | ( (lv_kind_2_0= rulestring_type ) ) | ( (lv_kind_3_0= rulewide_string_type ) ) )", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4462:2: ( (lv_kind_0_0= rulechar_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4462:2: ( (lv_kind_0_0= rulechar_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4463:1: (lv_kind_0_0= rulechar_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4463:1: (lv_kind_0_0= rulechar_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4464:3: lv_kind_0_0= rulechar_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindChar_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulechar_type_in_rulecharstr_type8168);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4487:6: ( (lv_kind_1_0= rulewide_char_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4487:6: ( (lv_kind_1_0= rulewide_char_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4488:1: (lv_kind_1_0= rulewide_char_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4488:1: (lv_kind_1_0= rulewide_char_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4489:3: lv_kind_1_0= rulewide_char_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_char_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_char_type_in_rulecharstr_type8195);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4512:6: ( (lv_kind_2_0= rulestring_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4512:6: ( (lv_kind_2_0= rulestring_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4513:1: (lv_kind_2_0= rulestring_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4513:1: (lv_kind_2_0= rulestring_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4514:3: lv_kind_2_0= rulestring_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindString_typeEnumRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulestring_type_in_rulecharstr_type8222);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4537:6: ( (lv_kind_3_0= rulewide_string_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4537:6: ( (lv_kind_3_0= rulewide_string_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4538:1: (lv_kind_3_0= rulewide_string_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4538:1: (lv_kind_3_0= rulewide_string_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4539:3: lv_kind_3_0= rulewide_string_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCharstr_typeAccess().getKindWide_string_typeEnumRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulewide_string_type_in_rulecharstr_type8249);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4569:1: entryRuleother_type returns [EObject current=null] : iv_ruleother_type= ruleother_type EOF ;
    public final EObject entryRuleother_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleother_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4570:2: (iv_ruleother_type= ruleother_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4571:2: iv_ruleother_type= ruleother_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOther_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleother_type_in_entryRuleother_type8285);
            iv_ruleother_type=ruleother_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleother_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleother_type8295); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4578:1: ruleother_type returns [EObject current=null] : ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) ;
    public final EObject ruleother_type() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;

        Enumerator lv_kind_1_0 = null;

        Enumerator lv_kind_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4583:6: ( ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4584:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4584:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )
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
                    new NoViableAltException("4584:1: ( ( (lv_kind_0_0= ruleboolean_type ) ) | ( (lv_kind_1_0= ruleoctet_type ) ) | ( (lv_kind_2_0= ruleany_type ) ) )", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4584:2: ( (lv_kind_0_0= ruleboolean_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4584:2: ( (lv_kind_0_0= ruleboolean_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4585:1: (lv_kind_0_0= ruleboolean_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4585:1: (lv_kind_0_0= ruleboolean_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4586:3: lv_kind_0_0= ruleboolean_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOther_typeAccess().getKindBoolean_typeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleboolean_type_in_ruleother_type8341);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4609:6: ( (lv_kind_1_0= ruleoctet_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4609:6: ( (lv_kind_1_0= ruleoctet_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4610:1: (lv_kind_1_0= ruleoctet_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4610:1: (lv_kind_1_0= ruleoctet_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4611:3: lv_kind_1_0= ruleoctet_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOther_typeAccess().getKindOctet_typeEnumRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleoctet_type_in_ruleother_type8368);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4634:6: ( (lv_kind_2_0= ruleany_type ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4634:6: ( (lv_kind_2_0= ruleany_type ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4635:1: (lv_kind_2_0= ruleany_type )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4635:1: (lv_kind_2_0= ruleany_type )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4636:3: lv_kind_2_0= ruleany_type
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOther_typeAccess().getKindAny_typeEnumRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleany_type_in_ruleother_type8395);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4666:1: entryRulefixed_pt_const_type returns [EObject current=null] : iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF ;
    public final EObject entryRulefixed_pt_const_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_pt_const_type = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4667:2: (iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4668:2: iv_rulefixed_pt_const_type= rulefixed_pt_const_type EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFixed_pt_const_typeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulefixed_pt_const_type_in_entryRulefixed_pt_const_type8431);
            iv_rulefixed_pt_const_type=rulefixed_pt_const_type();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefixed_pt_const_type; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulefixed_pt_const_type8441); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4675:1: rulefixed_pt_const_type returns [EObject current=null] : ( () 'fixed' ) ;
    public final EObject rulefixed_pt_const_type() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4680:6: ( ( () 'fixed' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4681:1: ( () 'fixed' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4681:1: ( () 'fixed' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4681:2: () 'fixed'
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4681:2: ()
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4682:2: 
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

            match(input,53,FollowSets000.FOLLOW_53_in_rulefixed_pt_const_type8488); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4707:1: entryRuleconst_exp returns [EObject current=null] : iv_ruleconst_exp= ruleconst_exp EOF ;
    public final EObject entryRuleconst_exp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconst_exp = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4708:2: (iv_ruleconst_exp= ruleconst_exp EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4709:2: iv_ruleconst_exp= ruleconst_exp EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConst_expRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_entryRuleconst_exp8524);
            iv_ruleconst_exp=ruleconst_exp();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconst_exp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconst_exp8534); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4716:1: ruleconst_exp returns [EObject current=null] : this_or_expr_0= ruleor_expr ;
    public final EObject ruleconst_exp() throws RecognitionException {
        EObject current = null;

        EObject this_or_expr_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4721:6: (this_or_expr_0= ruleor_expr )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4723:2: this_or_expr_0= ruleor_expr
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getConst_expAccess().getOr_exprParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleor_expr_in_ruleconst_exp8583);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4742:1: entryRuleor_expr returns [EObject current=null] : iv_ruleor_expr= ruleor_expr EOF ;
    public final EObject entryRuleor_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleor_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4743:2: (iv_ruleor_expr= ruleor_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4744:2: iv_ruleor_expr= ruleor_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOr_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleor_expr_in_entryRuleor_expr8617);
            iv_ruleor_expr=ruleor_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleor_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleor_expr8627); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4751:1: ruleor_expr returns [EObject current=null] : (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* ) ;
    public final EObject ruleor_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_xor_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4756:6: ( (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4757:1: (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4757:1: (this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4758:2: this_xor_expr_0= rulexor_expr ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOr_exprAccess().getXor_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_ruleor_expr8677);
            this_xor_expr_0=rulexor_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_xor_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4769:1: ( () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==58) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4769:2: () ( (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= rulexor_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4769:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4770:2: 
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4788:2: ( (lv_operator_2_0= '|' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4789:1: (lv_operator_2_0= '|' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4789:1: (lv_operator_2_0= '|' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4790:3: lv_operator_2_0= '|'
            	    {
            	    lv_operator_2_0=(Token)input.LT(1);
            	    match(input,58,FollowSets000.FOLLOW_58_in_ruleor_expr8707); if (failed) return current;
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4809:2: ( (lv_right_3_0= rulexor_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4810:1: (lv_right_3_0= rulexor_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4810:1: (lv_right_3_0= rulexor_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4811:3: lv_right_3_0= rulexor_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOr_exprAccess().getRightXor_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_ruleor_expr8741);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4841:1: entryRulexor_expr returns [EObject current=null] : iv_rulexor_expr= rulexor_expr EOF ;
    public final EObject entryRulexor_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulexor_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4842:2: (iv_rulexor_expr= rulexor_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4843:2: iv_rulexor_expr= rulexor_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getXor_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulexor_expr_in_entryRulexor_expr8779);
            iv_rulexor_expr=rulexor_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulexor_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulexor_expr8789); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4850:1: rulexor_expr returns [EObject current=null] : (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* ) ;
    public final EObject rulexor_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_and_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4855:6: ( (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4856:1: (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4856:1: (this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4857:2: this_and_expr_0= ruleand_expr ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getXor_exprAccess().getAnd_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_rulexor_expr8839);
            this_and_expr_0=ruleand_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_and_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4868:1: ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==59) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4868:2: () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleand_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4868:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4869:2: 
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4887:2: ( (lv_operator_2_0= '^' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4888:1: (lv_operator_2_0= '^' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4888:1: (lv_operator_2_0= '^' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4889:3: lv_operator_2_0= '^'
            	    {
            	    lv_operator_2_0=(Token)input.LT(1);
            	    match(input,59,FollowSets000.FOLLOW_59_in_rulexor_expr8869); if (failed) return current;
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4908:2: ( (lv_right_3_0= ruleand_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4909:1: (lv_right_3_0= ruleand_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4909:1: (lv_right_3_0= ruleand_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4910:3: lv_right_3_0= ruleand_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getXor_exprAccess().getRightAnd_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_rulexor_expr8903);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4940:1: entryRuleand_expr returns [EObject current=null] : iv_ruleand_expr= ruleand_expr EOF ;
    public final EObject entryRuleand_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4941:2: (iv_ruleand_expr= ruleand_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4942:2: iv_ruleand_expr= ruleand_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnd_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleand_expr_in_entryRuleand_expr8941);
            iv_ruleand_expr=ruleand_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleand_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleand_expr8951); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4949:1: ruleand_expr returns [EObject current=null] : (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* ) ;
    public final EObject ruleand_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_shift_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4954:6: ( (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4955:1: (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4955:1: (this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4956:2: this_shift_expr_0= ruleshift_expr ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAnd_exprAccess().getShift_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_ruleand_expr9001);
            this_shift_expr_0=ruleshift_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_shift_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4967:1: ( () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==60) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4967:2: () ( (lv_operator_2_0= '&' ) ) ( (lv_right_3_0= ruleshift_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4967:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4968:2: 
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4986:2: ( (lv_operator_2_0= '&' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4987:1: (lv_operator_2_0= '&' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4987:1: (lv_operator_2_0= '&' )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:4988:3: lv_operator_2_0= '&'
            	    {
            	    lv_operator_2_0=(Token)input.LT(1);
            	    match(input,60,FollowSets000.FOLLOW_60_in_ruleand_expr9031); if (failed) return current;
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5007:2: ( (lv_right_3_0= ruleshift_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5008:1: (lv_right_3_0= ruleshift_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5008:1: (lv_right_3_0= ruleshift_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5009:3: lv_right_3_0= ruleshift_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAnd_exprAccess().getRightShift_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_ruleand_expr9065);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5039:1: entryRuleshift_expr returns [EObject current=null] : iv_ruleshift_expr= ruleshift_expr EOF ;
    public final EObject entryRuleshift_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleshift_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5040:2: (iv_ruleshift_expr= ruleshift_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5041:2: iv_ruleshift_expr= ruleshift_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getShift_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleshift_expr_in_entryRuleshift_expr9103);
            iv_ruleshift_expr=ruleshift_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleshift_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleshift_expr9113); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5048:1: ruleshift_expr returns [EObject current=null] : (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* ) ;
    public final EObject ruleshift_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_add_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5053:6: ( (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5054:1: (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5054:1: (this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5055:2: this_add_expr_0= ruleadd_expr ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getShift_exprAccess().getAdd_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_ruleshift_expr9163);
            this_add_expr_0=ruleadd_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_add_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5066:1: ( () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=61 && LA67_0<=62)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5066:2: () ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) ) ( (lv_right_3_0= ruleadd_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5066:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5067:2: 
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5085:2: ( ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5086:1: ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5086:1: ( (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5087:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5087:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )
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
            	            new NoViableAltException("5087:1: (lv_operator_2_1= '>>' | lv_operator_2_2= '<<' )", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5088:3: lv_operator_2_1= '>>'
            	            {
            	            lv_operator_2_1=(Token)input.LT(1);
            	            match(input,61,FollowSets000.FOLLOW_61_in_ruleshift_expr9195); if (failed) return current;
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
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5106:8: lv_operator_2_2= '<<'
            	            {
            	            lv_operator_2_2=(Token)input.LT(1);
            	            match(input,62,FollowSets000.FOLLOW_62_in_ruleshift_expr9224); if (failed) return current;
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5127:2: ( (lv_right_3_0= ruleadd_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5128:1: (lv_right_3_0= ruleadd_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5128:1: (lv_right_3_0= ruleadd_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5129:3: lv_right_3_0= ruleadd_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getShift_exprAccess().getRightAdd_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_ruleshift_expr9261);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5159:1: entryRuleadd_expr returns [EObject current=null] : iv_ruleadd_expr= ruleadd_expr EOF ;
    public final EObject entryRuleadd_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadd_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5160:2: (iv_ruleadd_expr= ruleadd_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5161:2: iv_ruleadd_expr= ruleadd_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdd_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleadd_expr_in_entryRuleadd_expr9299);
            iv_ruleadd_expr=ruleadd_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleadd_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleadd_expr9309); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5168:1: ruleadd_expr returns [EObject current=null] : (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* ) ;
    public final EObject ruleadd_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_mult_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5173:6: ( (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5174:1: (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5174:1: (this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5175:2: this_mult_expr_0= rulemult_expr ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAdd_exprAccess().getMult_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_ruleadd_expr9359);
            this_mult_expr_0=rulemult_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_mult_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5186:1: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=63 && LA69_0<=64)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5186:2: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= rulemult_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5186:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5187:2: 
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5205:2: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5206:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5206:1: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5207:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5207:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
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
            	            new NoViableAltException("5207:1: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5208:3: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)input.LT(1);
            	            match(input,63,FollowSets000.FOLLOW_63_in_ruleadd_expr9391); if (failed) return current;
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
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5226:8: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)input.LT(1);
            	            match(input,64,FollowSets000.FOLLOW_64_in_ruleadd_expr9420); if (failed) return current;
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5247:2: ( (lv_right_3_0= rulemult_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5248:1: (lv_right_3_0= rulemult_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5248:1: (lv_right_3_0= rulemult_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5249:3: lv_right_3_0= rulemult_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdd_exprAccess().getRightMult_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_ruleadd_expr9457);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5279:1: entryRulemult_expr returns [EObject current=null] : iv_rulemult_expr= rulemult_expr EOF ;
    public final EObject entryRulemult_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemult_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5280:2: (iv_rulemult_expr= rulemult_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5281:2: iv_rulemult_expr= rulemult_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMult_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulemult_expr_in_entryRulemult_expr9495);
            iv_rulemult_expr=rulemult_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemult_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulemult_expr9505); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5288:1: rulemult_expr returns [EObject current=null] : (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* ) ;
    public final EObject rulemult_expr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_unary_expr_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5293:6: ( (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5294:1: (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5294:1: (this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )* )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5295:2: this_unary_expr_0= ruleunary_expr ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMult_exprAccess().getUnary_exprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_rulemult_expr9555);
            this_unary_expr_0=ruleunary_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_unary_expr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5306:1: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=65 && LA71_0<=67)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5306:2: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= ruleunary_expr ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5306:2: ()
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5307:2: 
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5325:2: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5326:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5326:1: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5327:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5327:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
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
            	            new NoViableAltException("5327:1: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )", 70, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt70) {
            	        case 1 :
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5328:3: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)input.LT(1);
            	            match(input,65,FollowSets000.FOLLOW_65_in_rulemult_expr9587); if (failed) return current;
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
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5346:8: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)input.LT(1);
            	            match(input,66,FollowSets000.FOLLOW_66_in_rulemult_expr9616); if (failed) return current;
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
            	            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5364:8: lv_operator_2_3= '%'
            	            {
            	            lv_operator_2_3=(Token)input.LT(1);
            	            match(input,67,FollowSets000.FOLLOW_67_in_rulemult_expr9645); if (failed) return current;
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

            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5385:2: ( (lv_right_3_0= ruleunary_expr ) )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5386:1: (lv_right_3_0= ruleunary_expr )
            	    {
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5386:1: (lv_right_3_0= ruleunary_expr )
            	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5387:3: lv_right_3_0= ruleunary_expr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMult_exprAccess().getRightUnary_exprParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_rulemult_expr9682);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5417:1: entryRuleunary_expr returns [EObject current=null] : iv_ruleunary_expr= ruleunary_expr EOF ;
    public final EObject entryRuleunary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5418:2: (iv_ruleunary_expr= ruleunary_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5419:2: iv_ruleunary_expr= ruleunary_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnary_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_expr_in_entryRuleunary_expr9720);
            iv_ruleunary_expr=ruleunary_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunary_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunary_expr9730); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5426:1: ruleunary_expr returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr ) ;
    public final EObject ruleunary_expr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_expression_2_0 = null;

        EObject this_primary_expr_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5431:6: ( ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5432:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5432:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )
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
                    new NoViableAltException("5432:1: ( ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) ) | this_primary_expr_3= ruleprimary_expr )", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5432:2: ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5432:2: ( () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5432:3: () ( (lv_operator_1_0= ruleunary_operator ) ) ( (lv_expression_2_0= ruleprimary_expr ) )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5432:3: ()
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5433:2: 
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5446:2: ( (lv_operator_1_0= ruleunary_operator ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5447:1: (lv_operator_1_0= ruleunary_operator )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5447:1: (lv_operator_1_0= ruleunary_operator )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5448:3: lv_operator_1_0= ruleunary_operator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnary_exprAccess().getOperatorUnary_operatorParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleunary_operator_in_ruleunary_expr9789);
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

                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5470:2: ( (lv_expression_2_0= ruleprimary_expr ) )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5471:1: (lv_expression_2_0= ruleprimary_expr )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5471:1: (lv_expression_2_0= ruleprimary_expr )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5472:3: lv_expression_2_0= ruleprimary_expr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnary_exprAccess().getExpressionPrimary_exprParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_ruleunary_expr9810);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5496:2: this_primary_expr_3= ruleprimary_expr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_ruleunary_expr9842);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5515:1: entryRuleunary_operator returns [String current=null] : iv_ruleunary_operator= ruleunary_operator EOF ;
    public final String entryRuleunary_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleunary_operator = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5516:2: (iv_ruleunary_operator= ruleunary_operator EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5517:2: iv_ruleunary_operator= ruleunary_operator EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnary_operatorRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleunary_operator_in_entryRuleunary_operator9878);
            iv_ruleunary_operator=ruleunary_operator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleunary_operator.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleunary_operator9889); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5524:1: ruleunary_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' | kw= '~' ) ;
    public final AntlrDatatypeRuleToken ruleunary_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5529:6: ( (kw= '-' | kw= '+' | kw= '~' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5530:1: (kw= '-' | kw= '+' | kw= '~' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5530:1: (kw= '-' | kw= '+' | kw= '~' )
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
                    new NoViableAltException("5530:1: (kw= '-' | kw= '+' | kw= '~' )", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5531:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleunary_operator9927); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnary_operatorAccess().getHyphenMinusKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5538:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,63,FollowSets000.FOLLOW_63_in_ruleunary_operator9946); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getUnary_operatorAccess().getPlusSignKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5545:2: kw= '~'
                    {
                    kw=(Token)input.LT(1);
                    match(input,68,FollowSets000.FOLLOW_68_in_ruleunary_operator9965); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5558:1: entryRuleprimary_expr returns [EObject current=null] : iv_ruleprimary_expr= ruleprimary_expr EOF ;
    public final EObject entryRuleprimary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprimary_expr = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5559:2: (iv_ruleprimary_expr= ruleprimary_expr EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5560:2: iv_ruleprimary_expr= ruleprimary_expr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimary_exprRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleprimary_expr_in_entryRuleprimary_expr10005);
            iv_ruleprimary_expr=ruleprimary_expr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleprimary_expr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleprimary_expr10015); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5567:1: ruleprimary_expr returns [EObject current=null] : (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) ) ;
    public final EObject ruleprimary_expr() throws RecognitionException {
        EObject current = null;

        EObject this_constantDefRef_0 = null;

        EObject this_valueExpression_1 = null;

        EObject this_const_exp_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5572:6: ( (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5573:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5573:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) )
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
                    new NoViableAltException("5573:1: (this_constantDefRef_0= ruleconstantDefRef | this_valueExpression_1= rulevalueExpression | ( '(' this_const_exp_3= ruleconst_exp ')' ) )", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5574:2: this_constantDefRef_0= ruleconstantDefRef
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimary_exprAccess().getConstantDefRefParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconstantDefRef_in_ruleprimary_expr10065);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5587:2: this_valueExpression_1= rulevalueExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimary_exprAccess().getValueExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulevalueExpression_in_ruleprimary_expr10095);
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
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5599:6: ( '(' this_const_exp_3= ruleconst_exp ')' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5599:6: ( '(' this_const_exp_3= ruleconst_exp ')' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5599:8: '(' this_const_exp_3= ruleconst_exp ')'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_ruleprimary_expr10111); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimary_exprAccess().getConst_expParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_ruleprimary_expr10136);
                    this_const_exp_3=ruleconst_exp();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_const_exp_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleprimary_expr10145); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5627:1: entryRuleconstantDefRef returns [EObject current=null] : iv_ruleconstantDefRef= ruleconstantDefRef EOF ;
    public final EObject entryRuleconstantDefRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstantDefRef = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5628:2: (iv_ruleconstantDefRef= ruleconstantDefRef EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5629:2: iv_ruleconstantDefRef= ruleconstantDefRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantDefRefRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleconstantDefRef_in_entryRuleconstantDefRef10182);
            iv_ruleconstantDefRef=ruleconstantDefRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconstantDefRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleconstantDefRef10192); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5636:1: ruleconstantDefRef returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleconstantDefRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5641:6: ( ( ( RULE_ID ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5642:1: ( ( RULE_ID ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5642:1: ( ( RULE_ID ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5643:1: ( RULE_ID )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5643:1: ( RULE_ID )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5644:3: RULE_ID
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleconstantDefRef10238); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5667:1: entryRulevalueExpression returns [EObject current=null] : iv_rulevalueExpression= rulevalueExpression EOF ;
    public final EObject entryRulevalueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalueExpression = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5668:2: (iv_rulevalueExpression= rulevalueExpression EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5669:2: iv_rulevalueExpression= rulevalueExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_rulevalueExpression_in_entryRulevalueExpression10273);
            iv_rulevalueExpression=rulevalueExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulevalueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulevalueExpression10283); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5676:1: rulevalueExpression returns [EObject current=null] : ( (lv_value_0_0= ruleliteral ) ) ;
    public final EObject rulevalueExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5681:6: ( ( (lv_value_0_0= ruleliteral ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5682:1: ( (lv_value_0_0= ruleliteral ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5682:1: ( (lv_value_0_0= ruleliteral ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5683:1: (lv_value_0_0= ruleliteral )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5683:1: (lv_value_0_0= ruleliteral )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5684:3: lv_value_0_0= ruleliteral
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getValueExpressionAccess().getValueLiteralParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleliteral_in_rulevalueExpression10328);
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5714:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5715:2: (iv_ruleliteral= ruleliteral EOF )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5716:2: iv_ruleliteral= ruleliteral EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLiteralRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleliteral_in_entryRuleliteral10364);
            iv_ruleliteral=ruleliteral();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleliteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleliteral10375); if (failed) return current;

            }

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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5723:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL ) ;
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
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5728:6: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5729:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5729:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )
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
                    new NoViableAltException("5729:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_HEX_LITERAL_2= RULE_HEX_LITERAL | this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL | this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL | this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL | this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL )", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5729:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleliteral10415); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5737:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleliteral10441); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5745:10: this_HEX_LITERAL_2= RULE_HEX_LITERAL
                    {
                    this_HEX_LITERAL_2=(Token)input.LT(1);
                    match(input,RULE_HEX_LITERAL,FollowSets000.FOLLOW_RULE_HEX_LITERAL_in_ruleliteral10467); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_HEX_LITERAL_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getHEX_LITERALTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5753:10: this_WIDE_STRING_LITERAL_3= RULE_WIDE_STRING_LITERAL
                    {
                    this_WIDE_STRING_LITERAL_3=(Token)input.LT(1);
                    match(input,RULE_WIDE_STRING_LITERAL,FollowSets000.FOLLOW_RULE_WIDE_STRING_LITERAL_in_ruleliteral10493); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_WIDE_STRING_LITERAL_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getWIDE_STRING_LITERALTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5761:10: this_FIXED_PT_LITERAL_4= RULE_FIXED_PT_LITERAL
                    {
                    this_FIXED_PT_LITERAL_4=(Token)input.LT(1);
                    match(input,RULE_FIXED_PT_LITERAL,FollowSets000.FOLLOW_RULE_FIXED_PT_LITERAL_in_ruleliteral10519); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_FIXED_PT_LITERAL_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getFIXED_PT_LITERALTerminalRuleCall_4(), null); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5769:10: this_FLOATING_PT_LITERAL_5= RULE_FLOATING_PT_LITERAL
                    {
                    this_FLOATING_PT_LITERAL_5=(Token)input.LT(1);
                    match(input,RULE_FLOATING_PT_LITERAL,FollowSets000.FOLLOW_RULE_FLOATING_PT_LITERAL_in_ruleliteral10545); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_FLOATING_PT_LITERAL_5);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getLiteralAccess().getFLOATING_PT_LITERALTerminalRuleCall_5(), null); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5777:10: this_BOOLEAN_LITERAL_6= RULE_BOOLEAN_LITERAL
                    {
                    this_BOOLEAN_LITERAL_6=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN_LITERAL,FollowSets000.FOLLOW_RULE_BOOLEAN_LITERAL_in_ruleliteral10571); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5792:1: ruleparam_attribute returns [Enumerator current=null] : ( ( 'in' ) | ( 'out' ) | ( 'inout' ) ) ;
    public final Enumerator ruleparam_attribute() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5796:6: ( ( ( 'in' ) | ( 'out' ) | ( 'inout' ) ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5797:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5797:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )
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
                    new NoViableAltException("5797:1: ( ( 'in' ) | ( 'out' ) | ( 'inout' ) )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5797:2: ( 'in' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5797:2: ( 'in' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5797:4: 'in'
                    {
                    match(input,69,FollowSets000.FOLLOW_69_in_ruleparam_attribute10628); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParam_attributeAccess().getPARAM_INEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5803:6: ( 'out' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5803:6: ( 'out' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5803:8: 'out'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleparam_attribute10643); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getParam_attributeAccess().getPARAM_OUTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5809:6: ( 'inout' )
                    {
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5809:6: ( 'inout' )
                    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5809:8: 'inout'
                    {
                    match(input,71,FollowSets000.FOLLOW_71_in_ruleparam_attribute10658); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5819:1: rulefloat_type returns [Enumerator current=null] : ( 'float' ) ;
    public final Enumerator rulefloat_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5823:6: ( ( 'float' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5824:1: ( 'float' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5824:1: ( 'float' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5824:3: 'float'
            {
            match(input,72,FollowSets000.FOLLOW_72_in_rulefloat_type10700); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5834:1: ruledouble_type returns [Enumerator current=null] : ( 'double' ) ;
    public final Enumerator ruledouble_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5838:6: ( ( 'double' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5839:1: ( 'double' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5839:1: ( 'double' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5839:3: 'double'
            {
            match(input,55,FollowSets000.FOLLOW_55_in_ruledouble_type10741); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5849:1: ruleshort_type returns [Enumerator current=null] : ( 'short' ) ;
    public final Enumerator ruleshort_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5853:6: ( ( 'short' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5854:1: ( 'short' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5854:1: ( 'short' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5854:3: 'short'
            {
            match(input,57,FollowSets000.FOLLOW_57_in_ruleshort_type10782); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5864:1: rulelong_type returns [Enumerator current=null] : ( 'long' ) ;
    public final Enumerator rulelong_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5868:6: ( ( 'long' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5869:1: ( 'long' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5869:1: ( 'long' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5869:3: 'long'
            {
            match(input,54,FollowSets000.FOLLOW_54_in_rulelong_type10823); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5879:1: rulechar_type returns [Enumerator current=null] : ( 'char' ) ;
    public final Enumerator rulechar_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5883:6: ( ( 'char' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5884:1: ( 'char' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5884:1: ( 'char' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5884:3: 'char'
            {
            match(input,73,FollowSets000.FOLLOW_73_in_rulechar_type10864); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5894:1: rulewide_char_type returns [Enumerator current=null] : ( 'wchar' ) ;
    public final Enumerator rulewide_char_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5898:6: ( ( 'wchar' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5899:1: ( 'wchar' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5899:1: ( 'wchar' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5899:3: 'wchar'
            {
            match(input,74,FollowSets000.FOLLOW_74_in_rulewide_char_type10905); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5909:1: rulestring_type returns [Enumerator current=null] : ( 'string' ) ;
    public final Enumerator rulestring_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5913:6: ( ( 'string' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5914:1: ( 'string' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5914:1: ( 'string' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5914:3: 'string'
            {
            match(input,51,FollowSets000.FOLLOW_51_in_rulestring_type10946); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5924:1: rulewide_string_type returns [Enumerator current=null] : ( 'wstring' ) ;
    public final Enumerator rulewide_string_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5928:6: ( ( 'wstring' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5929:1: ( 'wstring' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5929:1: ( 'wstring' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5929:3: 'wstring'
            {
            match(input,52,FollowSets000.FOLLOW_52_in_rulewide_string_type10987); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5939:1: ruleboolean_type returns [Enumerator current=null] : ( 'boolean' ) ;
    public final Enumerator ruleboolean_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5943:6: ( ( 'boolean' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5944:1: ( 'boolean' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5944:1: ( 'boolean' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5944:3: 'boolean'
            {
            match(input,75,FollowSets000.FOLLOW_75_in_ruleboolean_type11028); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5954:1: ruleoctet_type returns [Enumerator current=null] : ( 'octet' ) ;
    public final Enumerator ruleoctet_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5958:6: ( ( 'octet' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5959:1: ( 'octet' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5959:1: ( 'octet' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5959:3: 'octet'
            {
            match(input,76,FollowSets000.FOLLOW_76_in_ruleoctet_type11069); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5969:1: ruleany_type returns [Enumerator current=null] : ( 'any' ) ;
    public final Enumerator ruleany_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5973:6: ( ( 'any' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5974:1: ( 'any' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5974:1: ( 'any' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5974:3: 'any'
            {
            match(input,77,FollowSets000.FOLLOW_77_in_ruleany_type11110); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5984:1: ruleobject_type returns [Enumerator current=null] : ( 'Object' ) ;
    public final Enumerator ruleobject_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5988:6: ( ( 'Object' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5989:1: ( 'Object' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5989:1: ( 'Object' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5989:3: 'Object'
            {
            match(input,78,FollowSets000.FOLLOW_78_in_ruleobject_type11151); if (failed) return current;
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
    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:5999:1: rulevoid_type returns [Enumerator current=null] : ( 'void' ) ;
    public final Enumerator rulevoid_type() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6003:6: ( ( 'void' ) )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6004:1: ( 'void' )
            {
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6004:1: ( 'void' )
            // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:6004:3: 'void'
            {
            match(input,79,FollowSets000.FOLLOW_79_in_rulevoid_type11192); if (failed) return current;
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

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:2: ( ( 'typedef' ( ( rulearray_type_spec ) ) ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:2: ( 'typedef' ( ( rulearray_type_spec ) ) )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:2: ( 'typedef' ( ( rulearray_type_spec ) ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2045:4: 'typedef' ( ( rulearray_type_spec ) )
        {
        match(input,37,FollowSets000.FOLLOW_37_in_synpred493671); if (failed) return ;
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2049:1: ( ( rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2050:1: ( rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2050:1: ( rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2051:3: rulearray_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAlias_typeAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred493692);
        rulearray_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:2: ( ( ( ( rulearray_type_spec ) ) ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:2: ( ( ( rulearray_type_spec ) ) ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:2: ( ( ( rulearray_type_spec ) ) ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:3: ( ( rulearray_type_spec ) ) ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2555:3: ( ( rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2556:1: ( rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2556:1: ( rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2557:3: rulearray_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeArray_type_specParserRuleCall_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred594644);
        rulearray_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,17,FollowSets000.FOLLOW_17_in_synpred594654); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred60
    public final void synpred60_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:6: ( ( ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:6: ( ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:6: ( ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:7: ( ( rulesimple_type_spec ) ) ( ( RULE_ID ) ) ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2584:7: ( ( rulesimple_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2585:1: ( rulesimple_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2585:1: ( rulesimple_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2586:3: rulesimple_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMemberAccess().getContainedTypeSimple_type_specParserRuleCall_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulesimple_type_spec_in_synpred604683);
        rulesimple_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2608:2: ( ( RULE_ID ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2609:1: ( RULE_ID )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2609:1: ( RULE_ID )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:2610:3: RULE_ID
        {
        match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred604700); if (failed) return ;

        }


        }

        match(input,17,FollowSets000.FOLLOW_17_in_synpred604715); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred60

    // $ANTLR start synpred69
    public final void synpred69_fragment() throws RecognitionException {   
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:2: ( ( ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';' ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:2: ( ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';' )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:2: ( ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';' )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:3: ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+ ( ( rulearray_type_spec ) ) ';'
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:3: ( ( 'case' ( ( ruleconst_exp ) ) ':' ) | ( 'default' ':' ) )+
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
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:4: ( 'case' ( ( ruleconst_exp ) ) ':' )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:4: ( 'case' ( ( ruleconst_exp ) ) ':' )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3021:6: 'case' ( ( ruleconst_exp ) ) ':'
        	    {
        	    match(input,43,FollowSets000.FOLLOW_43_in_synpred695356); if (failed) return ;
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3025:1: ( ( ruleconst_exp ) )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3026:1: ( ruleconst_exp )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3026:1: ( ruleconst_exp )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3027:3: ruleconst_exp
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getLabelConst_expParserRuleCall_0_0_0_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleconst_exp_in_synpred695377);
        	    ruleconst_exp();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }

        	    match(input,24,FollowSets000.FOLLOW_24_in_synpred695387); if (failed) return ;

        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3054:6: ( 'default' ':' )
        	    {
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3054:6: ( 'default' ':' )
        	    // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3054:8: 'default' ':'
        	    {
        	    match(input,44,FollowSets000.FOLLOW_44_in_synpred695405); if (failed) return ;
        	    match(input,24,FollowSets000.FOLLOW_24_in_synpred695415); if (failed) return ;

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

        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3062:4: ( ( rulearray_type_spec ) )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3063:1: ( rulearray_type_spec )
        {
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3063:1: ( rulearray_type_spec )
        // ../org.csu.idl.xtext/src-gen/org/csu/idl/xtext/parser/antlr/internal/InternalIDL.g:3064:3: rulearray_type_spec
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCase_stmtAccess().getContainedTypeArray_type_specParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_rulearray_type_spec_in_synpred695439);
        rulearray_type_spec();
        _fsp--;
        if (failed) return ;

        }


        }

        match(input,17,FollowSets000.FOLLOW_17_in_synpred695449); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred69

    public final boolean synpred69() {
        backtracking++;
        int start = input.mark();
        try {
            synpred69_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred59() {
        backtracking++;
        int start = input.mark();
        try {
            synpred59_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred60() {
        backtracking++;
        int start = input.mark();
        try {
            synpred60_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_19_in_rulemodule705 = new BitSet(new long[]{0x0000633800E40000L});
        public static final BitSet FOLLOW_ruledefinition_in_rulemodule726 = new BitSet(new long[]{0x0000633800F40000L});
        public static final BitSet FOLLOW_20_in_rulemodule737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_decl_in_entryRuleinterface_decl773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinterface_decl783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleinterface_decl827 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleinterface_decl864 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleinterface_decl889 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl906 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_24_in_ruleinterface_decl922 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl944 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_25_in_ruleinterface_decl955 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_decl977 = new BitSet(new long[]{0x0000000002080000L});
        public static final BitSet FOLLOW_19_in_ruleinterface_decl991 = new BitSet(new long[]{0x03D8633984100020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_ruleexport_in_ruleinterface_decl1012 = new BitSet(new long[]{0x03D8633984100020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_20_in_ruleinterface_decl1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinterface_fwd_in_entryRuleinterface_fwd1059 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinterface_fwd1069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleinterface_fwd1105 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleinterface_fwd1121 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleinterface_fwd1133 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleinterface_fwd1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexport_in_entryRuleexport1191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleexport1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_ruleexport1252 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_ruleexport1294 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_ruleexport1336 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_decl_in_ruleexport1378 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_decl_in_ruleexport1420 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleexport1429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_decl_in_entryRuleop_decl1466 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleop_decl1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleop_decl1519 = new BitSet(new long[]{0x03D8000000000020L,0x000000000000FF00L});
        public static final BitSet FOLLOW_ruleop_type_spec_in_ruleop_decl1555 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1583 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1601 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1616 = new BitSet(new long[]{0x0000000010000000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleparam_decl_in_ruleop_decl1638 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1649 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_ruleparam_decl_in_ruleop_decl1670 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1684 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_29_in_ruleop_decl1695 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1705 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1727 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1738 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleop_decl1760 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1772 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleop_decl1785 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleop_decl1795 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleop_decl1812 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleop_decl1828 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleop_decl1845 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleop_decl1862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleop_type_spec_in_entryRuleop_type_spec1900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleop_type_spec1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleop_type_spec1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevoid_type_in_ruleop_type_spec1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleparam_decl_in_entryRuleparam_decl2036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleparam_decl2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleparam_attribute_in_ruleparam_decl2092 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleparam_decl2114 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleparam_decl2142 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleparam_decl2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_decl_in_entryRuleattr_decl2201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleattr_decl2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereadonly_attr_spec_in_ruleattr_decl2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_spec_in_ruleattr_decl2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulereadonly_attr_spec_in_entryRulereadonly_attr_spec2326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulereadonly_attr_spec2336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulereadonly_attr_spec2380 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulereadonly_attr_spec2403 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2425 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2453 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2471 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_rulereadonly_attr_spec2486 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_rulereadonly_attr_spec2496 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2518 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_rulereadonly_attr_spec2529 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2551 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_rulereadonly_attr_spec2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulereadonly_attr_spec2589 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulereadonly_attr_spec2612 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulereadonly_attr_spec2634 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2662 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulereadonly_attr_spec2680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleattr_spec_in_entryRuleattr_spec2722 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleattr_spec2732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleattr_spec2768 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleattr_spec2790 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2818 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2836 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleattr_spec2853 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec2863 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2885 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec2896 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2918 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec2930 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleattr_spec2941 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec2951 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec2973 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec2984 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3006 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec3018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleattr_spec3038 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleattr_spec3048 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3070 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_25_in_ruleattr_spec3081 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3103 = new BitSet(new long[]{0x0000000012000000L});
        public static final BitSet FOLLOW_28_in_ruleattr_spec3115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleattr_spec3135 = new BitSet(new long[]{0x03D8000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_ruleattr_spec3157 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3185 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleattr_spec3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleexcept_decl_in_entryRuleexcept_decl3245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleexcept_decl3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleexcept_decl3290 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleexcept_decl3307 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleexcept_decl3322 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulemember_in_ruleexcept_decl3343 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_20_in_ruleexcept_decl3354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletype_decl_in_entryRuletype_decl3390 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletype_decl3400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulealias_type_in_ruletype_decl3450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_ruletype_decl3480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunion_type_in_ruletype_decl3510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_ruletype_decl3540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruletype_decl3556 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruletype_decl3565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstr_forward_decl_in_ruletype_decl3590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulealias_type_in_entryRulealias_type3625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulealias_type3635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulealias_type3671 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulealias_type3692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulealias_type3710 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulealias_type3732 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulealias_type3760 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulealias_type3778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_entryRulearray_type_spec3820 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulearray_type_spec3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulearray_type_spec3877 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulearray_type_spec3905 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulearray_type_spec3923 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_rulearray_type_spec3939 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulearray_type_spec3960 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulearray_type_spec3970 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_entryRulesimple_type_spec4008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesimple_type_spec4018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_rulesimple_type_spec4068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletemplate_type_spec_in_rulesimple_type_spec4098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulebase_type_spec_in_entryRulebase_type_spec4133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulebase_type_spec4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_rulebase_type_spec4193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleobject_type_in_rulebase_type_spec4219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletemplate_type_spec_in_entryRuletemplate_type_spec4255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletemplate_type_spec4265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesequence_type_in_ruletemplate_type_spec4315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_ruletemplate_type_spec4345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_ruletemplate_type_spec4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_type_in_ruletemplate_type_spec4405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_entryRulestruct_type4442 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulestruct_type4452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rulestruct_type4487 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulestruct_type4504 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulestruct_type4519 = new BitSet(new long[]{0x03F9010000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulemember_in_rulestruct_type4540 = new BitSet(new long[]{0x03F9010000100020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_20_in_rulestruct_type4551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemember_in_entryRulemember4587 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemember4597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulemember4644 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulemember4683 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4700 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestruct_type_in_rulemember4744 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4761 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4806 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulemember4823 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulemember4838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunion_type_in_entryRuleunion_type4875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunion_type4885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleunion_type4920 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleunion_type4937 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleunion_type4952 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleunion_type4962 = new BitSet(new long[]{0x0340200000000020L,0x0000000000000A00L});
        public static final BitSet FOLLOW_ruleswitch_type_spec_cont_in_ruleunion_type4984 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleunion_type5012 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleunion_type5023 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleunion_type5033 = new BitSet(new long[]{0x0000180000000000L});
        public static final BitSet FOLLOW_rulecase_stmt_in_ruleunion_type5054 = new BitSet(new long[]{0x0000180000100000L});
        public static final BitSet FOLLOW_20_in_ruleunion_type5065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleswitch_type_spec_cont_in_entryRuleswitch_type_spec_cont5101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleswitch_type_spec_cont5111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_ruleswitch_type_spec_cont5161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulechar_type_in_ruleswitch_type_spec_cont5200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolean_type_in_ruleswitch_type_spec_cont5241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_ruleswitch_type_spec_cont5273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecase_stmt_in_entryRulecase_stmt5308 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecase_stmt5318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulecase_stmt5356 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulecase_stmt5377 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5387 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_rulecase_stmt5405 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5415 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_rulecase_stmt5439 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulecase_stmt5449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulecase_stmt5469 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulecase_stmt5490 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5500 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_rulecase_stmt5518 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulecase_stmt5528 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulecase_stmt5553 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulecase_stmt5581 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_rulecase_stmt5599 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulecase_stmt5614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_type_in_entryRuleenum_type5651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleenum_type5661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleenum_type5696 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleenum_type5713 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleenum_type5728 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleenum_member_in_ruleenum_type5749 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_25_in_ruleenum_type5760 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleenum_member_in_ruleenum_type5781 = new BitSet(new long[]{0x0000000002100000L});
        public static final BitSet FOLLOW_20_in_ruleenum_type5793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleenum_member_in_entryRuleenum_member5829 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleenum_member5839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleenum_member5880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstr_forward_decl_in_entryRuleconstr_forward_decl5921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconstr_forward_decl5932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleconstr_forward_decl5971 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstr_forward_decl5986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleconstr_forward_decl6012 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstr_forward_decl6027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_decl_in_entryRuleconst_decl6073 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_decl6083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleconst_decl6118 = new BitSet(new long[]{0x03F8000000000020L,0x0000000000003F00L});
        public static final BitSet FOLLOW_ruleconst_type_in_ruleconst_decl6140 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconst_decl6168 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconst_decl6186 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleconst_decl6201 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_ruleconst_decl6222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_type_in_entryRuleconst_type6258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_type6268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_ruleconst_type6318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_ruleconst_type6348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_ruleconst_type6378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_const_type_in_ruleconst_type6408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimitive_def_in_entryRuleprimitive_def6443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleprimitive_def6453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_ruleprimitive_def6503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloating_pt_type_in_ruleprimitive_def6533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecharstr_type_in_ruleprimitive_def6563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleother_type_in_ruleprimitive_def6593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesequence_type_in_entryRulesequence_type6628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesequence_type6638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulesequence_type6673 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulesequence_type6683 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_rulesequence_type6705 = new BitSet(new long[]{0x0004000002000000L});
        public static final BitSet FOLLOW_RULE_ID_in_rulesequence_type6733 = new BitSet(new long[]{0x0004000002000000L});
        public static final BitSet FOLLOW_25_in_rulesequence_type6745 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulesequence_type6766 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulesequence_type6778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestringdef_type_in_entryRulestringdef_type6814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulestringdef_type6824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulestringdef_type6859 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulestringdef_type6869 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulestringdef_type6890 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulestringdef_type6900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_stringdef_type_in_entryRulewide_stringdef_type6936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulewide_stringdef_type6946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulewide_stringdef_type6981 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulewide_stringdef_type6991 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulewide_stringdef_type7012 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulewide_stringdef_type7022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_type_in_entryRulefixed_pt_type7058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefixed_pt_type7068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulefixed_pt_type7103 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_rulefixed_pt_type7113 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulefixed_pt_type7134 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulefixed_pt_type7144 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_rulefixed_pt_type7165 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_rulefixed_pt_type7175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloating_pt_type_in_entryRulefloating_pt_type7211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefloating_pt_type7221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefloat_type_in_rulefloating_pt_type7267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruledouble_type_in_rulefloating_pt_type7294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelongdouble_type_in_rulefloating_pt_type7321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelongdouble_type_in_entryRulelongdouble_type7358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulelongdouble_type7369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelongdouble_type7407 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_rulelongdouble_type7420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleinteger_type_in_entryRuleinteger_type7460 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleinteger_type7470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleshort_type_in_ruleinteger_type7516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelong_type_in_ruleinteger_type7543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelonglong_type_in_ruleinteger_type7570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleushort_type_in_ruleinteger_type7597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulong_type_in_ruleinteger_type7624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulonglong_type_in_ruleinteger_type7651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulelonglong_type_in_entryRulelonglong_type7688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulelonglong_type7699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelonglong_type7737 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_rulelonglong_type7750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleushort_type_in_entryRuleushort_type7791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleushort_type7802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleushort_type7840 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleushort_type7853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulong_type_in_entryRuleulong_type7894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleulong_type7905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleulong_type7943 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulong_type7956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleulonglong_type_in_entryRuleulonglong_type7997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleulonglong_type8008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleulonglong_type8046 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulonglong_type8059 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleulonglong_type8072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulecharstr_type_in_entryRulecharstr_type8112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulecharstr_type8122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulechar_type_in_rulecharstr_type8168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_char_type_in_rulecharstr_type8195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulestring_type_in_rulecharstr_type8222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulewide_string_type_in_rulecharstr_type8249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleother_type_in_entryRuleother_type8285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleother_type8295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleboolean_type_in_ruleother_type8341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleoctet_type_in_ruleother_type8368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleany_type_in_ruleother_type8395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulefixed_pt_const_type_in_entryRulefixed_pt_const_type8431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulefixed_pt_const_type8441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rulefixed_pt_const_type8488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconst_exp_in_entryRuleconst_exp8524 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconst_exp8534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleor_expr_in_ruleconst_exp8583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleor_expr_in_entryRuleor_expr8617 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleor_expr8627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulexor_expr_in_ruleor_expr8677 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleor_expr8707 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_rulexor_expr_in_ruleor_expr8741 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_rulexor_expr_in_entryRulexor_expr8779 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulexor_expr8789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleand_expr_in_rulexor_expr8839 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_rulexor_expr8869 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleand_expr_in_rulexor_expr8903 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_ruleand_expr_in_entryRuleand_expr8941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleand_expr8951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleshift_expr_in_ruleand_expr9001 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleand_expr9031 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleshift_expr_in_ruleand_expr9065 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleshift_expr_in_entryRuleshift_expr9103 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleshift_expr9113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleadd_expr_in_ruleshift_expr9163 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleshift_expr9195 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_62_in_ruleshift_expr9224 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleadd_expr_in_ruleshift_expr9261 = new BitSet(new long[]{0x6000000000000002L});
        public static final BitSet FOLLOW_ruleadd_expr_in_entryRuleadd_expr9299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleadd_expr9309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulemult_expr_in_ruleadd_expr9359 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_63_in_ruleadd_expr9391 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_64_in_ruleadd_expr9420 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_rulemult_expr_in_ruleadd_expr9457 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_rulemult_expr_in_entryRulemult_expr9495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulemult_expr9505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_expr_in_rulemult_expr9555 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
        public static final BitSet FOLLOW_65_in_rulemult_expr9587 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_66_in_rulemult_expr9616 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_67_in_rulemult_expr9645 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleunary_expr_in_rulemult_expr9682 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000EL});
        public static final BitSet FOLLOW_ruleunary_expr_in_entryRuleunary_expr9720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunary_expr9730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_operator_in_ruleunary_expr9789 = new BitSet(new long[]{0x0000000008000FF0L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_ruleunary_expr9810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_ruleunary_expr9842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleunary_operator_in_entryRuleunary_operator9878 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleunary_operator9889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleunary_operator9927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleunary_operator9946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleunary_operator9965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleprimary_expr_in_entryRuleprimary_expr10005 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleprimary_expr10015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstantDefRef_in_ruleprimary_expr10065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalueExpression_in_ruleprimary_expr10095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleprimary_expr10111 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_ruleprimary_expr10136 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleprimary_expr10145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleconstantDefRef_in_entryRuleconstantDefRef10182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleconstantDefRef10192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleconstantDefRef10238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulevalueExpression_in_entryRulevalueExpression10273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulevalueExpression10283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleliteral_in_rulevalueExpression10328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral10364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleliteral10375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleliteral10415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral10441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HEX_LITERAL_in_ruleliteral10467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WIDE_STRING_LITERAL_in_ruleliteral10493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FIXED_PT_LITERAL_in_ruleliteral10519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOATING_PT_LITERAL_in_ruleliteral10545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_LITERAL_in_ruleliteral10571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleparam_attribute10628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleparam_attribute10643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleparam_attribute10658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_rulefloat_type10700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruledouble_type10741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleshort_type10782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rulelong_type10823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_rulechar_type10864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulewide_char_type10905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulestring_type10946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rulewide_string_type10987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleboolean_type11028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleoctet_type11069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleany_type11110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleobject_type11151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_rulevoid_type11192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_synpred493671 = new BitSet(new long[]{0x03F9000000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred493692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred594644 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred594654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesimple_type_spec_in_synpred604683 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred604700 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred604715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_synpred695356 = new BitSet(new long[]{0x8000000008000FF0L,0x0000000000000011L});
        public static final BitSet FOLLOW_ruleconst_exp_in_synpred695377 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred695387 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_44_in_synpred695405 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_synpred695415 = new BitSet(new long[]{0x03F9180000000020L,0x0000000000007F00L});
        public static final BitSet FOLLOW_rulearray_type_spec_in_synpred695439 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred695449 = new BitSet(new long[]{0x0000000000000002L});
    }


}