# frozen_string_literal: true

class Item
  attr_accessor :amount
  protected attr_reader :product
  def initialize(product, amount)
    @product = product
    @amount = amount
  end

  def total
    @product.price * @amount
  end

  def to_s
    "#{format('%-15s', @product.name)}\t#{@amount}\t$#{format('%.2f', @product.price)}"
  end

  def ==(other)
    return false unless other.is_a? Item
    @product == other.product
  end

  def hash
    [@product].hash
  end

  alias_method :eql, :==
end
