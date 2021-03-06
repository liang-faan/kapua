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
package org.eclipse.kapua.service.device.call.message;

import org.eclipse.kapua.message.Channel;

/**
 * {@link DeviceChannel} definition.
 *
 * @since 1.0.0
 */
public interface DeviceChannel extends Channel {

    /**
     * Gets the {@link DeviceMessage} classification.
     * <p>
     * This field it is used to distinguish between command messages and "standard" messages such as telemetry messages.
     * The domain values can be customized via configuration parameter.
     *
     * @return The {@link DeviceMessage} classification.
     * @since 1.0.0
     */
    String getMessageClassification();

    /**
     * Sets the {@link DeviceMessage} classification.
     *
     * @param messageClassification The {@link DeviceMessage} classification.
     * @see #getMessageClassification()
     * @since 1.0.0
     */
    void setMessageClassification(String messageClassification);

    /**
     * Gets the scope.
     *
     * @return The scope.
     * @since 1.0.0
     */
    String getScope();

    /**
     * Sets the scope
     *
     * @param scope The scope
     * @since 1.0.0
     */
    void setScope(String scope);

    /**
     * Gets the client identifier.
     *
     * @return The client identifier.
     * @since 1.0.0
     */
    String getClientId();

    /**
     * Sets the client identifier.
     *
     * @param clientId The client identifier.
     * @since 1.0.0
     */
    void setClientId(String clientId);

}
