class Section
  def initialize(section_name)
    @section_name = section_name
  end

  def ==(other)
    return false unless other.is_a?(Section)
    @section_name == other.section_name
  end
  def hash
    @section_name.hash
  end

  def to_s = @section_name

  alias_method :eql?, :==

  protected attr_reader :section_name

end
