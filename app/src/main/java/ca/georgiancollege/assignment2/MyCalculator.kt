package ca.georgiancollege.assignment2
import ca.georgiancollege.assignment2.databinding.ActivityMainBinding

class MyCalculator(dataBinding: ActivityMainBinding) {

    private val binding: ActivityMainBinding = dataBinding
    private var result: String

    init {
        result = ""
        myButtons()
    }

    private fun myButtons(): Unit
    {
        val numberButtons = arrayOf(
            binding.oneButton, binding.twoButton, binding.threeButton, binding.fourButton,
            binding.fiveButton, binding.sixButton, binding.sevenButton, binding.eightButton,
            binding.nineButton, binding.zeroButton, binding.decimalButton, binding.backspaceButton,
            binding.plusMinusButton
        )

        val actionButtons = arrayOf(
            binding.multiply, binding.plusButton, binding.divideButton, binding.minusButton,
            binding.equalsButton, binding.divideButton, binding.clearButton
        )

        numberButtons.forEach { it.setOnClickListener { numberHandler(it.tag as String) } }
        actionButtons.forEach { it.setOnClickListener { actionHandler(it.tag as String) } }
    }


    private fun numberHandler(tag: String): Unit
    {
        when(tag)
        {
            "." -> {
                if(!binding.resultView.text.contains("."))
                {
                    result += if(result.isEmpty()) "0." else "."

                    binding.resultView.text = result
                }
            }
            "Delete" -> {
                result = result.dropLast(1)

                binding.resultView.text = if(result.isEmpty() || result=="-") "0" else result
            }
            "Plus_Minus" -> {
                if(result.startsWith("-"))
                {
                    result = result.substring(1)
                    binding.resultView.text = result
                }
                else
                {
                    if(result.isNotEmpty())
                    {
                        result = "-".plus(result)
                        binding.resultView.text = result
                    }
                }
            }
            else -> {
                if(binding.resultView.text == "0")
                {
                    result = tag
                }
                else
                {
                    result += tag
                }
                binding.resultView.text = result
            }
        }
    }

    private fun actionHandler(tag: String): Unit
    {
        when(tag)
        {
            "Clear" -> clear()
            else -> {

            }
        }


    }

    private fun clear(): Unit
    {
        result = ""
        binding.resultView.text = "0"
    }



}


