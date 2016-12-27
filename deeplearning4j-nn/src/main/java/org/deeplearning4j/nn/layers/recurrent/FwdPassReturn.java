package org.deeplearning4j.nn.layers.recurrent;

import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * Created by benny on 12/31/15.
 */
public class FwdPassReturn {
    //First: needed by standard forward pass only
    public INDArray fwdPassOutput;
    //Arrays: Needed for backpropGradient only
    public INDArray[] fwdPassOutputAsArrays;
    public INDArray[] memCellState;        //Pre nonlinearity
    public INDArray[] memCellActivations;    //Post nonlinearity
    public INDArray[] iz;
    public INDArray[] ia;
    public INDArray[] fa;
    public INDArray[] oa;
    public INDArray[] ga;
    //Gate pre-outs: only needed if not using sigmoid. For sigmoid: sigmaPrime(z) = sigmoid(z) * (1-sigmoid(z)) -> use activations
    public INDArray[] fz;
    public INDArray[] oz;
    public INDArray[] gz;
    //Last 2: needed for rnnTimeStep only
    public INDArray lastAct;
    public INDArray lastMemCell;
}