/*******************************************************************************
 * Copyright (c) 2017, 2019 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.certificate.internal;

import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.service.certificate.PrivateCertificate;

/**
 * {@link PrivateCertificate} implementation
 *
 * @since 1.0.0
 */
public class PrivateCertificateImpl extends PublicCertificateImpl implements PrivateCertificate {

    private String privateKey;
    private String password;

    public PrivateCertificateImpl(KapuaId scopeId) {
        super(scopeId);
    }

    public PrivateCertificateImpl(PrivateCertificate certificate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getPrivateKey() {
        return privateKey;
    }

    @Override
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
