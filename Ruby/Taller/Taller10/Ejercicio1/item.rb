# frozen_string_literal: true

class Item
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
end
