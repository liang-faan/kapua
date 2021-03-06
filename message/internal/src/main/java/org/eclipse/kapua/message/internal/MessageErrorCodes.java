/*******************************************************************************
 * Copyright (c) 2016, 2019 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.message.internal;

import org.eclipse.kapua.KapuaErrorCode;

/**
 * Message error codes.
 *
 * @since 1.0.0
 */
public enum MessageErrorCodes implements KapuaErrorCode {
    /**
     * Invalid destination
     *
     * @since 1.0.0
     */
    INVALID_DESTINATION,
    /**
     * Invalid message
     *
     * @since 1.0.0
     */
    INVALID_MESSAGE,
    /**
     * Invalid metric type
     *
     * @since 1.0.0
     */
    INVALID_METRIC_TYPE,
    /**
     * Invalid metric value
     *
     * @since 1.0.0
     */
    INVALID_METRIC_VALUE
}
