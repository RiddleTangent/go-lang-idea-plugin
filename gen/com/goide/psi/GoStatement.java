// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;

public interface GoStatement extends GoCompositeElement {

  @Nullable
  GoBlock getBlock();

  @Nullable
  GoConstDeclaration getConstDeclaration();

  @Nullable
  GoTypeDeclaration getTypeDeclaration();

  @Nullable
  GoVarDeclaration getVarDeclaration();

  boolean processDeclarations(PsiScopeProcessor processor, ResolveState state, PsiElement lastParent, PsiElement place);

}
