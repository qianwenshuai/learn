package com.qian.salfeditor;

import org.springframework.beans.factory.config.CustomEditorConfigurer;

import java.beans.PropertyEditorSupport;

/**
 * @author: qws
 * @description:
 * @date: 2021/5/11 17:11
 */
public class AddressPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] s = text.split("_");
        Address address = new Address();
        address.setProvince(s[0]);
        address.setCity(s[1]);
        address.setTown(s[2]);
        this.setValue(address);
    }

}
