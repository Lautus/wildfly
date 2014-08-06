/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.test.integration.ee.injection.resource.jndi.bad;

/**
 * @author baranowb
 * 
 */
public interface Constants {

    String TEST_MODULE_NAME = "BadDonkeyModule";
    String TEST_MODULE_NAME_FULL = "test." + TEST_MODULE_NAME;
    
    String TESTED_DU_NAME = "BadTest";
    String TESTED_ARCHIVE_NAME = TESTED_DU_NAME + ".jar";
    

    String TEST_DU_NAME = "BadTestCase";
    String TEST_ARCHIVE_NAME = TEST_DU_NAME + ".jar";
    
    String JNDI_NAME_GLOBAL = "java:global/" + TEST_DU_NAME + "/ResourceEJBImpl";
    String JNDI_NAME_BAD = "java:jboss:/" + TEST_DU_NAME + "/ResourceEJBImpl";
    
    String ERROR_MESSAGE = "Context part 'jboss:' violates JNDI name syntax in 'java:jboss:/BadTestCase/ResourceEJBImpl' entry.";
}
