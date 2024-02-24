// This is a generated file. Not intended for manual editing.
package com.templ.templ.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.templ.templ.psi.TemplTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.templ.templ.psi.*;

public class TemplSwitchCaseImpl extends ASTWrapperPsiElement implements TemplSwitchCase {

  public TemplSwitchCaseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TemplVisitor visitor) {
    visitor.visitSwitchCase(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TemplVisitor) accept((TemplVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public TemplHtmlDeclBody getHtmlDeclBody() {
    return findChildByClass(TemplHtmlDeclBody.class);
  }

}
