/**
 * SortOperations_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.simit.www.SortOperations;

public interface SortOperations_PortType extends java.rmi.Remote {
    public int[] bubbleSort(int[] in) throws java.rmi.RemoteException;
    public int[] insertionSort(int[] in) throws java.rmi.RemoteException;
    public int[] selectionSort(int[] in) throws java.rmi.RemoteException;
    public int[] quickSort(int[] in) throws java.rmi.RemoteException;
}
