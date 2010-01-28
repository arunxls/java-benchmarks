package javagrande.threadv1_0.section2;
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
*      This version copyright (c) The University of Edinburgh, 2001.      *
*                         All rights reserved.                            *
*                                                                         *
**************************************************************************/


import javagrande.threadv1_0.crypt.*;
import javagrande.threadv1_0.jgfutil.*;
import javagrande.threadv1_0.lufact.*;
import javagrande.threadv1_0.series.*;
import javagrande.threadv1_0.sor.*;
import javagrande.threadv1_0.sparsematmult.*;

public class JGFAllSizeC{

  public static int nthreads;

  public static void main(String argv[]){
   
    int size = 2; 

  if(argv.length != 0 ) {
    nthreads = Integer.parseInt(argv[0]);
  } else {
    System.out.println("The no of threads has not been specified, defaulting to 1");
    System.out.println("  ");
    nthreads = 1;
  }

    JGFInstrumentor.printHeader(2,size,nthreads);

    JGFSeriesBench se = new JGFSeriesBench(nthreads); 
    se.JGFrun(size);

    JGFLUFactBench lub = new JGFLUFactBench(nthreads);
    lub.JGFrun(size);    

    JGFCryptBench cb = new JGFCryptBench(nthreads);
    cb.JGFrun(size);    

    JGFSORBench jb = new JGFSORBench(nthreads); 
    jb.JGFrun(size);
   
    JGFSparseMatmultBench smm = new JGFSparseMatmultBench(nthreads); 
    smm.JGFrun(size);
 
  }
}


