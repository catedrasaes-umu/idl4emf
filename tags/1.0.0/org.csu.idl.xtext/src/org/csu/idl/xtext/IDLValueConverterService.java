package org.csu.idl.xtext;

import org.csu.idl.idlmm.PrimitiveKind;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractToStringConverter;
import org.eclipse.xtext.parsetree.AbstractNode;

public class IDLValueConverterService extends DefaultTerminalConverters {

	@ValueConverter(rule = "longdouble_type")
	public IValueConverter<PrimitiveKind> longdouble_type () {
		return new AbstractToStringConverter<PrimitiveKind>() {

			@Override
			protected PrimitiveKind internalToValue(String string,
					AbstractNode node) throws ValueConverterException {
				return PrimitiveKind.PK_LONGDOUBLE;
			}

			@Override
			public String toString(PrimitiveKind value) {
				return "long double";
			}
			
		};
	}
	
	
	
	@ValueConverter(rule = "longlong_type")
	public IValueConverter<PrimitiveKind> longlong_type() {
		return new AbstractToStringConverter<PrimitiveKind>() {

			@Override
			protected PrimitiveKind internalToValue(String string,
					AbstractNode node) throws ValueConverterException {
				return PrimitiveKind.PK_LONGLONG;
			}
			
			@Override
			public String toString(PrimitiveKind value) {
				return "long long";
			}
			
		};
	}
	
	
	@ValueConverter(rule = "ushort_type")
	public IValueConverter<PrimitiveKind> ushort_type() {
		return new AbstractToStringConverter<PrimitiveKind>() {

			@Override
			protected PrimitiveKind internalToValue(String string,
					AbstractNode node) throws ValueConverterException {
				return PrimitiveKind.PK_USHORT;
			}
			
			@Override
			public String toString(PrimitiveKind value) {
				return "unsigned short";
			}
			
		};
	}
	
	
	@ValueConverter(rule = "ulong_type")
	public IValueConverter<PrimitiveKind> ulong_type() {
		return new AbstractToStringConverter<PrimitiveKind>() {

			@Override
			protected PrimitiveKind internalToValue(String string,
					AbstractNode node) throws ValueConverterException {
				return PrimitiveKind.PK_ULONG;
			}

			@Override
			public String toString(PrimitiveKind value) {
				return "unsigned long";
			}
			
		};
	}
	
	
	@ValueConverter(rule = "ulonglong_type")
	public IValueConverter<PrimitiveKind> ulonglong_type() {
		return new AbstractToStringConverter<PrimitiveKind>() {

			@Override
			protected PrimitiveKind internalToValue(String string,
					AbstractNode node) throws ValueConverterException {
				return PrimitiveKind.PK_ULONGLONG;
			}

			@Override
			public String toString(PrimitiveKind value) {
				return "unsigned long long";
			}
			
		};
	}
	
	
	@ValueConverter(rule = "ID")
	public IValueConverter<String> ID() {
		return new AbstractToStringConverter<String>() {

			@Override
			protected String internalToValue(String string,
					AbstractNode node) throws ValueConverterException {
				return string.startsWith("_") ? string.substring(1) : string;
			}

			@Override
			public String toString(String value) {
				return value;
			}
			
		};
	}
}