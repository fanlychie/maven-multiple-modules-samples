package org.fanlychie.service;

import org.fanlychie.facade.MessageFacade;

public class MessageService implements MessageFacade {

    @Override
    public String sayHi() {
        return "Hi Maven";
    }

}