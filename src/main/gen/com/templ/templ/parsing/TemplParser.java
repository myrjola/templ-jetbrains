// This is a generated file. Not intended for manual editing.
package com.templ.templ.parsing;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.templ.templ.psi.TemplTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class TemplParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // INLINE_COMPONENT_START GO_INLINE_COMPONENT component_children?
  public static boolean component(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component")) return false;
    if (!nextTokenIs(b, INLINE_COMPONENT_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT, null);
    r = consumeTokens(b, 1, INLINE_COMPONENT_START, GO_INLINE_COMPONENT);
    p = r; // pin = 1
    r = r && component_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // component_children?
  private static boolean component_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_2")) return false;
    component_children(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LBRACE html_decl_body RBRACE
  public static boolean component_children(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_children")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_CHILDREN, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, html_decl_body(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // CSS_DECL_START CSS_CLASS_ID LPARENTH RPARENTH LBRACE CSS_PROPERTIES RBRACE
  public static boolean css_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "css_decl")) return false;
    if (!nextTokenIs(b, CSS_DECL_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CSS_DECL, null);
    r = consumeTokens(b, 1, CSS_DECL_START, CSS_CLASS_ID, LPARENTH, RPARENTH, LBRACE, CSS_PROPERTIES, RBRACE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GO_ELSE_START_FRAGMENT html_decl_body
  public static boolean else_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_$")) return false;
    if (!nextTokenIs(b, GO_ELSE_START_FRAGMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE, null);
    r = consumeToken(b, GO_ELSE_START_FRAGMENT);
    p = r; // pin = 1
    r = r && html_decl_body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GO_ELSE_IF_START_FRAGMENT html_decl_body
  public static boolean else_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_if")) return false;
    if (!nextTokenIs(b, GO_ELSE_IF_START_FRAGMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ELSE_IF, null);
    r = consumeToken(b, GO_ELSE_IF_START_FRAGMENT);
    p = r; // pin = 1
    r = r && html_decl_body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BOOL_EXPR_START? LBRACE GO_EXPR RBRACE
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    if (!nextTokenIs(b, "<expr>", BOOL_EXPR_START, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = expr_0(b, l + 1);
    r = r && consumeTokens(b, 1, LBRACE, GO_EXPR, RBRACE);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // BOOL_EXPR_START?
  private static boolean expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    consumeToken(b, BOOL_EXPR_START);
    return true;
  }

  /* ********************************************************** */
  // GO_FOR_START_FRAGMENT html_decl_body RBRACE
  public static boolean for_loop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_loop")) return false;
    if (!nextTokenIs(b, GO_FOR_START_FRAGMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_LOOP, null);
    r = consumeToken(b, GO_FOR_START_FRAGMENT);
    p = r; // pin = 1
    r = r && report_error_(b, html_decl_body(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GO_ROOT_FRAGMENT
  public static boolean go_root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "go_root")) return false;
    if (!nextTokenIs(b, GO_ROOT_FRAGMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GO_ROOT_FRAGMENT);
    exit_section_(b, m, GO_ROOT, r);
    return r;
  }

  /* ********************************************************** */
  // HTML_DECL_START DECL_GO_TOKEN html_decl_body RBRACE
  public static boolean html_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_decl")) return false;
    if (!nextTokenIs(b, HTML_DECL_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HTML_DECL, null);
    r = consumeTokens(b, 1, HTML_DECL_START, DECL_GO_TOKEN);
    p = r; // pin = 1
    r = r && report_error_(b, html_decl_body(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // (HTML_FRAGMENT | expr | if_cond | switch_stmt | for_loop | component)*
  public static boolean html_decl_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_decl_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, HTML_DECL_BODY, "<html decl body>");
    while (true) {
      int c = current_position_(b);
      if (!html_decl_body_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "html_decl_body", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // HTML_FRAGMENT | expr | if_cond | switch_stmt | for_loop | component
  private static boolean html_decl_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "html_decl_body_0")) return false;
    boolean r;
    r = consumeToken(b, HTML_FRAGMENT);
    if (!r) r = expr(b, l + 1);
    if (!r) r = if_cond(b, l + 1);
    if (!r) r = switch_stmt(b, l + 1);
    if (!r) r = for_loop(b, l + 1);
    if (!r) r = component(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // GO_IF_START_FRAGMENT html_decl_body else_if* else? RBRACE
  public static boolean if_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_cond")) return false;
    if (!nextTokenIs(b, GO_IF_START_FRAGMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_COND, null);
    r = consumeToken(b, GO_IF_START_FRAGMENT);
    p = r; // pin = 1
    r = r && report_error_(b, html_decl_body(b, l + 1));
    r = p && report_error_(b, if_cond_2(b, l + 1)) && r;
    r = p && report_error_(b, if_cond_3(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // else_if*
  private static boolean if_cond_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_cond_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!else_if(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_cond_2", c)) break;
    }
    return true;
  }

  // else?
  private static boolean if_cond_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_cond_3")) return false;
    else_$(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // !(HTML_DECL_START | CSS_DECL_START | SCRIPT_DECL_START | GO_ROOT_FRAGMENT)
  static boolean recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // HTML_DECL_START | CSS_DECL_START | SCRIPT_DECL_START | GO_ROOT_FRAGMENT
  private static boolean recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_0")) return false;
    boolean r;
    r = consumeToken(b, HTML_DECL_START);
    if (!r) r = consumeToken(b, CSS_DECL_START);
    if (!r) r = consumeToken(b, SCRIPT_DECL_START);
    if (!r) r = consumeToken(b, GO_ROOT_FRAGMENT);
    return r;
  }

  /* ********************************************************** */
  // go_root (root_item)*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    if (!nextTokenIs(b, GO_ROOT_FRAGMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = go_root(b, l + 1);
    r = r && root_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (root_item)*
  private static boolean root_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!root_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root_1", c)) break;
    }
    return true;
  }

  // (root_item)
  private static boolean root_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = root_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // go_root | html_decl | css_decl | script_decl
  static boolean root_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_);
    r = go_root(b, l + 1);
    if (!r) r = html_decl(b, l + 1);
    if (!r) r = css_decl(b, l + 1);
    if (!r) r = script_decl(b, l + 1);
    exit_section_(b, l, m, r, false, TemplParser::recover);
    return r;
  }

  /* ********************************************************** */
  // SCRIPT_DECL_START SCRIPT_FUNCTION_DECL SCRIPT_BODY RBRACE
  public static boolean script_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script_decl")) return false;
    if (!nextTokenIs(b, SCRIPT_DECL_START)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SCRIPT_DECL, null);
    r = consumeTokens(b, 1, SCRIPT_DECL_START, SCRIPT_FUNCTION_DECL, SCRIPT_BODY, RBRACE);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GO_CASE_FRAGMENT html_decl_body
  public static boolean switch_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_case")) return false;
    if (!nextTokenIs(b, GO_CASE_FRAGMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_CASE, null);
    r = consumeToken(b, GO_CASE_FRAGMENT);
    p = r; // pin = 1
    r = r && html_decl_body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GO_DEFAULT_FRAGMENT html_decl_body
  public static boolean switch_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_default")) return false;
    if (!nextTokenIs(b, GO_DEFAULT_FRAGMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_DEFAULT, null);
    r = consumeToken(b, GO_DEFAULT_FRAGMENT);
    p = r; // pin = 1
    r = r && html_decl_body(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // GO_SWITCH_START_FRAGMENT switch_case* switch_default? RBRACE
  public static boolean switch_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_stmt")) return false;
    if (!nextTokenIs(b, GO_SWITCH_START_FRAGMENT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SWITCH_STMT, null);
    r = consumeToken(b, GO_SWITCH_START_FRAGMENT);
    p = r; // pin = 1
    r = r && report_error_(b, switch_stmt_1(b, l + 1));
    r = p && report_error_(b, switch_stmt_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // switch_case*
  private static boolean switch_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_stmt_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!switch_case(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_stmt_1", c)) break;
    }
    return true;
  }

  // switch_default?
  private static boolean switch_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_stmt_2")) return false;
    switch_default(b, l + 1);
    return true;
  }

}
