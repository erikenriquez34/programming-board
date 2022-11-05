// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

//REV libraries
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

//Subsystem base?? I guess it needs this
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class NeoMotor extends SubsystemBase {

private CANSparkMax motor;

// the big spark is 4
// the small spark is 3
public NeoMotor() {
    //motor configuration
    this.motor = new CANSparkMax(4, MotorType.kBrushless);
}

public void motorPower(double power) {
    this.motor.set(power);
}

    // public void setMotorPower(double power, double motorPower) {
    //     this.motor.set(motorPower);
    // }

    // //small big is 3 same programming
    // public void NeoMotor(double motorPower) {
    //     setMotorPower(motorPower, motorPower);
    // }

    // public void motorOn(double power) {
    //     this.motor.set(power);
    // }
}