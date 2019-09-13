package com.update.plugin.aop

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor


/**
 * @author : liupu
 * date   : 2019/9/13
 * desc   :
 * github : https://github.com/CodeLiuPu/
 */
class AopClassVisitor extends ClassVisitor {
    String className
    String superName
    String[] interfaces

    AopClassVisitor(int api, ClassVisitor cv) {
        super(api, cv)
    }

    @Override
    void visit(int version, int access, String name, String signature,
               String superName, String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
        this.className = name;
        this.superName = superName;
        this.interfaces = interfaces;
    }

    @Override
    MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions)
        return mv
    }
}