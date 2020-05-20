package org.docksidestage.javatry.basic.st6.os;

public class St6OSMac extends St6OperationSystem{
    public St6OSMac(String loginId) {
        super(loginId);
    }
    @Override
    public String getFileSeparator(){
        return "/";
    }

    @Override
    public String getUserDirectory(){
        return "/Users/" + loginId;
    }
}
