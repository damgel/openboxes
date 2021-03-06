/**
 * Copyright (c) 2012 Partners In Health.  All rights reserved.
 * The use and distribution terms for this software are covered by the
 * Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 * which can be found in the file epl-v10.html at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by
 * the terms of this license.
 * You must not remove this notice, or any other, from this software.
 **/
package org.pih.warehouse

import org.pih.warehouse.core.Location

class ImageTagLib {

    def grailsApplication

    def displayLogo = { attrs, body ->

        Location location = Location.get(attrs.location)
        def logo = [
                url: grailsApplication.config.openboxes.logo.url,
                label: grailsApplication.config.openboxes.logo.label
        ]

        out << g.render(template: '/taglib/displayLogo', model: [attrs:attrs,location:location,logo:logo]);
    }


    def displayBarcode = { attrs, body ->

        out << g.render(template: '/taglib/displayBarcode', model: [attrs:attrs])

    }
}
