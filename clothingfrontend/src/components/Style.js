import * as React from 'react';
import Box from '@mui/material/Box';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';

export default function StyleSelect() {
  const [style, setStyle] = React.useState('');

  const handleChange = (event) => {

    setStyle(event.target.value);
  };

  return (
    <Box sx={{ minWidth: 130 }}>
      <FormControl fullWidth>
        <InputLabel id="select-clothing-style">Style</InputLabel>
        <Select
          labelId="select-clothing-style"
          id="select-clothing-style"
          value={style}
          label="Style"
          onChange={handleChange}
        >
          <MenuItem value={"Casual"}>Casual</MenuItem>
          <MenuItem value={"Athletic"}>Athletic</MenuItem>
          <MenuItem value={"Preppy"}>Preppy</MenuItem>
          <MenuItem value={"Formal"}>Formal</MenuItem>
        </Select>
      </FormControl>
    </Box>
  );
}