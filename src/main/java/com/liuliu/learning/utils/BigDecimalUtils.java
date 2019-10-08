package com.liuliu.learning.utils;

import java.math.BigDecimal;


public class BigDecimalUtils {
	public static BigDecimal toBigDecimal(Object val) {
		try {
			if (val instanceof BigDecimal) {
				return (BigDecimal) val;
			} else if (val == null) {
				throw new IllegalArgumentException("Null can not to BigDecimal.");
			} else if (val instanceof String) {
				String str = (String) val;
				if ("".equals(str.trim())) {
					return BigDecimal.valueOf(0);
				}
				str = str.trim();
				return new BigDecimal(str);
			} else if (val instanceof Number) {
				return new BigDecimal(val.toString());
			} else if (val instanceof Character) {
				int i = ((Character) val).charValue();
				return new BigDecimal(i);
			}
		} catch (Exception ex) {
			throw new NumberFormatException("Can not convert " + val + " to number.");
		}

		throw new IllegalArgumentException(val.getClass().getName() + " can not to BigDecimal.");
	}
}
