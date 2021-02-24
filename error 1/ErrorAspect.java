aspect ErrorAspect
{
	pointcut err():(call(* Employee.get_id(..)));
	pointcut warn():(call(* Employee.get_name(..)));
	declare error:err():"Employee id must be greater than 100";
	declare warning:warn():"Employee name should be greater than 5";
}