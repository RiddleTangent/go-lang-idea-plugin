// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoLiteralTypeExpr extends GoExpression {

  @Nullable
  GoType getType();

  @Nullable
  GoTypeReferenceExpression getTypeReferenceExpression();

  @Nullable
  PsiElement getLbrack();

  @Nullable
  PsiElement getRbrack();

  @Nullable
  PsiElement getTripleDot();

}
