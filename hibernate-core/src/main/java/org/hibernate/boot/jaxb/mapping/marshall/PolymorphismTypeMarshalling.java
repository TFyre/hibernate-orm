/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html.
 */
package org.hibernate.boot.jaxb.mapping.marshall;

import org.hibernate.annotations.PolymorphismType;

/**
 * @author Steve Ebersole
 */
public class PolymorphismTypeMarshalling {
	public static PolymorphismType fromXml(String value) {
		return PolymorphismType.fromExternalValue( value );
	}

	public static String toXml(PolymorphismType value) {
		return value.getExternalForm();
	}
}
