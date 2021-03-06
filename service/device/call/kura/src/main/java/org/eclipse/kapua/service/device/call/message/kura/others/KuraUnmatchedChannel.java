/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.call.message.kura.others;

import org.eclipse.kapua.service.device.call.message.DeviceChannel;
import org.eclipse.kapua.service.device.call.message.kura.KuraChannel;

/**
 * {@link DeviceChannel} {@link org.eclipse.kapua.service.device.call.kura.Kura} implementation.
 *
 * @see KuraUnmatchedMessage
 * @since 1.0.0
 */
public class KuraUnmatchedChannel extends KuraChannel implements DeviceChannel {

    /**
     * Constructor.
     *
     * @since 1.0.0.
     */
    public KuraUnmatchedChannel() {
    }

    /**
     * Constructor.
     *
     * @param scopeNamespace The scope namespace.
     * @param clientId       The clientId.
     * @see org.eclipse.kapua.service.device.call.message.DeviceChannel
     * @since 1.0.0
     */
    public KuraUnmatchedChannel(String scopeNamespace, String clientId) {
        this(null, scopeNamespace, clientId);
    }

    /**
     * Constructor.
     *
     * @param messageClassification The message classification
     * @param scopeNamespace        The scope namespace.
     * @param clientId              The clientId.
     * @since 1.0.0
     */
    public KuraUnmatchedChannel(String messageClassification, String scopeNamespace, String clientId) {
        super(messageClassification, scopeNamespace, clientId);
    }

}
