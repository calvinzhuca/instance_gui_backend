/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redhat.syseng.soleng.rhpam.model;

import com.redhat.syseng.soleng.rhpam.model.ProcessInfo;

/**
 *
 * @author czhu
 */
public class ProcessInfos {

    private ProcessInfo sourceInfo;

    private ProcessInfo targetInfo;

    public ProcessInfo getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(ProcessInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public ProcessInfo getTargetInfo() {
        return targetInfo;
    }

    public void setTargetInfo(ProcessInfo targetInfo) {
        this.targetInfo = targetInfo;
    }



    @Override
    public String toString() {
        return "ProcessInfos [sourceInfo=" + sourceInfo
                + ", targetInfo=" + targetInfo 
                + "]";
    }

}
