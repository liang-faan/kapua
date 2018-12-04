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
package org.eclipse.kapua.service.certificate;

import org.eclipse.kapua.model.KapuaEntityFactory;

/**
 * {@link PrivateCertificateFactory} definition.
 *
 * @see org.eclipse.kapua.model.KapuaEntityFactory
 * @since 1.0.0
 */
public interface PrivateCertificateFactory extends KapuaEntityFactory<PrivateCertificate, PrivateCertificateCreator, PrivateCertificateQuery, PrivateCertificateListResult> {

    /**
     * Instantiates a new {@link CertificateUsage}.
     *
     * @param name The name to set into the {@link CertificateUsage}
     * @return The newly instantiated {@link CertificateUsage}
     * @since 1.0.0
     */
    CertificateUsage newCertificateUsage(String name);

    /**
     * Instantiates a new {@link KeyUsageSetting}.
     *
     * @param usage        The {@link KeyUsage} to set into the {@link KeyUsageSetting}.
     * @param allowed      The allowed to set into the {@link KeyUsageSetting}.
     * @param kapuaAllowed The kapua allowed to set into the {@link KeyUsageSetting}.
     * @return The newly instantiated {@link KeyUsageSetting}
     * @since 1.0.0
     */
    KeyUsageSetting newKeyUsageSetting(KeyUsage usage, boolean allowed, Boolean kapuaAllowed);

    /**
     * Instantiates a new {@link CertificateGenerator}.
     *
     * @return The newly instantiated {@link CertificateGenerator}.
     * @since 1.0.0
     */
    CertificateGenerator newCertificateGenerator();

}
