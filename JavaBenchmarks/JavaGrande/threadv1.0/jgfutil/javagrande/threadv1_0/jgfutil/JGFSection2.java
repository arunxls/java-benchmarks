/**************************************************************************
*                                                                         *
*         Java Grande Forum Benchmark Suite - Thread Version 1.0          *
*                                                                         *
*                            produced by                                  *
*                                                                         *
*                  Java Grande Benchmarking Project                       *
*                                                                         *
*                                at                                       *
*                                                                         *
*                Edinburgh Parallel Computing Centre                      *
*                                                                         * 
*                email: epcc-javagrande@epcc.ed.ac.uk                     *
*                                                                         *
*                                                                         *
*      This version copyright (c) The University of Edinburgh, 1999.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/


package javagrande.threadv1_0.jgfutil; 

public interface JGFSection2 {
  public void JGFsetsize(int size);
  public void JGFinitialise();
  public void JGFkernel();
  public void JGFvalidate();
  public void JGFtidyup();  
  public void JGFrun(int size); 
}
 
