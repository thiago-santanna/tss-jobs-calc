import React from 'react';
import { FiArrowLeft } from "react-icons/fi";
import Link from 'next/link';

const NavForm = ({ title = "Page" }) => {
  return (
    <nav className="bg-gray-800">
      <div className=" container mx-auto text-white relative flex items-center justify-between h-16">
        <Link href="/"><a><FiArrowLeft size={24} /></a></Link>
        <span>{title}</span>
        <span>...</span>
      </div>
    </nav>
  );
}

export default NavForm;
