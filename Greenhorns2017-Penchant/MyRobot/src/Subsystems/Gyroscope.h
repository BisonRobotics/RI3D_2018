#ifndef __JJC__GYROSCOPE__HEADER__
#define __JJC__GYROSCOPE__HEADER__

#include "Commands/Subsystem.h"
#include "WPILib.h"

class Gyroscope : public Subsystem {
private:
	std::shared_ptr<frc::ADXRS450_Gyro> gyroz;
public:
	Gyroscope();
	void InitDefaultCommand();
};

#endif // __JJC__GYROSCOPE__HEADER__
