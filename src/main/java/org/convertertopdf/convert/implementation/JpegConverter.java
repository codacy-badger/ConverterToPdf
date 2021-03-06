package org.convertertopdf.convert.implementation;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Image;
import com.lowagie.text.Jpeg;

import java.io.IOException;
import java.net.MalformedURLException;

import org.convertertopdf.convert.ImageConverter;
import org.convertertopdf.util.EFormat;

/**
 * Class responsable to convert JPEG/JPG files to PDF.
 * 
 * @author Thiago Leite e-mail: thiagoleiteecarvalho@gmail.com
 */
public final class JpegConverter extends ImageConverter {

	/** {@inheritDoc} */
	@Override
	public EFormat getFormat() {
		return EFormat.JPEG;
	}

	/** {@inheritDoc} */
	@Override
	public Image getImage() throws BadElementException, MalformedURLException, IOException {
		return new Jpeg(getBytes());
	}

}