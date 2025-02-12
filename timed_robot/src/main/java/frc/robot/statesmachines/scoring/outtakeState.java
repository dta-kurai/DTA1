package frc.robot.statesmachines.scoring;

import frc.robot.Robot;
import frc.robot.Library.StateMachine.State;
import frc.robot.Library.StateMachine.Transition;

public class outtakeState extends State{
    public outtakeState() {

    }

    @Override
    public void build() {
        addTransition(
            new Transition(() -> {
                return Robot.controller.getYButtonPressed();
            },
            Bob.idleState)
        );
    }

    @Override
    public void init(State prevState) {
        Robot.intakeMotor.set(0.75);
    }

    @Override
    public void execute() {

    }

    @Override
    public void exit(State nextState) {
        
    }
}