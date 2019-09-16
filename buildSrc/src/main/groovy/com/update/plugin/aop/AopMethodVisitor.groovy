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
    int access
    String name
    String desc
    String signature
    String className
    String[] exceptions
    int aopVar

    AopMethodVisitor(final int api, final MethodVisitor mv,
                     int access, String name,
                     String desc, String signature,
                     String[] exceptions, String className) {
        super(api, access, desc, mv)
        this.access = access
        this.name = name
        this.desc = desc
        this.signature = signature
        this.exceptions = exceptions
        this.className = className
    }
}