/**
 * Unit-API - Units of Measurement API for Java
 * Copyright (c) 2014 Jean-Marie Dautelle, Werner Keil, V2COM
 * All rights reserved.
 *
 * See LICENSE.txt for details.
 */
package javax.measure;

import javax.measure.function.ConversionOperator;
import javax.measure.function.UnitSupplier;
import javax.measure.function.ValueSupplier;

/**
 * Represents a value with a unit.
 * 
 * A Measurement object is used for maintaining the tuple of value and unit.
 * </br> Arithmetic methods (were applicable) are provided. At least a runtime error (for some
 * operations already at compile time) will occur when two measurements are used
 * in an incompatible way. E.g., when a speed (m/s) is added to a distance (m).
 * The measurement class will correctly track changes in unit during
 * multiplication and division, always coercing the result to the most simple
 * form. See <type>Unit</type> for more information on the supported units.
 * 
 * <p>
 * Measurement instances should be immutable.
 * </p>
 * 
 * @param <Q>
 *            The type of the measurement.
 * @param <V>
 *            The measured value.
 * 
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @see <a href="http://en.wikipedia.org/wiki/Units_of_measurement">Wikipedia:
 *      Units of measurement</a>
 * @version 0.16, $Date: 2014-08-03 $
 */
public interface Measurement<Q extends Quantity<Q>, V> extends UnitSupplier<Q>,
        ValueSupplier<V>, ConversionOperator<Measurement<Q, V>, Unit<Q>> {
}
