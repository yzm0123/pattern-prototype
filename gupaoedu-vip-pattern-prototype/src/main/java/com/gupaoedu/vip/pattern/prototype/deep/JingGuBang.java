package com.gupaoedu.vip.pattern.prototype.deep;

import java.io.Serializable;

public class JingGuBang implements Serializable {

    private float h = 100;
    private float d = 100;

    public void big(){
        this.h *= 2;
        this.d *= 2;
    }

    public void small(){
        this.h /= 2;
        this.d /= 2;
    }
}
