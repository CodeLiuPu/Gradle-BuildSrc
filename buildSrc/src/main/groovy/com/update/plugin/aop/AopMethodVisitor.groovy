package com.update.plugin.aop

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.commons.LocalVariablesSorter


/**
 * @author : liupu
 * date   : 2019/9/13
 * desc   :
 * github : https://github.com/CodeLiuPu/
 */
class AopMethodVisitor extends LocalVariablesSorter {

    AopMethodVisitor(int i, String s, MethodVisitor methodVisitor) {
        super(i, s, methodVisitor)
    }
}