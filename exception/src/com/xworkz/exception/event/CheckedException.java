package com.xworkz.exception.event;

import jdk.internal.org.xml.sax.SAXException;
import org.ietf.jgss.GSSException;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;

import javax.management.*;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.management.modelmbean.XMLParseException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.transaction.xa.XAException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathException;
import java.awt.*;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.print.PrinterException;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.LambdaConversionException;
import java.net.URISyntaxException;
import java.rmi.AlreadyBoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

public class CheckedException {
    public void aclNotFoundException() throws AclNotFoundException {
        throw new AclNotFoundException();
    }

    public void activationException() throws ActivationException {
        throw new ActivationException();
    }

    public void alreadyBoundException() throws AlreadyBoundException {
        throw new AlreadyBoundException();
    }

    public void applicationException() throws ApplicationException {
        throw new ApplicationException(null, null);
    }

    public void aWTException() throws AWTException {
        throw new AWTException("");
    }

    public void backingStoreException() throws BackingStoreException {
        throw new BackingStoreException("");
    }

    public void badAttributeValueExpException() throws BadAttributeValueExpException {
        throw new BadAttributeValueExpException("");
    }

    public void badBinaryOpValueExpException() throws BadBinaryOpValueExpException {
        throw new BadBinaryOpValueExpException(null);
    }

    public void badLocationException() throws BadLocationException {
        throw new BadLocationException(null, 56);
    }

    public void badStringOperationException() throws BadStringOperationException {
        throw new BadStringOperationException(null);
    }

    public void brokenBarrierException() throws BrokenBarrierException {
        throw new BrokenBarrierException();
    }

    public void certificateException() throws CertificateException {
        throw new CertificateException();
    }

    public void cloneNotSupportedException() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void dataFormatException() throws DataFormatException {
        throw new DataFormatException();
    }

    public void datatypeConfigurationException() throws DatatypeConfigurationException {
        throw new DatatypeConfigurationException();
    }

    public void destroyFailedException() throws DestroyFailedException {
        throw new DestroyFailedException();
    }

    public void executionException() throws ExecutionException {
        throw new ExecutionException(null);
    }

    public void gSSException() throws GSSException {
        throw new GSSException(7);
    }

    public void illegalClassFormatException() throws IllegalClassFormatException {
        throw new IllegalClassFormatException(null);
    }

    public void interruptedException() throws InterruptedException {
        throw new InterruptedException(null);
    }

    public void introspectionException() throws IntrospectionException {
        throw new IntrospectionException(null);
    }

    public void invalidApplicationException() throws InvalidApplicationException {
        throw new InvalidApplicationException(null);
    }

    public void invalidMidiDataException() throws InvalidMidiDataException {
        throw new InvalidMidiDataException(null);
    }

    public void invalidTargetObjectTypeException() throws InvalidTargetObjectTypeException {
        throw new InvalidTargetObjectTypeException(null);
    }

    public void iOException() throws IOException {
        throw new IOException("");
    }

    public void jAXBException() throws JAXBException {
        throw new JAXBException("");
    }

    public void jMException() throws JMException {
        throw new JMException("");
    }

    public void keySelectorException() throws KeySelectorException {
        throw new KeySelectorException("");
    }

    public void lambdaConversionException() throws LambdaConversionException {
        throw new LambdaConversionException("");
    }

    public void lastOwnerException() throws LastOwnerException {
        throw new LastOwnerException();
    }

    public void lineUnavailableException() throws LineUnavailableException {
        throw new LineUnavailableException("");
    }

    public void marshalException() throws MarshalException {
        throw new MarshalException("");
    }

    public void midiUnavailableException() throws MidiUnavailableException {
        throw new MidiUnavailableException("");
    }

    public void mimeTypeParseException() throws MimeTypeParseException {
        throw new MimeTypeParseException("");
    }

    public void namingException() throws NamingException {
        throw new NamingException("");
    }

    public void noninvertibleTransformException() throws NoninvertibleTransformException {
        throw new NoninvertibleTransformException("");
    }

    public void notBoundException() throws NotBoundException {
        throw new NotBoundException("");
    }

    public void notOwnerException() throws NotOwnerException {
        throw new NotOwnerException();
    }

    public void parseException() throws ParseException {
        throw new ParseException(null,67);
    }

    public void ParserConfigurationException() throws ParserConfigurationException {
        throw new ParserConfigurationException("");
    }

    public void privilegedActionException() throws PrivilegedActionException {
        throw new PrivilegedActionException(null);
    }


    public void propertyVetoException() throws PropertyVetoException {
        throw new PropertyVetoException(null,null);
    }
    public void reflectiveOperationException() throws ReflectiveOperationException{
        throw new ReflectiveOperationException();
    }
    public void refreshFailedException() throws RefreshFailedException{
        throw new RefreshFailedException(null);
    }
    public void remarshalException() throws RemarshalException {
        throw new RemarshalException();
    }
    public void runtimeException() throws RuntimeException {
        throw new RuntimeException();
    }
    public void sAXException() throws SAXException {
        throw new SAXException(null,null);
    }
    public void scriptException() throws ScriptException {
        throw new ScriptException("");
    }
    public void serverNotActiveException() throws ServerNotActiveException {
        throw new ServerNotActiveException();
    }
    public void sOAPException() throws SOAPException {
        throw new SOAPException(null,null);
    }
    public void sQLException() throws SQLException {
        throw new SQLException();
    }
    public void timeoutException() throws TimeoutException {
        throw new TimeoutException();
    }
    public void tooManyListenersException() throws TooManyListenersException {
        throw new TooManyListenersException(null);
    }
    public void transformerException() throws TransformerException {
        throw new TransformerException("");
    }
    public void transformException() throws TransformException {
        throw new TransformException();
    }
    public void unmodifiableClassException() throws UnmodifiableClassException{
        throw new UnmodifiableClassException(null);
    }
    public void unsupportedAudioFileException() throws UnsupportedAudioFileException{
        throw new UnsupportedAudioFileException(null);
    }
    public void unsupportedCallbackException() throws UnsupportedCallbackException{
        throw new UnsupportedCallbackException(null);
    }
    public void unsupportedFlavorException() throws UnsupportedFlavorException{
        throw new UnsupportedFlavorException(null);
    }
    public void unsupportedLookAndFeelException() throws UnsupportedLookAndFeelException{
        throw new UnsupportedLookAndFeelException(null);
    }
    public void uRIReferenceException() throws URIReferenceException{
        throw new URIReferenceException();
    }
    public void xAException() throws XAException{
        throw new XAException(null);
    }
    public void  xMLParseException() throws  XMLParseException{
        throw new  XMLParseException(null);
    }
    public void xMLSignatureException() throws XMLSignatureException{
        throw new XMLSignatureException();
    }
    public void xMLStreamException() throws XMLStreamException{
        throw new XMLStreamException();
    }

    public void xPathException() throws XPathException{
        throw new XPathException("");
    }



}


