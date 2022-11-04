// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public CANSparkMax motor;

// the big spark is 4 and small is 3 same programming
public class NeoMotor {
    this.motor = new CANSparkMax(4, MotorType.kBrushless);
}

public void setMotorPower(double power, double motorPower) {
    this.motor.set(motorPower);
}

public void NeoMotorPower(double motorPower) {
    setMotorPower(motorPower, motorPower);
}

public void motorOn(double power) {
    this.motor.set(power);
}
