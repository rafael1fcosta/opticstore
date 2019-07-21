package org.opticstore.controller;

import org.opticstore.service.Service;
import org.opticstore.view.View;

public abstract class AbstractController implements Controller {

    protected View view;
    protected Service service;

    // -----------------------------------------------------------------------------------------------------------------

    public AbstractController(View view, Service service) {
        this.view = view;
        this.service = service;
    }

    // -----------------------------------------------------------------------------------------------------------------

}
