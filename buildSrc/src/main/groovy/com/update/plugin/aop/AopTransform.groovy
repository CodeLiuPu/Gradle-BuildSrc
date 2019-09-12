package com.update.plugin.aop


import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.gradle.internal.pipeline.TransformManager

/**
 * @author : liupu
 * date   : 2019/9/12
 * desc   :
 * github : https://github.com/CodeLiuPu/
 */
class AopTransform extends Transform {

    @Override
    String getName() {
        return "AopPlugin"
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_CLASS
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT
    }

    @Override
    boolean isIncremental() {
        return false
    }
}