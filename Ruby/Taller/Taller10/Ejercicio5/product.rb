# frozen_string_literal: true

class Product
  include comparable

  attr_reader :name, :price
  def initialize(name, price)
    @name = name
    @price = price
  end

  def ==(other)
    return false unless other.is_a? Product
    @name == other.name && @price == other.price
  end

  def hash
    [@name, @price].hash
  end

  alias_method :eql, :==

  def <=>(other)
    return nil unless other.is_a? Product
    [@price, @name] <=> [other.price, other.name]
  end

end
