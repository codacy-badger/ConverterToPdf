package org.convertertopdf.convert.implementation;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Image;

import java.io.IOException;
import java.net.MalformedURLException;

import org.convertertopdf.convert.ImageConverter;
import org.convertertopdf.util.EFormat;

/**
 * Class responsable to convert TIF files to PDF.
 * 
 * @author Thiago Leite e-mail: thiagoleiteecarvalho@gmail.com
 */
public final class TiffConverter extends ImageConverter {

	/** {@inheritDoc} */
	@Override
	public EFormat getFormat() {
		return EFormat.TIFF;
	}

	/** {@inheritDoc} */
	@Override
	public Image getImage() throws BadElementException, MalformedURLException, IOException {
		return Image.getInstance(getBytes());
	}
}
