package org.convertertopdf.convert.implementation;

import org.convertertopdf.convert.OfficeConverter;
import org.convertertopdf.util.EFormat;

/**
 * Class responsable to convert RTF files to PDF.
 * 
 * @author Thiago Leite e-mail: thiagoleiteecarvalho@gmail.com
 */
public final class RtfConverter extends OfficeConverter {

	/** {@inheritDoc} */
	public EFormat getFormat() {
		return EFormat.RTF;
	}

}