import java.time.LocalTime;

class CourseSection
{
   private final String prefix;
   private final String number;
   private final int enrollment;
   private final LocalTime startTime;
   private final LocalTime endTime;

   public CourseSection(final String prefix, final String number,
      final int enrollment, final LocalTime startTime, final LocalTime endTime)
   {
      this.prefix = prefix;
      this.number = number;
      this.enrollment = enrollment;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   public boolean equals(Object other){
      if (other == null){
         return false;
      }
      if (!other.getClass().equals(this.getClass())){
         return false;
      }
      boolean res = true;
      boolean ch = false;

      if (prefix == null){
         res = res && ((CourseSection)other).prefix == null;
      }
      if (number == null){
         res = res && ((CourseSection)other).number == null;
      }
      if (startTime == null){
         res = res && ((CourseSection)other).startTime == null;
         ch = true;
      }
      if (endTime == null){
         res = res && ((CourseSection)other).endTime == null;
      }
      if (((CourseSection)other).prefix == null){
         res = res && prefix == null;
      }
      if (((CourseSection)other).number == null){
         res = res && number == null;
      }
      if (ch){
         return res && prefix == ((CourseSection)other).prefix && number == ((CourseSection)other).number && enrollment == ((CourseSection)other).enrollment
                 && startTime == ((CourseSection)other).startTime && endTime == ((CourseSection)other).endTime;
      }
      return res && prefix == ((CourseSection)other).prefix && number == ((CourseSection)other).number && enrollment == ((CourseSection)other).enrollment
              && startTime.equals(((CourseSection)other).startTime) && endTime == ((CourseSection)other).endTime;
   }
   // additional likely methods not defined since they are not needed for testing

   public int hashCode(){
      int result = 1;
      result += enrollment;
      if (!(prefix == null)){
         return result += prefix.hashCode();
      }
      if (!(number == null)){
         return result += number.hashCode();
      }
      if (!(startTime == null)){
         return result += startTime.hashCode();
      }
      if (!(endTime == null)){
         return result += endTime.hashCode();
      }
      return result;
   }
}
