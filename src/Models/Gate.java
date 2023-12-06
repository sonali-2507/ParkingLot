package Models;



public class Gate extends BaseModel{

    private GateType gateType;
    private  int gateNumber;
    private Operator operator;
    private GateStaus gateStaus;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStaus getGateStaus() {
        return gateStaus;
    }

    public void setGateStaus(GateStaus gateStaus) {
        this.gateStaus = gateStaus;
    }
}
