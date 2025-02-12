package frc.robot.statesmachines.scoring;

import frc.robot.Robot;
import frc.robot.Library.StateMachine.State;
import frc.robot.Library.StateMachine.Transition;

public class intakeState extends State{
    public intakeState() {

    }

    @Override
    public void build() {
        addTransition(
            new Transition(() -> {
                return Robot.controller.getXButtonPressed();
            }, 
            Bob.idleState)
        );
    }

    @Override
    public void init(State prevState) {
        Robot.intakeMotor.set(-0.75);
    }

    @Override
    public void execute() {

    }

    @Override
    public void exit(State nextState) {
        
    }
}
